package com.heimdallauth.server.utils;

import java.time.Instant;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MetadataUtils {
    private static final String CREATION_TIMESTAMP_KEY = "creationTimestamp";
    private static final String UPDATE_TIMESTAMP_KEY = "updateTimestamp";
    public static List<HeimdallMetadata> getCreationAndUpdateTimestamps(){
        return List.of(
          HeimdallMetadata.builder().key(CREATION_TIMESTAMP_KEY).value(Instant.now().toString()).build(),
            HeimdallMetadata.builder().key(UPDATE_TIMESTAMP_KEY).value(Instant.now().toString()).build()
        );
    }
    public static List<HeimdallMetadata> createAndAddMetadataToExistingMetadata(List<HeimdallMetadata> metadata, String key, String value){
        return Stream.concat(metadata.stream(), Stream.of(HeimdallMetadata.builder().key(key).value(value).build()))
                     .collect(Collectors.toList());
    }
    public static List<HeimdallMetadata> updateTimestamp(List<HeimdallMetadata> metadata){
        return metadata.stream()
                .map(m -> {
                    if(m.getKey().equals(UPDATE_TIMESTAMP_KEY)){
                        return HeimdallMetadata.builder().key(m.getKey()).value(Instant.now().toString()).build();
                    }
                    return m;
                })
                .collect(Collectors.toList());
    }
}
