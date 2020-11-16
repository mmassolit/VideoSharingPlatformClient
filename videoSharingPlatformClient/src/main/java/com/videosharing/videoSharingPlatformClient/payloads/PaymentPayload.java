package com.videosharing.videoSharingPlatformClient.payloads;

import com.videosharing.videoSharingPlatformClient.models.User;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PaymentPayload {
    private User userFrom;
    private User userTo;
    private double amount;
}
