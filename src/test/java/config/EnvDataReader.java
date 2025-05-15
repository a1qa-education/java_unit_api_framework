package config;

import lombok.experimental.UtilityClass;
import utils.JsonUtils;

@UtilityClass
public class EnvDataReader {
    private final String RESOURCES_PATH = "src/test/resources/";
    private final String ENVIRONMENT_PATH = RESOURCES_PATH + "environment/";

    private String getCurrentEnvironment() {
        return JsonUtils.getStringByKey(RESOURCES_PATH + "env.json", "env");
    }

    public EnvData getEnvData() {
        String envConfigPath = "%s%s.json".formatted(ENVIRONMENT_PATH, getCurrentEnvironment());
        return JsonUtils.deserializeJson(envConfigPath, EnvData.class);
    }
}
