package com.training;

import javax.xml.ws.Endpoint;

import com.training.services.WeatherServiceImpl;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			Endpoint.publish("http://localhost:8080/service",new WeatherServiceImpl());
			System.out.println("Service Published");
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
