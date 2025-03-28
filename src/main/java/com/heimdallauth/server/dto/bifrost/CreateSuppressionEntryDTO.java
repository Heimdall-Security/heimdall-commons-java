package com.heimdallauth.server.dto.bifrost;

import com.heimdallauth.server.constants.bifrost.SuppressionListEntryType;
import com.heimdallauth.server.constants.bifrost.SuppressionReason;
import lombok.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CreateSuppressionEntryDTO {
    private SuppressionListEntryType entryType;
    private String suppressionEntryValue;
    private SuppressionReason reason;
}
