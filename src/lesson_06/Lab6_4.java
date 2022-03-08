package lesson_06;

import java.util.Arrays;

public class Lab6_4 {

    public static void main(String[] args) {
        String url = "https://google.com";

        String[] result = url.split("://google");

        if(result[0].equals("http")) {
            System.out.print("It's http and ");
        } if(result[0].equals("https")) {
            System.out.print("It's https and ");
        } if(result[1].equals(".com")) {
            System.out.print("domain name is dot com");
        } if(result[1].equals(".net")) {
            System.out.print("domain name is dot net");
        }
    }
}
