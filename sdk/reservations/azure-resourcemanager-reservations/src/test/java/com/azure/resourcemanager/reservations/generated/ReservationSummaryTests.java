// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.reservations.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.reservations.models.ReservationSummary;

public final class ReservationSummaryTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ReservationSummary model = BinaryData.fromString(
            "{\"succeededCount\":65.17869,\"failedCount\":88.90607,\"expiringCount\":91.838905,\"expiredCount\":63.2669,\"pendingCount\":91.96146,\"cancelledCount\":32.27721,\"processingCount\":29.596352,\"warningCount\":21.768867,\"noBenefitCount\":31.161303}")
            .toObject(ReservationSummary.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ReservationSummary model = new ReservationSummary();
        model = BinaryData.fromObject(model).toObject(ReservationSummary.class);
    }
}
