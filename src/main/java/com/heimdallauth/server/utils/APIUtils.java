package com.heimdallauth.server.utils;

import java.util.logging.Level;
import java.util.logging.Logger;

public class APIUtils {
    private static final String HTTP_SCHEMA_DELIMITER = "://";
    private static final String HTTP_URL_COMPONENT_DELIMITER = ".";
    private static final String KEYWORD_DEV = "dev";
    private static final Logger LOGGER = Logger.getLogger(APIUtils.class.getName());

    public static String buildHttpBaseUrl(String schema,String serviceName,  String cloudIdentifier, String dnsName, boolean isDevEnvironment) {
        StringBuilder sb = new StringBuilder(schema);
        sb.append(HTTP_SCHEMA_DELIMITER);
        sb.append(normalizeServiceName(serviceName)).append(HTTP_URL_COMPONENT_DELIMITER);
        if(isDevEnvironment) {
            sb.append(KEYWORD_DEV).append(HTTP_URL_COMPONENT_DELIMITER);
        }
        sb.append(cloudIdentifier).append(HTTP_URL_COMPONENT_DELIMITER).append(dnsName);
        return sb.toString();
    }
    static String normalizeServiceName(String serviceName) {
        String cleanedServiceName = serviceName.trim()
                                               .replaceAll("\\s+", "-") // Replace spaces with hyphens
                                               .replaceAll("[^a-zA-Z0-9\\-]", ""); // Remove special characters
        if (!cleanedServiceName.equals(serviceName)) {
            LOGGER.log(Level.INFO, "Service name normalized from {0} to {1}", new Object[]{serviceName, cleanedServiceName});
        }
        return cleanedServiceName.replaceAll(HTTP_SCHEMA_DELIMITER, "").toLowerCase();
    }

}
