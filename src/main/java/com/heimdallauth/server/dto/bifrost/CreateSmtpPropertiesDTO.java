package com.heimdallauth.server.dto.bifrost;

import com.heimdallauth.server.constants.bifrost.SmtpAuthenticationMethod;
import com.heimdallauth.server.constants.bifrost.SmtpConnectionSecurity;

import java.util.Map;

public record CreateSmtpPropertiesDTO(
        String serverAddress,
        int portNumber,
        String loginUsername,
        String loginPassword,
        String fromEmailAddress,
        String replyToEmailAddress,
        SmtpAuthenticationMethod authenticationMethod,
        SmtpConnectionSecurity connectionSecurity,
        int connectionLimit,
        long maxIdleTime,
        boolean enabled,
        Map<String, String> messageHeaders
) {
}
