package config;

import lombok.experimental.UtilityClass;
import utils.JsonUtils;

@UtilityClass
public class EnvDataReader {
    private final String RESOURCES_PATH = "src/test/resources/";
    private final String ENVIRONMENT_PATH = RESOURCES_PATH + "environment/";
    private EnvData cachedEnvData;

    private String getCurrentEnvironment() {
        return JsonUtils.getStringByKey(RESOURCES_PATH + "env.json", "env");
    }

    public EnvData getEnvData() {
        if (cachedEnvData == null) {
            String envConfigPath = "%s%s.json".formatted(ENVIRONMENT_PATH, getCurrentEnvironment());
            cachedEnvData = JsonUtils.deserializeJson(envConfigPath, EnvData.class);
        }
        return cachedEnvData;
    }
}
