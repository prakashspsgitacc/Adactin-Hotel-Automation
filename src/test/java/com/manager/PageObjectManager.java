package com.manager;

import com.pages.LoginPage;
import com.pages.SearchHotelPage;

public class PageObjectManager {
	
	private	LoginPage loginpage;
	private SearchHotelPage searchhotelpage;

	public LoginPage getLoginpage() {
		return (loginpage==null)? loginpage=new LoginPage():loginpage;
	}
	
	public SearchHotelPage getSearchHotelpage() {
		return (searchhotelpage==null)? searchhotelpage=new SearchHotelPage():searchhotelpage;
	}
	
	

}
