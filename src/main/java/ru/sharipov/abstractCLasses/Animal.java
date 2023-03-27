package ru.sharipov.abstractCLasses;

import ru.sharipov.classes.Track;
import ru.sharipov.classes.Wall;

public abstract class Animal {
    private String nickName;

    public Animal(String nickName){
        this.nickName = nickName;
    }

    public String getNickName(){
        return nickName;
    }

    public abstract void run();

    public abstract void run(Track track);

    public abstract void jump();

    public abstract void jump(Wall wall);
}
