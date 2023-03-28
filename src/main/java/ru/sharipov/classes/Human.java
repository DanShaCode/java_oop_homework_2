package ru.sharipov.classes;

import ru.sharipov.abstractCLasses.HomoSapiens;

public class Human extends HomoSapiens {


    public Human(String name, Integer age, Integer jumpingSkill, Integer physicalSkill) {
        super(name, age, jumpingSkill, physicalSkill);
    }

    @Override
    public String toString(){
        System.out.println();
        return getName();
    }

    @Override
    public void run() {
        System.out.println();
        System.out.println(getName() + " is running ...  ");
    }

    @Override
    public void run(Track track) {
        if (track.getDistance() <= getPhysycalSkill()){
            System.out.println();
            System.out.println("Eazy breezy lemon squizee!");
        } else {
            System.out.println();
            System.out.println("No! Sorry i can't to run this distance ...");
        }
    }

    @Override
    public void jump() {
        System.out.println();
        System.out.println(getName() + " is jumping ...  ");
    }

    @Override
    public void jump(Wall wall) {
        System.out.println();
        if (wall.getHeight() > getJumpingSkill())
            System.out.println("It's too high! " + getName() + " can't jump over the wall ... ");
        else
            System.out.println(getName() + " jump over the wall ... ");
    }
}
