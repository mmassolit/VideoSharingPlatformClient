package com.videosharing.videoSharingPlatformClient.controllers;

import org.apache.http.client.methods.HttpPost;

import com.videosharing.videoSharingPlatformClient.models.BalanceTransaction;

import com.videosharing.videoSharingPlatformClient.payloads.BalanceTransactionPayload;
import com.videosharing.videoSharingPlatformClient.requests.Request;
import com.videosharing.videoSharingPlatformClient.utils.FData;
import com.videosharing.videoSharingPlatformClient.utils.Logging;

import java.io.IOException;

public class BalanceTransactionTest {
    private final String endPoint = "http://localhost:8080/api/balance-transactions";

    private final UserTest userTest = new UserTest();
    
    public void createBalanceTransactions(int num) throws IOException {
        for (int i=0; i< num; i++){
            Request post = Request.builder()
                    .type(new HttpPost(endPoint))
                    .body(new BalanceTransactionPayload(userTest.getRandomUser().getId(), FData.getBalance()))
                    .response(BalanceTransaction.class).build();
            Logging.printObject(post.send(), "Creating BalanceTransaction");
        }
    }

    public void testService(int num) throws IOException{
        System.out.println("BalanceTransaction service testing".toUpperCase());
        createBalanceTransactions(num);
    }
}
