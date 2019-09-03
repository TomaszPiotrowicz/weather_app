package pl.tomasz.weather_app.dto;

public class DtoForm {


    private String CityName;

    @Override
    public String toString() {
        return "DtoForm{" +
                "City='" + CityName + '\'' +
                '}';
    }



    public String getCityName() {
        return CityName;
    }

    public void setCityName(String cityName) {
        CityName = cityName;
    }
    public DtoForm(String CityName){
        this.CityName= CityName;
    }
}

