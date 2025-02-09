// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.Duration;

/**
 * Number of rejected cloud to device messages (HTTP protocol) is not in allowed range.
 */
@Fluent
public final class HttpC2DRejectedMessagesNotInAllowedRange extends TimeWindowCustomAlertRule {
    /*
     * The type of the custom alert rule.
     */
    private String ruleType = "HttpC2DRejectedMessagesNotInAllowedRange";

    /**
     * Creates an instance of HttpC2DRejectedMessagesNotInAllowedRange class.
     */
    public HttpC2DRejectedMessagesNotInAllowedRange() {
    }

    /**
     * Get the ruleType property: The type of the custom alert rule.
     * 
     * @return the ruleType value.
     */
    @Override
    public String ruleType() {
        return this.ruleType;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HttpC2DRejectedMessagesNotInAllowedRange withTimeWindowSize(Duration timeWindowSize) {
        super.withTimeWindowSize(timeWindowSize);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HttpC2DRejectedMessagesNotInAllowedRange withMinThreshold(int minThreshold) {
        super.withMinThreshold(minThreshold);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HttpC2DRejectedMessagesNotInAllowedRange withMaxThreshold(int maxThreshold) {
        super.withMaxThreshold(maxThreshold);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HttpC2DRejectedMessagesNotInAllowedRange withIsEnabled(boolean isEnabled) {
        super.withIsEnabled(isEnabled);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        if (timeWindowSize() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property timeWindowSize in model HttpC2DRejectedMessagesNotInAllowedRange"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(HttpC2DRejectedMessagesNotInAllowedRange.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeBooleanField("isEnabled", isEnabled());
        jsonWriter.writeIntField("minThreshold", minThreshold());
        jsonWriter.writeIntField("maxThreshold", maxThreshold());
        jsonWriter.writeStringField("timeWindowSize", CoreUtils.durationToStringWithDays(timeWindowSize()));
        jsonWriter.writeStringField("ruleType", this.ruleType);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of HttpC2DRejectedMessagesNotInAllowedRange from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of HttpC2DRejectedMessagesNotInAllowedRange if the JsonReader was pointing to an instance of
     * it, or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the HttpC2DRejectedMessagesNotInAllowedRange.
     */
    public static HttpC2DRejectedMessagesNotInAllowedRange fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            HttpC2DRejectedMessagesNotInAllowedRange deserializedHttpC2DRejectedMessagesNotInAllowedRange
                = new HttpC2DRejectedMessagesNotInAllowedRange();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("isEnabled".equals(fieldName)) {
                    deserializedHttpC2DRejectedMessagesNotInAllowedRange.withIsEnabled(reader.getBoolean());
                } else if ("minThreshold".equals(fieldName)) {
                    deserializedHttpC2DRejectedMessagesNotInAllowedRange.withMinThreshold(reader.getInt());
                } else if ("maxThreshold".equals(fieldName)) {
                    deserializedHttpC2DRejectedMessagesNotInAllowedRange.withMaxThreshold(reader.getInt());
                } else if ("timeWindowSize".equals(fieldName)) {
                    deserializedHttpC2DRejectedMessagesNotInAllowedRange.withTimeWindowSize(
                        reader.getNullable(nonNullReader -> Duration.parse(nonNullReader.getString())));
                } else if ("displayName".equals(fieldName)) {
                    deserializedHttpC2DRejectedMessagesNotInAllowedRange.withDisplayName(reader.getString());
                } else if ("description".equals(fieldName)) {
                    deserializedHttpC2DRejectedMessagesNotInAllowedRange.withDescription(reader.getString());
                } else if ("ruleType".equals(fieldName)) {
                    deserializedHttpC2DRejectedMessagesNotInAllowedRange.ruleType = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedHttpC2DRejectedMessagesNotInAllowedRange;
        });
    }
}
