package com.videosharing.videoSharingPlatformClient.controllers;

import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;

import com.videosharing.videoSharingPlatformClient.models.User;
import com.videosharing.videoSharingPlatformClient.payloads.UserPayload;
import com.videosharing.videoSharingPlatformClient.requests.Request;
import com.videosharing.videoSharingPlatformClient.utils.FData;
import com.videosharing.videoSharingPlatformClient.utils.Logging;

import java.io.IOException;
import java.util.Random;

public class UserTest {
    private final String endPoint = "http://localhost:8080/api/users";

    private final Random rand = new Random();
    private final RoleTest roleTest = new RoleTest();
    
    public void createUsers(int num) throws IOException {
        for (int i=0; i < num; i++){
            Request post = Request.builder()
                    .type(new HttpPost(endPoint))
                    .body(new UserPayload(roleTest.getRandomRole().getId(), FData.getName(), FData.getPassword(), FData.getEmail()))
                    .response(User.class).build();
            Logging.printObject(post.send(), "Creating User");
        }
    }

    public User getRandomUser() throws IOException {
        Request get = Request.builder()
		                .type(new HttpGet(endPoint))
		                .body(null)
		                .response(User[].class).build();
        User[] users = (User[]) get.send();
        
        return users[rand.nextInt(users.length)];
    }


    public void testService(int num) throws IOException{
        System.out.println("User service testing".toUpperCase());
        createUsers(num);
    }
}
