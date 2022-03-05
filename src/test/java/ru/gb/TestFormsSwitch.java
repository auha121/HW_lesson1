package ru.gb;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.URL;

public class TestFormsSwitch {

    @Test
    public void switchForms() throws Exception {

//      Устанавливаем capabilities.
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "Pixel 3 GB");
        capabilities.setCapability("platformVersion", "10");
        capabilities.setCapability("udid", "emulator-5554");
        capabilities.setCapability("automationName", "UiAutomator2");
//      Проверьте актуальность пути до приложения на своём компьютере.
        capabilities.setCapability("app", "/Users/auha1/Desktop/Android-NativeDemoApp-0.2.1.apk");

//      Устанавливаем и открываем приложение.
        MobileDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

        Thread.sleep(2000);
//      Переходим на Forms
        MobileElement formsButton = (MobileElement) driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"Forms\"]/android.widget.TextView");
        formsButton.click();
//      Переключаем Switch
        Thread.sleep(2000);
        MobileElement formsSwitchButton = (MobileElement) driver.findElementByAccessibilityId("switch");
        formsSwitchButton.click();

    }
}
