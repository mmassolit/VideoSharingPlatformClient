package com.videosharing.videoSharingPlatformClient.models;

import lombok.Data;

@Data
public class BalanceTransaction {
    private String id;
    private String dateCreated;
    private User user;
    private double amount;
}