// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.generated;

import com.azure.resourcemanager.synapse.models.CheckNameAvailabilityRequest;

/**
 * Samples for Operations CheckNameAvailability.
 */
public final class OperationsCheckNameAvailabilitySamples {
    /*
     * x-ms-original-file: specification/synapse/resource-manager/Microsoft.Synapse/stable/2021-03-01/examples/
     * CheckNameAvailabilityWorkspaceAlreadyExists.json
     */
    /**
     * Sample code: Check for a workspace name that already exists.
     * 
     * @param manager Entry point to SynapseManager.
     */
    public static void
        checkForAWorkspaceNameThatAlreadyExists(com.azure.resourcemanager.synapse.SynapseManager manager) {
        manager.operations()
            .checkNameAvailabilityWithResponse(
                new CheckNameAvailabilityRequest().withName("workspace1").withType("Microsoft.Synapse/workspaces"),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/synapse/resource-manager/Microsoft.Synapse/stable/2021-03-01/examples/
     * CheckNameAvailabilityWorkspaceAvailable.json
     */
    /**
     * Sample code: Check for a workspace name that is available.
     * 
     * @param manager Entry point to SynapseManager.
     */
    public static void checkForAWorkspaceNameThatIsAvailable(com.azure.resourcemanager.synapse.SynapseManager manager) {
        manager.operations()
            .checkNameAvailabilityWithResponse(new CheckNameAvailabilityRequest().withName("workspace1")
                .withType("Microsoft.ProjectArcadia/workspaces"), com.azure.core.util.Context.NONE);
    }
}
