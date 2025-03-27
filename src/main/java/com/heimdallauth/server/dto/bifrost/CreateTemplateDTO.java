package com.heimdallauth.server.dto.bifrost;

import com.heimdallauth.server.constants.bifrost.EmailPriority;
import com.heimdallauth.server.models.bifrost.EmailTemplateContent;
import com.heimdallauth.server.models.bifrost.Template;
import lombok.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CreateTemplateDTO {
    private String templateName;
    private String templateDescription;
    private String subject;
    private String plainTextBodyContent;
    private String htmlBodyContent;
    private EmailPriority defaultEmailPriority;

    private EmailTemplateContent getEmailTemplateContent() {
        return EmailTemplateContent.builder()
                .htmlBodyContent(htmlBodyContent)
                .plainTextBodyContent(plainTextBodyContent)
                .subject(subject)
                .build();
    }
    public Template toTemplate(){
        return Template.builder()
                .templatedContent(this.getEmailTemplateContent())
                .templateName(templateName)
                .templateDescription(templateDescription)
                .defaultEmailPriority(defaultEmailPriority)
                .build();
    }
}
