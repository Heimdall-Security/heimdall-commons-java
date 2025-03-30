package com.heimdallauth.server.dto.bifrost;

import com.heimdallauth.server.models.bifrost.SmtpProperties;
import lombok.*;

import java.util.List;
import java.util.UUID;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CreateConfigurationSetDTO {
    private String configurationSetName;
    private String configurationSetDescription;
    private List<UUID> emailSuppressionEntries;
    private SmtpProperties smtpProperties;
}
