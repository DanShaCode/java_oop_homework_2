package ru.sharipov;

import ru.sharipov.abstractCLasses.Animal;
import ru.sharipov.abstractCLasses.AutomaticDevice;
import ru.sharipov.abstractCLasses.HomoSapiens;
import ru.sharipov.classes.*;

public class Main {

    public static void main(String[] args) {

        System.out.println();
        System.out.println("         Creating objects");
        System.out.println("-------------------------------------");

        Animal cat = new Cat("Felix", 5, 5);
        cat.jump();

        AutomaticDevice robot = new Robot("Apple", "XR", 100);
        robot.run();

        HomoSapiens man = new Human("Danis", 32, 2, 43);
        man.jump();

        Wall wall = new Wall(3);

        Track track = new Track(50);

        System.out.println();
        System.out.println("        Actions with the WALL");
        System.out.println("-------------------------------------");

        System.out.println();
        System.out.println("-= Human =-");
        man.jump(wall);


        System.out.println();
        System.out.println("-= Robot =-");
        robot.jump(wall);


        System.out.println();
        System.out.println("-= Cat =-");
        cat.jump(wall);

        System.out.println();
        System.out.println("       Actions with the TRACK");
        System.out.println("-------------------------------------");

        System.out.println();
        System.out.println("-= Human =-");
        man.run(track);


        System.out.println();
        System.out.println("-= Robot =-");
        robot.run(track);


        System.out.println();
        System.out.println("-= Cat =-");
        cat.run(track);

        System.out.println();
        System.out.println("          Obstacle course");
        System.out.println("-------------------------------------");

        Object[] participants = {man, robot, cat};

        Object[] obstacles = {wall,track};

        Obstacle.obstacleCourse(participants, obstacles);

    }

}