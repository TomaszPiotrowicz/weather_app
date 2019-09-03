package pl.tomasz.weather_app.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.tomasz.weather_app.service.WeatherService;
import pl.tomasz.weather_app.service.WeatherServiceImpl;
import pl.tomasz.weather_app.weather.Forecast;
import pl.tomasz.weather_app.weather.WeatherForecast;


@RestController
public class WeatherRestController {

    private WeatherService weatherService;
    private  static final Logger logger = LoggerFactory.getLogger(WeatherController.class);

    @Autowired
    public WeatherRestController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping(value = "/weather/")
    WeatherForecast getWeatherAsJson() {
        return weatherService.getWeatherForecastForCity();
//    } @GetMapping("/show-form")
//    WeatherForecast x(){
//        return  weatherService.getx();
//    }
//    @PostMapping("handle-form")
//    public String handleFormParams(@ModelAttribute Forecast input){
//        Forecast cityForecast =
//                new Forecast(input.getCityName(),input.getPressure(),input.getTemp(),input.getHumidity(),input.getWind());
//        return "redirect:/show-form";
//    }
//}


    }}
