package com.heimdallauth.server.dto.bifrost;

import com.heimdallauth.server.models.bifrost.EmailContent;
import com.heimdallauth.server.models.bifrost.MessageHeader;

import java.util.List;
import java.util.UUID;

public record CreateEmailTemplateDTO(
        UUID tenantId,
        String templateName,
        String templateDescription,
        EmailContent templatedEmailContent,
        List<MessageHeader> defaultEmailHeaders
) {
}
