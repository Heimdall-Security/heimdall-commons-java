package com.heimdallauth.server.models.bifrost;

import lombok.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class MessageHeader {
    private String name;
    private String value;
}
