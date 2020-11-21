package util;

import java.util.Scanner;

public class Util {
    public static String enterString(String title) {
        System.out.println(title);
        Scanner sc = new Scanner(System.in);
        String answer = sc.nextLine();
        return answer;
    }

    public static int enterNumber(String title) {
        System.out.println(title);
        Scanner sc = new Scanner(System.in);
        int answer = sc.nextInt();
        return answer;
    }

    public static void printInfoTrip(String ans1, String ans2, int passenger, String time, String requires) {
        System.out.println("your trip from :" + ans1 + " to " + ans2.toUpperCase() + " with " + passenger +
                " passenger" + " at " + time + " and with these requires: " + requires + ". Is ready");
    }

    public static String fillInfo() {
        String nameSurname = enterString("Enter your name and surname");
        String email = enterString("Enter your e-mail");
        String phone = enterString("Enter your phone number");
        return "name: " + nameSurname + " e-mail: " + email + " phone: " + phone;
    }

}
