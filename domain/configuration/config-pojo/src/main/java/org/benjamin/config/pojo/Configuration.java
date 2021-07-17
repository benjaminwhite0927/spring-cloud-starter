package org.benjamin.config.pojo;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "configurations")
public class Configuration implements Serializable {
    @Id
    @Column(name = "i_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "i_key")
    private String key;

    @Column(name = "i_value")
    private String value;

    @Column(name = "i_application")
    private String application;

    @Column(name = "i_profile")
    private String profile;

    @Column(name = "i_label")
    private String label;

    private static final long serialVersionUID = 1L;

    /**
     * @return i_id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return i_key
     */
    public String getKey() {
        return key;
    }

    /**
     * @param key
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * @return i_value
     */
    public String getValue() {
        return value;
    }

    /**
     * @param value
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * @return i_application
     */
    public String getApplication() {
        return application;
    }

    /**
     * @param application
     */
    public void setApplication(String application) {
        this.application = application;
    }

    /**
     * @return i_profile
     */
    public String getProfile() {
        return profile;
    }

    /**
     * @param profile
     */
    public void setProfile(String profile) {
        this.profile = profile;
    }

    /**
     * @return i_label
     */
    public String getLabel() {
        return label;
    }

    /**
     * @param label
     */
    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", key=").append(key);
        sb.append(", value=").append(value);
        sb.append(", application=").append(application);
        sb.append(", profile=").append(profile);
        sb.append(", label=").append(label);
        sb.append("]");
        return sb.toString();
    }
}