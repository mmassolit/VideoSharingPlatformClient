package com.videosharing.videoSharingPlatformClient.models;

import lombok.Data;

@Data
public class Ad {
    private String id;
    private String dateCreated;
    private double cpm;
    private double budget;
    private User user;
}