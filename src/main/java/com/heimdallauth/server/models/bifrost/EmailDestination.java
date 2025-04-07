package com.heimdallauth.server.models.bifrost;

import java.util.List;

public record EmailDestination(
        List<String> toDestinationEmailAddress,
        List<String> ccDestinationEmailAddress,
        List<String> bccDestinationEmailAddress
) {
}
