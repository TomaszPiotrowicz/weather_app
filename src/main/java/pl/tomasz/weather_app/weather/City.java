package pl.tomasz.weather_app.weather;

public class City {


    public City(String cityName,String url) {
        CityName = cityName;
        url= url;
    }

    @Override
    public String toString() {
        return "City{" +
                "CityName='" + CityName + '\'' +
                '}';
    }

    private String CityName;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    private String url;

    public String getCityName() {
        return CityName;
    }

    public void setCityName(String cityName) {
        CityName = cityName;
    }
}

