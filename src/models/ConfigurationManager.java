
package models;

public class ConfigurationManager {
    private static ConfigurationManager instance;
    private String config;

    private ConfigurationManager() {}

    public static ConfigurationManager getInstance() {
        if (instance == null) {
            instance = new ConfigurationManager();
        }
        return instance;
    }
    public String getConfig(String key) {
        return config;
    }

    public void setConfig(String key, String value) {
        this.config = value;
    }
}
