package pl.tomasz.weather_app.weather;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.math.BigDecimal;

@JsonIgnoreProperties
public class Forecast {

    public Forecast() {
    }


    private BigDecimal temp;
    private Long pressure;
    private BigDecimal humidity;
    private double wind;

//    public Forecast(String City, BigDecimal temp, Long pressure, BigDecimal humidity) {
//        this.City= City;
//        this.temp = temp;
//        this.pressure = pressure;
//        this.humidity = humidity;
//        this.wind = wind;
//
//    }
//
//    public Forecast(String cityName, Long pressure, BigDecimal temp, BigDecimal humidity, double wind) {
//    }


    @Override
    public String toString() {
        return "Forecast{" +
                "temp=" + temp +
                ", pressure=" + pressure +
                ",humidity=" + humidity +
                ",wind=" + wind +
                '}';
    }

    public BigDecimal getTemp() {
        return temp;
    }

    public void setTemp(BigDecimal temp) {
        this.temp = temp;
    }

    public Long getPressure() {
        return pressure;
    }

    public void setPressure(Long pressure) {
        this.pressure = pressure;
    }

    public BigDecimal getHumidity() {
        return humidity;
    }

    public void setHumidity(BigDecimal humidity) {

        this.humidity = humidity;
    }

    public double getWind() {
        return wind;
    }

    public void setWind(double wind) {
        this.wind = wind;
    }


}


