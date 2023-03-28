package ru.sharipov.abstractCLasses;

import ru.sharipov.classes.Track;
import ru.sharipov.classes.Wall;

public abstract class AutomaticDevice {
    private String name;
    private String model;

    private double batteryCapacity;

    public AutomaticDevice(String name, String model, double batteryCapacity){
        this.name = name;
        this.model = model;
        this.batteryCapacity = batteryCapacity;
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public abstract void run();

    public abstract void run(Track track);

    public abstract void jump();

    public abstract void jump(Wall wall);
}
