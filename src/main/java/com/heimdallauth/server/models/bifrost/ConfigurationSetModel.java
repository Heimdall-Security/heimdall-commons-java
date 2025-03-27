package com.heimdallauth.server.models.bifrost;

import lombok.*;

import java.util.List;
import java.util.UUID;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ConfigurationSetModel {
    private UUID configurationSetId;
    private String configurationSetName;
    private String configurationSetDescription;
    private boolean enabled;
    private List<SuppressionEntryModel> suppressionEntries;

}
