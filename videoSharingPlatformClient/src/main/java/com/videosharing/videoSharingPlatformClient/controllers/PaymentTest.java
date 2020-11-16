package com.videosharing.videoSharingPlatformClient.controllers;

import org.apache.http.client.methods.HttpPost;

import com.videosharing.videoSharingPlatformClient.models.Payment;

import com.videosharing.videoSharingPlatformClient.payloads.PaymentPayload;
import com.videosharing.videoSharingPlatformClient.requests.Request;
import com.videosharing.videoSharingPlatformClient.utils.FData;
import com.videosharing.videoSharingPlatformClient.utils.Logging;

import java.io.IOException;

public class PaymentTest {
    private final String endPoint = "http://localhost:8080/api/payments";

    private final UserTest userTest = new UserTest();
    
    public void createPayments(int num) throws IOException {
        for (int i=0; i< num; i++){
            Request post = Request.builder()
                    .type(new HttpPost(endPoint))
                    .body(new PaymentPayload(userTest.getRandomUser().getId(), userTest.getRandomUser().getId(),  FData.getBalance()))
                    .response(Payment.class).build();
            Logging.printObject(post.send(), "Creating Payment");
        }
    }

    public void testService(int num) throws IOException{
        System.out.println("Payment service testing".toUpperCase());
        createPayments(num);
    }
}
