public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        MobileAppDisplay mobileDisplay = new MobileAppDisplay(weatherData);
        WebAppDisplay webDisplay = new WebAppDisplay(weatherData);

        weatherData.setMeasurements(25.5, 65.0, 1013.25);
        weatherData.setMeasurements(26.0, 60.0, 1012.50);
    }}