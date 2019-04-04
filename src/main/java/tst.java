import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class tst {

    public static WebDriver driver;
    public static WebDriverWait wait;

    public static void main(String[] args) {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
////        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        driver.navigate().to("https://rozetka.com.ua/ ");
//        wait = new WebDriverWait(driver, 3);
//        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("/html/body/app-root/div/div[1]/div[1]/header/div/div[2]/div[1]/fat-menu/div/ul/li[1]/div")));
//        driver.findElement(By.xpath("/html/body/app-root/d  iv/div[1]/div[3]/div/aside/main-page-sidebar/sidebar-fat-menu/div/ul/li[1]/a")).click();

//        driver.get("https://www.ebay.com/");
//        WebElement link = driver.findElement(By.xpath("(//ul[@class='hl-cat-nav__container']//a[text()='Electronics'])[1]"));
//        WebElement element = driver.findElement(By.xpath("(//ul[@class='hl-cat-nav__container']//a[text()='Electronics'])[1]"));

        /*
        Actions actions = new Actions(driver);
        actions.moveToElement(link).build().perform();
//        System.out.println(driver.getTitle());
//        System.out.println(driver.getCurrentUrl());
        actions.dragAndDrop(element, link).build().perform(); // перетаскиваем элемент во второй элемент, который называется ссылка. Дальше мы соберем все наши действия и выполним метод пеформ.
        actions.clickAndHold(element).moveToElement(link).release().build().perform(); // Кликнуть на элемент и не отпускать клавишу. В скобках тот элемент, на который мы кликаем.
        Нажать левой кнопкой на элемент, но при этом не отпускать мышку.
        // Кликнем на элемент и не отпуская курсор мыши будем наводить курсор на другой элемент, таким образом мы будем его перетаскивать. Релиз позволит отпустить клавишу мыши.
        // Первый метод мы нажимаем и не отпускаем потом наводим мышь на элемент и следующим методом мы отпускаем кнопку мыши. В дальнейшем мы должны собрать все эти действия и выполнить

        actions.doubleClick(element);
        actions.contextClick(element); // Иммитирует нажатие правой кнопки мыши на элемент

        Action action = actions.clickAndHold(element).moveToElement(link).release().build();
        action.perform();
        */

//        driver.navigate().to("https://rozetka.com.ua/mobile-phones/c80003/producer=samsung/");
////        if (!driver.findElement(By.xpath("//span[@class='filter-parametrs-i-l-i-text filter-parametrs-i-l-i-checkbox sprite-side']//i[text()='Apple']")).isSelected()) {
////            driver.findElement(By.xpath("//span[@class='filter-parametrs-i-l-i-text filter-parametrs-i-l-i-checkbox sprite-side']//i[text()='Apple']")).click();
////        }
////
////        if (driver.findElement(By.xpath("//span[@class='filter-parametrs-i-l-i-text filter-parametrs-i-l-i-checkbox-active sprite-side']//i[text()='Apple']")).isSelected()){
////            driver.findElement(By.xpath("//span[@class='filter-parametrs-i-l-i-text filter-parametrs-i-l-i-checkbox-active sprite-side']//i[text()='Apple']")).click();
////        }



        //TST

//        driver.quit();

    }
}
