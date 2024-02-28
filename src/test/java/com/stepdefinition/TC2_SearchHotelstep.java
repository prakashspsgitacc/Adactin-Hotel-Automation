package com.stepdefinition;

import org.baseclass.BaseClass;

import com.manager.PageObjectManager;

import io.cucumber.java.en.Then;

public class TC2_SearchHotelstep extends BaseClass {
	
	PageObjectManager pom =new PageObjectManager();
	
	
	@Then("User should search hotel with all fields {string},{string},{string},{string},{string},{string},{string} and {string}")
	public void user_should_search_hotel_with_all_fields_and(String location, String hotel, String roomType, String roomNos, String checkInDate, String checkOutDate, String adultRoom, String childRoom) {
	   
	pom.getSearchHotelpage().searchHotel(location, hotel, roomType, roomNos, checkInDate, checkOutDate, adultRoom,childRoom);
		
	}


}
