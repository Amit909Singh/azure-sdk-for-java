// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated;

/**
 * Samples for StreamingEndpoints Get.
 */
public final class StreamingEndpointsGetSamples {
    /*
     * x-ms-original-file:
     * specification/mediaservices/resource-manager/Microsoft.Media/Streaming/stable/2022-11-01/examples/
     * streamingendpoint-list-by-name.json
     */
    /**
     * Sample code: Get a streaming endpoint by name.
     * 
     * @param manager Entry point to MediaServicesManager.
     */
    public static void
        getAStreamingEndpointByName(com.azure.resourcemanager.mediaservices.MediaServicesManager manager) {
        manager.streamingEndpoints()
            .getWithResponse("mediaresources", "slitestmedia10", "myStreamingEndpoint1",
                com.azure.core.util.Context.NONE);
    }
}
