package com.manager;

import com.pages.LoginPage;
import com.pages.SearchHotelPage;
import com.pages.SelectHotelPage;

public class PageObjectManager {

	private LoginPage loginpage;
	private SearchHotelPage searchhotelpage;
	private SelectHotelPage selecthotelpage;

	public SelectHotelPage getSelecthotelpage() {
		return (selecthotelpage == null) ? selecthotelpage =new SelectHotelPage () : selecthotelpage ;
	}

	public LoginPage getLoginpage() {
		return (loginpage == null) ? loginpage = new LoginPage() : loginpage;
	}

	public SearchHotelPage getSearchHotelpage() {
		return (searchhotelpage == null) ? searchhotelpage = new SearchHotelPage() : searchhotelpage;
	}

}
