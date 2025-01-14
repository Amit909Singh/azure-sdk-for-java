// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabric.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Describes the named partition scheme of the service.
 */
@Fluent
public final class NamedPartitionSchemeDescription extends PartitionSchemeDescription {
    /*
     * Specifies how the service is partitioned.
     */
    private PartitionScheme partitionScheme = PartitionScheme.NAMED;

    /*
     * The number of partitions.
     */
    private int count;

    /*
     * Array of size specified by the ‘count’ parameter, for the names of the partitions.
     */
    private List<String> names;

    /**
     * Creates an instance of NamedPartitionSchemeDescription class.
     */
    public NamedPartitionSchemeDescription() {
    }

    /**
     * Get the partitionScheme property: Specifies how the service is partitioned.
     * 
     * @return the partitionScheme value.
     */
    @Override
    public PartitionScheme partitionScheme() {
        return this.partitionScheme;
    }

    /**
     * Get the count property: The number of partitions.
     * 
     * @return the count value.
     */
    public int count() {
        return this.count;
    }

    /**
     * Set the count property: The number of partitions.
     * 
     * @param count the count value to set.
     * @return the NamedPartitionSchemeDescription object itself.
     */
    public NamedPartitionSchemeDescription withCount(int count) {
        this.count = count;
        return this;
    }

    /**
     * Get the names property: Array of size specified by the ‘count’ parameter, for the names of the partitions.
     * 
     * @return the names value.
     */
    public List<String> names() {
        return this.names;
    }

    /**
     * Set the names property: Array of size specified by the ‘count’ parameter, for the names of the partitions.
     * 
     * @param names the names value to set.
     * @return the NamedPartitionSchemeDescription object itself.
     */
    public NamedPartitionSchemeDescription withNames(List<String> names) {
        this.names = names;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        if (names() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property names in model NamedPartitionSchemeDescription"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(NamedPartitionSchemeDescription.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeIntField("count", this.count);
        jsonWriter.writeArrayField("names", this.names, (writer, element) -> writer.writeString(element));
        jsonWriter.writeStringField("partitionScheme",
            this.partitionScheme == null ? null : this.partitionScheme.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of NamedPartitionSchemeDescription from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of NamedPartitionSchemeDescription if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the NamedPartitionSchemeDescription.
     */
    public static NamedPartitionSchemeDescription fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            NamedPartitionSchemeDescription deserializedNamedPartitionSchemeDescription
                = new NamedPartitionSchemeDescription();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("count".equals(fieldName)) {
                    deserializedNamedPartitionSchemeDescription.count = reader.getInt();
                } else if ("names".equals(fieldName)) {
                    List<String> names = reader.readArray(reader1 -> reader1.getString());
                    deserializedNamedPartitionSchemeDescription.names = names;
                } else if ("partitionScheme".equals(fieldName)) {
                    deserializedNamedPartitionSchemeDescription.partitionScheme
                        = PartitionScheme.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedNamedPartitionSchemeDescription;
        });
    }
}
