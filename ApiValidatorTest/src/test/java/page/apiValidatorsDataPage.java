package page;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class apiValidatorsDataPage {
    public static Stream<Arguments> getObject() {
        return Stream.of(
                Arguments.of("kadzo.v2023.systems/ecogroup.berezka.systems.berezka"
                        , "kadzo.v2023.systems/ecogroup.berezka.systems.berezka.catalog"
                        , "live-stage", "Архивный", "Эскиз", "Промышленная эксплуатация", "Атрибут объекта успешно обновлен")
        );
    }

    public static Stream<Arguments> getObjectCancel() {
        return Stream.of(
                Arguments.of("kadzo.v2023.systems/ecogroup.berezka.systems.berezka"
                        , "kadzo.v2023.systems/ecogroup.berezka.systems.berezka.catalog"
                        , "live-stage", "Отменено", "Эскиз", "Промышленная эксплуатация", "Атрибут объекта успешно обновлен")
        );
    }
}
