package lesson_03;

public class Lab3_4 {
    public static void main(String[] args) {
        int[] intArray1 = {10, 4, 7, 100, 1, -5, 12};
        int[] intArray2 = {0, 2, -10, -20, 10};
        int[] intArray3 = new int[intArray1.length + intArray2.length];
        int j = 0;

        for (int i = 0; i < intArray1.length; i++) {
            intArray3[j] = intArray1[i];
            j++;
        }
        for (int i = 0; i < intArray2.length; i++) {
            intArray3[j] = intArray2[i];
            j++;
        }
        for (int i = 0; i < intArray3.length; i++) {
            int temp = intArray3[i];
            for (int k = i + 1; k < intArray3.length; k++) {
                if(temp > intArray3[k]) {
                    intArray3[i] = intArray3[k];
                    intArray3[k] = temp;
                    temp = intArray3[i];
                }
            }
        }
        for (int ascendIntArray : intArray3) {
            System.out.println(ascendIntArray);
        }
    }
}
