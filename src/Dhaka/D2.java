package Dhaka;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class D2 {
	private static final By By = null;
	ChromeDriver dr;
D2(ChromeDriver dr){
	this.dr=dr;
}

public void getElement(By by) {
	dr.findElement(by);
	
}
public void getElements(By by) {
	dr.findElements(by);
}

public void huber(By by) {
	Actions women=new Actions( dr);
	women.moveToElement(dr.findElement(by)).perform();
}

public void click(String value) {
	dr.findElement(By.id(value)).click();
}
public void clicked(By by) {
	dr.findElement(by).click();
}
public String getText(By locator) {
String s=	dr.findElement(locator).getText();
System.out.println(s);
return s;

}














}
