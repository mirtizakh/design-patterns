package singleton_pattern;

public class SingletonPatternMain {
    public static void main(String[] args) {
     /*
        ConfigManager configManager = new ConfigManager();
        configManager.set("name", "Test");

        ConfigManager other = new ConfigManager();
        System.out.println(other.get("name"));
   */
        // --- After implementing Singleton approach -- //

        ConfigManagerSingleton configManagerSingleton = ConfigManagerSingleton.getInstnce();
        configManagerSingleton.set("name", "Test");

        ConfigManagerSingleton configManagerSingletonOther = ConfigManagerSingleton.getInstnce();
        System.out.println(configManagerSingletonOther.get("name"));

    }
}
