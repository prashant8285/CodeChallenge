package com.japrasha.retail.resources;

import java.util.List;

import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.japrasha.retail.model.RetailShop;
import com.japrasha.retail.resources.beans.ShopDetailsFilterBean;
import com.japrasha.retail.service.ShopDetailService;

@Path("/shopdetails")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@SpringBootApplication
public class ShopDetailResource {

	private ShopDetailService shopService = new ShopDetailService();

	@GET
	public List<RetailShop> getShops(@BeanParam ShopDetailsFilterBean filterBean) {
		if (filterBean.getLat() != null && filterBean.getLon() != null) {
			return shopService.getAllShopDetailsForLatLog(filterBean.getLat(),
					filterBean.getLon());
		}
		return shopService.getAllShops();
	}

	/*@GET
	public List<RetailShop> getShops() {
		return shopService.getAllShops();
	}*/

	@POST
	public RetailShop addShopDetails(RetailShop shop) {
		return shopService.addShop(shop);
	}

	/*@GET
	@Path("/{shopName}")
	public RetailShop getShopDetails(@PathParam("shopName") String shopName) {
		return shopService.getShop(shopName);
	}*/

	
}
