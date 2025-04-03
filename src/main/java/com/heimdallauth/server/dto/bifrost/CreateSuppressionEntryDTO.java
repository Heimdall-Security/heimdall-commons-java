package com.heimdallauth.server.dto.bifrost;

import com.heimdallauth.server.constants.bifrost.SuppressionListEntryType;
import com.heimdallauth.server.constants.bifrost.SuppressionReason;

public record CreateSuppressionEntryDTO(
        SuppressionListEntryType entryType,
        String value,
        SuppressionReason reason
) {
}
