package com.syntax.JavaProject02;

public interface CodingTask5 { /*
    1. Create a WebDriver Interface:
        void open()
        void close()
        String getTitle()
    2. Create TakesScreenshot Interface:
        void getScreenshot()
    3. Create RemoteWebDriver Interface that inherits from WebDriver and TakesScreenshot:
        void navigate()
    4. Create 3 classes ChromeDriver, FirefoxDriver, SafariDriver that implements functionality defined in the RemoteWebDriver Interface
     */
}

interface WebDriver {
    void open();

    void close();

    String getTitle();
}

interface TakesScreenShot {
    void getScreenshot();
}

interface RemoteWebDriver extends WebDriver, TakesScreenShot {
    void navigate();
}

class ChromeDriver implements RemoteWebDriver {

    @Override
    public void open() {
        System.out.println("Opening Google website from Chrome");
    }

    @Override
    public void close() {
        System.out.println("Closing Google website from Chrome");
    }

    @Override
    public String getTitle() {
        return "Google";
    }

    @Override
    public void getScreenshot() {
        System.out.println("Getting Screenshot");
    }

    @Override
    public void navigate() {
        System.out.println("Navigating to Google home page from Chrome");
    }
}

class FirefoxDriver implements RemoteWebDriver {

    @Override
    public void open() {
        System.out.println("Opening Facebook website from Firefox");
    }

    @Override
    public void close() {
        System.out.println("Closing Facebook website browser from Firefox");
    }

    @Override
    public String getTitle() {
        return "Facebook - Log In or Sign Up";
    }

    @Override
    public void getScreenshot() {
        System.out.println("Getting Screenshot");
    }

    @Override
    public void navigate() {
        System.out.println("Navigating to Facebook home page from Firefox");
    }
}

class SafariDriver implements RemoteWebDriver {

    @Override
    public void open() {
        System.out.println("Opening Youtube website from Safari");
    }

    @Override
    public void close() {
        System.out.println("Closing Youtube website from Safari");
    }

    @Override
    public String getTitle() {
        return "Youtube";
    }

    @Override
    public void getScreenshot() {
        System.out.println("Getting Screenshot");
    }

    @Override
    public void navigate() {
        System.out.println("Navigating to Youtube home page from Safari");
    }
}
class WebDriverTester{
    public static void main(String[] args) {
        RemoteWebDriver[] drivers = {new ChromeDriver(), new FirefoxDriver(), new SafariDriver()};
        for(RemoteWebDriver driver : drivers){
            driver.open();
            driver.close();
            System.out.println("The title of the web browser is " + driver.getTitle());
            driver.getScreenshot();
            driver.navigate();
            System.out.println("-------------------------------------------------------------");
        }
    }
}

