package com.videosharing.videoSharingPlatformClient.payloads;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class RolePayload {
    private String name;
    private boolean allowedVideos;
    private boolean allowedAds;
}
