// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datalakeanalytics.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/**
 * Resource collection API of Locations.
 */
public interface Locations {
    /**
     * Gets subscription-level properties and limits for Data Lake Analytics specified by resource location.
     * 
     * @param location The resource location without whitespace.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return subscription-level properties and limits for Data Lake Analytics specified by resource location along
     * with {@link Response}.
     */
    Response<CapabilityInformation> getCapabilityWithResponse(String location, Context context);

    /**
     * Gets subscription-level properties and limits for Data Lake Analytics specified by resource location.
     * 
     * @param location The resource location without whitespace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return subscription-level properties and limits for Data Lake Analytics specified by resource location.
     */
    CapabilityInformation getCapability(String location);
}
