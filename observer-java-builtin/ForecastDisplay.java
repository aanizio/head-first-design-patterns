import java.util.Observable;
import java.util.Observer;

class ForecastDisplay implements Observer {
  private float currentPressure;
  private Observable observable;

  public ForecastDisplay(Observable observable) {
    this.observable = observable;
    observable.addObserver(this);
  }

  public void update(Observable o, Object arg) {
    if (!(o instanceof WeatherData)) return;
    WeatherData obj = (WeatherData) o;
    this.currentPressure = obj.getPressure();
    display();
  }

  public void display() {
    System.out.println(String.format("ForecastDisplay: pressure = %.2f", currentPressure));
  }
}
