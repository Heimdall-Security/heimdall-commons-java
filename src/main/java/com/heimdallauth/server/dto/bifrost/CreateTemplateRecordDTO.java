package com.heimdallauth.server.dto.bifrost;

import com.heimdallauth.server.models.bifrost.Template;

public record CreateTemplateRecordDTO(
        String templateName,
        String templateDescription,
        String subject,
        Template content
) {
}
