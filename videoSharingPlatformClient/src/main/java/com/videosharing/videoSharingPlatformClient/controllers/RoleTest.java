package com.videosharing.videoSharingPlatformClient.controllers;

import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;

import com.videosharing.videoSharingPlatformClient.models.Role;
import com.videosharing.videoSharingPlatformClient.payloads.RolePayload;
import com.videosharing.videoSharingPlatformClient.requests.Request;
import com.videosharing.videoSharingPlatformClient.utils.FData;
import com.videosharing.videoSharingPlatformClient.utils.Logging;

import java.io.IOException;
import java.util.Random;

public class RoleTest {
    private final String endPoint = "http://localhost:8080/api/roles";

    private final Random rand = new Random();

    public void createRoles(int num) throws IOException {
        for (int i=0; i < num; i++){
            Request post = Request.builder()
                    .type(new HttpPost(endPoint))
                    .body(new RolePayload(FData.getRole(), true, true))
                    .response(Role.class).build();
            Logging.printObject(post.send(), "Creating Role");
        }
    }

    public Role getRandomRole() throws IOException {
        Request get = Request.builder()
		                .type(new HttpGet(endPoint))
		                .body(null)
		                .response(Role[].class).build();
        Role[] roles = (Role[]) get.send();
        
        return roles[rand.nextInt(roles.length)];
    }


    public void testService(int num) throws IOException{
        System.out.println("Role service testing".toUpperCase());
        createRoles(num);
    }
}
