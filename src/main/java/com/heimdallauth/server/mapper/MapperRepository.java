package com.heimdallauth.server.mapper;

import com.heimdallauth.server.mapper.bifrost.ConfigurationSetDTOToConfigurationSetModelMappingConfig;
import com.heimdallauth.server.mapper.bifrost.ConfigurationSetModelToConfigurationSetDTOMappingConfig;
import org.modelmapper.ModelMapper;

public class MapperRepository {
    public static final ModelMapper BIFROST_SERVICE_MAPPER = new ModelMapper();

    static {
        BIFROST_SERVICE_MAPPER.addMappings(new ConfigurationSetModelToConfigurationSetDTOMappingConfig());
        BIFROST_SERVICE_MAPPER.addMappings(new ConfigurationSetDTOToConfigurationSetModelMappingConfig());
    }

}
