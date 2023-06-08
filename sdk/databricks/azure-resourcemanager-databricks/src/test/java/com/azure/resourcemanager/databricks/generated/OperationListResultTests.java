// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databricks.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.databricks.fluent.models.OperationInner;
import com.azure.resourcemanager.databricks.models.OperationDisplay;
import com.azure.resourcemanager.databricks.models.OperationListResult;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class OperationListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        OperationListResult model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"name\":\"kexxppof\",\"display\":{\"provider\":\"x\",\"resource\":\"jpgd\",\"operation\":\"ocjjxhvpmouexh\",\"description\":\"xibqeojnx\"}},{\"name\":\"zvddntwndeicbtwn\",\"display\":{\"provider\":\"oqvuhr\",\"resource\":\"f\",\"operation\":\"yd\",\"description\":\"lmjthjq\"}}],\"nextLink\":\"pyeicxm\"}")
                .toObject(OperationListResult.class);
        Assertions.assertEquals("kexxppof", model.value().get(0).name());
        Assertions.assertEquals("x", model.value().get(0).display().provider());
        Assertions.assertEquals("jpgd", model.value().get(0).display().resource());
        Assertions.assertEquals("ocjjxhvpmouexh", model.value().get(0).display().operation());
        Assertions.assertEquals("xibqeojnx", model.value().get(0).display().description());
        Assertions.assertEquals("pyeicxm", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        OperationListResult model =
            new OperationListResult()
                .withValue(
                    Arrays
                        .asList(
                            new OperationInner()
                                .withName("kexxppof")
                                .withDisplay(
                                    new OperationDisplay()
                                        .withProvider("x")
                                        .withResource("jpgd")
                                        .withOperation("ocjjxhvpmouexh")
                                        .withDescription("xibqeojnx")),
                            new OperationInner()
                                .withName("zvddntwndeicbtwn")
                                .withDisplay(
                                    new OperationDisplay()
                                        .withProvider("oqvuhr")
                                        .withResource("f")
                                        .withOperation("yd")
                                        .withDescription("lmjthjq"))))
                .withNextLink("pyeicxm");
        model = BinaryData.fromObject(model).toObject(OperationListResult.class);
        Assertions.assertEquals("kexxppof", model.value().get(0).name());
        Assertions.assertEquals("x", model.value().get(0).display().provider());
        Assertions.assertEquals("jpgd", model.value().get(0).display().resource());
        Assertions.assertEquals("ocjjxhvpmouexh", model.value().get(0).display().operation());
        Assertions.assertEquals("xibqeojnx", model.value().get(0).display().description());
        Assertions.assertEquals("pyeicxm", model.nextLink());
    }
}