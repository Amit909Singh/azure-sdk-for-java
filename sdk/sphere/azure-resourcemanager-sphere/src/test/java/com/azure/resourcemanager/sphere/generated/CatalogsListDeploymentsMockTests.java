// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sphere.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.sphere.AzureSphereManager;
import com.azure.resourcemanager.sphere.models.Deployment;
import com.azure.resourcemanager.sphere.models.RegionalDataBoundary;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class CatalogsListDeploymentsMockTests {
    @Test
    public void testListDeployments() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"deploymentId\":\"jawgqwg\",\"deployedImages\":[{\"properties\":{\"image\":\"kxfbkpycgklwndn\",\"imageId\":\"dauwhvylwzbtd\",\"imageName\":\"ujznb\",\"regionalDataBoundary\":\"None\",\"uri\":\"uwprzql\",\"description\":\"ualupjmkh\",\"componentId\":\"obbc\",\"imageType\":\"CustomerBoardConfig\",\"provisioningState\":\"Updating\"},\"id\":\"riplrbpbewtg\",\"name\":\"fgb\",\"type\":\"c\"}],\"deploymentDateUtc\":\"2021-02-14T22:48:14Z\",\"provisioningState\":\"Accepted\"},\"id\":\"v\",\"name\":\"hjkbegibtnmxieb\",\"type\":\"waloayqcgwr\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        AzureSphereManager manager = AzureSphereManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<Deployment> response = manager.catalogs()
            .listDeployments("zceuojgjrw", "ueiotwmcdyt", "x", 384724385, 1665373545, 838785311,
                com.azure.core.util.Context.NONE);

        Assertions.assertEquals("jawgqwg", response.iterator().next().properties().deploymentId());
        Assertions.assertEquals("kxfbkpycgklwndn",
            response.iterator().next().properties().deployedImages().get(0).properties().image());
        Assertions.assertEquals("dauwhvylwzbtd",
            response.iterator().next().properties().deployedImages().get(0).properties().imageId());
        Assertions.assertEquals(RegionalDataBoundary.NONE,
            response.iterator().next().properties().deployedImages().get(0).properties().regionalDataBoundary());
    }
}
