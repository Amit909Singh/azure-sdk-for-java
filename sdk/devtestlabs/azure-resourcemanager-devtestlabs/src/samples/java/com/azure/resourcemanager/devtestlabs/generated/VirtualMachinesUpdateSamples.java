// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.generated;

import com.azure.resourcemanager.devtestlabs.models.LabVirtualMachine;

/**
 * Samples for VirtualMachines Update.
 */
public final class VirtualMachinesUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/devtestlabs/resource-manager/Microsoft.DevTestLab/stable/2018-09-15/examples/VirtualMachines_Update
     * .json
     */
    /**
     * Sample code: VirtualMachines_Update.
     * 
     * @param manager Entry point to DevTestLabsManager.
     */
    public static void virtualMachinesUpdate(com.azure.resourcemanager.devtestlabs.DevTestLabsManager manager) {
        LabVirtualMachine resource = manager.virtualMachines()
            .getWithResponse("resourceGroupName", "{labName}", "{vmName}", null, com.azure.core.util.Context.NONE)
            .getValue();
        resource.update().apply();
    }
}
