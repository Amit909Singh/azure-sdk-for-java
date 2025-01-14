// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.purview.sharing.generated;

import com.azure.analytics.purview.sharing.models.ShareStatus;
import com.azure.analytics.purview.sharing.models.UserInvitation;
import com.azure.analytics.purview.sharing.models.UserInvitationProperties;
import com.azure.core.util.BinaryData;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;

public final class UserInvitationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        UserInvitation model = BinaryData.fromString(
            "{\"invitationKind\":\"User\",\"properties\":{\"expirationDate\":\"2021-06-05T20:06:24Z\",\"notify\":false,\"senderEmail\":\"ddtocjjxhvp\",\"senderName\":\"uexhdzx\",\"senderTenantName\":\"qeojnxqbzvddntw\",\"sentAt\":\"2021-07-30T22:07:59Z\",\"shareStatus\":\"Attached\",\"state\":\"Succeeded\",\"targetEmail\":\"w\"},\"id\":\"zao\",\"type\":\"uhrhcffcyddgl\"}")
            .toObject(UserInvitation.class);
        Assertions.assertEquals(OffsetDateTime.parse("2021-06-05T20:06:24Z"),
            model.getProperties().getExpirationDate());
        Assertions.assertEquals(false, model.getProperties().isNotify());
        Assertions.assertEquals(ShareStatus.ATTACHED_SHARE_STATUS, model.getProperties().getShareStatus());
        Assertions.assertEquals("w", model.getProperties().getTargetEmail());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        UserInvitation model = new UserInvitation().setProperties(
            new UserInvitationProperties().setExpirationDate(OffsetDateTime.parse("2021-06-05T20:06:24Z"))
                .setNotify(false)
                .setShareStatus(ShareStatus.ATTACHED_SHARE_STATUS)
                .setTargetEmail("w"));
        model = BinaryData.fromObject(model).toObject(UserInvitation.class);
        Assertions.assertEquals(OffsetDateTime.parse("2021-06-05T20:06:24Z"),
            model.getProperties().getExpirationDate());
        Assertions.assertEquals(false, model.getProperties().isNotify());
        Assertions.assertEquals(ShareStatus.ATTACHED_SHARE_STATUS, model.getProperties().getShareStatus());
        Assertions.assertEquals("w", model.getProperties().getTargetEmail());
    }
}
