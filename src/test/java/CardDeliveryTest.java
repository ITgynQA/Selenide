import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class CardDeliveryTest {
    String generateDate(int daysToAdd, String pattern) {
        return LocalDate.now().plusDays(daysToAdd).format(DateTimeFormatter.ofPattern(pattern));
    }


    @Test
    public void happyPathTest1() {
        open("http:/localhost:9999/");
        $("[data-test-id='city'] input").setValue("Самара");
        $("[data-test-id='date'] input").sendKeys(Keys.chord(Keys.SHIFT, Keys.HOME), Keys.DELETE);
        $("[data-test-id='date'] input").setValue(generateDate(5, "dd.MM.yyyy"));
        $("[data-test-id='name'] input").setValue("Иванов Иван");
        $("[data-test-id='phone'] input").setValue("+79998887766");
        $("[data-test-id='agreement']").click();
        $("button.button_view_extra").click();
        $("[data-test-id='notification'] .notification__title").shouldHave(text("Успешно!"), Duration.ofSeconds(13));

    }

    @Test
    public void happyPathTest2() {
        open("http:/localhost:9999/");
        $("[data-test-id='city'] input").setValue("Самара");
        $("[data-test-id='date'] input").sendKeys(Keys.chord(Keys.SHIFT, Keys.HOME), Keys.DELETE);
        $("[data-test-id='date'] input").setValue(generateDate(5, "dd.MM.yyyy"));
        $("[data-test-id='name'] input").setValue("Иванов Иван");
        $("[data-test-id='phone'] input").setValue("+79998887766");
        $("[data-test-id='agreement']").click();
        $("button.button_view_extra").click();
        $("[data-test-id='notification'] .notification__content").shouldHave(exactText("Встреча успешно забронирована на " + generateDate(5, "dd.MM.yyyy")), Duration.ofSeconds(13));
    }

    @Test
    public void happyPathTest3() {
        open("http:/localhost:9999/");
        $("[data-test-id='city'] input").setValue("Петропавловск-Камчатский");
        $("[data-test-id='date'] input").sendKeys(Keys.chord(Keys.SHIFT, Keys.HOME), Keys.DELETE);
        $("[data-test-id='date'] input").setValue(generateDate(5, "dd.MM.yyyy"));
        $("[data-test-id='name'] input").setValue("Иванов Иван");
        $("[data-test-id='phone'] input").setValue("+79998887766");
        $("[data-test-id='agreement']").click();
        $("button.button_view_extra").click();
        $("[data-test-id='notification'] .notification__content").shouldHave(exactText("Встреча успешно забронирована на " + generateDate(5, "dd.MM.yyyy")), Duration.ofSeconds(13));
    }

    @Test
    public void happyPathTest4() {
        open("http:/localhost:9999/");
        $("[data-test-id='city'] input").setValue("Нижний Новгород");
        $("[data-test-id='date'] input").sendKeys(Keys.chord(Keys.SHIFT, Keys.HOME), Keys.DELETE);
        $("[data-test-id='date'] input").setValue(generateDate(5, "dd.MM.yyyy"));
        $("[data-test-id='name'] input").setValue("Иванов Иван");
        $("[data-test-id='phone'] input").setValue("+79998887766");
        $("[data-test-id='agreement']").click();
        $("button.button_view_extra").click();
        $("[data-test-id='notification'] .notification__content").shouldHave(exactText("Встреча успешно забронирована на " + generateDate(5, "dd.MM.yyyy")), Duration.ofSeconds(13));
    }

    @Test
    public void happyPathTest5() {
        open("http:/localhost:9999/");
        $("[data-test-id='city'] input").setValue("Самара");
        $("[data-test-id='date'] input").sendKeys(Keys.chord(Keys.SHIFT, Keys.HOME), Keys.DELETE);
        $("[data-test-id='date'] input").setValue(generateDate(40, "dd.MM.yyyy"));
        $("[data-test-id='name'] input").setValue("Иванов Иван");
        $("[data-test-id='phone'] input").setValue("+79998887766");
        $("[data-test-id='agreement']").click();
        $("button.button_view_extra").click();
        $("[data-test-id='notification'] .notification__content").shouldHave(exactText("Встреча успешно забронирована на " + generateDate(40, "dd.MM.yyyy")), Duration.ofSeconds(13));
    }

    @Test
    public void happyPathTest6() {
        open("http:/localhost:9999/");
        $("[data-test-id='city'] input").setValue("Самара");
        $("[data-test-id='date'] input").sendKeys(Keys.chord(Keys.SHIFT, Keys.HOME), Keys.DELETE);
        $("[data-test-id='date'] input").setValue(generateDate(5, "dd.MM.yyyy"));
        $("[data-test-id='name'] input").setValue("Иванов-Петров Иван");
        $("[data-test-id='phone'] input").setValue("+79998887766");
        $("[data-test-id='agreement']").click();
        $("button.button_view_extra").click();
        $("[data-test-id='notification'] .notification__content").shouldHave(exactText("Встреча успешно забронирована на " + generateDate(5, "dd.MM.yyyy")), Duration.ofSeconds(13));
    }

    @Test
    public void happyPathTest7() {
        open("http:/localhost:9999/");
        $("[data-test-id='city'] input").setValue("Самара");
        $("[data-test-id='date'] input").sendKeys(Keys.chord(Keys.SHIFT, Keys.HOME), Keys.DELETE);
        $("[data-test-id='date'] input").setValue(generateDate(5, "dd.MM.yyyy"));
        $("[data-test-id='name'] input").setValue("Иванов Петров Иван");
        $("[data-test-id='phone'] input").setValue("+79998887766");
        $("[data-test-id='agreement']").click();
        $("button.button_view_extra").click();
        $("[data-test-id='notification'] .notification__content").shouldHave(exactText("Встреча успешно забронирована на " + generateDate(5, "dd.MM.yyyy")), Duration.ofSeconds(13));
    }

    @Test
    public void happyPathTest8() {
        open("http:/localhost:9999/");
        $("[data-test-id='city'] input").setValue("Самара");
        $("[data-test-id='date'] input").sendKeys(Keys.chord(Keys.SHIFT, Keys.HOME), Keys.DELETE);
        $("[data-test-id='date'] input").setValue(generateDate(5, "dd.MM.yyyy"));
        $("[data-test-id='name'] input").setValue("ИвАнов ИвАн");
        $("[data-test-id='phone'] input").setValue("+79998887766");
        $("[data-test-id='agreement']").click();
        $("button.button_view_extra").click();
        $("[data-test-id='notification'] .notification__content").shouldHave(exactText("Встреча успешно забронирована на " + generateDate(5, "dd.MM.yyyy")), Duration.ofSeconds(13));
    }

    @Test
    public void happyPathTest9() {
        open("http:/localhost:9999/");
        $("[data-test-id='city'] input").setValue("Самара");
        $("[data-test-id='date'] input").sendKeys(Keys.chord(Keys.SHIFT, Keys.HOME), Keys.DELETE);
        $("[data-test-id='date'] input").setValue(generateDate(5, "dd.MM.yyyy"));
        $("[data-test-id='name'] input").setValue("Семёнов Семён");
        $("[data-test-id='phone'] input").setValue("+79998887766");
        $("[data-test-id='agreement']").click();
        $("button.button_view_extra").click();
        $("[data-test-id='notification'] .notification__content").shouldHave(exactText("Встреча успешно забронирована на " + generateDate(5, "dd.MM.yyyy")), Duration.ofSeconds(13));
    }
}



