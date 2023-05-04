// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.paloaltonetworks.ngfw.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Data Type for App Seen. */
@Fluent
public final class AppSeenData {
    /*
     * number of rows
     */
    @JsonProperty(value = "count", required = true)
    private int count;

    /*
     * array of appSeen
     */
    @JsonProperty(value = "appSeenList", required = true)
    private List<AppSeenInfo> appSeenList;

    /** Creates an instance of AppSeenData class. */
    public AppSeenData() {
    }

    /**
     * Get the count property: number of rows.
     *
     * @return the count value.
     */
    public int count() {
        return this.count;
    }

    /**
     * Set the count property: number of rows.
     *
     * @param count the count value to set.
     * @return the AppSeenData object itself.
     */
    public AppSeenData withCount(int count) {
        this.count = count;
        return this;
    }

    /**
     * Get the appSeenList property: array of appSeen.
     *
     * @return the appSeenList value.
     */
    public List<AppSeenInfo> appSeenList() {
        return this.appSeenList;
    }

    /**
     * Set the appSeenList property: array of appSeen.
     *
     * @param appSeenList the appSeenList value to set.
     * @return the AppSeenData object itself.
     */
    public AppSeenData withAppSeenList(List<AppSeenInfo> appSeenList) {
        this.appSeenList = appSeenList;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (appSeenList() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property appSeenList in model AppSeenData"));
        } else {
            appSeenList().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(AppSeenData.class);
}