package Dhaka;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class D3 {
	 ChromeDriver dr;
	D2 x=new D2(dr);
	@Test
	public void setElements() throws InterruptedException {
		 x.huber(By.xpath(".//*[@id='vesitem-1145821539711701358350576']/a/span[1]"));
		 Thread.sleep(5000);
	}

}
