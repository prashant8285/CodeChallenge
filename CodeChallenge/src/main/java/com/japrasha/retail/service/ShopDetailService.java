package com.japrasha.retail.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.japrasha.retail.database.Database;
import com.japrasha.retail.model.RetailShop;

public class ShopDetailService {

	private Map<String, RetailShop> shops = Database.getShops();

	public ShopDetailService() {
		// TODO: 
		/*shops.put("111",
				new RetailShop(111L, "ABC", "Deccan", "411001", "", ""));*/
	}

	public List<RetailShop> getAllShops() {
		return new ArrayList<RetailShop>(shops.values());
	}

	public RetailShop getShop(String shopId) {
		return shops.get(shopId);
	}

	public RetailShop addShop(RetailShop shop) {
		//TODO: Call to Google Geotag API
		shop.setLat("1001");
		shop.setLon("2001");
		shop.setId(shops.size() + 1);
		shops.put(String.valueOf(shop.getId()), shop);
		return shop;
	}

	public List<RetailShop> getAllShopDetailsForLatLog(String lat, String log) {
		List<RetailShop> shopDetailsForLatLog = new ArrayList<>();
		for (RetailShop shop : shops.values()) {
			if (shop.getLat().equalsIgnoreCase(lat)
					&& shop.getLon().equalsIgnoreCase(log)) {
				shopDetailsForLatLog.add(shop);
			}
		}
		return shopDetailsForLatLog;
	}

}
