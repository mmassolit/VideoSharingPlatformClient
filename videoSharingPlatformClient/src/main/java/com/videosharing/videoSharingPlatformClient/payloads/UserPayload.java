package com.videosharing.videoSharingPlatformClient.payloads;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserPayload {
	private String role;
    private String name;
    private String password;
    private String email;
}
