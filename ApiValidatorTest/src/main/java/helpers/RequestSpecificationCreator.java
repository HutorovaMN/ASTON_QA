package helpers;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.apache.http.HttpStatus;

import static common.BaseUrl.BASE_HOST;
import static common.BaseUrl.MAIN_HOST;
import static io.restassured.http.ContentType.JSON;
import static org.hamcrest.Matchers.lessThanOrEqualTo;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class RequestSpecificationCreator {

    public static RequestSpecification getRecSpec(String path,
                                                  String pathId) {
        return new RequestSpecBuilder()
                .setBaseUri(MAIN_HOST)
                .setBasePath(String.format(path, pathId))
                .setContentType(ContentType.JSON)
                .build();
    }

    public static RequestSpecification requestSpec() {
        return new RequestSpecBuilder()
                .setBaseUri(BASE_HOST)//---> Cтартовая URL
                .setRelaxedHTTPSValidation()//---> Отключение проверки сертификата
                .setContentType(String.valueOf(JSON))//---> Установка Content Type
                .setAccept(String.valueOf(JSON))//---> Установка Accept
                .build();
    }
}
