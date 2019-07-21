package Package1;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DressObjects extends BaseClass{
	@FindBy(xpath="//div/div/header/div[3]/div/div/div[6]/ul/li[2]/a")
	private WebElement dresses;
	
	@FindBy(xpath="//div/div/header/div[3]/div/div/div[6]/ul/li/a")
	private WebElement women;
	
	@FindBy(xpath="//div/div/header/div[3]/div/div/div[6]/ul/li[3]/a")
	private WebElement Tshirts;
	
	@FindBy(xpath="//div[contains(@class  ,'columns-container')]//div[3]/div/div[1]/div/ul/li[1]/a")
	private WebElement top;
	
	
	public DressObjects() {
		PageFactory.initElements(driver, this);
	}

	public WebElement dresstab() {
		    dresses.click();
			return dresses;
		}
	
		public WebElement womentab() {
			women.click();
			return women;
		}
		public WebElement tshirttab() {
			Tshirts.click();
			return Tshirts;
		}
	
	
	}
	


