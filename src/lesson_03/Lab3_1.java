package lesson_03;

public class Lab3_1 {
    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5};
        int even = 0;
        int odd = 0;

        for (int i = 0; i < intArray.length; i++) {
            if(intArray[i]%2==0) {
                even = even + 1;
            } else {
                odd = odd + 1;
            }
        }
        System.out.println("The number of odd number is: " + odd);
        System.out.println("The number of even number is: " + even);
    }
}
