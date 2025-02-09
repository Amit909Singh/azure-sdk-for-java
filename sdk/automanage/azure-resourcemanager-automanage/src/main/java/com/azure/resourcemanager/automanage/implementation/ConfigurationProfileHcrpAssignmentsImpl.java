// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automanage.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.automanage.fluent.ConfigurationProfileHcrpAssignmentsClient;
import com.azure.resourcemanager.automanage.fluent.models.ConfigurationProfileAssignmentInner;
import com.azure.resourcemanager.automanage.models.ConfigurationProfileAssignment;
import com.azure.resourcemanager.automanage.models.ConfigurationProfileHcrpAssignments;

public final class ConfigurationProfileHcrpAssignmentsImpl implements ConfigurationProfileHcrpAssignments {
    private static final ClientLogger LOGGER = new ClientLogger(ConfigurationProfileHcrpAssignmentsImpl.class);

    private final ConfigurationProfileHcrpAssignmentsClient innerClient;

    private final com.azure.resourcemanager.automanage.AutomanageManager serviceManager;

    public ConfigurationProfileHcrpAssignmentsImpl(ConfigurationProfileHcrpAssignmentsClient innerClient,
        com.azure.resourcemanager.automanage.AutomanageManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<ConfigurationProfileAssignment> createOrUpdateWithResponse(String resourceGroupName,
        String machineName, String configurationProfileAssignmentName, ConfigurationProfileAssignmentInner parameters,
        Context context) {
        Response<ConfigurationProfileAssignmentInner> inner = this.serviceClient()
            .createOrUpdateWithResponse(resourceGroupName, machineName, configurationProfileAssignmentName, parameters,
                context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new ConfigurationProfileAssignmentImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ConfigurationProfileAssignment createOrUpdate(String resourceGroupName, String machineName,
        String configurationProfileAssignmentName, ConfigurationProfileAssignmentInner parameters) {
        ConfigurationProfileAssignmentInner inner = this.serviceClient()
            .createOrUpdate(resourceGroupName, machineName, configurationProfileAssignmentName, parameters);
        if (inner != null) {
            return new ConfigurationProfileAssignmentImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ConfigurationProfileAssignment> getWithResponse(String resourceGroupName, String machineName,
        String configurationProfileAssignmentName, Context context) {
        Response<ConfigurationProfileAssignmentInner> inner = this.serviceClient()
            .getWithResponse(resourceGroupName, machineName, configurationProfileAssignmentName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new ConfigurationProfileAssignmentImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ConfigurationProfileAssignment get(String resourceGroupName, String machineName,
        String configurationProfileAssignmentName) {
        ConfigurationProfileAssignmentInner inner
            = this.serviceClient().get(resourceGroupName, machineName, configurationProfileAssignmentName);
        if (inner != null) {
            return new ConfigurationProfileAssignmentImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Void> deleteWithResponse(String resourceGroupName, String machineName,
        String configurationProfileAssignmentName, Context context) {
        return this.serviceClient()
            .deleteWithResponse(resourceGroupName, machineName, configurationProfileAssignmentName, context);
    }

    public void delete(String resourceGroupName, String machineName, String configurationProfileAssignmentName) {
        this.serviceClient().delete(resourceGroupName, machineName, configurationProfileAssignmentName);
    }

    private ConfigurationProfileHcrpAssignmentsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.automanage.AutomanageManager manager() {
        return this.serviceManager;
    }
}
