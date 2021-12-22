package singleton_pattern;

import java.util.HashMap;
import java.util.Map;

public class ConfigManagerSingleton {
    private final Map<String, Object> settings = new HashMap();
    private final static ConfigManagerSingleton instnce = new ConfigManagerSingleton();

    private ConfigManagerSingleton() {
    }

    public void set(String key, Object value) {
        settings.put(key, value);
    }

    public Object get(String key) {
        return settings.get(key);
    }

    public static ConfigManagerSingleton getInstnce() {
        return instnce;
    }
}
