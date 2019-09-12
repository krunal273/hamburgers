package hamburgers;

/**
 *
 * @author krunal and zhe
 */
public class DeluxeHamburger extends Hamburgers {

    public DeluxeHamburger(String hamburgerName, String breadName, String meatName, double basePrice) {
        super(hamburgerName, breadName, meatName, basePrice);
        super.SetAllowItems(2);
    }

    @Override
    public void AddAddionalItem(String addition) {
        AddAddionalItemWithCount(addition, GetAllowItems());
    }

    @Override
    protected void AddAddionalItemWithCount(String addition, int allowItmes) {
        double additionPrice = GetAdditionPrice();
//        System.out.println("Count= " + countAddition);
//        System.out.println("Flag= " + flagForAddition);

        if (countAddition != allowItmes && flagForAddition == true) {  // up to 4 addition can add to hamburger.
            double eachAdditionPrice = 0;
            addition = addition.toLowerCase();
            switch (addition) {
                case "chip":
                case "chips":
                    eachAdditionPrice = 2.75;
                    break;

                case "drink":
                case "drinks":
                    eachAdditionPrice = 1.85;
                    break;

                default:
                    System.out.println("Sorry We don't have " + addition + " addition for hamburgers.");
//                    super.AddAddionalItem(addition);
//                    countAddition = super.countAddition;
            }
            if (eachAdditionPrice != 0) {
                additionPrice += eachAdditionPrice;
                System.out.println("Added " + addition + " for an extra " + eachAdditionPrice);
                countAddition++; // Count Each valid Addition and stop if exceed than stop adding.
                SetAdditionPrice(additionPrice); // Setting  Price to addition
            }
        } else {
            System.out.println("Only 2 Addition Allow per " + GetHamburgerName() + " Hamburger or Base Price should more than zero.");
        }
    } // Function Finish.
}
