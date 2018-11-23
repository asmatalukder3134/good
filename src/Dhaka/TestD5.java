package Dhaka;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestD5 {
	WebDriver dr;

	public void getElement(WebElement e) {
		e.click();
	}

	public void getUrlPage() {
		dr.getPageSource();
	}

	public void mygetUrl(String url) {
		dr.getCurrentUrl();
	}

	public void verifyPageTitle(By by, String t) {
		boolean b = dr.getTitle().contains(t);
		System.out.println(b);
	}

	public void getTitle() {
		String s = dr.getTitle();
		System.out.println(s);
	}

	public void verifyPageUrl() {
		String s = dr.getCurrentUrl();
		System.out.println(s);
	}

	public void clickElement(By by) {
		dr.findElement(by).click();

	}

	public void typeElement(By by) {
		dr.findElement(by).sendKeys();
		;
	}

	public void verifyElement(By locator) {
		dr.findElement(locator).isDisplayed();
	}

	public void typeElement(WebElement e, String s) {
		e.sendKeys(s);
	}

	public void elementEnable(By by) {
		dr.findElement(by).isEnabled();
	}

	public void getElement(By by, String s) {
		dr.findElement(by).equals(s);
	}

	public void getElement1(WebElement e) {
		e.click();
	}

	public boolean verifyElement1(By by) {
		boolean b = dr.findElement(by).isDisplayed();
		return b;

	}

	public void getUrl() {
		dr.getCurrentUrl();
	}

	public WebElement getElement(By locator) {
		WebElement e = dr.findElement(locator);
		return e;
	}

	public WebElement getElement2(WebElement e) {
		return e;
	}

	public void verifyText(By by, String s) {
		dr.findElement(by).getText().contains(s);
	}

	public void getElements(By by) {
		dr.findElements(by).get(5).getText();
		int size = dr.findElements(by).size();
		for (int i = 0; i < size; i++) {
			if (dr.findElements(by).get(i).getText().contains(""))
				;
			System.out.println();
		}
	}

	public List<WebElement>  getelements(By by) {
		List<WebElement> e = dr.findElements(by);
		return e;

	}
	public void getElements1(By by) {
		List<WebElement> r=dr.findElements(by);
		int size=r.size();
		for(int i=0;i<size;i++)
		{
			if(r.get(i).getText().contains(""));
		}
	}

	int a[] = { 23, 56, 87, 90, 65 };
	int max=a[0];
	{
	for(int i = 1;i<a.length;i++)
	{
		if (a[i] > max);
		{
			max = a[i];
		}
	}
	{
		System.out.println(max);
	}

}}
