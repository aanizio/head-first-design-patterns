class ForecastDisplay implements WeatherDisplay, Observer {
  private float temperature;
  private float humidity;
  private float pressure;
  private Subject weatherData;

  public ForecastDisplay(Subject weatherData) {
    this.weatherData = weatherData;
    weatherData.addObserver(this);
  }

  public void update(float temperature, float humidity, float pressure) {
    this.temperature = temperature;
    this.humidity = humidity;
    this.pressure = pressure;
    display();
  }

  public void display() {
    System.out.println(String.format("ForecastDisplay: temp = %.2f; humidity = %.2f; pressure = %.2f", temperature, humidity, pressure));
  }
}
