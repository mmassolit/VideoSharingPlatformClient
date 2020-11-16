package com.videosharing.videoSharingPlatformClient.payloads;

import com.videosharing.videoSharingPlatformClient.models.Role;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserPayload {
    private String name;
    private String password;
    private String email;
    private Role role;
}
