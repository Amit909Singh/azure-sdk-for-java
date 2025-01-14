// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * An Application Insights component feature capability.
 */
@Immutable
public final class ApplicationInsightsComponentFeatureCapability
    implements JsonSerializable<ApplicationInsightsComponentFeatureCapability> {
    /*
     * The name of the capability.
     */
    private String name;

    /*
     * The description of the capability.
     */
    private String description;

    /*
     * The value of the capability.
     */
    private String value;

    /*
     * The unit of the capability.
     */
    private String unit;

    /*
     * The meter used for the capability.
     */
    private String meterId;

    /*
     * The meter rate of the meter.
     */
    private String meterRateFrequency;

    /**
     * Creates an instance of ApplicationInsightsComponentFeatureCapability class.
     */
    public ApplicationInsightsComponentFeatureCapability() {
    }

    /**
     * Get the name property: The name of the capability.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the description property: The description of the capability.
     * 
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Get the value property: The value of the capability.
     * 
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Get the unit property: The unit of the capability.
     * 
     * @return the unit value.
     */
    public String unit() {
        return this.unit;
    }

    /**
     * Get the meterId property: The meter used for the capability.
     * 
     * @return the meterId value.
     */
    public String meterId() {
        return this.meterId;
    }

    /**
     * Get the meterRateFrequency property: The meter rate of the meter.
     * 
     * @return the meterRateFrequency value.
     */
    public String meterRateFrequency() {
        return this.meterRateFrequency;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ApplicationInsightsComponentFeatureCapability from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ApplicationInsightsComponentFeatureCapability if the JsonReader was pointing to an
     * instance of it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ApplicationInsightsComponentFeatureCapability.
     */
    public static ApplicationInsightsComponentFeatureCapability fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ApplicationInsightsComponentFeatureCapability deserializedApplicationInsightsComponentFeatureCapability
                = new ApplicationInsightsComponentFeatureCapability();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("Name".equals(fieldName)) {
                    deserializedApplicationInsightsComponentFeatureCapability.name = reader.getString();
                } else if ("Description".equals(fieldName)) {
                    deserializedApplicationInsightsComponentFeatureCapability.description = reader.getString();
                } else if ("Value".equals(fieldName)) {
                    deserializedApplicationInsightsComponentFeatureCapability.value = reader.getString();
                } else if ("Unit".equals(fieldName)) {
                    deserializedApplicationInsightsComponentFeatureCapability.unit = reader.getString();
                } else if ("MeterId".equals(fieldName)) {
                    deserializedApplicationInsightsComponentFeatureCapability.meterId = reader.getString();
                } else if ("MeterRateFrequency".equals(fieldName)) {
                    deserializedApplicationInsightsComponentFeatureCapability.meterRateFrequency = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedApplicationInsightsComponentFeatureCapability;
        });
    }
}
