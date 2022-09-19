package appPackages;

import java.util.Scanner;

public class PhoneApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Phone nokia3310 = new Phone();

        System.out.println("WELCOME TO NOKIA 3310");
        System.out.println("Press 1 to see Menu: ");
        int menuList = input.nextInt();
        if(menuList == 1){
            nokia3310.mainMenu();
        }

        System.out.println("Press 00 to switch off phone: ");
        menuList = input.nextInt();
        if (menuList == 00){
            nokia3310.switchOff();
        }

    }
}
