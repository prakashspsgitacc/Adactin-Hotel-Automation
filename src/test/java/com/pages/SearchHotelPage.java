package com.pages;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelPage extends BaseClass {
	public SearchHotelPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "username_show")
	private WebElement txtLoginSuccessMsg;

	@FindBy(id = "location")
	private WebElement ddnLocation;

	@FindBy(id = "hotels")
	private WebElement ddnHotels;

	@FindBy(id = "room_type")
	private WebElement ddnRoomType;

	@FindBy(id = "room_nos")
	private WebElement ddnRoomNos;

	@FindBy(id = "datepick_in")
	private WebElement txtDateIn;

	@FindBy(id = "datepick_out")
	private WebElement txtDateOut;

	@FindBy(id = "adult_room")
	private WebElement ddnAdultRoom;

	@FindBy(id = "child_room")
	private WebElement ddnChildRoom;

	@FindBy(id = "Submit")
	private WebElement btnSubmit;

	public WebElement getDdnLocation() {
		return ddnLocation;
	}

	public WebElement getDdnHotels() {
		return ddnHotels;
	}

	public WebElement getDdnRoomType() {
		return ddnRoomType;
	}

	public WebElement getDdnRoomNos() {
		return ddnRoomNos;
	}

	public WebElement getTxtDateIn() {
		return txtDateIn;
	}

	public WebElement getTxtDateOut() {
		return txtDateOut;
	}

	public WebElement getDdnAdultRoom() {
		return ddnAdultRoom;
	}

	public WebElement getDdnChildRoom() {
		return ddnChildRoom;
	}

	public WebElement getBtnSubmit() {
		return btnSubmit;
	}

	public WebElement getTxtLoginSuccessMsg() {
		return txtLoginSuccessMsg;
	}
	
	public void searchHotel(String location, String hotel, String roomType, String roomNos, String checkInDate,
			String checkOutDate, String adultRoom, String childRoom) {
		
		selectOptionByText(getDdnLocation(), location);
		selectOptionByText(getDdnHotels(), hotel);
		selectOptionByText(getDdnRoomType(), roomType);
		elementSendkeys(getDdnRoomNos(), roomNos);
		insertValueJs(getTxtDateIn(), checkInDate);
		insertValueJs(getTxtDateOut(), checkOutDate);
		elementSendkeys(getDdnAdultRoom(), adultRoom);
	    elementSendkeys(getDdnChildRoom(), childRoom);
	    elementClick(getBtnSubmit());
	}
		

	
	
	

}
