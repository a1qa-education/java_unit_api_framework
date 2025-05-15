package utils;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import lombok.experimental.UtilityClass;
import org.apache.http.HttpStatus;
import org.awaitility.core.ConditionTimeoutException;

import java.time.Duration;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;

import static org.awaitility.Awaitility.await;

@UtilityClass
public class ResponseUtils {
    private final Duration COMMON_WAIT = Duration.ofSeconds(15);
    private final Duration POLL_INTERVAL = Duration.ofMillis(1000);

    public void checkStatusCode(Response response, int statusCode) {
        // TODO: complete the method
    }

    public void checkContentType(Response response, ContentType contentType) {
        // TODO: complete the method
    }

    public void checkHeaderContainsString(Response response, String header, String headerValue) {
        // TODO: complete the method
    }

    public void checkResponseMessageDisplayed(Response response, String message) {
        // TODO: complete the method
    }

    public Response waitForStatusCode(Supplier<Response> requestSupplier, int expectedStatusCode) {
        AtomicReference<Response> lastResponse = new AtomicReference<>();

        try {
            await().atMost(COMMON_WAIT)
                    .pollInterval(POLL_INTERVAL)
                    .until(() -> {
                        Response response = requestSupplier.get();
                        lastResponse.set(response);
                        return response.getStatusCode() == expectedStatusCode;
                    });
        } catch (ConditionTimeoutException e) {
            throw new AssertionError("Timeout waiting for SC '%d'. Last SC was '%d'. Exception: %s"
                    .formatted(expectedStatusCode, lastResponse.get().statusCode(), e));
        }
        return lastResponse.get();
    }

    public <T> Response waitForPropertyToBeEqual(Supplier<Response> requestSupplier, String jsonPath, T expectedValue) {
        AtomicReference<Response> lastResponse = new AtomicReference<>();

        try {
            await().atMost(COMMON_WAIT)
                    .pollInterval(POLL_INTERVAL)
                    .until(() -> {
                        Response response = requestSupplier.get();
                        lastResponse.set(response);
                        return response.getStatusCode() == HttpStatus.SC_OK
                                && expectedValue.equals(response.path(jsonPath));
                    });
        } catch (ConditionTimeoutException e) {
            throw new AssertionError("Timeout waiting for SC 200 and '%1$s' to be '%2$s'. Last SC was '%3$d'. Last '%1$s' was '%4$s'. Exception: %5$s"
                    .formatted(jsonPath, expectedValue, lastResponse.get().statusCode(), lastResponse.get().path(jsonPath), e));
        }
        return lastResponse.get();
    }
}
