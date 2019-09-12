package hamburgers;

import java.util.Scanner;

/**
 *
 * @author krunal and zhe
 */
public class HamburgersTest {

    public static void main(String[] args) {
        // TODO code application logic here
        // Basic Hamburger or Regular only. 4 addition allow. 
        System.out.println("1.Basic Hamburger, 2.HealthyBurger, 3. Deluxe Hamburger");
//        String itemArray[] = {};
        Scanner input = new Scanner(System.in);
        int burgerNumber = input.nextInt();

        switch (burgerNumber) {
            case 1:
                Hamburgers basic = new Hamburgers("basic", "White bread", "meat", 5.0);
                String itemArray[] = {"tomato", "lettuce", "carrot", "cheese"};
                printHamburger(itemArray, basic);
                break;

            case 2:
                Hamburgers healthy = new HealthyBurger("Healthy", "Brown Bread", "Meat", 3.66);
                String itemArray1[] = {"tomato", "lettuce", "carrot", "cheese", "egg", "lentil"};
                printHamburger(itemArray1, healthy);
                break;

            case 3:
                Hamburgers deluxe = new DeluxeHamburger("Deluxe", "White Bread", "meat", 5.6);
                String itemArray3[] = {"chip", "drink"};
                printHamburger(itemArray3, deluxe);
                break;

            default:
                System.out.println("Bye.");
        }

    }

    public static void printHamburger(String[] itemArray, Hamburgers hamburgers) {
        Scanner input = new Scanner(System.in);
        int i = 1;
        for (String item : itemArray) {
            System.out.println(i++ + " = " + item);
        }
        System.out.println("0 = Exit");
        while (!input.hasNext("0")) {
            int itemNumber = input.nextInt();
            if (itemArray.length >= itemNumber) {
                hamburgers.AddAddionalItem(itemArray[itemNumber - 1]);
            } else {
                System.out.println("Addition Number is not valid.");
            }
        }
        hamburgers.PrintGrandPrice();
    }
}
