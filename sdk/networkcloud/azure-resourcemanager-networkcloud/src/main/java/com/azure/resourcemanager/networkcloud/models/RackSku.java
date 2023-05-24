// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.models;

import com.azure.core.management.SystemData;
import com.azure.resourcemanager.networkcloud.fluent.models.RackSkuInner;
import java.util.List;

/** An immutable client-side representation of RackSku. */
public interface RackSku {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the computeMachines property: The list of machine SKUs and associated rack slot for the compute-dedicated
     * machines in this rack model.
     *
     * @return the computeMachines value.
     */
    List<MachineSkuSlot> computeMachines();

    /**
     * Gets the controllerMachines property: The list of machine SKUs and associated rack slot for the control-plane
     * dedicated machines in this rack model.
     *
     * @return the controllerMachines value.
     */
    List<MachineSkuSlot> controllerMachines();

    /**
     * Gets the description property: The free-form text describing the rack.
     *
     * @return the description value.
     */
    String description();

    /**
     * Gets the maxClusterSlots property: The maximum number of compute racks supported by an aggregator rack. 0 if this
     * is a compute rack or a rack for a single rack cluster(rackType="Single").
     *
     * @return the maxClusterSlots value.
     */
    Long maxClusterSlots();

    /**
     * Gets the provisioningState property: The provisioning state of the rack SKU resource.
     *
     * @return the provisioningState value.
     */
    RackSkuProvisioningState provisioningState();

    /**
     * Gets the rackType property: The type of the rack.
     *
     * @return the rackType value.
     */
    RackSkuType rackType();

    /**
     * Gets the storageAppliances property: The list of appliance SKUs and associated rack slot for the storage
     * appliance(s) in this rack model.
     *
     * @return the storageAppliances value.
     */
    List<StorageApplianceSkuSlot> storageAppliances();

    /**
     * Gets the supportedRackSkuIds property: The list of supported SKUs if the rack is an aggregator.
     *
     * @return the supportedRackSkuIds value.
     */
    List<String> supportedRackSkuIds();

    /**
     * Gets the inner com.azure.resourcemanager.networkcloud.fluent.models.RackSkuInner object.
     *
     * @return the inner object.
     */
    RackSkuInner innerModel();
}