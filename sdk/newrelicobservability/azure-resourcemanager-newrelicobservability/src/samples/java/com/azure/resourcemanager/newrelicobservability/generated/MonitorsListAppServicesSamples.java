// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.newrelicobservability.generated;

import com.azure.resourcemanager.newrelicobservability.models.AppServicesGetRequest;
import java.util.Arrays;

/** Samples for Monitors ListAppServices. */
public final class MonitorsListAppServicesSamples {
    /*
     * x-ms-original-file: specification/newrelic/resource-manager/NewRelic.Observability/preview/2022-07-01-preview/examples/Monitors_ListAppServices_MaximumSet_Gen.json
     */
    /**
     * Sample code: Monitors_ListAppServices_MaximumSet_Gen.
     *
     * @param manager Entry point to NewRelicObservabilityManager.
     */
    public static void monitorsListAppServicesMaximumSetGen(
        com.azure.resourcemanager.newrelicobservability.NewRelicObservabilityManager manager) {
        manager
            .monitors()
            .listAppServices(
                "rgNewRelic",
                "fhcjxnxumkdlgpwanewtkdnyuz",
                new AppServicesGetRequest()
                    .withAzureResourceIds(Arrays.asList("pvzrksrmzowobuhxpwiotnpcvjbu"))
                    .withUserEmail("ruxvg@xqkmdhrnoo.hlmbpm"),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/newrelic/resource-manager/NewRelic.Observability/preview/2022-07-01-preview/examples/Monitors_ListAppServices_MinimumSet_Gen.json
     */
    /**
     * Sample code: Monitors_ListAppServices_MinimumSet_Gen.
     *
     * @param manager Entry point to NewRelicObservabilityManager.
     */
    public static void monitorsListAppServicesMinimumSetGen(
        com.azure.resourcemanager.newrelicobservability.NewRelicObservabilityManager manager) {
        manager
            .monitors()
            .listAppServices(
                "rgNewRelic",
                "fhcjxnxumkdlgpwanewtkdnyuz",
                new AppServicesGetRequest().withUserEmail("ruxvg@xqkmdhrnoo.hlmbpm"),
                com.azure.core.util.Context.NONE);
    }
}