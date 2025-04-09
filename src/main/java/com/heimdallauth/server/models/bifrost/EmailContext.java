package com.heimdallauth.server.models.bifrost;

import com.heimdallauth.server.models.OrganizationContext;
import com.heimdallauth.server.models.UserContext;

import java.util.Map;

public record EmailContext(
        UserContext user,
        OrganizationContext organizationContext,
        Map<String, Object> variables
) {
}
