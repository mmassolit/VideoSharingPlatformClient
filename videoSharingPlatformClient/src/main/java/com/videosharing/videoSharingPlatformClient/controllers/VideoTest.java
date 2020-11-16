package com.videosharing.videoSharingPlatformClient.controllers;

import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;

import com.videosharing.videoSharingPlatformClient.models.Video;
import com.videosharing.videoSharingPlatformClient.payloads.VideoPayload;
import com.videosharing.videoSharingPlatformClient.requests.Request;
import com.videosharing.videoSharingPlatformClient.utils.FData;
import com.videosharing.videoSharingPlatformClient.utils.Logging;

import java.io.IOException;
import java.util.Random;

public class VideoTest {
    private final String endPoint = "http://localhost:8080/api/videos";

    private final Random rand = new Random();
    private final UserTest userTest = new UserTest();
    
    public void createVideos(int num) throws IOException {
        for (int i=0; i< num; i++){
            Request post = Request.builder()
                    .type(new HttpPost(endPoint))
                    .body(new VideoPayload(FData.getVideoName(), userTest.getRandomUser().getId()))
                    .response(Video.class).build();
            Logging.printObject(post.send(), "Creating Video");
        }
    }

    public Video getRandomVideo() throws IOException {
        Request get = Request.builder()
		                .type(new HttpGet(endPoint))
		                .body(null)
		                .response(Video[].class).build();
        Video[] videos = (Video[]) get.send();
        
        return videos[rand.nextInt(videos.length)];
    }


    public void testService(int num) throws IOException{
        System.out.println("Video service testing".toUpperCase());
        createVideos(num);
    }
}
