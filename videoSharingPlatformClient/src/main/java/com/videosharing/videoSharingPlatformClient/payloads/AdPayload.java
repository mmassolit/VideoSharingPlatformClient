package com.videosharing.videoSharingPlatformClient.payloads;

import com.videosharing.videoSharingPlatformClient.models.User;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AdPayload {
    private double cpm;
    private double budget;
    private User user;
}