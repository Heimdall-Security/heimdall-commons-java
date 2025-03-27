package com.heimdallauth.server.bifrost;

import com.heimdallauth.server.constants.bifrost.SuppressionListEntryType;
import lombok.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class SuppressionListEntry {
    private SuppressionListEntryType type;
    private String value;
}
