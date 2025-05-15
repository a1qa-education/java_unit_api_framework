package api;

import constants.Endpoints;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import config.EnvDataReader;
import lombok.experimental.UtilityClass;

@UtilityClass
public class SpecFactory {

    public RequestSpecification getBaseReqSpec() {
        return getBaseReqSpecBuilder()
                .build();
    }

    public RequestSpecification getReqSpecWithContentType() {
        return getBaseReqSpecBuilder()
                .setContentType(ContentType.JSON)
                .build();
    }

    private RequestSpecBuilder getBaseReqSpecBuilder() {
        return new RequestSpecBuilder()
                .setBaseUri(EnvDataReader.getEnvData().getApiUrl())
                .setBasePath(Endpoints.BASE_PATH)
                .addFilter(new RequestLoggingFilter())
                .addFilter(new ResponseLoggingFilter())
                .setAccept(ContentType.JSON);
    }
}
