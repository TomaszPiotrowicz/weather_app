package pl.tomasz.weather_app.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import pl.tomasz.weather_app.dto.DtoForm;
import pl.tomasz.weather_app.service.WeatherService;
import pl.tomasz.weather_app.weather.City;
import pl.tomasz.weather_app.weather.WeatherForecast;

import javax.validation.Valid;
import java.util.List;

@Controller
public class WebController {



        private static final Logger logger = LoggerFactory.getLogger(WebController.class);
        private WeatherService weatherService;

    public WebController(WeatherService weatherService) {
            this.weatherService = weatherService;
        }
        @GetMapping("/show-weather")
        public String showForm (Model model){
            model.addAttribute("data", new DtoForm("zz"));
            return "form";

        }
        @PostMapping("/weather-for-city")
        public String showWeatherForCity(@RequestParam("city-name") String city,Model model){

        logger.debug("showWeatherforcity() city:[{}]",city);
        // query for weather-rest
          logger.debug(""+  weatherService.getWeatherForCity(city));
            //add model parametr i zwrócić template
            model.addAttribute("weatherForecast",weatherService.getWeatherForCity(city));
        return "weather_page";
        }
    }