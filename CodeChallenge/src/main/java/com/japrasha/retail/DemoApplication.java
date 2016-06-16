package com.japrasha.retail;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.japrasha.retail.RetailShop;

@SpringBootApplication
public class DemoApplication {

	public static Map<String, RetailShop> shops = new HashMap<String, RetailShop>();
	public static void main(String[] args) {
		
		
		shops.put("111",new RetailShop(111L, "ABC", "Deccan", "411001", "", ""));
		shops.put("222", new RetailShop(222L, "PQR", "Aundh", "411005", "", ""));
		
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("Hello World");
		for(RetailShop shop : shops.values()){
			System.out.println("Shop No :" + shop.getId() + "ShopName :" +shop.getName());
		}
		
		
		
	}
	
	
}
