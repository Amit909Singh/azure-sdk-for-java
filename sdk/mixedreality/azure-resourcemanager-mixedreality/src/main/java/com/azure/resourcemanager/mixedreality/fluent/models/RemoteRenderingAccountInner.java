// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mixedreality.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SystemData;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.mixedreality.models.Identity;
import com.azure.resourcemanager.mixedreality.models.Sku;
import java.io.IOException;
import java.util.Map;

/**
 * RemoteRenderingAccount Response.
 */
@Fluent
public final class RemoteRenderingAccountInner extends Resource {
    /*
     * Property bag.
     */
    private MixedRealityAccountProperties innerProperties;

    /*
     * The identity associated with this account
     */
    private Identity identity;

    /*
     * The plan associated with this account
     */
    private Identity plan;

    /*
     * The sku associated with this account
     */
    private Sku sku;

    /*
     * The kind of account, if supported
     */
    private Sku kind;

    /*
     * System metadata for this account
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
     * Creates an instance of RemoteRenderingAccountInner class.
     */
    public RemoteRenderingAccountInner() {
    }

    /**
     * Get the innerProperties property: Property bag.
     * 
     * @return the innerProperties value.
     */
    private MixedRealityAccountProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the identity property: The identity associated with this account.
     * 
     * @return the identity value.
     */
    public Identity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: The identity associated with this account.
     * 
     * @param identity the identity value to set.
     * @return the RemoteRenderingAccountInner object itself.
     */
    public RemoteRenderingAccountInner withIdentity(Identity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the plan property: The plan associated with this account.
     * 
     * @return the plan value.
     */
    public Identity plan() {
        return this.plan;
    }

    /**
     * Set the plan property: The plan associated with this account.
     * 
     * @param plan the plan value to set.
     * @return the RemoteRenderingAccountInner object itself.
     */
    public RemoteRenderingAccountInner withPlan(Identity plan) {
        this.plan = plan;
        return this;
    }

    /**
     * Get the sku property: The sku associated with this account.
     * 
     * @return the sku value.
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: The sku associated with this account.
     * 
     * @param sku the sku value to set.
     * @return the RemoteRenderingAccountInner object itself.
     */
    public RemoteRenderingAccountInner withSku(Sku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the kind property: The kind of account, if supported.
     * 
     * @return the kind value.
     */
    public Sku kind() {
        return this.kind;
    }

    /**
     * Set the kind property: The kind of account, if supported.
     * 
     * @param kind the kind value to set.
     * @return the RemoteRenderingAccountInner object itself.
     */
    public RemoteRenderingAccountInner withKind(Sku kind) {
        this.kind = kind;
        return this;
    }

    /**
     * Get the systemData property: System metadata for this account.
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
    public RemoteRenderingAccountInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RemoteRenderingAccountInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the storageAccountName property: The name of the storage account associated with this accountId.
     * 
     * @return the storageAccountName value.
     */
    public String storageAccountName() {
        return this.innerProperties() == null ? null : this.innerProperties().storageAccountName();
    }

    /**
     * Set the storageAccountName property: The name of the storage account associated with this accountId.
     * 
     * @param storageAccountName the storageAccountName value to set.
     * @return the RemoteRenderingAccountInner object itself.
     */
    public RemoteRenderingAccountInner withStorageAccountName(String storageAccountName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MixedRealityAccountProperties();
        }
        this.innerProperties().withStorageAccountName(storageAccountName);
        return this;
    }

    /**
     * Get the accountId property: unique id of certain account.
     * 
     * @return the accountId value.
     */
    public String accountId() {
        return this.innerProperties() == null ? null : this.innerProperties().accountId();
    }

    /**
     * Get the accountDomain property: Correspond domain name of certain Spatial Anchors Account.
     * 
     * @return the accountDomain value.
     */
    public String accountDomain() {
        return this.innerProperties() == null ? null : this.innerProperties().accountDomain();
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
        if (identity() != null) {
            identity().validate();
        }
        if (plan() != null) {
            plan().validate();
        }
        if (sku() != null) {
            sku().validate();
        }
        if (kind() != null) {
            kind().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("location", location());
        jsonWriter.writeMapField("tags", tags(), (writer, element) -> writer.writeString(element));
        jsonWriter.writeJsonField("properties", this.innerProperties);
        jsonWriter.writeJsonField("identity", this.identity);
        jsonWriter.writeJsonField("plan", this.plan);
        jsonWriter.writeJsonField("sku", this.sku);
        jsonWriter.writeJsonField("kind", this.kind);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RemoteRenderingAccountInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RemoteRenderingAccountInner if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the RemoteRenderingAccountInner.
     */
    public static RemoteRenderingAccountInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RemoteRenderingAccountInner deserializedRemoteRenderingAccountInner = new RemoteRenderingAccountInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedRemoteRenderingAccountInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedRemoteRenderingAccountInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedRemoteRenderingAccountInner.type = reader.getString();
                } else if ("location".equals(fieldName)) {
                    deserializedRemoteRenderingAccountInner.withLocation(reader.getString());
                } else if ("tags".equals(fieldName)) {
                    Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                    deserializedRemoteRenderingAccountInner.withTags(tags);
                } else if ("properties".equals(fieldName)) {
                    deserializedRemoteRenderingAccountInner.innerProperties
                        = MixedRealityAccountProperties.fromJson(reader);
                } else if ("identity".equals(fieldName)) {
                    deserializedRemoteRenderingAccountInner.identity = Identity.fromJson(reader);
                } else if ("plan".equals(fieldName)) {
                    deserializedRemoteRenderingAccountInner.plan = Identity.fromJson(reader);
                } else if ("sku".equals(fieldName)) {
                    deserializedRemoteRenderingAccountInner.sku = Sku.fromJson(reader);
                } else if ("kind".equals(fieldName)) {
                    deserializedRemoteRenderingAccountInner.kind = Sku.fromJson(reader);
                } else if ("systemData".equals(fieldName)) {
                    deserializedRemoteRenderingAccountInner.systemData = SystemData.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedRemoteRenderingAccountInner;
        });
    }
}
