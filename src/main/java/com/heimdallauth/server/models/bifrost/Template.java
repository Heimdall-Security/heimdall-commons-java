package com.heimdallauth.server.models.bifrost;

import com.heimdallauth.server.constants.bifrost.EmailPriority;

public record Template(
        String hrn,
        String templateName,
        String templateDescription,
        EmailTemplateContent templatedContent,
        EmailPriority defaultEmailPriority
) {
}
