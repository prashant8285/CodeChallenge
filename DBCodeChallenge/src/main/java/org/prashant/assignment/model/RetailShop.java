package org.prashant.assignment.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class RetailShop {

	private long id;
	private String name;
	private String address;
	private String pincode;
	private String lon;
	private String lat;

	public RetailShop(long id, String name, String address, String pincode,
			String lon, String lat) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.pincode = pincode;
		this.lon = lon;
		this.lat = lat;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public RetailShop() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

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
