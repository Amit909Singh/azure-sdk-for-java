// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databricks.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.databricks.models.PrivateLinkServiceConnectionState;
import com.azure.resourcemanager.databricks.models.PrivateLinkServiceConnectionStatus;
import org.junit.jupiter.api.Assertions;

public final class PrivateLinkServiceConnectionStateTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PrivateLinkServiceConnectionState model =
            BinaryData
                .fromString(
                    "{\"status\":\"Rejected\",\"description\":\"bhtqqrolfpfpsa\",\"actionsRequired\":\"bquxigjy\"}")
                .toObject(PrivateLinkServiceConnectionState.class);
        Assertions.assertEquals(PrivateLinkServiceConnectionStatus.REJECTED, model.status());
        Assertions.assertEquals("bhtqqrolfpfpsa", model.description());
        Assertions.assertEquals("bquxigjy", model.actionsRequired());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PrivateLinkServiceConnectionState model =
            new PrivateLinkServiceConnectionState()
                .withStatus(PrivateLinkServiceConnectionStatus.REJECTED)
                .withDescription("bhtqqrolfpfpsa")
                .withActionsRequired("bquxigjy");
        model = BinaryData.fromObject(model).toObject(PrivateLinkServiceConnectionState.class);
        Assertions.assertEquals(PrivateLinkServiceConnectionStatus.REJECTED, model.status());
        Assertions.assertEquals("bhtqqrolfpfpsa", model.description());
        Assertions.assertEquals("bquxigjy", model.actionsRequired());
    }
}