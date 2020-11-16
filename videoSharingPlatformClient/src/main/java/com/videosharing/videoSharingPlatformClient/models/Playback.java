package com.videosharing.videoSharingPlatformClient.models;

import lombok.Data;

@Data
public class Playback {
    private String id;
    private String dateCreated;
    private User user;
    private Video video;
    private Ad ad;
}