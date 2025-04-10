package com.heimdallauth.server.models;

public record OrganizationContext(
        String supportContactEmailAddress,
        String supportContactPhoneNumber,
        String organizationName,
        String hostedFQDN,
        String organizationLogoURL,
        String organizationLogoAltText
) {
}
