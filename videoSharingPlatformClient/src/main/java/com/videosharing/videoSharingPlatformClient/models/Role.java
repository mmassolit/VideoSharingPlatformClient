package com.videosharing.videoSharingPlatformClient.models;

import lombok.Data;

@Data
public class Role {
    private String id;
    private String dateCreated;
    private String name;
    private boolean allowedVideos;
    private boolean allowedAds;
}