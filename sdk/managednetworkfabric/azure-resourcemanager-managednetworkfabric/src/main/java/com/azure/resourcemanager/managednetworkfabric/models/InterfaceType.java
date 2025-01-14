// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The Interface Type. Example: Management/Data.
 */
public final class InterfaceType extends ExpandableStringEnum<InterfaceType> {
    /**
     * Static value Management for InterfaceType.
     */
    public static final InterfaceType MANAGEMENT = fromString("Management");

    /**
     * Static value Data for InterfaceType.
     */
    public static final InterfaceType DATA = fromString("Data");

    /**
     * Creates a new instance of InterfaceType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public InterfaceType() {
    }

    /**
     * Creates or finds a InterfaceType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding InterfaceType.
     */
    public static InterfaceType fromString(String name) {
        return fromString(name, InterfaceType.class);
    }

    /**
     * Gets known InterfaceType values.
     * 
     * @return known InterfaceType values.
     */
    public static Collection<InterfaceType> values() {
        return values(InterfaceType.class);
    }
}
