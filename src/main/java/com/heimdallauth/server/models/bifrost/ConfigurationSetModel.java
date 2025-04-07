package com.heimdallauth.server.models.bifrost;

import java.util.List;
import java.util.UUID;

public record ConfigurationSetModel(
        UUID configurationSetId,
        String configurationSetName,
        String configurationSetDescription,
        List<SuppressionEntryModel> suppressionEntries,
        UUID tenantId,
        boolean enabled,
        SmtpProperties smtpProperties
) {
}
