package org.benjamin.config.api;

import org.benjamin.config.pojo.Configuration;
import org.benjamin.config.pojo.bo.ConfigurationBO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("config")
public interface IConfigurationService {

    @GetMapping("configurations")
    public List<Configuration> listAll(@RequestParam("profile") String profile, @RequestParam("label") String label);

    @PostMapping("configuration")
    public void addConfiguration(@RequestBody ConfigurationBO configurationBO);

    @PutMapping("configuration")
    public void updateConfiguration(@RequestBody ConfigurationBO configurationBO);

    @DeleteMapping("configuration")
    public void deleteConfiguration(@RequestBody ConfigurationBO configurationBO);
}
