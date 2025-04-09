package com.heimdallauth.server.models;

public record UserContext(
        String username,
        String firstName,
        String lastName,
        String primaryEmailAddress,
        String secondaryEmailAddress,
        String phoneNumber
) {
}
