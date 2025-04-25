package com.heimdallauth.server.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class APIUtilsTest {

    @Test
    void testBuildHttpBaseUrl() {
        String schema = "http";
        String serviceName = "Test Service";
        String cloudIdentifier = "cloud";
        String dnsName = "example.com";
        boolean isDevEnvironment = true;

        String expectedUrl = "http://test-service.dev.cloud.example.com";
        String actualUrl = APIUtils.buildHttpBaseUrl(schema, serviceName, cloudIdentifier, dnsName, isDevEnvironment);

        assertEquals(expectedUrl, actualUrl);
    }

    @Test
    void testBuildHttpBaseUrlWithoutDevEnvironment() {
        String schema = "https";
        String serviceName = "Another Service";
        String cloudIdentifier = "ap-west-1";
        String dnsName = "example.org";
        boolean isDevEnvironment = false;

        String expectedUrl = "https://another-service.ap-west-1.example.org";
        String actualUrl = APIUtils.buildHttpBaseUrl(schema, serviceName, cloudIdentifier, dnsName, isDevEnvironment);

        assertEquals(expectedUrl, actualUrl);
    }

    @Test
    void testNormalizeServiceName() {
        String serviceName = "My Service!@#";
        String expectedNormalized = "my-service";
        String actualNormalized = APIUtils.normalizeServiceName(serviceName);

        assertEquals(expectedNormalized, actualNormalized);
    }

    @Test
    void testNormalizeServiceNameWithNoChanges() {
        String serviceName = "valid-service-name";
        String expectedNormalized = "valid-service-name";
        String actualNormalized = APIUtils.normalizeServiceName(serviceName);

        assertEquals(expectedNormalized, actualNormalized);
    }
}