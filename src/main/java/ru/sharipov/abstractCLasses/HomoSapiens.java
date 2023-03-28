package ru.sharipov.abstractCLasses;

import ru.sharipov.classes.Track;
import ru.sharipov.classes.Wall;

public abstract class HomoSapiens {
    private String name;
    private Integer age;

    private Integer jumpingSkill;

    private Integer physycalSkill;

    public HomoSapiens(String name, Integer age, Integer jumpingSkill, Integer physycalSkill){
        this.name = name;
        this.age = age;
        this.jumpingSkill = jumpingSkill;
        this.physycalSkill = physycalSkill;
    }

    public Integer getJumpingSkill() {
        return jumpingSkill;
    }

    public Integer getPhysycalSkill() {
        return physycalSkill;
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
