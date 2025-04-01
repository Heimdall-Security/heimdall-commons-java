package com.heimdallauth.server.models.bifrost;

import java.util.UUID;

public record ConfigurationSetModel(
        UUID configurationSetId,
        String configurationSetName,
        String configurationSetDescription,
        UUID tenantId,
        boolean enabled,
        SmtpProperties smtpProperties
) {
}
