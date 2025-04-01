package com.heimdallauth.server.models.bifrost;

import com.heimdallauth.server.constants.bifrost.SmtpAuthenticationMethod;
import com.heimdallauth.server.constants.bifrost.SmtpEncryption;

public record SmtpProperties(
        String serverAddress,
        int port,
        String username,
        String password,
        boolean useSSLTls,
        SmtpEncryption smtpEncryption,
        SmtpAuthenticationMethod authenticationMethod
) {
}
