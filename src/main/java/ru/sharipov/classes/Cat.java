package ru.sharipov.classes;

import ru.sharipov.abstractCLasses.Animal;

public class Cat extends Animal {
    public Cat(String nickName, Integer jumpingSkill, Integer physicalSkill) {
        super(nickName, jumpingSkill, physicalSkill);
    }

    @Override
    public String toString(){
        System.out.println();
        return getNickName();
    }


    @Override
    public void run() {
        System.out.println();
        System.out.println(getNickName() + " is getting ready to run ... ");
    }

    @Override
    public void run(Track track) {
        if (track.getDistance() > getPhysicalSkill()){
            System.out.println();
            System.out.println("I am to lazy ... maybe go to sleep ?!");
        } else {
            System.out.println();
            System.out.println(getNickName() + " take a little walk ... ");
        }
    }

    @Override
    public void jump() {
        System.out.println();
        System.out.println(getNickName() + " is getting ready to jump ... ");
    }

    @Override
    public void jump(Wall wall) {
        if(wall.getHeight() > getJumpingSkill()){
            System.out.println();
            System.out.println(getNickName() +  " can't jump through the wall but gut tells me that there is a hole here ... ");
        } else {
            System.out.println();
            System.out.println(getNickName() +  " jump over the wall softly ... ");
        }


    }

}
