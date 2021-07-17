package org.benjamin.config.api;

import lombok.extern.slf4j.Slf4j;
import org.benjamin.config.mapper.ConfigurationMapper;
import org.benjamin.config.pojo.Configuration;
import org.benjamin.config.pojo.bo.ConfigurationBO;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.RestController;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@RestController
public class ConfigurationService implements IConfigurationService{
    @Resource
    private ConfigurationMapper configurationMapper;

    @Override
    public List<Configuration> listAll(String profile, String label) {
        Configuration configuration = new Configuration();
        configuration.setProfile(profile);
        configuration.setLabel(label);
        List<Configuration> configurations = configurationMapper.select(configuration);
        return configurations;
    }

    @Override
    public void addConfiguration(ConfigurationBO configurationBO) {
        Configuration configuration = new Configuration();
        BeanUtils.copyProperties(configurationBO, configuration);

        Configuration configurationNew = configurationMapper.selectOneByExample(generateSearchConfiguration(configuration));
        if (configurationNew != null) {
            log.warn("There are existing configuration - {}", configurationNew);
        } else {
            configurationMapper.insert(configuration);
            log.warn("Created new configuration - {}", configuration);
        }
    }

    @Override
    public void updateConfiguration(ConfigurationBO configurationBO) {
        Configuration configuration = new Configuration();
        BeanUtils.copyProperties(configurationBO, configuration);

        Configuration configurationNew = configurationMapper.selectOneByExample(generateSearchConfiguration(configuration));
        if (configurationNew == null) {
            log.warn("There is no configuration - {}", configuration);
        } else {
            configuration.setId(configurationNew.getId());
            configurationMapper.updateByPrimaryKeySelective(configuration);
            log.warn("Updated configuration from '{}' to '{}'", configurationNew, configuration);
        }
    }

    @Override
    public void deleteConfiguration(ConfigurationBO configurationBO) {
        Configuration configuration = new Configuration();
        BeanUtils.copyProperties(configurationBO, configuration);
        configurationMapper.delete(configuration);
        log.info("Deleted the configuration - {}", configuration);
    }

    private Example generateSearchConfiguration(Configuration configuration) {
        Example configurationExample = new Example(Configuration.class);
        Example.Criteria configurationCriteria = configurationExample.createCriteria();
        configurationCriteria.andEqualTo("profile", configuration.getProfile());
        configurationCriteria.andEqualTo("label", configuration.getLabel());
        configurationCriteria.andEqualTo("application", configuration.getApplication());
        configurationCriteria.andEqualTo("key", configuration.getKey());
        return configurationExample;
    }
}