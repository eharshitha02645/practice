package com.training.ifaces;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface WeatherService {
	@WebMethod public String getWeather(@WebParam(name = "city") String city);

}
