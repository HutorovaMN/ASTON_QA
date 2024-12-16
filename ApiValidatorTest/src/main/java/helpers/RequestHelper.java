package helpers;

import common.BaseUrl;
import entity.pojo.RequestObject;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.Arrays;
import java.util.List;

import static io.restassured.RestAssured.given;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class RequestHelper extends BaseUrl {

    public static <T> List<T> doGetReturnList(int httpStatusCode, Class<T[]> responseType) {
        return Arrays.asList(given()
                .spec(RequestSpecificationCreator.requestSpec())
                .when()
                .log().all()
                .get(VALIDATOR)
                .then().statusCode(httpStatusCode)
                .log().all()
                .extract()
                .body()
                .as(responseType));
    }

    public static <T> T doPatchReturnItem(RequestObject request, Class<T> responseType) {
        return given()
                .spec(RequestSpecificationCreator.requestSpec())
                .body(request)
                .patch(MANIFEST_HOST)
                .then()
                .log().all()
                .extract().as(responseType);
    }
}
