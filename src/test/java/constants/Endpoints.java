package constants;

import lombok.experimental.UtilityClass;

@UtilityClass
public class Endpoints {
    public final String BASE_PATH = "/v2";
    public final String PET = "/pet";
    public final String PET_BY_ID = "%s/{%s}".formatted(PET, Params.ID);
    // TODO: add missing endpoints
}
