package ru.sharipov.classes;

public class Obstacle {

    public static void obstacleСourse(Object[] participants, Object[] obstacles) {
        for (Object participant: participants){
            boolean wallCheck = false;
            boolean trackCheck = false;
            for (Object obstacle: obstacles){
                if (obstacle instanceof Wall){
                    wallCheck = wallPass(participant,obstacle);
                    if (wallCheck == false){
                        System.out.println("Participant: " + participant.toString());
                        System.out.println("Result : No! Track is not done!");
                        System.out.println("Can't to pass the wall ... ");
                        break;
                    }
                }
                if (obstacle instanceof Track){
                    trackCheck = trackPass(participant, obstacle);
                    if (trackCheck == false){
                        System.out.println("Participant: " + participant.toString());
                        System.out.println("Result : No! Track is not done!");
                        System.out.println("Can't to pass the running track ... ");
                        break;
                    }
                }
            }
            if (wallCheck == true && trackCheck == true){
                System.out.println("Participant: " + participant.toString());
                System.out.println("Result: Yes! Track is done!");
            }
        }
    }

    public static boolean wallPass(Object participant, Object obstacle){
        if (participant instanceof Human
                && obstacle instanceof Wall
                && ((Wall) obstacle).getHeight() <= ((Human) participant).getJumpingSkill()){
            return true;
        }
        if (participant instanceof Robot && obstacle instanceof Wall){
            boolean chargeCheck = ((Robot) participant).chargeSpend(obstacle);
            if (chargeCheck == true){
                return true;
            } else {
                return false;
            }
        }
        if (participant instanceof Cat
                && obstacle instanceof Wall
                && ((Wall) obstacle).getHeight() < 3){
            return true;
        }
        else {
            return false;
        }
    }

    public static boolean trackPass(Object participant, Object obstacle){
        if (participant instanceof Human
                && obstacle instanceof Track
                && ((Track) obstacle).getDistance() <= ((Human) participant).getPhysycalSkill()){
            return true;
        }
        if (participant instanceof Robot && obstacle instanceof Track) {
            boolean chargeCheck = ((Robot) participant).chargeSpend(obstacle);
            if (chargeCheck == true){
                return true;
            } else {
                return false;
            }
        }
        if (participant instanceof Cat
                && obstacle instanceof Track
                && ((Track) obstacle).getDistance() < 1){
            return true;
        }
        else {
            return false;
        }
    }

}
