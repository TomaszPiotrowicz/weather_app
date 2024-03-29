package pl.tomasz.weather_app.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import pl.tomasz.weather_app.weather.City;
import pl.tomasz.weather_app.weather.WeatherForecast;

import java.util.ArrayList;
import java.util.List;

@Service
public class WeatherServiceImpl implements WeatherService {


//    temperatura z celcjuszem  dla warszawy działa na sztywno
//    private static final String url = "https://api.openweathermap.org/data/2.5/weather?q=warszawa,pl&units=metric&appid=b044c1e2cf9ef6b840bdb054b2898708";
//    temperatura dla ciechanowa -zamiana na %s aby było uniwersalnie
    private static final String url = "https://api.openweathermap.org/data/2.5/weather?q=%s,pl&units=metric&appid=b044c1e2cf9ef6b840bdb054b2898708";

    private RestTemplate restTemplate;

    public WeatherServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public WeatherForecast getWeatherForecastForCity() {
        return restTemplate.getForObject(String.format(url,"ciechanów"), WeatherForecast.class);
    }

    @Override
    public WeatherForecast getWeatherForCity(String cityName) {

        return restTemplate.getForObject(String.format(url, cityName), WeatherForecast.class);
    }


}








