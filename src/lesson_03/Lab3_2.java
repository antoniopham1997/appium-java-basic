package lesson_03;

public class Lab3_2 {
    public static void main(String[] args) {
        int[] intArray = {6, 2, 100, 4, 5};
        int maxNumber = intArray[0];
        int minNumber = intArray[0];

        for (int i = 0; i < intArray.length; i++) {
            if(maxNumber < intArray[i]) {
                maxNumber = intArray[i];
            }
            if(minNumber > intArray[i]) {
                minNumber = intArray[i];
            }
        }
        System.out.println("Max number is: " + maxNumber);
        System.out.println("Min number is: " + minNumber);
    }
}
