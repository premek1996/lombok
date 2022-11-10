package advancedlombok;

import lombok.Getter;
import lombok.SneakyThrows;

import java.util.HashMap;
import java.util.Map;

public class CrmContracts {

    @Getter(lazy = true)
    private final Map<String, String> numbers = fetchNumbers();

    @SneakyThrows
    private Map<String, String> fetchNumbers() {
        Map<String, String> numbers = new HashMap<>();
        numbers.put("allegro", "124214124");
        Thread.sleep(500);
        numbers.put("nike", "253253253");
        Thread.sleep(500);
        numbers.put("web", "124124");
        Thread.sleep(500);
        return numbers;
    }

}
