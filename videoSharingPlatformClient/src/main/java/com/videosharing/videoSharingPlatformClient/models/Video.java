package com.videosharing.videoSharingPlatformClient.models;

import lombok.Data;

@Data
public class Video {
    private String id;
    private String dateCreated;
    private String name;
    private User user;
}