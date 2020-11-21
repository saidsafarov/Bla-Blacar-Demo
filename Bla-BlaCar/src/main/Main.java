package main;

import serviceUtil.ServiceUtil;
import util.Util;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to the Bla-Bla Car...\n\tYour ride,Your choice");
        String nationality = util.Util.enterString("Please tell us,you are foreign or native...");
        int menu = 0;
        while (true) {
            String info = null;
            if (nationality.equalsIgnoreCase("Foreign")) {
                info = Util.enterString("Enter your passport info below");
                System.out.println("Checking information for  " + info + "...");
                Thread.sleep(2000);
                System.out.println("information process completed successfully ");
            } else if (nationality.equalsIgnoreCase("native")) {
            } else {
                System.out.println("Invalid operation");
                break;
            }
            menu = ServiceUtil.servicesOfEntering();
            if (menu == 0) {
                System.out.println("Quiting from system...");
                break;
            } else if (menu == 1) {
                String info1 = Util.fillInfo();
                System.out.println("password id:" + info + " " + info1);
                ServiceUtil.service1();
            } else if (menu == 2) {
                ServiceUtil.service2();
            } else if (menu == 3) {
                ServiceUtil.service3();
            }
        }
    }
}