package com.heimdallauth.server.models.bifrost;

import com.heimdallauth.server.constants.bifrost.SmtpAuthenticationMethod;
import com.heimdallauth.server.constants.bifrost.SmtpEncryption;
import lombok.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class SmtpProperties {
    private String serverAddress;
    private int port;
    private String username;
    private String password;
    private boolean useSSLTls;
    private SmtpEncryption smtpEncryption;
    private SmtpAuthenticationMethod authenticationMethod;
}
