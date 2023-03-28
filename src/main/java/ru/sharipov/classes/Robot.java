package ru.sharipov.classes;

import ru.sharipov.abstractCLasses.AutomaticDevice;

public class Robot extends AutomaticDevice {
    public Robot(String name, String model, double batteryCapacity) {
        super(name, model, batteryCapacity);
    }

    public boolean chargeSpend(Object action){
        if (action instanceof Wall){
            if ((getBatteryCapacity() - ((Wall) action).getHeight()) >= 0){
                setBatteryCapacity(getBatteryCapacity() - ((Wall) action).getHeight());
                return true;
            } else {
                return false;
            }
        }
        if (action instanceof Track){
            if ((getBatteryCapacity() - ((Track) action).getDistance()) >= 0 ){
                setBatteryCapacity(getBatteryCapacity() - ((Track) action).getDistance());
                return true;
            } else {
                return false;
            }
        }
        return false;
    }


    @Override
    public String toString(){
        System.out.println();
        return getName() + getModel();
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
