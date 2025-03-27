package com.heimdallauth.server.models.bifrost;

import com.heimdallauth.server.constants.bifrost.EmailPriority;
import lombok.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Template {
    private String hrn;
    private String templateName;
    private String templateDescription;
    private EmailTemplateContent templatedContent;
    private EmailPriority defaultEmailPriority;
}
