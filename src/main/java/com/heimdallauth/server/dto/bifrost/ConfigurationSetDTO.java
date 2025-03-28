package com.heimdallauth.server.dto.bifrost;

import com.heimdallauth.server.models.bifrost.SmtpProperties;
import com.heimdallauth.server.models.bifrost.SuppressionEntryModel;
import lombok.*;

import java.util.List;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ConfigurationSetDTO {
    private String configurationSetId;
    private String configurationSetName;
    private String configurationSetDescription;
    private List<SuppressionEntryModel> emailSuppressions;
    private SmtpProperties smtpProperties;
    private String createdAt;
    private String updatedAt;
}
