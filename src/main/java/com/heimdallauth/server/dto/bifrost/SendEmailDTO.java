package com.heimdallauth.server.dto.bifrost;

import com.heimdallauth.server.models.bifrost.EmailDestination;
import com.heimdallauth.server.models.bifrost.EmailContent;

import java.util.List;
import java.util.UUID;

public record SendEmailDTO(
        UUID configurationSetId,
        EmailDestination destination,
        EmailContent content,
        List<String> replyToEmails
) {
}
