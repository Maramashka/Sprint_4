import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;

@RunWith(Parameterized.class)
public class TestOrderPage extends WebDriverProvider {

    private static final String URL_ORDER = "https://qa-scooter.praktikum-services.ru/order";

    private final By firstName_selector = By.xpath(".//input[@class='Input_Responsible__1jDKN' and @placeholder='* Имя']"); // поле "Имя"
    private final By lastName_selector = By.xpath(".//input[@class='Input_Responsible__1jDKN' and @placeholder='* Фамилия']"); // поле "Фамилия"
    private final By address_selector = By.xpath(".//input[@class='Input_Responsible__1jDKN' and @placeholder='* Адрес: куда привезти заказ']"); // поле "Адрес"
    private final By metro_selector = By.xpath(".//div[contains(@class, 'Order_Text__2broi') and text()='Бауманская']"); // Выпадающий список "Станция метро"
    private final By phone_selector = By.xpath(".//input[@class='Input_Responsible__1jDKN' and @placeholder='* Телефон: на него позвонит курьер']"); // поле "Телефон"

    private final By rentalTime_selector = By.className("Input_Input__1iN_Z Input_Responsible__1jDKN react-datepicker-ignore-onclickoutside"); // Когда привезти самокат
    private final By rentalPeriod_selector = By.className("Dropdown-placeholder");// Срок аренды
    private final By colour_selector = By.className("Order_Checkboxes__3lWSI Order_FilledContainer__2MKAk"); // чек-бокс Цвет самоката
    private final By comment_selector = By.xpath(".//input[@class='Input_Input__1iN_Z Input_Responsible__1jDKN' and @placeholder='Комментарий для курьера']"); // Комментарий


    private final By OrderNextButton = By.className("Button_Button__ra12g Button_Middle__1CSJM"); // кнопка "Далее"
    private final By OrderFinalButton = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM' and @text() ='Заказать']"); // Кнопка "Заказать" раздела "Про аренду"
    private final By OrderPopUpButtonYes = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM' and @text() ='Да']"); // Попап "Хотите оформить заказ?" - кнопка "Да"

    private final String firstName;
    private final String lastName;
    private final String address;
    private final String metro;
    private final String phone;

    private final String rentalTime; // Когда привезти самокат
    private final String rentalPeriod; // Cрок аренды (выпадающий список)
    private final String colour; // цвет самоката
    private final String comment; // комментарий

    public TestOrderPage(String firstName, String lastName, String address, String metro, String phone,
                         String rentalTime, String rentalPeriod, String colour, String comment) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.metro = metro;
        this.phone = phone;
        this.rentalTime = rentalTime;
        this.rentalPeriod = rentalPeriod;
        this.colour = colour;
        this.comment = comment;
    }

    @Parameterized.Parameters
    public static Object[][] getOrderForm() {
        return new Object[][] {
                {"Паша", "Журавлёв", "под капотом", "Савёловская", "+70_000_000_000", "сутки", "black", "Код, пишись"},
                {"Пелагея", "Зверева", "в ауте", "Бауманская", "+80_000_000_000", "двое суток", "grey", "Я верну колбасу"}
        };
    }

    public boolean checkOrderNextButtonIsEnabled() {
        return driver.findElement(OrderNextButton).isEnabled();
    }

    public void clickOrderNextButton() {
        driver.findElement(OrderNextButton).click();
    }

    public boolean checkOrderFinalButtonIsEnabled() {
        return driver.findElement(OrderFinalButton).isEnabled();
    }

    public void clickOrderFinalButton() {
        driver.findElement(OrderFinalButton).click();
    }

    public boolean checkOrderPopUpButtonYesIsEnabled() {
        return driver.findElement(OrderPopUpButtonYes).isEnabled();
    }

    public void clickOrderPopUpButtonYes() {
        driver.findElement(OrderPopUpButtonYes).click();
    }

    public void setFirstName() {
        driver.findElement(firstName_selector).sendKeys(firstName);
    }

    public void setLastNameName() {
        driver.findElement(lastName_selector).sendKeys(lastName);
    }

    public void setAddress() {
        driver.findElement(address_selector).sendKeys(address);
    }

    public void setMetro() {
        driver.findElement(metro_selector).sendKeys(metro);
    }

    public void setPhone() {
        driver.findElement(metro_selector).sendKeys(phone);
    }

    public void setRentalTime() {
        driver.findElement(rentalTime_selector).sendKeys(rentalTime);
    }

    public void setRentalPeriod() {
        driver.findElement(rentalPeriod_selector).sendKeys(rentalPeriod);
    }

    public void setColour() {
        driver.findElement(colour_selector).sendKeys(colour);
    }

    public void setComment() {
        driver.findElement(comment_selector).sendKeys(comment);
    }

    @Test
    public void checkOrderFormUsingTopButton() {

    }
}