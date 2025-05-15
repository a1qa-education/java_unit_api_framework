package utils;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import lombok.experimental.UtilityClass;

import java.io.FileNotFoundException;
import java.io.FileReader;

@UtilityClass
public class JsonUtils {
    private final String JSON_DESERIALIZE_ERROR_MSG = "Could not deserialize JSON file at '%s'. Cause: %s";
    private final String JSON_KEY_NOT_FOUND_ERROR_MSG = "Key '%s' not found in the JSON file '%s'";
    private final Gson GSON = new Gson();

    public <T> T deserializeJson(String filePath, Class<T> tClass) {
        try {
            return GSON.fromJson(new FileReader(filePath), tClass);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(JSON_DESERIALIZE_ERROR_MSG.formatted(filePath, e));
        }
    }

    public String getStringByKey(String filePath, String key) {
        try {
            JsonObject jsonObject = JsonParser.parseReader(new FileReader(filePath)).getAsJsonObject();
            JsonElement jsonElement = jsonObject.get(key);

            if (jsonElement == null || jsonElement.isJsonNull()) {
                throw new RuntimeException(JSON_KEY_NOT_FOUND_ERROR_MSG.formatted(key, filePath));
            }
            return jsonElement.getAsString();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(JSON_DESERIALIZE_ERROR_MSG.formatted(filePath, e));
        }
    }
}
