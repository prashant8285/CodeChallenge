package com.japrasha.retail.database;

import java.util.HashMap;
import java.util.Map;

import com.japrasha.retail.model.RetailShop;

public class Database {

	private static Map<String, RetailShop> shops = new HashMap<>();
	
	public static Map<String, RetailShop> getShops() {
		return shops;
	}

	
	
	
}
