package observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements IObservable {

    List<IObserver> iObserverList = new ArrayList<>();

    @Override
    public void addObserver(IObserver iObserver) {
        iObserverList.add(iObserver);
    }

    @Override
    public void removeObserver(IObserver iObserver) {
        iObserverList.remove(iObserver);
    }

    @Override
    public void notifyObservers() {
        iObserverList.stream()
                .forEach(entity -> {
                    entity.update();
                });
    }

    public double getTemperature() {
        return Math.random();
    }
}
