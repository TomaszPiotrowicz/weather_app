package pl.tomasz.weather_app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.tomasz.weather_app.service.WeatherService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WeatherController {

    private WeatherService weatherService;

    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }


    @GetMapping("/display-weather")
    String displayWeather(Model model) {
        model.addAttribute("weatherForecast", weatherService.getWeatherForecastForCity());

        return "weather-page";
    }
//    @GetMapping("/x")
//    String fff(Model model){
//        model.addAttribute("weatherForecast",weatherService.getx());
//        return "weather-page";
//    }
}





