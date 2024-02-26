package com.pages;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelPage extends BaseClass{
	public SearchHotelPage() {
		PageFactory.initElements( driver,this);
	}
	
	@FindBy(id = "username_show")
	private WebElement txtLoginSuccessMsg;

	public WebElement getTxtLoginSuccessMsg() {
		return txtLoginSuccessMsg;
	}


	

}
