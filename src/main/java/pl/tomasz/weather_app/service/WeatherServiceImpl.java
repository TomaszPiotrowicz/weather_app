package pl.tomasz.weather_app.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import pl.tomasz.weather_app.weather.City;
import pl.tomasz.weather_app.weather.WeatherForecast;

import java.util.ArrayList;
import java.util.List;

@Service
public class WeatherServiceImpl implements WeatherService {

//    List<City> citylist =new ArrayList<City>();
//
//    citylist.add(new City("Kraków",url))

    // temperatura z celcjuszem  dla warszawy działa
//    private static final String url = "https://api.openweathermap.org/data/2.5/weather?q=warszawa,pl&units=metric&appid=b044c1e2cf9ef6b840bdb054b2898708";
//    temperatura dla ciechanowa
    private static final String url = "https://api.openweathermap.org/data/2.5/weather?q=ciechanów,pl&units=metric&appid=b044c1e2cf9ef6b840bdb054b2898708";
//    to jest dobry przykład
//    private static final String url = "https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22";

    private RestTemplate restTemplate;

    public WeatherServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public WeatherForecast getWeatherForecastForCity() {
        return restTemplate.getForObject(url, WeatherForecast.class);
    }


}





