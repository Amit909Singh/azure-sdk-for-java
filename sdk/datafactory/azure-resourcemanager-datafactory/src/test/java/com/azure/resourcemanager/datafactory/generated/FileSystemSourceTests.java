// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.FileSystemSource;

public final class FileSystemSourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        FileSystemSource model = BinaryData.fromString(
            "{\"type\":\"FileSystemSource\",\"recursive\":\"datamihgksqwzuosyyx\",\"additionalColumns\":\"datadxzudfar\",\"sourceRetryCount\":\"datayrdy\",\"sourceRetryWait\":\"datawgikpdpudqiwhvx\",\"maxConcurrentConnections\":\"datavpoeuufw\",\"disableMetricsCollection\":\"datadeffrbxzjedy\",\"\":{\"lnomqbdvjl\":\"datasxspnmfydphl\",\"lbpehvjpgllrhnlx\":\"dataf\",\"dchdsxvkmgppxz\":\"datatpgzybezmyjq\"}}")
            .toObject(FileSystemSource.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        FileSystemSource model = new FileSystemSource().withSourceRetryCount("datayrdy")
            .withSourceRetryWait("datawgikpdpudqiwhvx")
            .withMaxConcurrentConnections("datavpoeuufw")
            .withDisableMetricsCollection("datadeffrbxzjedy")
            .withRecursive("datamihgksqwzuosyyx")
            .withAdditionalColumns("datadxzudfar");
        model = BinaryData.fromObject(model).toObject(FileSystemSource.class);
    }
}
