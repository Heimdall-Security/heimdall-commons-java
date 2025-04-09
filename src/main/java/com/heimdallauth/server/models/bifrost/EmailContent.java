package com.heimdallauth.server.models.bifrost;

public record EmailContent (
        String subject,
        String plainTextContent,
        String htmlBodyContent
) {
}
