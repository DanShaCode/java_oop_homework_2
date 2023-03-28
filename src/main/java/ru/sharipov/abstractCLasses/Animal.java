package ru.sharipov.abstractCLasses;

import ru.sharipov.classes.Track;
import ru.sharipov.classes.Wall;

public abstract class Animal {
    private String nickName;
    private Integer jumpingSkill;
    private Integer physicalSkill;

    public Animal(String nickName, Integer jumpingSkill, Integer physicalSkill){
        this.nickName = nickName;
        this.jumpingSkill = jumpingSkill;
        this.physicalSkill = physicalSkill;
    }

    public String getNickName(){
        return nickName;
    }

    public Integer getJumpingSkill() {
        return jumpingSkill;
    }

    public Integer getPhysicalSkill() {
        return physicalSkill;
    }

    public abstract void run();

    public abstract void run(Track track);

    public abstract void jump();

    public abstract void jump(Wall wall);
}
