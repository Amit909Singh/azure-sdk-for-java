// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.deviceprovisioningservices.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SystemData;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.deviceprovisioningservices.models.IotDpsPropertiesDescription;
import com.azure.resourcemanager.deviceprovisioningservices.models.IotDpsSkuInfo;
import java.io.IOException;
import java.util.Map;

/**
 * The description of the provisioning service.
 */
@Fluent
public final class ProvisioningServiceDescriptionInner extends Resource {
    /*
     * The Etag field is *not* required. If it is provided in the response body, it must also be provided as a header
     * per the normal ETag convention.
     */
    private String etag;

    /*
     * Service specific properties for a provisioning service
     */
    private IotDpsPropertiesDescription properties;

    /*
     * Sku info for a provisioning Service.
     */
    private IotDpsSkuInfo sku;

    /*
     * Metadata pertaining to creation and last modification of the resource.
     */
    private SystemData systemData;

    /*
     * The type of the resource.
     */
    private String type;

    /*
     * The name of the resource.
     */
    private String name;

    /*
     * Fully qualified resource Id for the resource.
     */
    private String id;

    /**
     * Creates an instance of ProvisioningServiceDescriptionInner class.
     */
    public ProvisioningServiceDescriptionInner() {
    }

    /**
     * Get the etag property: The Etag field is *not* required. If it is provided in the response body, it must also be
     * provided as a header per the normal ETag convention.
     * 
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set the etag property: The Etag field is *not* required. If it is provided in the response body, it must also be
     * provided as a header per the normal ETag convention.
     * 
     * @param etag the etag value to set.
     * @return the ProvisioningServiceDescriptionInner object itself.
     */
    public ProvisioningServiceDescriptionInner withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * Get the properties property: Service specific properties for a provisioning service.
     * 
     * @return the properties value.
     */
    public IotDpsPropertiesDescription properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Service specific properties for a provisioning service.
     * 
     * @param properties the properties value to set.
     * @return the ProvisioningServiceDescriptionInner object itself.
     */
    public ProvisioningServiceDescriptionInner withProperties(IotDpsPropertiesDescription properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the sku property: Sku info for a provisioning Service.
     * 
     * @return the sku value.
     */
    public IotDpsSkuInfo sku() {
        return this.sku;
    }

    /**
     * Set the sku property: Sku info for a provisioning Service.
     * 
     * @param sku the sku value to set.
     * @return the ProvisioningServiceDescriptionInner object itself.
     */
    public ProvisioningServiceDescriptionInner withSku(IotDpsSkuInfo sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the systemData property: Metadata pertaining to creation and last modification of the resource.
     * 
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the type property: The type of the resource.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the name property: The name of the resource.
     * 
     * @return the name value.
     */
    @Override
    public String name() {
        return this.name;
    }

    /**
     * Get the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    @Override
    public String id() {
        return this.id;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProvisioningServiceDescriptionInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProvisioningServiceDescriptionInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property properties in model ProvisioningServiceDescriptionInner"));
        } else {
            properties().validate();
        }
        if (sku() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property sku in model ProvisioningServiceDescriptionInner"));
        } else {
            sku().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ProvisioningServiceDescriptionInner.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("location", location());
        jsonWriter.writeMapField("tags", tags(), (writer, element) -> writer.writeString(element));
        jsonWriter.writeJsonField("properties", this.properties);
        jsonWriter.writeJsonField("sku", this.sku);
        jsonWriter.writeStringField("etag", this.etag);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ProvisioningServiceDescriptionInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ProvisioningServiceDescriptionInner if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ProvisioningServiceDescriptionInner.
     */
    public static ProvisioningServiceDescriptionInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ProvisioningServiceDescriptionInner deserializedProvisioningServiceDescriptionInner
                = new ProvisioningServiceDescriptionInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedProvisioningServiceDescriptionInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedProvisioningServiceDescriptionInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedProvisioningServiceDescriptionInner.type = reader.getString();
                } else if ("location".equals(fieldName)) {
                    deserializedProvisioningServiceDescriptionInner.withLocation(reader.getString());
                } else if ("tags".equals(fieldName)) {
                    Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                    deserializedProvisioningServiceDescriptionInner.withTags(tags);
                } else if ("properties".equals(fieldName)) {
                    deserializedProvisioningServiceDescriptionInner.properties
                        = IotDpsPropertiesDescription.fromJson(reader);
                } else if ("sku".equals(fieldName)) {
                    deserializedProvisioningServiceDescriptionInner.sku = IotDpsSkuInfo.fromJson(reader);
                } else if ("etag".equals(fieldName)) {
                    deserializedProvisioningServiceDescriptionInner.etag = reader.getString();
                } else if ("systemData".equals(fieldName)) {
                    deserializedProvisioningServiceDescriptionInner.systemData = SystemData.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedProvisioningServiceDescriptionInner;
        });
    }
}
