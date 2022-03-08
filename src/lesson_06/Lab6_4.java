package lesson_06;

import java.util.Arrays;

public class Lab6_4 {

    public static void main(String[] args) {
        String url = "https://google.com";

        String[] result = url.split("://google");

        System.out.println("It's " + result[0] + " and " + "domain name is " + result[1]);
    }
}
