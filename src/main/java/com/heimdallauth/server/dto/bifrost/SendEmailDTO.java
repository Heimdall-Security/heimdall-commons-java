package com.heimdallauth.server.dto.bifrost;

import com.heimdallauth.server.models.bifrost.EmailDestination;
import com.heimdallauth.server.models.bifrost.EmailTemplateContent;

import java.util.List;

public record SendEmailDTO(
        EmailDestination destination,
        EmailTemplateContent content,
        List<String> replyToEmails
) {
}
