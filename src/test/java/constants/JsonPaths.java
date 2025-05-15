package constants;

import lombok.experimental.UtilityClass;

@UtilityClass
public class JsonPaths {
    public final String NAME = "name";
    public final String CATEGORY = "category";
    public final String CATEGORY_NAME = "%s.%s".formatted(CATEGORY, NAME);
}
