// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.streamanalytics.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Describes the error that occurred.
 */
@Immutable
public final class ErrorResponse implements JsonSerializable<ErrorResponse> {
    /*
     * Error code associated with the error that occurred.
     */
    private String code;

    /*
     * Describes the error in detail.
     */
    private String message;

    /**
     * Creates an instance of ErrorResponse class.
     */
    public ErrorResponse() {
    }

    /**
     * Get the code property: Error code associated with the error that occurred.
     * 
     * @return the code value.
     */
    public String code() {
        return this.code;
    }

    /**
     * Get the message property: Describes the error in detail.
     * 
     * @return the message value.
     */
    public String message() {
        return this.message;
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
     * Reads an instance of ErrorResponse from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ErrorResponse if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the ErrorResponse.
     */
    public static ErrorResponse fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ErrorResponse deserializedErrorResponse = new ErrorResponse();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("code".equals(fieldName)) {
                    deserializedErrorResponse.code = reader.getString();
                } else if ("message".equals(fieldName)) {
                    deserializedErrorResponse.message = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedErrorResponse;
        });
    }
}
