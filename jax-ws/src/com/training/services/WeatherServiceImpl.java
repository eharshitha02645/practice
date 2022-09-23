package com.training.services;

import com.training.ifaces.WeatherService;
import java.util.*;
//import java.util.HashMap;

import javax.jws.WebService;

@WebService(endpointInterface="com.training.ifaces.WeatherService")


public class WeatherServiceImpl implements WeatherService{
	
	private HashMap<String, String>details;
	public WeatherServiceImpl() {
		super();
		
		details = new HashMap<String,String>();
		details.put("CHN", "40C,rain");
		details.put("SBC", "27C,cloudy");
		details.put("BOM", "32C,drizzle");
		details.put("HYD", "38C,cloudy");
	}
	
	@Override
	public String getWeather(String city) {
		return this.details.get(city.toUpperCase());
	}
	
	
	
	

}
