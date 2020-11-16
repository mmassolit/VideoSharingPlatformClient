package com.videosharing.videoSharingPlatformClient.controllers;

import org.apache.http.client.methods.HttpPost;

import com.videosharing.videoSharingPlatformClient.models.Playback;
import com.videosharing.videoSharingPlatformClient.payloads.PlaybackPayload;
import com.videosharing.videoSharingPlatformClient.requests.Request;
import com.videosharing.videoSharingPlatformClient.utils.Logging;

import java.io.IOException;

public class PlaybackTest {
    private final String endPoint = "http://localhost:8080/api/playbacks";

    private final UserTest userTest = new UserTest();
    private final VideoTest videoTest = new VideoTest();
    private final AdTest adTest = new AdTest();
    
    public void createPlaybacks(int num) throws IOException {
        for (int i=0; i< num; i++){
            Request post = Request.builder()
                    .type(new HttpPost(endPoint))
                    .body(new PlaybackPayload(userTest.getRandomUser().getId(), videoTest.getRandomVideo().getId(),
                    		adTest.getRandomAd().getId()))
                    .response(Playback.class).build();
            Logging.printObject(post.send(), "Creating Playback");
        }
    }

    public void testService(int num) throws IOException{
        System.out.println("Playback service testing".toUpperCase());
        createPlaybacks(num);
    }
}
