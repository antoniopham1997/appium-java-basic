package lesson_08;

import java.security.SecureRandom;

public class Dog extends Animal{

    public Dog() {
    }

    public int getSpeed() {
        int dogSpeed = new SecureRandom().nextInt(60);
        return dogSpeed;
    }
}
