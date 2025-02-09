// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.postgresqlflexibleserver.models.CapabilityBase;
import com.azure.resourcemanager.postgresqlflexibleserver.models.CapabilityStatus;
import com.azure.resourcemanager.postgresqlflexibleserver.models.FastProvisioningEditionCapability;
import com.azure.resourcemanager.postgresqlflexibleserver.models.FastProvisioningSupportedEnum;
import com.azure.resourcemanager.postgresqlflexibleserver.models.FlexibleServerEditionCapability;
import com.azure.resourcemanager.postgresqlflexibleserver.models.GeoBackupSupportedEnum;
import com.azure.resourcemanager.postgresqlflexibleserver.models.OnlineResizeSupportedEnum;
import com.azure.resourcemanager.postgresqlflexibleserver.models.RestrictedEnum;
import com.azure.resourcemanager.postgresqlflexibleserver.models.ServerVersionCapability;
import com.azure.resourcemanager.postgresqlflexibleserver.models.StorageAutoGrowthSupportedEnum;
import com.azure.resourcemanager.postgresqlflexibleserver.models.ZoneRedundantHaAndGeoBackupSupportedEnum;
import com.azure.resourcemanager.postgresqlflexibleserver.models.ZoneRedundantHaSupportedEnum;
import java.io.IOException;
import java.util.List;

/**
 * Capability for the PostgreSQL server.
 */
@Fluent
public final class FlexibleServerCapabilityInner extends CapabilityBase {
    /*
     * Name of flexible servers capability
     */
    private String name;

    /*
     * List of supported flexible server editions
     */
    private List<FlexibleServerEditionCapability> supportedServerEditions;

    /*
     * The list of server versions supported for this capability.
     */
    private List<ServerVersionCapability> supportedServerVersions;

    /*
     * Gets a value indicating whether fast provisioning is supported. "Enabled" means fast provisioning is supported.
     * "Disabled" stands for fast provisioning is not supported.
     */
    private FastProvisioningSupportedEnum fastProvisioningSupported;

    /*
     * List of supported server editions for fast provisioning
     */
    private List<FastProvisioningEditionCapability> supportedFastProvisioningEditions;

    /*
     * Determines if geo-backup is supported in this region. "Enabled" means geo-backup is supported. "Disabled" stands
     * for geo-back is not supported.
     */
    private GeoBackupSupportedEnum geoBackupSupported;

    /*
     * A value indicating whether Zone Redundant HA is supported in this region. "Enabled" means zone redundant HA is
     * supported. "Disabled" stands for zone redundant HA is not supported.
     */
    private ZoneRedundantHaSupportedEnum zoneRedundantHaSupported;

    /*
     * A value indicating whether Zone Redundant HA and Geo-backup is supported in this region. "Enabled" means zone
     * redundant HA and geo-backup is supported. "Disabled" stands for zone redundant HA and geo-backup is not
     * supported.
     */
    private ZoneRedundantHaAndGeoBackupSupportedEnum zoneRedundantHaAndGeoBackupSupported;

    /*
     * A value indicating whether storage auto-grow is supported in this region. "Enabled" means storage auto-grow is
     * supported. "Disabled" stands for storage auto-grow is not supported.
     */
    private StorageAutoGrowthSupportedEnum storageAutoGrowthSupported;

    /*
     * A value indicating whether online resize is supported in this region for the given subscription. "Enabled" means
     * storage online resize is supported. "Disabled" means storage online resize is not supported.
     */
    private OnlineResizeSupportedEnum onlineResizeSupported;

    /*
     * A value indicating whether this region is restricted. "Enabled" means region is restricted. "Disabled" stands for
     * region is not restricted.
     */
    private RestrictedEnum restricted;

    /*
     * The reason for the capability not being available.
     */
    private String reason;

    /*
     * The status of the capability.
     */
    private CapabilityStatus status;

    /**
     * Creates an instance of FlexibleServerCapabilityInner class.
     */
    public FlexibleServerCapabilityInner() {
    }

    /**
     * Get the name property: Name of flexible servers capability.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of flexible servers capability.
     * 
     * @param name the name value to set.
     * @return the FlexibleServerCapabilityInner object itself.
     */
    public FlexibleServerCapabilityInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the supportedServerEditions property: List of supported flexible server editions.
     * 
     * @return the supportedServerEditions value.
     */
    public List<FlexibleServerEditionCapability> supportedServerEditions() {
        return this.supportedServerEditions;
    }

    /**
     * Get the supportedServerVersions property: The list of server versions supported for this capability.
     * 
     * @return the supportedServerVersions value.
     */
    public List<ServerVersionCapability> supportedServerVersions() {
        return this.supportedServerVersions;
    }

    /**
     * Get the fastProvisioningSupported property: Gets a value indicating whether fast provisioning is supported.
     * "Enabled" means fast provisioning is supported. "Disabled" stands for fast provisioning is not supported.
     * 
     * @return the fastProvisioningSupported value.
     */
    public FastProvisioningSupportedEnum fastProvisioningSupported() {
        return this.fastProvisioningSupported;
    }

    /**
     * Get the supportedFastProvisioningEditions property: List of supported server editions for fast provisioning.
     * 
     * @return the supportedFastProvisioningEditions value.
     */
    public List<FastProvisioningEditionCapability> supportedFastProvisioningEditions() {
        return this.supportedFastProvisioningEditions;
    }

    /**
     * Get the geoBackupSupported property: Determines if geo-backup is supported in this region. "Enabled" means
     * geo-backup is supported. "Disabled" stands for geo-back is not supported.
     * 
     * @return the geoBackupSupported value.
     */
    public GeoBackupSupportedEnum geoBackupSupported() {
        return this.geoBackupSupported;
    }

    /**
     * Get the zoneRedundantHaSupported property: A value indicating whether Zone Redundant HA is supported in this
     * region. "Enabled" means zone redundant HA is supported. "Disabled" stands for zone redundant HA is not supported.
     * 
     * @return the zoneRedundantHaSupported value.
     */
    public ZoneRedundantHaSupportedEnum zoneRedundantHaSupported() {
        return this.zoneRedundantHaSupported;
    }

    /**
     * Get the zoneRedundantHaAndGeoBackupSupported property: A value indicating whether Zone Redundant HA and
     * Geo-backup is supported in this region. "Enabled" means zone redundant HA and geo-backup is supported. "Disabled"
     * stands for zone redundant HA and geo-backup is not supported.
     * 
     * @return the zoneRedundantHaAndGeoBackupSupported value.
     */
    public ZoneRedundantHaAndGeoBackupSupportedEnum zoneRedundantHaAndGeoBackupSupported() {
        return this.zoneRedundantHaAndGeoBackupSupported;
    }

    /**
     * Get the storageAutoGrowthSupported property: A value indicating whether storage auto-grow is supported in this
     * region. "Enabled" means storage auto-grow is supported. "Disabled" stands for storage auto-grow is not supported.
     * 
     * @return the storageAutoGrowthSupported value.
     */
    public StorageAutoGrowthSupportedEnum storageAutoGrowthSupported() {
        return this.storageAutoGrowthSupported;
    }

    /**
     * Get the onlineResizeSupported property: A value indicating whether online resize is supported in this region for
     * the given subscription. "Enabled" means storage online resize is supported. "Disabled" means storage online
     * resize is not supported.
     * 
     * @return the onlineResizeSupported value.
     */
    public OnlineResizeSupportedEnum onlineResizeSupported() {
        return this.onlineResizeSupported;
    }

    /**
     * Get the restricted property: A value indicating whether this region is restricted. "Enabled" means region is
     * restricted. "Disabled" stands for region is not restricted.
     * 
     * @return the restricted value.
     */
    public RestrictedEnum restricted() {
        return this.restricted;
    }

    /**
     * Get the reason property: The reason for the capability not being available.
     * 
     * @return the reason value.
     */
    @Override
    public String reason() {
        return this.reason;
    }

    /**
     * Get the status property: The status of the capability.
     * 
     * @return the status value.
     */
    @Override
    public CapabilityStatus status() {
        return this.status;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        if (supportedServerEditions() != null) {
            supportedServerEditions().forEach(e -> e.validate());
        }
        if (supportedServerVersions() != null) {
            supportedServerVersions().forEach(e -> e.validate());
        }
        if (supportedFastProvisioningEditions() != null) {
            supportedFastProvisioningEditions().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("name", this.name);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of FlexibleServerCapabilityInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of FlexibleServerCapabilityInner if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the FlexibleServerCapabilityInner.
     */
    public static FlexibleServerCapabilityInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            FlexibleServerCapabilityInner deserializedFlexibleServerCapabilityInner
                = new FlexibleServerCapabilityInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("status".equals(fieldName)) {
                    deserializedFlexibleServerCapabilityInner.status = CapabilityStatus.fromString(reader.getString());
                } else if ("reason".equals(fieldName)) {
                    deserializedFlexibleServerCapabilityInner.reason = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedFlexibleServerCapabilityInner.name = reader.getString();
                } else if ("supportedServerEditions".equals(fieldName)) {
                    List<FlexibleServerEditionCapability> supportedServerEditions
                        = reader.readArray(reader1 -> FlexibleServerEditionCapability.fromJson(reader1));
                    deserializedFlexibleServerCapabilityInner.supportedServerEditions = supportedServerEditions;
                } else if ("supportedServerVersions".equals(fieldName)) {
                    List<ServerVersionCapability> supportedServerVersions
                        = reader.readArray(reader1 -> ServerVersionCapability.fromJson(reader1));
                    deserializedFlexibleServerCapabilityInner.supportedServerVersions = supportedServerVersions;
                } else if ("fastProvisioningSupported".equals(fieldName)) {
                    deserializedFlexibleServerCapabilityInner.fastProvisioningSupported
                        = FastProvisioningSupportedEnum.fromString(reader.getString());
                } else if ("supportedFastProvisioningEditions".equals(fieldName)) {
                    List<FastProvisioningEditionCapability> supportedFastProvisioningEditions
                        = reader.readArray(reader1 -> FastProvisioningEditionCapability.fromJson(reader1));
                    deserializedFlexibleServerCapabilityInner.supportedFastProvisioningEditions
                        = supportedFastProvisioningEditions;
                } else if ("geoBackupSupported".equals(fieldName)) {
                    deserializedFlexibleServerCapabilityInner.geoBackupSupported
                        = GeoBackupSupportedEnum.fromString(reader.getString());
                } else if ("zoneRedundantHaSupported".equals(fieldName)) {
                    deserializedFlexibleServerCapabilityInner.zoneRedundantHaSupported
                        = ZoneRedundantHaSupportedEnum.fromString(reader.getString());
                } else if ("zoneRedundantHaAndGeoBackupSupported".equals(fieldName)) {
                    deserializedFlexibleServerCapabilityInner.zoneRedundantHaAndGeoBackupSupported
                        = ZoneRedundantHaAndGeoBackupSupportedEnum.fromString(reader.getString());
                } else if ("storageAutoGrowthSupported".equals(fieldName)) {
                    deserializedFlexibleServerCapabilityInner.storageAutoGrowthSupported
                        = StorageAutoGrowthSupportedEnum.fromString(reader.getString());
                } else if ("onlineResizeSupported".equals(fieldName)) {
                    deserializedFlexibleServerCapabilityInner.onlineResizeSupported
                        = OnlineResizeSupportedEnum.fromString(reader.getString());
                } else if ("restricted".equals(fieldName)) {
                    deserializedFlexibleServerCapabilityInner.restricted
                        = RestrictedEnum.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedFlexibleServerCapabilityInner;
        });
    }
}
