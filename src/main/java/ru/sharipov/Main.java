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

    public static void main(String[] args) {

        System.out.println();
        System.out.println("         Creating objects");
        System.out.println("-------------------------------------");

        Animal cat = new Cat("Felix");
        cat.jump();

        AutomaticDevice robot = new Robot("Apple", "XR", 100);
        robot.run();

        HomoSapiens man = new Human("Danis", 32, 2, 43);
        man.jump();

        Wall wall = new Wall(50);

        Track track = new Track(51);

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

        Obstacle.obstacleСourse(participants, obstacles);

        System.out.println(robot.getBatteryCapacity());

    }

}