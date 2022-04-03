package lesson_08;

import java.security.SecureRandom;

public class Animal {

    public Animal() {
    }

    public int getSpeed() {
        int speed = new SecureRandom().nextInt(100);
        return speed;
    }
}
