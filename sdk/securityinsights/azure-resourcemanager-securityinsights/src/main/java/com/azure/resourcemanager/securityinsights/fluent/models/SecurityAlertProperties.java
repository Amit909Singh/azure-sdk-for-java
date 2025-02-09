// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.securityinsights.models.AlertSeverity;
import com.azure.resourcemanager.securityinsights.models.AlertStatus;
import com.azure.resourcemanager.securityinsights.models.AttackTactic;
import com.azure.resourcemanager.securityinsights.models.ConfidenceLevel;
import com.azure.resourcemanager.securityinsights.models.ConfidenceScoreStatus;
import com.azure.resourcemanager.securityinsights.models.EntityCommonProperties;
import com.azure.resourcemanager.securityinsights.models.KillChainIntent;
import com.azure.resourcemanager.securityinsights.models.SecurityAlertPropertiesConfidenceReasonsItem;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/**
 * SecurityAlert entity property bag.
 */
@Fluent
public final class SecurityAlertProperties extends EntityCommonProperties {
    /*
     * The display name of the alert.
     */
    private String alertDisplayName;

    /*
     * The type name of the alert.
     */
    private String alertType;

    /*
     * Display name of the main entity being reported on.
     */
    private String compromisedEntity;

    /*
     * The confidence level of this alert.
     */
    private ConfidenceLevel confidenceLevel;

    /*
     * The confidence reasons
     */
    private List<SecurityAlertPropertiesConfidenceReasonsItem> confidenceReasons;

    /*
     * The confidence score of the alert.
     */
    private Double confidenceScore;

    /*
     * The confidence score calculation status, i.e. indicating if score calculation is pending for this alert, not
     * applicable or final.
     */
    private ConfidenceScoreStatus confidenceScoreStatus;

    /*
     * Alert description.
     */
    private String description;

    /*
     * The impact end time of the alert (the time of the last event contributing to the alert).
     */
    private OffsetDateTime endTimeUtc;

    /*
     * Holds the alert intent stage(s) mapping for this alert.
     */
    private KillChainIntent intent;

    /*
     * The identifier of the alert inside the product which generated the alert.
     */
    private String providerAlertId;

    /*
     * The time the alert was made available for consumption.
     */
    private OffsetDateTime processingEndTime;

    /*
     * The name of a component inside the product which generated the alert.
     */
    private String productComponentName;

    /*
     * The name of the product which published this alert.
     */
    private String productName;

    /*
     * The version of the product generating the alert.
     */
    private String productVersion;

    /*
     * Manual action items to take to remediate the alert.
     */
    private List<String> remediationSteps;

    /*
     * The severity of the alert
     */
    private AlertSeverity severity;

    /*
     * The impact start time of the alert (the time of the first event contributing to the alert).
     */
    private OffsetDateTime startTimeUtc;

    /*
     * The lifecycle status of the alert.
     */
    private AlertStatus status;

    /*
     * Holds the product identifier of the alert for the product.
     */
    private String systemAlertId;

    /*
     * The tactics of the alert
     */
    private List<AttackTactic> tactics;

    /*
     * The time the alert was generated.
     */
    private OffsetDateTime timeGenerated;

    /*
     * The name of the vendor that raise the alert.
     */
    private String vendorName;

    /*
     * The uri link of the alert.
     */
    private String alertLink;

    /*
     * The list of resource identifiers of the alert.
     */
    private List<Object> resourceIdentifiers;

    /*
     * The graph item display name which is a short humanly readable description of the graph item instance. This
     * property is optional and might be system generated.
     */
    private String friendlyName;

    /*
     * A bag of custom fields that should be part of the entity and will be presented to the user.
     */
    private Map<String, Object> additionalData;

    /**
     * Creates an instance of SecurityAlertProperties class.
     */
    public SecurityAlertProperties() {
    }

    /**
     * Get the alertDisplayName property: The display name of the alert.
     * 
     * @return the alertDisplayName value.
     */
    public String alertDisplayName() {
        return this.alertDisplayName;
    }

    /**
     * Get the alertType property: The type name of the alert.
     * 
     * @return the alertType value.
     */
    public String alertType() {
        return this.alertType;
    }

    /**
     * Get the compromisedEntity property: Display name of the main entity being reported on.
     * 
     * @return the compromisedEntity value.
     */
    public String compromisedEntity() {
        return this.compromisedEntity;
    }

    /**
     * Get the confidenceLevel property: The confidence level of this alert.
     * 
     * @return the confidenceLevel value.
     */
    public ConfidenceLevel confidenceLevel() {
        return this.confidenceLevel;
    }

    /**
     * Get the confidenceReasons property: The confidence reasons.
     * 
     * @return the confidenceReasons value.
     */
    public List<SecurityAlertPropertiesConfidenceReasonsItem> confidenceReasons() {
        return this.confidenceReasons;
    }

    /**
     * Get the confidenceScore property: The confidence score of the alert.
     * 
     * @return the confidenceScore value.
     */
    public Double confidenceScore() {
        return this.confidenceScore;
    }

    /**
     * Get the confidenceScoreStatus property: The confidence score calculation status, i.e. indicating if score
     * calculation is pending for this alert, not applicable or final.
     * 
     * @return the confidenceScoreStatus value.
     */
    public ConfidenceScoreStatus confidenceScoreStatus() {
        return this.confidenceScoreStatus;
    }

    /**
     * Get the description property: Alert description.
     * 
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Get the endTimeUtc property: The impact end time of the alert (the time of the last event contributing to the
     * alert).
     * 
     * @return the endTimeUtc value.
     */
    public OffsetDateTime endTimeUtc() {
        return this.endTimeUtc;
    }

    /**
     * Get the intent property: Holds the alert intent stage(s) mapping for this alert.
     * 
     * @return the intent value.
     */
    public KillChainIntent intent() {
        return this.intent;
    }

    /**
     * Get the providerAlertId property: The identifier of the alert inside the product which generated the alert.
     * 
     * @return the providerAlertId value.
     */
    public String providerAlertId() {
        return this.providerAlertId;
    }

    /**
     * Get the processingEndTime property: The time the alert was made available for consumption.
     * 
     * @return the processingEndTime value.
     */
    public OffsetDateTime processingEndTime() {
        return this.processingEndTime;
    }

    /**
     * Get the productComponentName property: The name of a component inside the product which generated the alert.
     * 
     * @return the productComponentName value.
     */
    public String productComponentName() {
        return this.productComponentName;
    }

    /**
     * Get the productName property: The name of the product which published this alert.
     * 
     * @return the productName value.
     */
    public String productName() {
        return this.productName;
    }

    /**
     * Get the productVersion property: The version of the product generating the alert.
     * 
     * @return the productVersion value.
     */
    public String productVersion() {
        return this.productVersion;
    }

    /**
     * Get the remediationSteps property: Manual action items to take to remediate the alert.
     * 
     * @return the remediationSteps value.
     */
    public List<String> remediationSteps() {
        return this.remediationSteps;
    }

    /**
     * Get the severity property: The severity of the alert.
     * 
     * @return the severity value.
     */
    public AlertSeverity severity() {
        return this.severity;
    }

    /**
     * Set the severity property: The severity of the alert.
     * 
     * @param severity the severity value to set.
     * @return the SecurityAlertProperties object itself.
     */
    public SecurityAlertProperties withSeverity(AlertSeverity severity) {
        this.severity = severity;
        return this;
    }

    /**
     * Get the startTimeUtc property: The impact start time of the alert (the time of the first event contributing to
     * the alert).
     * 
     * @return the startTimeUtc value.
     */
    public OffsetDateTime startTimeUtc() {
        return this.startTimeUtc;
    }

    /**
     * Get the status property: The lifecycle status of the alert.
     * 
     * @return the status value.
     */
    public AlertStatus status() {
        return this.status;
    }

    /**
     * Get the systemAlertId property: Holds the product identifier of the alert for the product.
     * 
     * @return the systemAlertId value.
     */
    public String systemAlertId() {
        return this.systemAlertId;
    }

    /**
     * Get the tactics property: The tactics of the alert.
     * 
     * @return the tactics value.
     */
    public List<AttackTactic> tactics() {
        return this.tactics;
    }

    /**
     * Get the timeGenerated property: The time the alert was generated.
     * 
     * @return the timeGenerated value.
     */
    public OffsetDateTime timeGenerated() {
        return this.timeGenerated;
    }

    /**
     * Get the vendorName property: The name of the vendor that raise the alert.
     * 
     * @return the vendorName value.
     */
    public String vendorName() {
        return this.vendorName;
    }

    /**
     * Get the alertLink property: The uri link of the alert.
     * 
     * @return the alertLink value.
     */
    public String alertLink() {
        return this.alertLink;
    }

    /**
     * Get the resourceIdentifiers property: The list of resource identifiers of the alert.
     * 
     * @return the resourceIdentifiers value.
     */
    public List<Object> resourceIdentifiers() {
        return this.resourceIdentifiers;
    }

    /**
     * Get the friendlyName property: The graph item display name which is a short humanly readable description of the
     * graph item instance. This property is optional and might be system generated.
     * 
     * @return the friendlyName value.
     */
    @Override
    public String friendlyName() {
        return this.friendlyName;
    }

    /**
     * Get the additionalData property: A bag of custom fields that should be part of the entity and will be presented
     * to the user.
     * 
     * @return the additionalData value.
     */
    @Override
    public Map<String, Object> additionalData() {
        return this.additionalData;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        if (confidenceReasons() != null) {
            confidenceReasons().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("severity", this.severity == null ? null : this.severity.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SecurityAlertProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SecurityAlertProperties if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the SecurityAlertProperties.
     */
    public static SecurityAlertProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SecurityAlertProperties deserializedSecurityAlertProperties = new SecurityAlertProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("additionalData".equals(fieldName)) {
                    Map<String, Object> additionalData = reader.readMap(reader1 -> reader1.readUntyped());
                    deserializedSecurityAlertProperties.additionalData = additionalData;
                } else if ("friendlyName".equals(fieldName)) {
                    deserializedSecurityAlertProperties.friendlyName = reader.getString();
                } else if ("alertDisplayName".equals(fieldName)) {
                    deserializedSecurityAlertProperties.alertDisplayName = reader.getString();
                } else if ("alertType".equals(fieldName)) {
                    deserializedSecurityAlertProperties.alertType = reader.getString();
                } else if ("compromisedEntity".equals(fieldName)) {
                    deserializedSecurityAlertProperties.compromisedEntity = reader.getString();
                } else if ("confidenceLevel".equals(fieldName)) {
                    deserializedSecurityAlertProperties.confidenceLevel
                        = ConfidenceLevel.fromString(reader.getString());
                } else if ("confidenceReasons".equals(fieldName)) {
                    List<SecurityAlertPropertiesConfidenceReasonsItem> confidenceReasons
                        = reader.readArray(reader1 -> SecurityAlertPropertiesConfidenceReasonsItem.fromJson(reader1));
                    deserializedSecurityAlertProperties.confidenceReasons = confidenceReasons;
                } else if ("confidenceScore".equals(fieldName)) {
                    deserializedSecurityAlertProperties.confidenceScore = reader.getNullable(JsonReader::getDouble);
                } else if ("confidenceScoreStatus".equals(fieldName)) {
                    deserializedSecurityAlertProperties.confidenceScoreStatus
                        = ConfidenceScoreStatus.fromString(reader.getString());
                } else if ("description".equals(fieldName)) {
                    deserializedSecurityAlertProperties.description = reader.getString();
                } else if ("endTimeUtc".equals(fieldName)) {
                    deserializedSecurityAlertProperties.endTimeUtc = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("intent".equals(fieldName)) {
                    deserializedSecurityAlertProperties.intent = KillChainIntent.fromString(reader.getString());
                } else if ("providerAlertId".equals(fieldName)) {
                    deserializedSecurityAlertProperties.providerAlertId = reader.getString();
                } else if ("processingEndTime".equals(fieldName)) {
                    deserializedSecurityAlertProperties.processingEndTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("productComponentName".equals(fieldName)) {
                    deserializedSecurityAlertProperties.productComponentName = reader.getString();
                } else if ("productName".equals(fieldName)) {
                    deserializedSecurityAlertProperties.productName = reader.getString();
                } else if ("productVersion".equals(fieldName)) {
                    deserializedSecurityAlertProperties.productVersion = reader.getString();
                } else if ("remediationSteps".equals(fieldName)) {
                    List<String> remediationSteps = reader.readArray(reader1 -> reader1.getString());
                    deserializedSecurityAlertProperties.remediationSteps = remediationSteps;
                } else if ("severity".equals(fieldName)) {
                    deserializedSecurityAlertProperties.severity = AlertSeverity.fromString(reader.getString());
                } else if ("startTimeUtc".equals(fieldName)) {
                    deserializedSecurityAlertProperties.startTimeUtc = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("status".equals(fieldName)) {
                    deserializedSecurityAlertProperties.status = AlertStatus.fromString(reader.getString());
                } else if ("systemAlertId".equals(fieldName)) {
                    deserializedSecurityAlertProperties.systemAlertId = reader.getString();
                } else if ("tactics".equals(fieldName)) {
                    List<AttackTactic> tactics
                        = reader.readArray(reader1 -> AttackTactic.fromString(reader1.getString()));
                    deserializedSecurityAlertProperties.tactics = tactics;
                } else if ("timeGenerated".equals(fieldName)) {
                    deserializedSecurityAlertProperties.timeGenerated = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("vendorName".equals(fieldName)) {
                    deserializedSecurityAlertProperties.vendorName = reader.getString();
                } else if ("alertLink".equals(fieldName)) {
                    deserializedSecurityAlertProperties.alertLink = reader.getString();
                } else if ("resourceIdentifiers".equals(fieldName)) {
                    List<Object> resourceIdentifiers = reader.readArray(reader1 -> reader1.readUntyped());
                    deserializedSecurityAlertProperties.resourceIdentifiers = resourceIdentifiers;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSecurityAlertProperties;
        });
    }
}
