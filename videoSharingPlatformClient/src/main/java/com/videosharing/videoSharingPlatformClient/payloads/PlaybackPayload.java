package com.videosharing.videoSharingPlatformClient.payloads;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PlaybackPayload {
    private String user;
    private String video;
    private String ad;
}
