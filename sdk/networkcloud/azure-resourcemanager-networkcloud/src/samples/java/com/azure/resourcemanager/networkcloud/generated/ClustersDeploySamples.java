// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.generated;

import com.azure.resourcemanager.networkcloud.models.ClusterDeployParameters;
import java.util.Arrays;

/** Samples for Clusters Deploy. */
public final class ClustersDeploySamples {
    /*
     * x-ms-original-file: specification/networkcloud/resource-manager/Microsoft.NetworkCloud/preview/2022-12-12-preview/examples/Clusters_Deploy.json
     */
    /**
     * Sample code: Deploy cluster.
     *
     * @param manager Entry point to NetworkCloudManager.
     */
    public static void deployCluster(com.azure.resourcemanager.networkcloud.NetworkCloudManager manager) {
        manager
            .clusters()
            .deploy(
                "resourceGroupName", "clusterName", new ClusterDeployParameters(), com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/networkcloud/resource-manager/Microsoft.NetworkCloud/preview/2022-12-12-preview/examples/Clusters_Deploy_SkipValidation.json
     */
    /**
     * Sample code: Deploy cluster skipping validation.
     *
     * @param manager Entry point to NetworkCloudManager.
     */
    public static void deployClusterSkippingValidation(
        com.azure.resourcemanager.networkcloud.NetworkCloudManager manager) {
        manager
            .clusters()
            .deploy(
                "resourceGroupName",
                "clusterName",
                new ClusterDeployParameters().withSkipValidationsForMachines(Arrays.asList("bmmName1")),
                com.azure.core.util.Context.NONE);
    }
}