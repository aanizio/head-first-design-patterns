class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");

    WeatherData weatherData = new WeatherData();

    StatsDisplay statsDisplay = new StatsDisplay(weatherData);
    ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
    //HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

    weatherData.setMeasurements(80, 70, 30.4f);
  }
}
