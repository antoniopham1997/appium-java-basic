package lesson_03;

public class Lab3_3 {
    public static void main(String[] args) {
        int[] intArray = {10, 4, 7, 100, 1, -5, 12};
        for (int i = 0; i < intArray.length; i++) {
            int temp = intArray[i];
            for (int j = i + 1; j < intArray.length; j++) {
                if(temp > intArray[j]) {
                    intArray[i] = intArray[j];
                    intArray[j] = temp;
                    temp = intArray[i];
                }
            }
        }
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }
}
