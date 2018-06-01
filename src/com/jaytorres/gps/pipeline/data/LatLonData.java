package com.jaytorres.gps.pipeline.data;

import java.util.Date;

public class LatLonData {
	
	private double lat;
	private double lon;
	private double ele;
	private Date time;
	
	public LatLonData() {
		
	}
	
	public LatLonData(double lat, double lon, double ele, Date time) {
		setLat(lat);
		setLon(lon);
		setEle(ele);
		setTime(time);
	}
	
	@Override
	public String toString() {
		return "LatLonData [lat=" + lat + ", lon=" + lon + ", ele=" + ele + ", time=" + time + "]";
	}

	public double getLat() {
		return lat;
	}
	public void setLat(double lat) {
		this.lat = lat;
	}
	public double getLon() {
		return lon;
	}
	public void setLon(double lon) {
		this.lon = lon;
	}
	public double getEle() {
		return ele;
	}
	public void setEle(double ele) {
		this.ele = ele;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
}
