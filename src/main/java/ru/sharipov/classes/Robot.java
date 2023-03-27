package ru.sharipov.classes;

import ru.sharipov.abstractCLasses.AutomaticDevice;

public class Robot extends AutomaticDevice {
    public Robot(String name, String model) {
        super(name, model);
    }

    @Override
    public void run() {
        System.out.println();
        System.out.println(getName() + getModel()
                + " initialize running mode ... 1 ... 2 ... 3 ... ");
    }

    @Override
    public void run(Track track) {
        System.out.println();
        System.out.println(getName() + getModel() + " initialize running mode for "
                + track.getDistance() + " distance ...");
    }

    @Override
    public void jump() {
        System.out.println();
        System.out.println(getName() + getModel()
                + " initialize jumping mode ... 1 ... 2 ... 3 ... ");
    }


    @Override
    public void jump(Wall wall) {
        System.out.println();
        System.out.println(getName() + getModel()
                + " uses a jetpack to fly over a wall ... ");
    }

}
