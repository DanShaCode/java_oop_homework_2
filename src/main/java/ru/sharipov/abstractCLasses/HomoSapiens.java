package ru.sharipov.abstractCLasses;

import ru.sharipov.classes.Track;
import ru.sharipov.classes.Wall;

public abstract class HomoSapiens {
    private String name;
    private Integer age;

    public HomoSapiens(String name, Integer age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public abstract void run();


    public abstract void run(Track track);

    public abstract void jump();

    public abstract void jump(Wall wall);
}
