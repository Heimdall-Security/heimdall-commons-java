package com.heimdallauth.server.models.bifrost;

import com.heimdallauth.server.constants.bifrost.SuppressionListEntryType;
import com.heimdallauth.server.constants.bifrost.SuppressionReason;
import com.heimdallauth.server.utils.HeimdallMetadata;
import lombok.*;

import java.util.List;
import java.util.UUID;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class SuppressionEntryModel {
    private UUID suppressionEntryId;
    private SuppressionListEntryType suppressionListEntryType;
    private String value;
    private SuppressionReason reason;
    private List<HeimdallMetadata> metadata;
}
