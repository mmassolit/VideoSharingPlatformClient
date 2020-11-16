package com.videosharing.videoSharingPlatformClient.payloads;

import com.videosharing.videoSharingPlatformClient.models.User;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BalanceTransactionPayload {
    private User user;
    private double amount;
}
