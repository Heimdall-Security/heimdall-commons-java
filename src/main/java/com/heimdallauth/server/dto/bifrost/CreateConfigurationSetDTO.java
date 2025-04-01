package com.heimdallauth.server.dto.bifrost;

import com.heimdallauth.server.models.bifrost.SmtpProperties;

import java.util.List;
import java.util.UUID;

public record CreateConfigurationSetDTO(
        String configurationSetName,
        String configurationSetDescription,
        List<UUID> suppressionEntryIds,
        SmtpProperties smtpProperties
) {
}
