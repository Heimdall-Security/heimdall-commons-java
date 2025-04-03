package com.heimdallauth.server.models.bifrost;

import com.heimdallauth.server.constants.bifrost.SuppressionListEntryType;
import com.heimdallauth.server.constants.bifrost.SuppressionReason;
import com.heimdallauth.server.utils.HeimdallMetadata;

import java.util.List;
import java.util.UUID;

public record SuppressionEntryModel(
        UUID suppressionEntryId,
        SuppressionListEntryType suppressionListEntryType,
        String value,
        SuppressionReason reason,
        List<HeimdallMetadata> metadata) {
}
