import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class CardDeliveryTest {
    String generateDate(int daysToAdd) {
        return LocalDate.now().plusDays(daysToAdd).format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
    }

    @Test
    public void checkingFuLLTextOfMessageHappyPathTest() {
        open("http:/localhost:9999/");
        $("[data-test-id='city'] input").setValue("Самара");
        $("[data-test-id='date'] input").sendKeys(Keys.chord(Keys.SHIFT, Keys.HOME), Keys.DELETE);
        $("[data-test-id='date'] input").setValue(generateDate(14));
        $("[data-test-id='name'] input").setValue("Иванов Иван");
        $("[data-test-id='phone'] input").setValue("+79998887766");
        $("[data-test-id='agreement']").click();
        $("button.button_view_extra").click();
        $(".notification__content").shouldHave(Condition.text("Встреча успешно забронирована на " + generateDate(14)), Duration.ofSeconds(13)).shouldBe(Condition.visible);
    }

    @Test
    public void checkingDateHappyPathTest() {
        open("http:/localhost:9999/");
        $("[data-test-id='city'] input").setValue("Самара");
        $("[data-test-id='date'] input").sendKeys(Keys.chord(Keys.SHIFT, Keys.HOME), Keys.DELETE);
        $("[data-test-id='date'] input").setValue(generateDate(14));
        $("[data-test-id='name'] input").setValue("Иванов Иван");
        $("[data-test-id='phone'] input").setValue("+79998887766");
        $("[data-test-id='agreement']").click();
        $("button.button_view_extra").click();
        $("[data-test-id='notification'] .notification__content").shouldHave(text(generateDate(14)), Duration.ofSeconds(13));

    }

    @Test
    public void happyPathTest1() {
        open("http:/localhost:9999/");
        $("[data-test-id='city'] input").setValue("Самара");
        $("[data-test-id='date'] input").sendKeys(Keys.chord(Keys.SHIFT, Keys.HOME), Keys.DELETE);
        $("[data-test-id='date'] input").setValue(generateDate(4));
        $("[data-test-id='name'] input").setValue("Иванов Иван");
        $("[data-test-id='phone'] input").setValue("+79998887766");
        $("[data-test-id='agreement']").click();
        $("button.button_view_extra").click();
        $(".notification__content").shouldHave(Condition.text("Встреча успешно забронирована на " + generateDate(4)), Duration.ofSeconds(13)).shouldBe(Condition.visible);
    }


    @Test
    public void happyPathTest2() {
        open("http:/localhost:9999/");
        $("[data-test-id='city'] input").setValue("Самара");
        $("[data-test-id='date'] input").sendKeys(Keys.chord(Keys.SHIFT, Keys.HOME), Keys.DELETE);
        $("[data-test-id='date'] input").setValue(generateDate(3));
        $("[data-test-id='name'] input").setValue("Иванов Иван");
        $("[data-test-id='phone'] input").setValue("+79998887766");
        $("[data-test-id='agreement']").click();
        $("button.button_view_extra").click();
        $(".notification__content").shouldHave(Condition.text("Встреча успешно забронирована на " + generateDate(3)), Duration.ofSeconds(13)).shouldBe(Condition.visible);
    }

    @Test
    public void happyPathTest3() {
        open("http:/localhost:9999/");
        $("[data-test-id='city'] input").setValue("Петропавловск-Камчатский");
        $("[data-test-id='date'] input").sendKeys(Keys.chord(Keys.SHIFT, Keys.HOME), Keys.DELETE);
        $("[data-test-id='date'] input").setValue(generateDate(5));
        $("[data-test-id='name'] input").setValue("Иванов Иван");
        $("[data-test-id='phone'] input").setValue("+79998887766");
        $("[data-test-id='agreement']").click();
        $("button.button_view_extra").click();
        $(".notification__content").shouldHave(Condition.text("Встреча успешно забронирована на " + generateDate(5)), Duration.ofSeconds(13)).shouldBe(Condition.visible);
    }

    @Test
    public void happyPathTest4() {
        open("http:/localhost:9999/");
        $("[data-test-id='city'] input").setValue("Нижний Новгород");
        $("[data-test-id='date'] input").sendKeys(Keys.chord(Keys.SHIFT, Keys.HOME), Keys.DELETE);
        $("[data-test-id='date'] input").setValue(generateDate(5));
        $("[data-test-id='name'] input").setValue("Иванов Иван");
        $("[data-test-id='phone'] input").setValue("+79998887766");
        $("[data-test-id='agreement']").click();
        $("button.button_view_extra").click();
        $(".notification__content").shouldHave(Condition.text("Встреча успешно забронирована на " + generateDate(5)), Duration.ofSeconds(13)).shouldBe(Condition.visible);
    }

    @Test
    public void happyPathTest5() {
        open("http:/localhost:9999/");
        $("[data-test-id='city'] input").setValue("Самара");
        $("[data-test-id='date'] input").sendKeys(Keys.chord(Keys.SHIFT, Keys.HOME), Keys.DELETE);
        $("[data-test-id='date'] input").setValue(generateDate(40));
        $("[data-test-id='name'] input").setValue("Иванов Иван");
        $("[data-test-id='phone'] input").setValue("+79998887766");
        $("[data-test-id='agreement']").click();
        $("button.button_view_extra").click();
        $(".notification__content").shouldHave(Condition.text("Встреча успешно забронирована на " + generateDate(40)), Duration.ofSeconds(13)).shouldBe(Condition.visible);
    }

    @Test
    public void happyPathTest6() {
        open("http:/localhost:9999/");
        $("[data-test-id='city'] input").setValue("Самара");
        $("[data-test-id='date'] input").sendKeys(Keys.chord(Keys.SHIFT, Keys.HOME), Keys.DELETE);
        $("[data-test-id='date'] input").setValue(generateDate(5));
        $("[data-test-id='name'] input").setValue("Иванов-Петров Иван");
        $("[data-test-id='phone'] input").setValue("+79998887766");
        $("[data-test-id='agreement']").click();
        $("button.button_view_extra").click();
        $(".notification__content").shouldHave(Condition.text("Встреча успешно забронирована на " + generateDate(5)), Duration.ofSeconds(13)).shouldBe(Condition.visible);
    }

    @Test
    public void happyPathTest7() {
        open("http:/localhost:9999/");
        $("[data-test-id='city'] input").setValue("Самара");
        $("[data-test-id='date'] input").sendKeys(Keys.chord(Keys.SHIFT, Keys.HOME), Keys.DELETE);
        $("[data-test-id='date'] input").setValue(generateDate(5));
        $("[data-test-id='name'] input").setValue("Иванов Петров Иван");
        $("[data-test-id='phone'] input").setValue("+79998887766");
        $("[data-test-id='agreement']").click();
        $("button.button_view_extra").click();
        $(".notification__content").shouldHave(Condition.text("Встреча успешно забронирована на " + generateDate(5)), Duration.ofSeconds(13)).shouldBe(Condition.visible);
    }

    @Test
    public void happyPathTest8() {
        open("http:/localhost:9999/");
        $("[data-test-id='city'] input").setValue("Самара");
        $("[data-test-id='date'] input").sendKeys(Keys.chord(Keys.SHIFT, Keys.HOME), Keys.DELETE);
        $("[data-test-id='date'] input").setValue(generateDate(5));
        $("[data-test-id='name'] input").setValue("ИвАнов ИвАн");
        $("[data-test-id='phone'] input").setValue("+79998887766");
        $("[data-test-id='agreement']").click();
        $("button.button_view_extra").click();
        $(".notification__content").shouldHave(Condition.text("Встреча успешно забронирована на " + generateDate(5)), Duration.ofSeconds(13)).shouldBe(Condition.visible);
    }

    @Test
    public void happyPathTest9() {
        open("http:/localhost:9999/");
        $("[data-test-id='city'] input").setValue("Самара");
        $("[data-test-id='date'] input").sendKeys(Keys.chord(Keys.SHIFT, Keys.HOME), Keys.DELETE);
        $("[data-test-id='date'] input").setValue(generateDate(5));
        $("[data-test-id='name'] input").setValue("Семёнов Семён");
        $("[data-test-id='phone'] input").setValue("+79998887766");
        $("[data-test-id='agreement']").click();
        $("button.button_view_extra").click();
        $(".notification__content").shouldHave(Condition.text("Встреча успешно забронирована на " + generateDate(5)), Duration.ofSeconds(13)).shouldBe(Condition.visible);
    }

    @Test
    public void happyPathTest10() {
        open("http:/localhost:9999/");
        $("[data-test-id='city'] input").setValue("Орёл");
        $("[data-test-id='date'] input").sendKeys(Keys.chord(Keys.SHIFT, Keys.HOME), Keys.DELETE);
        $("[data-test-id='date'] input").setValue(generateDate(5));
        $("[data-test-id='name'] input").setValue("Иванов Иван");
        $("[data-test-id='phone'] input").setValue("+79998887766");
        $("[data-test-id='agreement']").click();
        $("button.button_view_extra").click();
        $(".notification__content").shouldHave(Condition.text("Встреча успешно забронирована на " + generateDate(5)), Duration.ofSeconds(13)).shouldBe(Condition.visible);
    }

    @Test
    public void happyPathTest11() {
        open("http:/localhost:9999/");
        $("[data-test-id='city'] input").setValue("СамАра");
        $("[data-test-id='date'] input").sendKeys(Keys.chord(Keys.SHIFT, Keys.HOME), Keys.DELETE);
        $("[data-test-id='date'] input").setValue(generateDate(5));
        $("[data-test-id='name'] input").setValue("Иванов Иван");
        $("[data-test-id='phone'] input").setValue("+79998887766");
        $("[data-test-id='agreement']").click();
        $("button.button_view_extra").click();
        $(".notification__content").shouldHave(Condition.text("Встреча успешно забронирована на " + generateDate(5)), Duration.ofSeconds(13)).shouldBe(Condition.visible);
    }


    @Test
    public void inputInvalidCityTest1() {
        open("http:/localhost:9999/");
        $("[data-test-id='city'] input").setValue("Сызрань");
        $("[data-test-id='date'] input").sendKeys(Keys.chord(Keys.SHIFT, Keys.HOME), Keys.DELETE);
        $("[data-test-id='date'] input").setValue(generateDate(5));
        $("[data-test-id='name'] input").setValue("Иванов Иван");
        $("[data-test-id='phone'] input").setValue("+79998887766");
        $("[data-test-id='agreement']").click();
        $("button.button_view_extra").click();
        $("[data-test-id='city'].input_invalid").shouldBe(visible);
    }

    @Test
    public void inputInvalidCityTest2() {
        open("http:/localhost:9999/");
        $("[data-test-id='city'] input").setValue("Петропавловск Камчатский");
        $("[data-test-id='date'] input").sendKeys(Keys.chord(Keys.SHIFT, Keys.HOME), Keys.DELETE);
        $("[data-test-id='date'] input").setValue(generateDate(5));
        $("[data-test-id='name'] input").setValue("Иванов Иван");
        $("[data-test-id='phone'] input").setValue("+79998887766");
        $("[data-test-id='agreement']").click();
        $("button.button_view_extra").click();
        $("[data-test-id='city'].input_invalid").shouldBe(visible);
    }

    @Test
    public void inputInvalidCityTest3() {
        open("http:/localhost:9999/");
        $("[data-test-id='city'] input").setValue("Samara");
        $("[data-test-id='date'] input").sendKeys(Keys.chord(Keys.SHIFT, Keys.HOME), Keys.DELETE);
        $("[data-test-id='date'] input").setValue(generateDate(5));
        $("[data-test-id='name'] input").setValue("Иванов Иван");
        $("[data-test-id='phone'] input").setValue("+79998887766");
        $("[data-test-id='agreement']").click();
        $("button.button_view_extra").click();
        $("[data-test-id='city'].input_invalid").shouldBe(visible);
    }

    @Test
    public void inputInvalidCityTest4() {
        open("http:/localhost:9999/");
        $("[data-test-id='city'] input").setValue("Наль4ик");
        $("[data-test-id='date'] input").sendKeys(Keys.chord(Keys.SHIFT, Keys.HOME), Keys.DELETE);
        $("[data-test-id='date'] input").setValue(generateDate(5));
        $("[data-test-id='name'] input").setValue("Иванов Иван");
        $("[data-test-id='phone'] input").setValue("+79998887766");
        $("[data-test-id='agreement']").click();
        $("button.button_view_extra").click();
        $("[data-test-id='city'].input_invalid").shouldBe(visible);
    }

    @Test
    public void inputInvalidCityTest5() {
        open("http:/localhost:9999/");
        $("[data-test-id='city'] input").setValue("С@мара");
        $("[data-test-id='date'] input").sendKeys(Keys.chord(Keys.SHIFT, Keys.HOME), Keys.DELETE);
        $("[data-test-id='date'] input").setValue(generateDate(5));
        $("[data-test-id='name'] input").setValue("Иванов Иван");
        $("[data-test-id='phone'] input").setValue("+79998887766");
        $("[data-test-id='agreement']").click();
        $("button.button_view_extra").click();
        $("[data-test-id='city'].input_invalid").shouldBe(visible);
    }

    @Test
    public void inputInvalidCityTest6() {
        open("http:/localhost:9999/");
        $("[data-test-id='city'] input").setValue("");
        $("[data-test-id='date'] input").sendKeys(Keys.chord(Keys.SHIFT, Keys.HOME), Keys.DELETE);
        $("[data-test-id='date'] input").setValue(generateDate(5));
        $("[data-test-id='name'] input").setValue("Иванов Иван");
        $("[data-test-id='phone'] input").setValue("+79998887766");
        $("[data-test-id='agreement']").click();
        $("button.button_view_extra").click();
        $("[data-test-id='city'].input_invalid").shouldBe(visible);
    }

    @Test
    public void inputInvalidDateTest1() {
        open("http:/localhost:9999/");
        $("[data-test-id='city'] input").setValue("Самара");
        $("[data-test-id='date'] input").sendKeys(Keys.chord(Keys.SHIFT, Keys.HOME), Keys.DELETE);
        $("[data-test-id='date'] input").setValue(generateDate(2));
        $("[data-test-id='name'] input").setValue("Иванов Иван");
        $("[data-test-id='phone'] input").setValue("+79998887766");
        $("[data-test-id='agreement']").click();
        $("button.button_view_extra").click();
        $("[data-test-id='date'] .input_invalid").shouldBe(visible);
    }
    @Test
    public void inputInvalidDateTest2() {
        open("http:/localhost:9999/");
        $("[data-test-id='city'] input").setValue("Самара");
        $("[data-test-id='date'] input").sendKeys(Keys.chord(Keys.SHIFT, Keys.HOME), Keys.DELETE);
        $("[data-test-id='date'] input").setValue("32.10.2023");
        $("[data-test-id='name'] input").setValue("Иванов Иван");
        $("[data-test-id='phone'] input").setValue("+79998887766");
        $("[data-test-id='agreement']").click();
        $("button.button_view_extra").click();
        $("[data-test-id='date'] .input_invalid").shouldBe(visible);
    }
    @Test
    public void inputInvalidDateTest3() {
        open("http:/localhost:9999/");
        $("[data-test-id='city'] input").setValue("Самара");
        $("[data-test-id='date'] input").sendKeys(Keys.chord(Keys.SHIFT, Keys.HOME), Keys.DELETE);
        $("[data-test-id='date'] input").setValue("32.15.2023");
        $("[data-test-id='name'] input").setValue("Иванов Иван");
        $("[data-test-id='phone'] input").setValue("+79998887766");
        $("[data-test-id='agreement']").click();
        $("button.button_view_extra").click();
        $("[data-test-id='date'] .input_invalid").shouldBe(visible);
    }
    @Test
    public void inputInvalidDateTest4() {
        open("http:/localhost:9999/");
        $("[data-test-id='city'] input").setValue("Самара");
        $("[data-test-id='date'] input").sendKeys(Keys.chord(Keys.SHIFT, Keys.HOME), Keys.DELETE);
        $("[data-test-id='date'] input").setValue("32.10.2022");
        $("[data-test-id='name'] input").setValue("Иванов Иван");
        $("[data-test-id='phone'] input").setValue("+79998887766");
        $("[data-test-id='agreement']").click();
        $("button.button_view_extra").click();
        $("[data-test-id='date'] .input_invalid").shouldBe(visible);
    }
    @Test
    public void inputInvalidDateTest5() {
        open("http:/localhost:9999/");
        $("[data-test-id='city'] input").setValue("Самара");
        $("[data-test-id='date'] input").sendKeys(Keys.chord(Keys.SHIFT, Keys.HOME), Keys.DELETE);
        $("[data-test-id='date'] input").setValue("00.10.2023");
        $("[data-test-id='name'] input").setValue("Иванов Иван");
        $("[data-test-id='phone'] input").setValue("+79998887766");
        $("[data-test-id='agreement']").click();
        $("button.button_view_extra").click();
        $("[data-test-id='date'] .input_invalid").shouldBe(visible);
    }
    @Test
    public void inputInvalidDateTest6() {
        open("http:/localhost:9999/");
        $("[data-test-id='city'] input").setValue("Самара");
        $("[data-test-id='date'] input").sendKeys(Keys.chord(Keys.SHIFT, Keys.HOME), Keys.DELETE);
        $("[data-test-id='date'] input").setValue("15.00.2023");
        $("[data-test-id='name'] input").setValue("Иванов Иван");
        $("[data-test-id='phone'] input").setValue("+79998887766");
        $("[data-test-id='agreement']").click();
        $("button.button_view_extra").click();
        $("[data-test-id='date'] .input_invalid").shouldBe(visible);
    }
    @Test
    public void inputInvalidDateTest7() {
        open("http:/localhost:9999/");
        $("[data-test-id='city'] input").setValue("Самара");
        $("[data-test-id='date'] input").sendKeys(Keys.chord(Keys.SHIFT, Keys.HOME), Keys.DELETE);
        $("[data-test-id='date'] input").setValue("10.10.0023");
        $("[data-test-id='name'] input").setValue("Иванов Иван");
        $("[data-test-id='phone'] input").setValue("+79998887766");
        $("[data-test-id='agreement']").click();
        $("button.button_view_extra").click();
        $("[data-test-id='date'] .input_invalid").shouldBe(visible);
    }

    @Test
    public void inputInvalidDateTest8() {
        open("http:/localhost:9999/");
        $("[data-test-id='city'] input").setValue("Самара");
        $("[data-test-id='date'] input").sendKeys(Keys.chord(Keys.SHIFT, Keys.HOME), Keys.DELETE);
        $("[data-test-id='date'] input").setValue(generateDate(10_000));
        $("[data-test-id='name'] input").setValue("Иванов Иван");
        $("[data-test-id='phone'] input").setValue("+79998887766");
        $("[data-test-id='agreement']").click();
        $("button.button_view_extra").click();
        $("[data-test-id='date'] .input_invalid").shouldBe(visible);
    }

    @Test
    public void inputInvalidDateTest9() {
        open("http:/localhost:9999/");
        $("[data-test-id='city'] input").setValue("Самара");
        $("[data-test-id='date'] input").sendKeys(Keys.chord(Keys.SHIFT, Keys.HOME), Keys.DELETE);
        $("[data-test-id='date'] input").setValue("");
        $("[data-test-id='name'] input").setValue("Иванов Иван");
        $("[data-test-id='phone'] input").setValue("+79998887766");
        $("[data-test-id='agreement']").click();
        $("button.button_view_extra").click();
        $("[data-test-id='date'] .input_invalid").shouldBe(visible);
    }

    @Test
    public void inputInvalidNameTest1() {
        open("http:/localhost:9999/");
        $("[data-test-id='city'] input").setValue("Самара");
        $("[data-test-id='date'] input").sendKeys(Keys.chord(Keys.SHIFT, Keys.HOME), Keys.DELETE);
        $("[data-test-id='date'] input").setValue(generateDate(5));
        $("[data-test-id='name'] input").setValue("Иванов Ivan");
        $("[data-test-id='phone'] input").setValue("+79998887766");
        $("[data-test-id='agreement']").click();
        $("button.button_view_extra").click();
        $("[data-test-id='name'].input_invalid").shouldBe(visible);
    }

    @Test
    public void inputInvalidNameTest2() {
        open("http:/localhost:9999/");
        $("[data-test-id='city'] input").setValue("Самара");
        $("[data-test-id='date'] input").sendKeys(Keys.chord(Keys.SHIFT, Keys.HOME), Keys.DELETE);
        $("[data-test-id='date'] input").setValue(generateDate(5));
        $("[data-test-id='name'] input").setValue("Иванов Ив@н");
        $("[data-test-id='phone'] input").setValue("+79998887766");
        $("[data-test-id='agreement']").click();
        $("button.button_view_extra").click();
        $("[data-test-id='name'].input_invalid").shouldBe(visible);
    }

    @Test
    public void inputInvalidNameTest3() {
        open("http:/localhost:9999/");
        $("[data-test-id='city'] input").setValue("Самара");
        $("[data-test-id='date'] input").sendKeys(Keys.chord(Keys.SHIFT, Keys.HOME), Keys.DELETE);
        $("[data-test-id='date'] input").setValue(generateDate(5));
        $("[data-test-id='name'] input").setValue("Иванов 4ван");
        $("[data-test-id='phone'] input").setValue("+79998887766");
        $("[data-test-id='agreement']").click();
        $("button.button_view_extra").click();
        $("[data-test-id='name'].input_invalid").shouldBe(visible);
    }

    @Test
    public void inputInvalidNameTest4() {
        open("http:/localhost:9999/");
        $("[data-test-id='city'] input").setValue("Самара");
        $("[data-test-id='date'] input").sendKeys(Keys.chord(Keys.SHIFT, Keys.HOME), Keys.DELETE);
        $("[data-test-id='date'] input").setValue(generateDate(5));
        $("[data-test-id='name'] input").setValue("И");
        $("[data-test-id='phone'] input").setValue("+79998887766");
        $("[data-test-id='agreement']").click();
        $("button.button_view_extra").click();
        $("[data-test-id='name'].input_invalid").shouldBe(visible);
    }

    @Test
    public void inputInvalidNameTest5() {
        open("http:/localhost:9999/");
        $("[data-test-id='city'] input").setValue("Самара");
        $("[data-test-id='date'] input").sendKeys(Keys.chord(Keys.SHIFT, Keys.HOME), Keys.DELETE);
        $("[data-test-id='date'] input").setValue(generateDate(5));
        $("[data-test-id='name'] input").setValue("Ааааааааааааааааааааааааааааааааааааааааааааааааааааааааааааааа" +
                "Ббббббббббббббббббббббббббббббббббббббббббббббббббббббббб");
        $("[data-test-id='phone'] input").setValue("+79998887766");
        $("[data-test-id='agreement']").click();
        $("button.button_view_extra").click();
        $("[data-test-id='name'].input_invalid").shouldBe(visible);
    }

    @Test
    public void inputInvalidNameTest6() {
        open("http:/localhost:9999/");
        $("[data-test-id='city'] input").setValue("Самара");
        $("[data-test-id='date'] input").sendKeys(Keys.chord(Keys.SHIFT, Keys.HOME), Keys.DELETE);
        $("[data-test-id='date'] input").setValue(generateDate(5));
        $("[data-test-id='name'] input").setValue("Иван");
        $("[data-test-id='phone'] input").setValue("+79998887766");
        $("[data-test-id='agreement']").click();
        $("button.button_view_extra").click();
        $("[data-test-id='name'].input_invalid").shouldBe(visible);
    }

    @Test
    public void inputInvalidNameTest7() {
        open("http:/localhost:9999/");
        $("[data-test-id='city'] input").setValue("Самара");
        $("[data-test-id='date'] input").sendKeys(Keys.chord(Keys.SHIFT, Keys.HOME), Keys.DELETE);
        $("[data-test-id='date'] input").setValue(generateDate(5));
        $("[data-test-id='name'] input").setValue("---Иванов Иван");
        $("[data-test-id='phone'] input").setValue("+79998887766");
        $("[data-test-id='agreement']").click();
        $("button.button_view_extra").click();
        $("[data-test-id='name'].input_invalid").shouldBe(visible);
    }

    @Test
    public void inputInvalidNameTest8() {
        open("http:/localhost:9999/");
        $("[data-test-id='city'] input").setValue("Самара");
        $("[data-test-id='date'] input").sendKeys(Keys.chord(Keys.SHIFT, Keys.HOME), Keys.DELETE);
        $("[data-test-id='date'] input").setValue(generateDate(5));
        $("[data-test-id='name'] input").setValue("-----");
        $("[data-test-id='phone'] input").setValue("+79998887766");
        $("[data-test-id='agreement']").click();
        $("button.button_view_extra").click();
        $("[data-test-id='name'].input_invalid").shouldBe(visible);
    }

    @Test
    public void inputInvalidNameTest9() {
        open("http:/localhost:9999/");
        $("[data-test-id='city'] input").setValue("Самара");
        $("[data-test-id='date'] input").sendKeys(Keys.chord(Keys.SHIFT, Keys.HOME), Keys.DELETE);
        $("[data-test-id='date'] input").setValue(generateDate(5));
        $("[data-test-id='name'] input").setValue("");
        $("[data-test-id='phone'] input").setValue("+79998887766");
        $("[data-test-id='agreement']").click();
        $("button.button_view_extra").click();
        $("[data-test-id='name'].input_invalid").shouldBe(visible);
    }

    @Test
    public void inputInvalidPhoneTest1() {
        open("http:/localhost:9999/");
        $("[data-test-id='city'] input").setValue("Самара");
        $("[data-test-id='date'] input").sendKeys(Keys.chord(Keys.SHIFT, Keys.HOME), Keys.DELETE);
        $("[data-test-id='date'] input").setValue(generateDate(5));
        $("[data-test-id='name'] input").setValue("Иванов Иван");
        $("[data-test-id='phone'] input").setValue("+7999888776");
        $("[data-test-id='agreement']").click();
        $("button.button_view_extra").click();
        $("[data-test-id='phone'].input_invalid").shouldBe(visible);
    }

    @Test
    public void inputInvalidPhoneTest2() {
        open("http:/localhost:9999/");
        $("[data-test-id='city'] input").setValue("Самара");
        $("[data-test-id='date'] input").sendKeys(Keys.chord(Keys.SHIFT, Keys.HOME), Keys.DELETE);
        $("[data-test-id='date'] input").setValue(generateDate(5));
        $("[data-test-id='name'] input").setValue("Иванов Иван");
        $("[data-test-id='phone'] input").setValue("+799988877665");
        $("[data-test-id='agreement']").click();
        $("button.button_view_extra").click();
        $("[data-test-id='phone'].input_invalid").shouldBe(visible);
    }

    @Test
    public void inputInvalidPhoneTest3() {
        open("http:/localhost:9999/");
        $("[data-test-id='city'] input").setValue("Самара");
        $("[data-test-id='date'] input").sendKeys(Keys.chord(Keys.SHIFT, Keys.HOME), Keys.DELETE);
        $("[data-test-id='date'] input").setValue(generateDate(5));
        $("[data-test-id='name'] input").setValue("Иванов Иван");
        $("[data-test-id='phone'] input").setValue("+7999888776а");
        $("[data-test-id='agreement']").click();
        $("button.button_view_extra").click();
        $("[data-test-id='phone'].input_invalid").shouldBe(visible);
    }

    @Test
    public void inputInvalidPhoneTest4() {
        open("http:/localhost:9999/");
        $("[data-test-id='city'] input").setValue("Самара");
        $("[data-test-id='date'] input").sendKeys(Keys.chord(Keys.SHIFT, Keys.HOME), Keys.DELETE);
        $("[data-test-id='date'] input").setValue(generateDate(5));
        $("[data-test-id='name'] input").setValue("Иванов Иван");
        $("[data-test-id='phone'] input").setValue("+7999888776@");
        $("[data-test-id='agreement']").click();
        $("button.button_view_extra").click();
        $("[data-test-id='phone'].input_invalid").shouldBe(visible);
    }

    @Test
    public void inputInvalidPhoneTest5() {
        open("http:/localhost:9999/");
        $("[data-test-id='city'] input").setValue("Самара");
        $("[data-test-id='date'] input").sendKeys(Keys.chord(Keys.SHIFT, Keys.HOME), Keys.DELETE);
        $("[data-test-id='date'] input").setValue(generateDate(5));
        $("[data-test-id='name'] input").setValue("Иванов Иван");
        $("[data-test-id='phone'] input").setValue("79998887766+");
        $("[data-test-id='agreement']").click();
        $("button.button_view_extra").click();
        $("[data-test-id='phone'].input_invalid").shouldBe(visible);
    }

    @Test
    public void inputInvalidPhoneTest6() {
        open("http:/localhost:9999/");
        $("[data-test-id='city'] input").setValue("Самара");
        $("[data-test-id='date'] input").sendKeys(Keys.chord(Keys.SHIFT, Keys.HOME), Keys.DELETE);
        $("[data-test-id='date'] input").setValue(generateDate(5));
        $("[data-test-id='name'] input").setValue("Иванов Иван");
        $("[data-test-id='phone'] input").setValue("+00000000000");
        $("[data-test-id='agreement']").click();
        $("button.button_view_extra").click();
        $("[data-test-id='phone'].input_invalid").shouldBe(visible);
    }

    @Test
    public void inputInvalidPhoneTest7() {
        open("http:/localhost:9999/");
        $("[data-test-id='city'] input").setValue("Самара");
        $("[data-test-id='date'] input").sendKeys(Keys.chord(Keys.SHIFT, Keys.HOME), Keys.DELETE);
        $("[data-test-id='date'] input").setValue(generateDate(5));
        $("[data-test-id='name'] input").setValue("Иванов Иван");
        $("[data-test-id='phone'] input").setValue("");
        $("[data-test-id='agreement']").click();
        $("button.button_view_extra").click();
        $("[data-test-id='phone'].input_invalid").shouldBe(visible);
    }

    @Test
    public void inputInvalidCheckboxTest() {
        open("http:/localhost:9999/");
        $("[data-test-id='city'] input").setValue("Самара");
        $("[data-test-id='date'] input").sendKeys(Keys.chord(Keys.SHIFT, Keys.HOME), Keys.DELETE);
        $("[data-test-id='date'] input").setValue(generateDate(5));
        $("[data-test-id='name'] input").setValue("Иванов Иван");
        $("[data-test-id='phone'] input").setValue("+79998887766");
        $("button.button_view_extra").click();
        $("[data-test-id='agreement'].input_invalid").shouldBe(visible);
    }
}



