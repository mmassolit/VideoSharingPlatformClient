package com.videosharing.videoSharingPlatformClient.payloads;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PaymentPayload {
    private String userFrom;
    private String userTo;
    private double amount;
}
