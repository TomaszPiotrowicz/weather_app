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


//
//@RequestMapping(value ="/showWeather", method = RequestMethod.POST )
//    public String showWeather
//        (@Valid @ModelAttribute WeatherForecast weatherForecast, BindingResult errors, Model model){
//    if (!errors.hasErrors()) {
//        // get mock objects
//        List<WeatherForecast> weatherForecasts = WeatherForecastUtils.buildWeatherForcasts();
//        // add current student
//        weatherForecasts.add(WeatherForecast);
//        model.addAttribute("weatherForecasts", weatherForecasts);
//            }
//    return ((errors.hasErrors()) ? "addStudent.html" : "listStudents.html");
//


//    /** to z git huba
//     * Handles requests for the student model.
//     *
//     */
//    @Controller
//    public class StudentController {
//
//        @RequestMapping(value = "/saveStudent", method = RequestMethod.POST)
//        public String saveStudent(@Valid @ModelAttribute Student student, BindingResult errors, Model model) {
//            if (!errors.hasErrors()) {
//                // get mock objects
//                List<Student> students = StudentUtils.buildStudents();
//                // add current student
//                students.add(student);
//                model.addAttribute("students", students);
//            }
//            return ((errors.hasErrors()) ? "addStudent.html" : "listStudents.html");
//        }
//
//        @RequestMapping(value = "/addStudent", method = RequestMethod.GET)
//        public String addStudent(Model model) {
//            model.addAttribute("student", new Student());
//            return "addStudent.html";
//        }
//
//        @RequestMapping(value = "/listStudents", method = RequestMethod.GET)
//        public String listStudent(Model model) {
//
//            model.addAttribute("students", StudentUtils.buildStudents());
//
//            return "listStudents.html";
//        }
//
//    }
// to mojj wcześniejszy kod !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!


//    @PostMapping("/handle-form")
//    public String handleFormParams(@ModelAttribute DtoForm input) {
//        City city = new City(input.getCityName());


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
    }