package lesson_06;

public class Lab6_3 {
    public static void main(String[] args) {
        String myStr = "12345nabc678";

        char[] string = myStr.toCharArray();

        for (char s : string) {
            if(Character.isDigit(s)) {
                System.out.print(s);
            }
        }
    }
}
