package com.videosharing.videoSharingPlatformClient;

import com.videosharing.videoSharingPlatformClient.controllers.*;

public class VideoSharingPlatformClientApplication {
    public static void main( String[] args ) {
        try{
            RoleTest roleTest = new RoleTest();
            UserTest userTest = new UserTest();
            BalanceTransactionTest balanceTransactionTest = new BalanceTransactionTest();
            AdTest adTest = new AdTest();
            VideoTest videoTest = new VideoTest();
            PaymentTest paymentTest = new PaymentTest();
            PlaybackTest playbackTest = new PlaybackTest();

            roleTest.testService(2);
            userTest.testService(5);
            balanceTransactionTest.testService(10);
            adTest.testService(10);
            videoTest.testService(10);
            paymentTest.testService(3);
            playbackTest.testService(100);
            
        } catch (Exception e){
            System.out.println(e.toString());
        }
    }
}