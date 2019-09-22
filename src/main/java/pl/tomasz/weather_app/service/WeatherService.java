package pl.tomasz.weather_app.service;

import pl.tomasz.weather_app.weather.WeatherForecast;


public interface WeatherService {

    WeatherForecast getWeatherForecastForCity();

    WeatherForecast getWeatherForCity(String cityName);


}
