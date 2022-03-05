package ru.gb;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.URL;

public class TestWebViewBack {

    @Test
    public void backWebView() throws Exception {

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
//      Переходим на WebView
        MobileElement webViewButton = (MobileElement) driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"WebView\"]/android.view.ViewGroup/android.widget.TextView");
        webViewButton.click();
        Thread.sleep(2000);
//      Возвращаемся на Home
        MobileElement homeButton = (MobileElement) driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"Home\"]/android.widget.TextView");
        homeButton.click();
    }
}
