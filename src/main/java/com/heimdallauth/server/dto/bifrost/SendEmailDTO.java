package com.heimdallauth.server.dto.bifrost;

import com.heimdallauth.server.models.bifrost.EmailDestination;
import com.heimdallauth.server.models.bifrost.EmailTemplateContent;

import java.util.List;
import java.util.UUID;

public record SendEmailDTO(
        UUID configurationSetId,
        EmailDestination destination,
        EmailTemplateContent content,
        List<String> replyToEmails
) {
}
