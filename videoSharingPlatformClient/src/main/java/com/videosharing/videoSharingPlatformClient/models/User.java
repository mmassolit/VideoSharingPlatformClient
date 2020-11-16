package com.videosharing.videoSharingPlatformClient.models;

import lombok.Data;

@Data
public class User {
    private String id;
    private String dateCreated;
    private Role role;
    private String name;
    private String password;
    private String email;
    private double balance;
}