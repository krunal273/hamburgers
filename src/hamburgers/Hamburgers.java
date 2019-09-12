package hamburgers;

/**
 *
 * @author krunal and zhe
 */
public class Hamburgers {

    private String hamburgerName; // name of the hamburger e.g basic,regular,healthy...
    private String breadName; // bread name
    private String meatName; // meat name
    private double additionPrice = 0; // addition price that use select in hamburger
    private double grandPrice = 0; // all price grand total
    private double basePrice = 0; // base Price without addition.
    int countAddition = 0;  // up to 4 addition can add to hamburger.
    boolean flagForAddition = false;
    private int allowItems = 4;

    protected double GetAdditionPrice() {
        return this.additionPrice;
    }

    protected void SetAdditionPrice(double value) {
        this.additionPrice = value;
    }

    protected String GetHamburgerName() {
        return this.hamburgerName;
    }

    protected void SetAllowItems(int value) {
        this.allowItems = value;
    }

    protected int GetAllowItems() {
        return this.allowItems;
    }

    public Hamburgers(String hamburgerName, String breadName, String meatName, double basePrice) {
        if (basePrice > 0) {
            this.hamburgerName = hamburgerName;
            this.breadName = breadName;
            this.meatName = meatName;
            this.basePrice = basePrice;
            flagForAddition = true;
            this.PrintBasicPrice();
        } else {
            System.out.println("Please Enter Valid Price for " + hamburgerName + " hamburger.");
        }

    }

    public final void PrintBasicPrice() {
        System.out.println(this.hamburgerName + " hamburger  on a " + this.breadName + " with " + this.meatName
                + ", price is " + this.basePrice);
    }

    public void AddAddionalItem(String addition) {
        AddAddionalItemWithCount(addition, allowItems);
    }

    protected void AddAddionalItemWithCount(String addition, int allowItems) {
//        System.out.println("Count = " + countAddition);
        if (countAddition != allowItems && flagForAddition == true) {  // up to 4 addition can add to hamburger.
            double eachAdditionPrice = 0;
            addition = addition.toLowerCase();
            switch (addition) {
                case "lettuce":
                    eachAdditionPrice = 0.27;
                    break;
                case "tomato":
                    eachAdditionPrice = 0.75;
                    break;
                case "carrot":
                    eachAdditionPrice = 0.35;
                    break;
                case "cheese":
                    eachAdditionPrice = 1.12;
                    break;

                default:
                    System.out.println("Sorry We don't have " + addition + " addition for hamburgers.");
            }
            if (eachAdditionPrice != 0) {
                additionPrice += eachAdditionPrice;
                System.out.println("Added " + addition + " for an extra " + eachAdditionPrice);
                countAddition++; // Count Each valid Addition and stop if exceed than stop adding.
            }
        } else {
            System.out.println("Only 4 Addition Allow per " + GetHamburgerName() + " Hamburger or Base Price should more than zero.");
        }
    } // Function Finish.

    public void PrintGrandPrice() {
        grandPrice = basePrice + additionPrice;
        System.out.println("Total Burger price is " + grandPrice);
    }
}
