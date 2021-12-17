import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;


public class DeliveryCardTest {
    @Test
    public void shouldSetForm() {
        open("http://localhost:9999/");
        $("[data-test-id='city'] input").setValue("Уфа");
        $("[data-test-id='date'] input").setValue("{data}");
        $("[data-test-id='name'] input").setValue("Попова София-Анна");
        $("[data-test-id='phone'] input").setValue("+79215867954");
        $("[data-test-id='agreement']").click();
        $(".button").click();
        $("[data-test-id='notification']").shouldBe(visible, Duration.ofSeconds(15));

    }
}
