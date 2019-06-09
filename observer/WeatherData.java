import java.util.*;

class WeatherData implements Subject {
  private float temperature;
  private float humidity;
  private float pressure;
  private ArrayList<Observer> observers;

  public WeatherData() {
    observers = new ArrayList<Observer>();
  }

  public void setMeasurements(float temperature, float humidity, float pressure) {
    this.temperature = temperature;
    this.humidity = humidity;
    this.pressure = pressure;
    measurementsChanged();
  }

  public void measurementsChanged() {
    notifyObservers();
  }

  public void addObserver(Observer observer) {
    observers.add(observer);
  }

  public void removeObserver(Observer observer) {
    observers.remove(observer);
  }

  public void notifyObservers() {
    System.out.println(String.format("\nUpdating %d observer(s)...", observers.size()));
    for (int i = 0; i < observers.size(); i++) {
      observers.get(i).update(temperature, humidity, pressure);
    }
    System.out.println("All updated!");
  }
}
