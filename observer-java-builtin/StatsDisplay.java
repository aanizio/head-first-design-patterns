import java.util.Observable;
import java.util.Observer;

class StatsDisplay implements Observer {
  private float temperature;
  private float humidity;
  private float pressure;
  private Observable observable;

  public StatsDisplay(Observable observable) {
    this.observable = observable;
    observable.addObserver(this);
  }

  public void update(Observable o, Object arg) {
    if (!(o instanceof WeatherData)) return;
    WeatherData obj = (WeatherData) o;
    this.temperature = obj.getTemperature();
    this.humidity = obj.getHumidity();
    this.pressure = obj.getPressure();
    display();
  }

  public void display() {
    System.out.println(String.format("StatsDisplay: temp = %.2f; humidity = %.2f; pressure = %.2f", temperature, humidity, pressure));
  }
}
