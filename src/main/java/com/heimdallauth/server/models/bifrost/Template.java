package com.heimdallauth.server.models.bifrost;

import java.time.Instant;
import java.util.UUID;

public record Template(
        String templateName,
        String templateDescription,
        UUID tenantId,
        EmailContent content,
        Instant createdAt,
        Instant updatedAt
) {
}
