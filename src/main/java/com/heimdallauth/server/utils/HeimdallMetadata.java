package com.heimdallauth.server.utils;

import lombok.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class HeimdallMetadata {
    private String key;
    private String value;
}
