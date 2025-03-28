package com.heimdallauth.server.mapper.bifrost;

import com.heimdallauth.server.dto.bifrost.ConfigurationSetDTO;
import com.heimdallauth.server.models.bifrost.ConfigurationSetModel;
import org.modelmapper.PropertyMap;

public class ConfigurationSetModelToConfigurationSetDTOMappingConfig extends PropertyMap<ConfigurationSetModel, ConfigurationSetDTO> {

        @Override
        protected void configure() {
            map().setConfigurationSetId(source.getConfigurationSetId().toString());
            map().setConfigurationSetName(source.getConfigurationSetName());
            map().setEmailSuppressions(source.getSuppressionEntries());
            map().setSmtpProperties(source.getSmtpProperties());
        }
}
