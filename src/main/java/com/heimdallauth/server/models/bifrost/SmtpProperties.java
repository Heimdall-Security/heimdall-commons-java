package com.heimdallauth.server.models.bifrost;

import com.heimdallauth.server.constants.bifrost.SmtpAuthenticationMethod;

import java.util.Map;

public record SmtpProperties(
        String serverAddress,
        int portNumber,
        String loginUsername,
        String loginPassword,
        String fromEmailAddress,
        String replyToEmailAddress,
        SmtpAuthenticationMethod authenticationMethod,
        int connectionLimit,
        long maxIdleTime,
        boolean enabled,
        Map<String, String> messageHeaders
) {
}
