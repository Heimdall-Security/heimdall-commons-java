package com.heimdallauth.server.models.bifrost;

import java.time.Instant;
import java.util.List;
import java.util.UUID;

public record Template(
        UUID templateId,
        String templateName,
        String templateDescription,
        UUID tenantId,
        EmailContent content,
        List<MessageHeader> defaultEmailHeaders,
        Instant createdAt,
        Instant updatedAt
) {
}
