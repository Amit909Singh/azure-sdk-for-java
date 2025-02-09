// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elasticsan.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.elasticsan.fluent.models.ElasticSanUpdateProperties;
import java.io.IOException;
import java.util.Map;

/**
 * Response for ElasticSan update request.
 */
@Fluent
public final class ElasticSanUpdate implements JsonSerializable<ElasticSanUpdate> {
    /*
     * Properties of ElasticSan.
     */
    private ElasticSanUpdateProperties innerProperties;

    /*
     * Update tags
     */
    private Map<String, String> tags;

    /**
     * Creates an instance of ElasticSanUpdate class.
     */
    public ElasticSanUpdate() {
    }

    /**
     * Get the innerProperties property: Properties of ElasticSan.
     * 
     * @return the innerProperties value.
     */
    private ElasticSanUpdateProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the tags property: Update tags.
     * 
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Update tags.
     * 
     * @param tags the tags value to set.
     * @return the ElasticSanUpdate object itself.
     */
    public ElasticSanUpdate withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the baseSizeTiB property: Base size of the Elastic San appliance in TiB.
     * 
     * @return the baseSizeTiB value.
     */
    public Long baseSizeTiB() {
        return this.innerProperties() == null ? null : this.innerProperties().baseSizeTiB();
    }

    /**
     * Set the baseSizeTiB property: Base size of the Elastic San appliance in TiB.
     * 
     * @param baseSizeTiB the baseSizeTiB value to set.
     * @return the ElasticSanUpdate object itself.
     */
    public ElasticSanUpdate withBaseSizeTiB(Long baseSizeTiB) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ElasticSanUpdateProperties();
        }
        this.innerProperties().withBaseSizeTiB(baseSizeTiB);
        return this;
    }

    /**
     * Get the extendedCapacitySizeTiB property: Extended size of the Elastic San appliance in TiB.
     * 
     * @return the extendedCapacitySizeTiB value.
     */
    public Long extendedCapacitySizeTiB() {
        return this.innerProperties() == null ? null : this.innerProperties().extendedCapacitySizeTiB();
    }

    /**
     * Set the extendedCapacitySizeTiB property: Extended size of the Elastic San appliance in TiB.
     * 
     * @param extendedCapacitySizeTiB the extendedCapacitySizeTiB value to set.
     * @return the ElasticSanUpdate object itself.
     */
    public ElasticSanUpdate withExtendedCapacitySizeTiB(Long extendedCapacitySizeTiB) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ElasticSanUpdateProperties();
        }
        this.innerProperties().withExtendedCapacitySizeTiB(extendedCapacitySizeTiB);
        return this;
    }

    /**
     * Get the publicNetworkAccess property: Allow or disallow public network access to ElasticSan Account. Value is
     * optional but if passed in, must be 'Enabled' or 'Disabled'.
     * 
     * @return the publicNetworkAccess value.
     */
    public PublicNetworkAccess publicNetworkAccess() {
        return this.innerProperties() == null ? null : this.innerProperties().publicNetworkAccess();
    }

    /**
     * Set the publicNetworkAccess property: Allow or disallow public network access to ElasticSan Account. Value is
     * optional but if passed in, must be 'Enabled' or 'Disabled'.
     * 
     * @param publicNetworkAccess the publicNetworkAccess value to set.
     * @return the ElasticSanUpdate object itself.
     */
    public ElasticSanUpdate withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ElasticSanUpdateProperties();
        }
        this.innerProperties().withPublicNetworkAccess(publicNetworkAccess);
        return this;
    }

    /**
     * Get the autoScaleProperties property: Auto Scale Properties for Elastic San Appliance.
     * 
     * @return the autoScaleProperties value.
     */
    public AutoScaleProperties autoScaleProperties() {
        return this.innerProperties() == null ? null : this.innerProperties().autoScaleProperties();
    }

    /**
     * Set the autoScaleProperties property: Auto Scale Properties for Elastic San Appliance.
     * 
     * @param autoScaleProperties the autoScaleProperties value to set.
     * @return the ElasticSanUpdate object itself.
     */
    public ElasticSanUpdate withAutoScaleProperties(AutoScaleProperties autoScaleProperties) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ElasticSanUpdateProperties();
        }
        this.innerProperties().withAutoScaleProperties(autoScaleProperties);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("properties", this.innerProperties);
        jsonWriter.writeMapField("tags", this.tags, (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ElasticSanUpdate from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ElasticSanUpdate if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the ElasticSanUpdate.
     */
    public static ElasticSanUpdate fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ElasticSanUpdate deserializedElasticSanUpdate = new ElasticSanUpdate();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("properties".equals(fieldName)) {
                    deserializedElasticSanUpdate.innerProperties = ElasticSanUpdateProperties.fromJson(reader);
                } else if ("tags".equals(fieldName)) {
                    Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                    deserializedElasticSanUpdate.tags = tags;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedElasticSanUpdate;
        });
    }
}
