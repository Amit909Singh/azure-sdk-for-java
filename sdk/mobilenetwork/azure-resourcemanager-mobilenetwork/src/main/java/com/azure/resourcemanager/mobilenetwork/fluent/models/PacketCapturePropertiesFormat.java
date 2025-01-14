// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.mobilenetwork.models.PacketCaptureStatus;
import com.azure.resourcemanager.mobilenetwork.models.ProvisioningState;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.List;

/**
 * Packet capture session properties.
 */
@Fluent
public final class PacketCapturePropertiesFormat implements JsonSerializable<PacketCapturePropertiesFormat> {
    /*
     * The provisioning state of the packet capture session resource.
     */
    private ProvisioningState provisioningState;

    /*
     * The status of the packet capture session.
     */
    private PacketCaptureStatus status;

    /*
     * The reason the current packet capture session state.
     */
    private String reason;

    /*
     * The start time of the packet capture session.
     */
    private OffsetDateTime captureStartTime;

    /*
     * List of network interfaces to capture on.
     */
    private List<String> networkInterfaces;

    /*
     * Number of bytes captured per packet, the remaining bytes are truncated. The default "0" means the entire packet
     * is captured.
     */
    private Long bytesToCapturePerPacket;

    /*
     * Maximum size of the capture output.
     */
    private Long totalBytesPerSession;

    /*
     * Maximum duration of the capture session in seconds.
     */
    private Integer timeLimitInSeconds;

    /*
     * The list of output files of a packet capture session.
     */
    private List<String> outputFiles;

    /**
     * Creates an instance of PacketCapturePropertiesFormat class.
     */
    public PacketCapturePropertiesFormat() {
    }

    /**
     * Get the provisioningState property: The provisioning state of the packet capture session resource.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the status property: The status of the packet capture session.
     * 
     * @return the status value.
     */
    public PacketCaptureStatus status() {
        return this.status;
    }

    /**
     * Get the reason property: The reason the current packet capture session state.
     * 
     * @return the reason value.
     */
    public String reason() {
        return this.reason;
    }

    /**
     * Get the captureStartTime property: The start time of the packet capture session.
     * 
     * @return the captureStartTime value.
     */
    public OffsetDateTime captureStartTime() {
        return this.captureStartTime;
    }

    /**
     * Get the networkInterfaces property: List of network interfaces to capture on.
     * 
     * @return the networkInterfaces value.
     */
    public List<String> networkInterfaces() {
        return this.networkInterfaces;
    }

    /**
     * Set the networkInterfaces property: List of network interfaces to capture on.
     * 
     * @param networkInterfaces the networkInterfaces value to set.
     * @return the PacketCapturePropertiesFormat object itself.
     */
    public PacketCapturePropertiesFormat withNetworkInterfaces(List<String> networkInterfaces) {
        this.networkInterfaces = networkInterfaces;
        return this;
    }

    /**
     * Get the bytesToCapturePerPacket property: Number of bytes captured per packet, the remaining bytes are truncated.
     * The default "0" means the entire packet is captured.
     * 
     * @return the bytesToCapturePerPacket value.
     */
    public Long bytesToCapturePerPacket() {
        return this.bytesToCapturePerPacket;
    }

    /**
     * Set the bytesToCapturePerPacket property: Number of bytes captured per packet, the remaining bytes are truncated.
     * The default "0" means the entire packet is captured.
     * 
     * @param bytesToCapturePerPacket the bytesToCapturePerPacket value to set.
     * @return the PacketCapturePropertiesFormat object itself.
     */
    public PacketCapturePropertiesFormat withBytesToCapturePerPacket(Long bytesToCapturePerPacket) {
        this.bytesToCapturePerPacket = bytesToCapturePerPacket;
        return this;
    }

    /**
     * Get the totalBytesPerSession property: Maximum size of the capture output.
     * 
     * @return the totalBytesPerSession value.
     */
    public Long totalBytesPerSession() {
        return this.totalBytesPerSession;
    }

    /**
     * Set the totalBytesPerSession property: Maximum size of the capture output.
     * 
     * @param totalBytesPerSession the totalBytesPerSession value to set.
     * @return the PacketCapturePropertiesFormat object itself.
     */
    public PacketCapturePropertiesFormat withTotalBytesPerSession(Long totalBytesPerSession) {
        this.totalBytesPerSession = totalBytesPerSession;
        return this;
    }

    /**
     * Get the timeLimitInSeconds property: Maximum duration of the capture session in seconds.
     * 
     * @return the timeLimitInSeconds value.
     */
    public Integer timeLimitInSeconds() {
        return this.timeLimitInSeconds;
    }

    /**
     * Set the timeLimitInSeconds property: Maximum duration of the capture session in seconds.
     * 
     * @param timeLimitInSeconds the timeLimitInSeconds value to set.
     * @return the PacketCapturePropertiesFormat object itself.
     */
    public PacketCapturePropertiesFormat withTimeLimitInSeconds(Integer timeLimitInSeconds) {
        this.timeLimitInSeconds = timeLimitInSeconds;
        return this;
    }

    /**
     * Get the outputFiles property: The list of output files of a packet capture session.
     * 
     * @return the outputFiles value.
     */
    public List<String> outputFiles() {
        return this.outputFiles;
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
        jsonWriter.writeArrayField("networkInterfaces", this.networkInterfaces,
            (writer, element) -> writer.writeString(element));
        jsonWriter.writeNumberField("bytesToCapturePerPacket", this.bytesToCapturePerPacket);
        jsonWriter.writeNumberField("totalBytesPerSession", this.totalBytesPerSession);
        jsonWriter.writeNumberField("timeLimitInSeconds", this.timeLimitInSeconds);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of PacketCapturePropertiesFormat from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of PacketCapturePropertiesFormat if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the PacketCapturePropertiesFormat.
     */
    public static PacketCapturePropertiesFormat fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            PacketCapturePropertiesFormat deserializedPacketCapturePropertiesFormat
                = new PacketCapturePropertiesFormat();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("provisioningState".equals(fieldName)) {
                    deserializedPacketCapturePropertiesFormat.provisioningState
                        = ProvisioningState.fromString(reader.getString());
                } else if ("status".equals(fieldName)) {
                    deserializedPacketCapturePropertiesFormat.status
                        = PacketCaptureStatus.fromString(reader.getString());
                } else if ("reason".equals(fieldName)) {
                    deserializedPacketCapturePropertiesFormat.reason = reader.getString();
                } else if ("captureStartTime".equals(fieldName)) {
                    deserializedPacketCapturePropertiesFormat.captureStartTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("networkInterfaces".equals(fieldName)) {
                    List<String> networkInterfaces = reader.readArray(reader1 -> reader1.getString());
                    deserializedPacketCapturePropertiesFormat.networkInterfaces = networkInterfaces;
                } else if ("bytesToCapturePerPacket".equals(fieldName)) {
                    deserializedPacketCapturePropertiesFormat.bytesToCapturePerPacket
                        = reader.getNullable(JsonReader::getLong);
                } else if ("totalBytesPerSession".equals(fieldName)) {
                    deserializedPacketCapturePropertiesFormat.totalBytesPerSession
                        = reader.getNullable(JsonReader::getLong);
                } else if ("timeLimitInSeconds".equals(fieldName)) {
                    deserializedPacketCapturePropertiesFormat.timeLimitInSeconds
                        = reader.getNullable(JsonReader::getInt);
                } else if ("outputFiles".equals(fieldName)) {
                    List<String> outputFiles = reader.readArray(reader1 -> reader1.getString());
                    deserializedPacketCapturePropertiesFormat.outputFiles = outputFiles;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedPacketCapturePropertiesFormat;
        });
    }
}
