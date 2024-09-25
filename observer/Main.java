package observer;

import lombok.SneakyThrows;

public class Main {

    @SneakyThrows
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        GoogleMaps googleMaps = new GoogleMaps(weatherStation);
        AppleMaps appleMaps = new AppleMaps(weatherStation);
        weatherStation.addObserver(googleMaps);
        weatherStation.addObserver(appleMaps);

        weatherStation.notifyObservers();
        weatherStation.notifyObservers();
        weatherStation.notifyObservers();
        weatherStation.notifyObservers();

        System.out.println("Apple maps");
        appleMaps.printTemperatures();
        System.out.println("Google maps");
        googleMaps.printTemperatures();

    }
}
