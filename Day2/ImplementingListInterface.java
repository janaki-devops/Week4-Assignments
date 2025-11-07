
package week4.week4day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplementingListInterface {

    public static void main(String[] args) throws InterruptedException {

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.next.co.uk/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // Accept cookies
        driver.findElement(By.xpath("//button[text() = 'ACCEPT ALL COOKIES']")).click();

        // Search for bags
        driver.findElement(By.xpath("//input[@placeholder = 'Search for anything here...']")).sendKeys("bags");
        driver.findElement(By.xpath("//img[@src= '/static-content/icons/header/next/v2/revision/search-input-button.svg']")).click();

        // Select "Mens"
        driver.findElement(By.xpath("//p[text()='Mens']")).click();

        // Count number of mens bags
        List<WebElement> noOfMensBags = driver.findElements(
            By.xpath("//p[contains(@class,'MuiTypography-root') and contains(@class,'MuiTypography-body1') and contains(@class,'produc-')]")
        );
        System.out.println("Number of men's bags: " + noOfMensBags.size());

        // Print product names
        for (WebElement each : noOfMensBags) {
            System.out.println(each.getText());
        }

        // Collect visible brand names
        List<WebElement> listOfBrands = driver.findElements(By.cssSelector(".brand-name"));
        List<String> brands = new ArrayList<>();
        for (WebElement each : listOfBrands) {
            if (each.isDisplayed()) {
                brands.add(each.getText());
            }
        }

        System.out.println("Brands on page: " + brands);

        // Close browser
        driver.quit();
    }
}