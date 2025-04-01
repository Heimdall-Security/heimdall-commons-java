package com.heimdallauth.server.models.bifrost;

public record EmailTemplateContent(
        String subject,
        String plainTextContent,
        String htmlBodyContent
) {
}
