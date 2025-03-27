package com.heimdallauth.server.dto.bifrost;

import com.heimdallauth.server.models.bifrost.SmtpProperties;
import com.heimdallauth.server.models.bifrost.SuppressionEntryModel;
import com.heimdallauth.server.utils.HeimdallMetadata;
import lombok.*;

import java.util.List;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CreateConfigurationSetDTO {
    private String configurationSetName;
    private String configurationSetDescription;
    private List<SuppressionEntryModel> emailSuppressionEntries;
    private SmtpProperties smtpProperties;
}
