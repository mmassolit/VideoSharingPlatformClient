package com.videosharing.videoSharingPlatformClient.models;

import lombok.Data;

@Data
public class Payment {
    private String id;
    private String dateCreated;
    private User userFrom;
    private User userTo;
    private double amount;
}