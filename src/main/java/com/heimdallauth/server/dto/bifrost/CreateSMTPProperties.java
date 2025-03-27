package com.heimdallauth.server.dto.bifrost;

import com.heimdallauth.server.constants.bifrost.SmtpAuthenticationMethod;
import com.heimdallauth.server.constants.bifrost.SmtpEncryption;
import com.heimdallauth.server.models.bifrost.SmtpProperties;
import lombok.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CreateSMTPProperties {
    private String serverAddress;
    private int port;
    private String username;
    private String password;
    private SmtpEncryption smtpEncryption;
    private SmtpAuthenticationMethod smtpAuthenticationMethod;

    public SmtpProperties toSmtpProperties() {
        return SmtpProperties.builder()
                .serverAddress(serverAddress)
                .port(port)
                .username(username)
                .password(password)
                .useSSLTls(smtpEncryption == SmtpEncryption.SSL || smtpEncryption == SmtpEncryption.STARTTLS)
                .smtpEncryption(smtpEncryption)
                .authenticationMethod(smtpAuthenticationMethod)
                .build();
    }
}
