package com.japrasha.retail;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.japrasha.retail.RetailShop;
import com.japrasha.retail.DemoApplication;

@RestController
@RequestMapping(value="/rest/shops")
public class RetailShopService {
	
	@RequestMapping(value="/",method = RequestMethod.GET)
	   public Map<String,RetailShop> getAllShops(){
	      return DemoApplication.shops;
	   }
	
	@RequestMapping(value="/add",method = RequestMethod.POST)
	public RetailShop addShop(@RequestParam(value="name") String name
	      ,@RequestParam(value="address") String address
	      ,@RequestParam(value="pincode") String pincode){
	 
	   //TODO: Call Google Geotaggin API to get location details 
	   // Timebeing hardcoded here
	   RetailShop shop=new RetailShop(Long.valueOf(name),name,address,pincode,"100","200");
	   DemoApplication.shops.put(name, shop);
	   return shop;
	 
	}
	
	@RequestMapping(value="/getShopDetails",method = RequestMethod.POST)
	public List<RetailShop> addShop(@RequestParam(value="log") String log
	      ,@RequestParam(value="lon") String lon){
	   
		List<RetailShop> shopList = new ArrayList<RetailShop>();
	   //Method call to get nearest shops for provided Latitude and Longitude
		for(RetailShop shop : DemoApplication.shops.values()){
			//Some more logic to put for nearby shops
			if (shop.getLat().equals(log) && shop.getLon().equals(lon)){
				shopList.add(shop);
			}
		}
	  return shopList;
	 
	}
	
}
