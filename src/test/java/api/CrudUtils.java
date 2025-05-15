package api;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import lombok.experimental.UtilityClass;

import java.util.Map;

import static io.restassured.RestAssured.given;

@UtilityClass
public class CrudUtils {

    public Response get(RequestSpecification spec, String endpoint,
                        Map<String, Object> pathParams,
                        Map<String, Object> queryParams) {
        // TODO: complete the method
        return null;
    }

    public Response post(RequestSpecification spec, String endpoint,
                         Map<String, Object> pathParams,
                         Object body) {
        // TODO: complete the method
        return null;
    }

    public Response put(RequestSpecification spec, String endpoint,
                        Map<String, Object> pathParams,
                        Object body) {
        // TODO: complete the method
        return null;
    }

    public Response delete(RequestSpecification spec, String endpoint,
                           Map<String, Object> pathParams,
                           Map<String, Object> queryParams) {
        return given()
                .spec(spec)
                .pathParams(pathParams != null ? pathParams : Map.of())
                .queryParams(queryParams != null ? queryParams : Map.of())
                .when()
                .delete(endpoint);
    }
}
