package serviceUtil;

import main.Cities;
import util.Util;

import java.util.LinkedList;
import java.util.Scanner;

public class ServiceUtil {
    public static int servicesOfEntering() {
        Scanner sc = new Scanner(System.in);
        String services = "1:Find ride\n" +
                "2:Offer ride\n" +
                "3:About us\n" +
                "7:How is works" +
                "\n0:to quit";
        System.out.println(services);
        int ans = sc.nextInt();
        return ans;
    }


    public static void service1() throws Exception {
        Cities cities1 = new Cities();
        String answer = Util.enterString("Please,enter where you want to go...");
        System.out.println("Checking destinations for " + answer.toUpperCase());
        Thread.sleep(2000);
        String answerToUpper = answer.toUpperCase();
        LinkedList<String> list = cities1.getList();
        if (list.contains(answerToUpper)) {
            System.out.println("There are available trips for " + answerToUpper + " ...");
            String answer2 = util.Util.enterString("Please,enter your current location: ");
            int passenger = Util.enterNumber("Tell us how many passenger will travel?");
            String time = Util.enterString("Enter time: ");
            String requires = Util.enterString("Enter requires :(for example:Smoking-yes,Pet-no" +
                    "Car type-Sedan,SUV. Luggage or non-luggage et.c)");
            Util.printInfoTrip(answerToUpper, answer2, passenger, time, requires);
        } else {
            System.out.println("there are no active trips for your destination...\nHere are the active trips:");
            Cities cities2 = new Cities();
            LinkedList<String> city = cities2.getList();
            for (String s : city) {
                System.out.println(s);
            }
        }
    }

    public static void service2() {
        String placeFrom = Util.enterString("Where do you head?");
        String placeTo = Util.enterString("Your current location");
        String car = Util.enterString("Enter your car type(for example:Sedan,Suv,Coupe");
        int capacity = Util.enterNumber("Enter passenger capacity of your vehicle that you can carry");
        String requires = Util.enterString("Enter requires :(for example:Smoking-yes,Pet-no" +
                ",Luggage or non-luggage et.c)");
        String time = Util.enterString("Enter travel time");
        System.out.println("Your " + car + " car live from " + placeFrom + " to " + placeTo +
                " with " + capacity + " capacity and with these requires: " + requires);
    }

    public static void service3() {
        System.out.println("BlaBlaCar is a French online marketplace for carpooling.\n" +
                " Its website and mobile apps connect drivers and passengers willing to travel together " +
                "between cities and share the cost of the journey.\n" +
                "The platform had 70 million users in 2019 and is available in 22 countries." +
                " \nAlmost all of which are in Europe and Latin America – countries include:\n Belgium, Brazil, Croatia," +
                " Czech Republic, France, Germany, Hungary, India, Italy, Luxembourg, Mexico, \nThe Netherlands, " +
                "Poland, Portugal, Romania, Russia, Serbia, Slovakia, Spain, Turkey, Ukraine, and the United Kingdom.");
    }
}
