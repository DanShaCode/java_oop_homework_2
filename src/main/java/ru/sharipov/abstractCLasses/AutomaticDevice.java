package ru.sharipov.abstractCLasses;

import ru.sharipov.classes.Track;
import ru.sharipov.classes.Wall;

public abstract class AutomaticDevice {
    private String name;
    private String model;

    public AutomaticDevice(String name, String model){
        this.name = name;
        this.model = model;
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
