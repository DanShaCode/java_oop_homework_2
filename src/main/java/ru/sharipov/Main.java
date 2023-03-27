//Домашнее задание на закрепление :

//        1)Создайте три класса: Человек, Кот, Робот, которые не наследуются от одного класса.
//        Эти классы должны уметь бегать и прыгать, все также с выводом информации о действии в консоль.
//
//
//        2) Создайте два класса: беговая дорожка и стена, при прохождении через которые, участники
//        должны выполнять соответствующие действия (бежать или прыгать), результат выполнения
//        печатаем в консоль (успешно пробежал, не смог пробежать и т.д.). У препятствий есть длина
//        (для дорожки) или высота (для стены), а участников ограничения на бег и прыжки.
//
//
//        3) Создайте два массива: с участниками и препятствиями, и заставьте всех участников пройти
//        этот набор препятствий. Если участник не смог пройти одно из препятствий, то дальше по
//        списку он препятствий не идет.

package ru.sharipov;

import ru.sharipov.abstractCLasses.Animal;
import ru.sharipov.abstractCLasses.AutomaticDevice;
import ru.sharipov.abstractCLasses.HomoSapiens;
import ru.sharipov.classes.*;

public class Main {

    private static boolean wallPass(Object participant, Object obstacle){
        if (participant instanceof Human
                && obstacle instanceof Wall
                && ((Wall) obstacle).getHeight() < 2){
            return true;
        } else {
            return false;
        }
    }

    private static boolean trackPass(Object participant, Object obstacle){
        if (participant instanceof Human
                && obstacle instanceof Track
                && ((Track) obstacle).getDistance() < 5){
            return true;
        } else {
            return false;
        }
    }



    public static void main(String[] args) {

        System.out.println();
        System.out.println("         Creating objects");
        System.out.println("-------------------------------------");

        Animal cat = new Cat("Felix");
        cat.jump();

        AutomaticDevice robot = new Robot("Apple", "XR");
        robot.run();

        HomoSapiens man = new Human("Danis", 32);
        man.jump();

        Wall wall = new Wall(1);

        Track track = new Track(1);

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

        Object[] participants = {man};

        Object[] obstacles = {wall,track};

        for (Object participant: participants){
            boolean wallCheck = false;
            boolean trackCheck = false;
            for (Object obstacle: obstacles){
                if (obstacle instanceof Wall){
                    wallCheck = wallPass(participant,obstacle);
                }
                if (obstacle instanceof Track){
                    trackCheck = trackPass(participant, obstacle);
                }
            }
            if (wallCheck == true && trackCheck == true){
                System.out.println("Yes! Track is done!");
            } else {
                System.out.println("No! Track is not done!");
            }
        }


    }
}