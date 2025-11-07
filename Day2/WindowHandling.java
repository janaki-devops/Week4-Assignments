package week4.week4day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowHandling {
    public static void main(String[] args) {

        // Launch Chrome browser in Guest mode
        ChromeOptions options = new ChromeOptions();
        options.addArguments("guest");
        ChromeDriver driver = new ChromeDriver(options);

        // Open Leaftaps CRM site
        driver.get("http://leaftaps.com/opentaps/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // Login to Leaftaps
        driver.findElement(By.id("username")).sendKeys("demosalesmanager");
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        driver.findElement(By.className("decorativeSubmit")).click();

        // Click CRM/SFA link
        driver.findElement(By.partialLinkText("CRM")).click();

        // Click Contacts tab
        driver.findElement(By.xpath("//a[text() = 'Contacts']")).click();

        // Click Merge Contacts
        driver.findElement(By.xpath("//a[text() = 'Merge Contacts']")).click();

        // Click the first lookup icon (From Contact)
        driver.findElement(By.xpath("//img[@src = '/images/fieldlookup.gif']")).click();

        // Get all window handles after new window opens
        Set<String> childWindow = driver.getWindowHandles();

        // Convert Set to List to easily switch using index
        List<String> listWindow = new ArrayList<String>(childWindow);

        // Switch to the newly opened window
        driver.switchTo().window(listWindow.get(1));

        // Select the first contact in the new window
        driver.findElement(By.xpath("(//a[@class='linktext'])[1]")).click();

        // Switch back to the main (parent) window
        driver.switchTo().window(listWindow.get(0));

        // Click the second lookup icon (To Contact)
        driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();

        // Get all window handles again (another window opened)
        Set<String> childWindow2 = driver.getWindowHandles();
        List<String> listWindow2 = new ArrayList<String>(childWindow2);

        // Switch to the second new window
        driver.switchTo().window(listWindow2.get(1));

        // Select the third contact from the list
        driver.findElement(By.xpath("(//a[@class='linktext'])[3]")).click();

        // Switch back to the main (parent) window again
        driver.switchTo().window(listWindow.get(0));

        // Click Merge button
        driver.findElement(By.xpath("//a[@class='buttonDangerous']")).click();

        // Handle the confirmation alert
        Alert alert = driver.switchTo().alert();
        alert.accept(); // click OK on the alert

        // Print the title of the resulting page
        System.out.println(driver.getTitle());

        // Close the browser
        driver.quit();
    }
}