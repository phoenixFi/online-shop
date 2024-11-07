
package models;

import java.util.HashMap;
import java.util.Map;

public class ConfigurationManager {
    private static ConfigurationManager instance;
    private Map<String, String> configs;

    private ConfigurationManager() {
        configs = new HashMap<>();
        configs.put("payment.defaultMethod", "credit_card");
        configs.put("order.defaultStatus", "pending");
    }
    public static ConfigurationManager getInstance() {
        if (instance == null) {
            instance = new ConfigurationManager();
        }
        return instance;
    }

    public void setConfig(String key, String value) {
        configs.put(key, value);
    }

    public String getConfig(String key) {
        return configs.getOrDefault(key, "");
    }
}
