// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.networkcloud.models.OsDisk;
import com.azure.resourcemanager.networkcloud.models.OsDiskCreateOption;
import com.azure.resourcemanager.networkcloud.models.OsDiskDeleteOption;
import org.junit.jupiter.api.Assertions;

public final class OsDiskTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        OsDisk model =
            BinaryData
                .fromString(
                    "{\"createOption\":\"Ephemeral\",\"deleteOption\":\"Delete\",\"diskSizeGB\":8296239298192767191}")
                .toObject(OsDisk.class);
        Assertions.assertEquals(OsDiskCreateOption.EPHEMERAL, model.createOption());
        Assertions.assertEquals(OsDiskDeleteOption.DELETE, model.deleteOption());
        Assertions.assertEquals(8296239298192767191L, model.diskSizeGB());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        OsDisk model =
            new OsDisk()
                .withCreateOption(OsDiskCreateOption.EPHEMERAL)
                .withDeleteOption(OsDiskDeleteOption.DELETE)
                .withDiskSizeGB(8296239298192767191L);
        model = BinaryData.fromObject(model).toObject(OsDisk.class);
        Assertions.assertEquals(OsDiskCreateOption.EPHEMERAL, model.createOption());
        Assertions.assertEquals(OsDiskDeleteOption.DELETE, model.deleteOption());
        Assertions.assertEquals(8296239298192767191L, model.diskSizeGB());
    }
}