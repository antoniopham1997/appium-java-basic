package lesson_06;

public class Lab6_1 {
    public static void main(String[] args) {
        String inputString = "2hrs and 5 minutes";
        int hour = Integer.parseInt(inputString.substring(inputString.indexOf("hrs")-1,inputString.indexOf("hrs")));
        int minute = Integer.parseInt(inputString.substring(inputString.indexOf(" minutes")-1,inputString.indexOf(" minutes")));

        System.out.println("Total " + (hour*60+minute) + " minutes");
    }
}
