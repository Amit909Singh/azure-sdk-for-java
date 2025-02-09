// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Enumeration to indicate the IP type.
 */
public final class IpType extends ExpandableStringEnum<IpType> {
    /**
     * Static value IPv4 for IpType.
     */
    public static final IpType IPV4 = fromString("IPv4");

    /**
     * Static value IPv6 for IpType.
     */
    public static final IpType IPV6 = fromString("IPv6");

    /**
     * Creates a new instance of IpType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public IpType() {
    }

    /**
     * Creates or finds a IpType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding IpType.
     */
    public static IpType fromString(String name) {
        return fromString(name, IpType.class);
    }

    /**
     * Gets known IpType values.
     * 
     * @return known IpType values.
     */
    public static Collection<IpType> values() {
        return values(IpType.class);
    }
}
