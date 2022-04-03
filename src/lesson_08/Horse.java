package lesson_08;

import java.security.SecureRandom;

public class Horse extends Animal{

    public Horse() {
    }

    public int getSpeed() {
        int horseSpeed = new SecureRandom().nextInt(75);
        return horseSpeed;
    }
}
