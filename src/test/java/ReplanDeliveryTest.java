import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.textCaseSensitive;
import static com.codeborne.selenide.Selenide.*;

public class ReplanDeliveryTest {

    void dataInput(int days) {
        SelenideElement data = $("[data-test-id=date]");
        data.$("[value]").doubleClick().sendKeys(Keys.BACK_SPACE);
        data.$("[placeholder]").setValue(DataGenerator.dataInput(days));
    }

    @BeforeEach
    void befor() {
        open("http://localhost:9999");
    }

    @Test
    void getTrueInputValidForm() {
        $("[placeholder=Город]").setValue(DataGenerator.cityForInput());
        int inDays = 4;
        dataInput(inDays);

    }
}

