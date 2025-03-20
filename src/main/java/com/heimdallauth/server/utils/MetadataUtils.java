package com.heimdallauth.server.utils;

import java.time.Instant;
import java.util.List;

public class MetadataUtils {
    private static final String CREATION_TIMESTAMP_KEY = "creationTimestamp";
    private static final String UPDATE_TIMESTAMP_KEY = "updateTimestamp";
    public static List<HeimdallMetadata> getCreationAndUpdateTimestamps(){
        return List.of(
          HeimdallMetadata.builder().key(CREATION_TIMESTAMP_KEY).value(Instant.now().toString()).build(),
            HeimdallMetadata.builder().key(UPDATE_TIMESTAMP_KEY).value(Instant.now().toString()).build()
        );
    }
}
