package org.prashant.assignment.resources.beans;

import javax.ws.rs.QueryParam;

public class ShopDetailsFilterBean {

	private @QueryParam("lat")
	String lat;
	private @QueryParam("lon")
	String lon;

	public String getLat() {
		return lat;
	}
	public void setLat(String lat) {
		this.lat = lat;
	}
	public String getLon() {
		return lon;
	}
	public void setLon(String lon) {
		this.lon = lon;
	}
}
