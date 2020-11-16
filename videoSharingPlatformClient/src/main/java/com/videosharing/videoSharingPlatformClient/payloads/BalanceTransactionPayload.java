package com.videosharing.videoSharingPlatformClient.payloads;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BalanceTransactionPayload {
    private String user;
    private double amount;
}
