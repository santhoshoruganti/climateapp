package com.example.weather.service;

import com.example.weather.domain.Weather;

/**
 * 
 * @author santhosh
 *
 */
public interface WeatherService {
	public Weather getWeather(String city);
}
