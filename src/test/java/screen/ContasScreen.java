package screen;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

public class ContasScreen {

	private AppiumDriver<MobileElement> driver;

	public ContasScreen(AppiumDriver<MobileElement> appiumDriver) {
		PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);
		this.driver = appiumDriver;
	}

	@AndroidFindBy(id = "android_field_first_number")
	@iOSFindBy(id = "apple_first_input")
	public MobileElement first_number;
	@AndroidFindBy(id = "android_field_second_number")
	@iOSFindBy(id = "apple_second_input")
	public MobileElement second_number;
	@AndroidFindBy(id = "android_button_sum")
	@iOSFindBy(id = "apple-sum-button")
	public MobileElement button_sum;
	@AndroidFindBy(id = "android_button_sub")
	@iOSFindBy(id = "apple-subtract-button")
	public MobileElement button_sub;
	@AndroidFindBy(id = "android_button_mult")
	@iOSFindBy(id = "apple-multiply-button")
	public MobileElement button_mult;
	@AndroidFindBy(id = "android_button_div")
	@iOSFindBy(id = "apple-divide-button")
	public MobileElement button_div;
	@AndroidFindBy(id = "android_result_text")
	@iOSFindBy(id = "apple_result_text")
	public MobileElement result_text;

	public ContasScreen inserirNumero(String num) {
		first_number.click();
		first_number.clear();
		driver.getKeyboard().sendKeys(num);
		return this;

	}

	public ContasScreen inserirNumero2(String num2) {
		second_number.click();
		second_number.clear();
		driver.getKeyboard().sendKeys(num2);
		return this;

	}

	public String Resultado() {
		return result_text.getText().toString().trim();
	}

	public ContasScreen closeKeyboard() {
		driver.hideKeyboard();
		return this;
	}

}
