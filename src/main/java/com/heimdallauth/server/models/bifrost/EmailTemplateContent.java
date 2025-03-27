package com.heimdallauth.server.models.bifrost;

import lombok.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class EmailTemplateContent {
    private String subject;
    private String plainTextBodyContent;
    private String htmlBodyContent;
}
