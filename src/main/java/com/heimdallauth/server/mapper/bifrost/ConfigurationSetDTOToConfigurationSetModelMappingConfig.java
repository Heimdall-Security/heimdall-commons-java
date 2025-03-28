package com.heimdallauth.server.mapper.bifrost;

import com.heimdallauth.server.dto.bifrost.ConfigurationSetDTO;
import com.heimdallauth.server.models.bifrost.ConfigurationSetModel;
import org.modelmapper.PropertyMap;

import java.util.UUID;

public class ConfigurationSetDTOToConfigurationSetModelMappingConfig extends PropertyMap<ConfigurationSetDTO, ConfigurationSetModel> {
    @Override
    protected void configure() {
        map().setConfigurationSetId(UUID.fromString(source.getConfigurationSetId()));
        map().setConfigurationSetName(source.getConfigurationSetName());
        map().setSuppressionEntries(source.getEmailSuppressions());
        map().setSmtpProperties(source.getSmtpProperties());
    }
}
