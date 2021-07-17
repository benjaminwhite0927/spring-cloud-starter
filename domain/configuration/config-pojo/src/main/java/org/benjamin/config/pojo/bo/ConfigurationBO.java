package org.benjamin.config.pojo.bo;

import lombok.*;

@Data
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class ConfigurationBO {
    private String key;
    private String value;
    private String application;
    private String profile;
    private String label;
}
