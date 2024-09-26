package observer;

import java.util.ArrayList;
import java.util.List;

public class GoogleMaps implements IObserver {

    List<Double> temperatures;
    WeatherStation weatherStation;

    public GoogleMaps(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
        this.temperatures = new ArrayList<>();
    }

    @Override
    public void update() {
        Double temp = this.weatherStation.getTemperature();
        this.temperatures.add(this.weatherStation.getTemperature());
    }

    public void printTemperatures() {
        System.out.println(this.temperatures.size());
        this.temperatures.stream()
                .forEach(entity -> System.out.println(entity));
    }
}
