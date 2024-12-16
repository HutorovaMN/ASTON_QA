package org.dochub.apitest;

import entity.pojo.ResponseJSONnata;
import helpers.Service;
import io.qameta.allure.Description;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static common.Tags.NEGATIVE;
import static common.Tags.POSITIVE;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class liveStageCheckCancelTest {
    private Service service;

    @BeforeEach
    void initService() {
        service = new Service();
    }

    @Tag(NEGATIVE)
    @Tag("apiValidator")
    @DisplayName("testcase_86_Cancel_Negative")
    @Description("API. \\live-stage\\Отмена. Обновление объекта")
    @MethodSource("page.apiValidatorsDataPage#getObjectCancel")
    @ParameterizedTest(name = "testcase_86_Negative")
    void checkLiveStageArchiveValidatorTest(String objectParent, String objectChild, String attributeLifeStage,
                                            String valueCancel, String valueSketch, String valueIndustrialOperation,
                                            String messageValid) {

        assertAll(
                () -> assertEquals(service.getResponseObjectPatch(objectParent, attributeLifeStage, valueCancel).getMessage()
                        , messageValid, "Атрибут " + attributeLifeStage + " объекта " + valueCancel + " не обновлен"),
                () -> assertEquals(service.getResponseObjectPatch(objectChild, attributeLifeStage, valueCancel).getMessage()
                        , messageValid, "Атрибут " + attributeLifeStage + " объекта " + valueCancel + " не обновлен"),
                () -> assertEquals("Маркетплейс", service.getValidator().get(0).getName(),
                        "Проверка имени: ожидается 'Маркетплейс'"),
                () -> assertEquals("Значение \"Отменено\" не из словаря допустимых значений",
                        service.getValidator().get(0).getError_text(),
                        "Проверка текста ошибки: ожидается 'Значение \"Отменено\" не из словаря допустимых значений'"),

                () -> assertEquals(service.getResponseObjectPatch(objectChild, attributeLifeStage, valueSketch).getMessage()
                        , messageValid, "Атрибут " + attributeLifeStage + " объекта " + valueSketch + " не обновлен"),
                () -> assertEquals("Маркетплейс", service.getValidator().get(0).getName(),
                        "Проверка имени: ожидается 'Маркетплейс'"),
                () -> assertEquals("Значение \"Отменено\" не из словаря допустимых значений",
                        service.getValidator().get(0).getError_text(),
                        "Проверка текста ошибки: ожидается 'Значение \"Отменено\" не из словаря допустимых значений'"),

                () -> assertEquals(service.getResponseObjectPatch(objectParent, attributeLifeStage, valueSketch).getMessage()
                        , messageValid, "Атрибут " + attributeLifeStage + " объекта " + valueSketch + " не обновлен"),
                () -> assertEquals(service.getResponseObjectPatch(objectChild, attributeLifeStage, valueCancel).getMessage()
                        , messageValid, "Атрибут " + attributeLifeStage + " объекта " + valueCancel + " не обновлен"),
                () -> assertEquals("Каталог услуг", service.getValidator().get(0).getName(),
                        "Проверка имени: ожидается 'Каталог услуг'"),
                () -> assertEquals("Значение \"Отменено\" не из словаря допустимых значений",
                        service.getValidator().get(0).getError_text(),
                        "Проверка текста ошибки: ожидается 'Значение \"Отменено\" не из словаря допустимых значений'")
        );
    }

    @Tag(POSITIVE)
    @Tag("apiValidator")
    @DisplayName("testcase_86_IndustrialOperation_Positive")
    @Description("API. \\live-stage\\Промышленная эксплуатация. Обновление объекта")
    @MethodSource("page.apiValidatorsDataPage#getObjectCancel")
    @ParameterizedTest(name = "testcase_86_Positive")
    void checkLiveStageIndustrialOperationValidatorTest(String objectParent, String objectChild, String attributeLifeStage,
                                                        String valueCancel, String valueSketch, String valueIndustrialOperation,
                                                        String messageValid) {

        assertAll(
                () -> assertEquals(service.getResponseObjectPatch(objectParent, attributeLifeStage, valueIndustrialOperation).getMessage()
                        , messageValid, "Атрибут " + attributeLifeStage + " объекта " + valueIndustrialOperation + " не обновлен"),
                () -> assertEquals(service.getResponseObjectPatch(objectChild, attributeLifeStage, valueCancel).getMessage()
                        , messageValid, "Атрибут " + attributeLifeStage + " объекта " + valueCancel + " не обновлен")
        );

        Assertions.assertThat(service.getValidator()).extracting(ResponseJSONnata::getName)
                .doesNotContain("Маркетплейс", "Список responseJSONnata содержит неожиданный элемент с именем 'Маркетплейс'");
    }
}
