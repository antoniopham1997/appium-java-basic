package lesson_08;

import java.util.ArrayList;
import java.util.List;

public class Race extends Animal{

    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal horse = new Horse();
        Animal tiger = new Tiger();

        List<Animal> animalList = new ArrayList<>();
        animalList.add(dog);
        animalList.add(horse);
        animalList.add(tiger);

        int maxSpeed = animalList.get(0).getSpeed();

        String winAnimal = animalList.get(0).getClass().getSimpleName();
        for(int i = 0; i < animalList.size()-1; i++) {
            if (animalList.get(i).getSpeed() > animalList.get(i + 1).getSpeed()) {
                maxSpeed = animalList.get(i).getSpeed();
                winAnimal = animalList.get(i).getClass().getSimpleName();
            }
        }
        System.out.println("Winner is: " + winAnimal + " with speed " + maxSpeed);
    }
}
