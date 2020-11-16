package com.videosharing.videoSharingPlatformClient.controllers;

import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;

import com.videosharing.videoSharingPlatformClient.models.Ad;

import com.videosharing.videoSharingPlatformClient.payloads.AdPayload;;
import com.videosharing.videoSharingPlatformClient.requests.Request;
import com.videosharing.videoSharingPlatformClient.utils.FData;
import com.videosharing.videoSharingPlatformClient.utils.Logging;

import java.io.IOException;
import java.util.Random;

public class AdTest {
    private final String endPoint = "http://localhost:8080/api/ads";

    private final Random rand = new Random();
    private final UserTest userTest = new UserTest();
    
    public void createAds(int num) throws IOException {
        for (int i=0; i< num; i++){
            Request post = Request.builder()
                    .type(new HttpPost(endPoint))
                    .body(new AdPayload(FData.getCpm(), FData.getBudget(), userTest.getRandomUser()))
                    .response(Ad.class).build();
            Logging.printObject(post.send(), "Creating Ad");
        }
    }

    public Ad getRandomAd() throws IOException {
        Request get = Request.builder()
		                .type(new HttpGet(endPoint))
		                .body(null)
		                .response(Ad[].class).build();
        Ad[] ads = (Ad[]) get.send();
        
        return ads[rand.nextInt(ads.length)];
    }


    public void testService() throws IOException{
        System.out.println("Ad service testing".toUpperCase());
        createAds(1);
    }
}
