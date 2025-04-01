package com.heimdallauth.server.dto.bifrost;

import com.heimdallauth.server.constants.bifrost.SmtpAuthenticationMethod;
import com.heimdallauth.server.constants.bifrost.SmtpEncryption;

public record CreateSmtpPropertiesDTO(
        String serverAddress,
        int port,
        String username,
        String password,
        SmtpEncryption encryption,
        SmtpAuthenticationMethod authenticationMethod
) {
}
