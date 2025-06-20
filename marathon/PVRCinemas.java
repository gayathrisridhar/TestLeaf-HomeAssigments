package week2.marathon;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PVRCinemas {

	public static void main(String[] args) {
		// Automating PVRCinemas
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.pvrcinemas.com/");
		driver.findElement(By.xpath("(//span[@class='cities-placed'])[2]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("//h6[text()='Chennai']")).click();
		driver.findElement(By.xpath("//span[text()='Cinema']")).click();
		driver.findElement(By.xpath("//span[text()='Select Cinema']")).click();
		driver.findElement(By.xpath("//span[text()='INOX The Marina Mall, OMR, Chennai']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Tomorrow')]")).click();
		driver.findElement(By.xpath("(//span[text()='DNA'])[2]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'04:15')]")).click();
		driver.findElement(By.xpath("//div[@class='quick-book-m']//span[text()='Book']")).click();
		driver.findElement(By.xpath("//button[text()='Accept']")).click();
		driver.findElement(By.xpath("//span[@id='CL.CLUB|J:9']")).click();
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		
		String element_SeatInfo = driver.findElement(By.xpath("//div[@class='seat-info']//p[text()='J9']")).getText();
		if (element_SeatInfo.equals("J9")) {
			System.out.println("Selected Seat Number = "+ element_SeatInfo );
						
		} else {
			System.out.println("Unable to Fine seat number");
		}
		
		String element_TotalPrice = driver.findElement(By.xpath("(//div[@class='ticket-prices']//p[text()])[1]")).getText();
		System.out.println("Total Ticket Price = "+ element_TotalPrice);
		
		driver.findElement(By.xpath("//button[text()='Continue']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebElement element = driver.findElement(By.xpath("//i[contains(@class,'pi-times')]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
		String titlePage = driver.getTitle();
		System.out.println("Title of the Page : " + titlePage);
		driver.quit();
		
	}
	
	

}
