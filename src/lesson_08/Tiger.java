package lesson_08;

import java.security.SecureRandom;

public class Tiger extends Animal{

    public Tiger() {
    }

    public int getSpeed() {
        int tigerSpeed = new SecureRandom().nextInt(100);
        return tigerSpeed;
    }
}
