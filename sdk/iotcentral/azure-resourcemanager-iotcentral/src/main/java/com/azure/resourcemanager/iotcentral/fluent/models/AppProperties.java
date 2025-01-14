// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iotcentral.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.iotcentral.models.AppState;
import com.azure.resourcemanager.iotcentral.models.NetworkRuleSets;
import com.azure.resourcemanager.iotcentral.models.ProvisioningState;
import com.azure.resourcemanager.iotcentral.models.PublicNetworkAccess;
import java.io.IOException;
import java.util.List;

/**
 * The properties of an IoT Central application.
 */
@Fluent
public final class AppProperties implements JsonSerializable<AppProperties> {
    /*
     * The provisioning state of the application.
     */
    private ProvisioningState provisioningState;

    /*
     * The ID of the application.
     */
    private String applicationId;

    /*
     * The display name of the application.
     */
    private String displayName;

    /*
     * The subdomain of the application.
     */
    private String subdomain;

    /*
     * The ID of the application template, which is a blueprint that defines the characteristics and behaviors of an
     * application. Optional; if not specified, defaults to a blank blueprint and allows the application to be defined
     * from scratch.
     */
    private String template;

    /*
     * The current state of the application.
     */
    private AppState state;

    /*
     * Whether requests from the public network are allowed.
     */
    private PublicNetworkAccess publicNetworkAccess;

    /*
     * Network Rule Set Properties of this IoT Central application.
     */
    private NetworkRuleSets networkRuleSets;

    /*
     * Private endpoint connections created on this IoT Central application.
     */
    private List<PrivateEndpointConnectionInner> privateEndpointConnections;

    /**
     * Creates an instance of AppProperties class.
     */
    public AppProperties() {
    }

    /**
     * Get the provisioningState property: The provisioning state of the application.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the applicationId property: The ID of the application.
     * 
     * @return the applicationId value.
     */
    public String applicationId() {
        return this.applicationId;
    }

    /**
     * Get the displayName property: The display name of the application.
     * 
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: The display name of the application.
     * 
     * @param displayName the displayName value to set.
     * @return the AppProperties object itself.
     */
    public AppProperties withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the subdomain property: The subdomain of the application.
     * 
     * @return the subdomain value.
     */
    public String subdomain() {
        return this.subdomain;
    }

    /**
     * Set the subdomain property: The subdomain of the application.
     * 
     * @param subdomain the subdomain value to set.
     * @return the AppProperties object itself.
     */
    public AppProperties withSubdomain(String subdomain) {
        this.subdomain = subdomain;
        return this;
    }

    /**
     * Get the template property: The ID of the application template, which is a blueprint that defines the
     * characteristics and behaviors of an application. Optional; if not specified, defaults to a blank blueprint and
     * allows the application to be defined from scratch.
     * 
     * @return the template value.
     */
    public String template() {
        return this.template;
    }

    /**
     * Set the template property: The ID of the application template, which is a blueprint that defines the
     * characteristics and behaviors of an application. Optional; if not specified, defaults to a blank blueprint and
     * allows the application to be defined from scratch.
     * 
     * @param template the template value to set.
     * @return the AppProperties object itself.
     */
    public AppProperties withTemplate(String template) {
        this.template = template;
        return this;
    }

    /**
     * Get the state property: The current state of the application.
     * 
     * @return the state value.
     */
    public AppState state() {
        return this.state;
    }

    /**
     * Get the publicNetworkAccess property: Whether requests from the public network are allowed.
     * 
     * @return the publicNetworkAccess value.
     */
    public PublicNetworkAccess publicNetworkAccess() {
        return this.publicNetworkAccess;
    }

    /**
     * Set the publicNetworkAccess property: Whether requests from the public network are allowed.
     * 
     * @param publicNetworkAccess the publicNetworkAccess value to set.
     * @return the AppProperties object itself.
     */
    public AppProperties withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess) {
        this.publicNetworkAccess = publicNetworkAccess;
        return this;
    }

    /**
     * Get the networkRuleSets property: Network Rule Set Properties of this IoT Central application.
     * 
     * @return the networkRuleSets value.
     */
    public NetworkRuleSets networkRuleSets() {
        return this.networkRuleSets;
    }

    /**
     * Set the networkRuleSets property: Network Rule Set Properties of this IoT Central application.
     * 
     * @param networkRuleSets the networkRuleSets value to set.
     * @return the AppProperties object itself.
     */
    public AppProperties withNetworkRuleSets(NetworkRuleSets networkRuleSets) {
        this.networkRuleSets = networkRuleSets;
        return this;
    }

    /**
     * Get the privateEndpointConnections property: Private endpoint connections created on this IoT Central
     * application.
     * 
     * @return the privateEndpointConnections value.
     */
    public List<PrivateEndpointConnectionInner> privateEndpointConnections() {
        return this.privateEndpointConnections;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (networkRuleSets() != null) {
            networkRuleSets().validate();
        }
        if (privateEndpointConnections() != null) {
            privateEndpointConnections().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("displayName", this.displayName);
        jsonWriter.writeStringField("subdomain", this.subdomain);
        jsonWriter.writeStringField("template", this.template);
        jsonWriter.writeStringField("publicNetworkAccess",
            this.publicNetworkAccess == null ? null : this.publicNetworkAccess.toString());
        jsonWriter.writeJsonField("networkRuleSets", this.networkRuleSets);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AppProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AppProperties if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the AppProperties.
     */
    public static AppProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AppProperties deserializedAppProperties = new AppProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("provisioningState".equals(fieldName)) {
                    deserializedAppProperties.provisioningState = ProvisioningState.fromString(reader.getString());
                } else if ("applicationId".equals(fieldName)) {
                    deserializedAppProperties.applicationId = reader.getString();
                } else if ("displayName".equals(fieldName)) {
                    deserializedAppProperties.displayName = reader.getString();
                } else if ("subdomain".equals(fieldName)) {
                    deserializedAppProperties.subdomain = reader.getString();
                } else if ("template".equals(fieldName)) {
                    deserializedAppProperties.template = reader.getString();
                } else if ("state".equals(fieldName)) {
                    deserializedAppProperties.state = AppState.fromString(reader.getString());
                } else if ("publicNetworkAccess".equals(fieldName)) {
                    deserializedAppProperties.publicNetworkAccess = PublicNetworkAccess.fromString(reader.getString());
                } else if ("networkRuleSets".equals(fieldName)) {
                    deserializedAppProperties.networkRuleSets = NetworkRuleSets.fromJson(reader);
                } else if ("privateEndpointConnections".equals(fieldName)) {
                    List<PrivateEndpointConnectionInner> privateEndpointConnections
                        = reader.readArray(reader1 -> PrivateEndpointConnectionInner.fromJson(reader1));
                    deserializedAppProperties.privateEndpointConnections = privateEndpointConnections;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAppProperties;
        });
    }
}
