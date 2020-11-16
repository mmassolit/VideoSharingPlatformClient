package com.videosharing.videoSharingPlatformClient.payloads;

import com.videosharing.videoSharingPlatformClient.models.Ad;
import com.videosharing.videoSharingPlatformClient.models.User;
import com.videosharing.videoSharingPlatformClient.models.Video;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PlaybackPayload {
    private User user;
    private Video video;
    private Ad ad;
}
