/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hamburgers;

/**
 *
 * @author krunal and zhe
 */
public class HealthyBurger extends Hamburgers {

    public HealthyBurger(String hamburgerName, String breadName, String meatName, double basePrice) {
        super(hamburgerName, breadName, meatName, basePrice);
        super.SetAllowItems(6);
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
                case "egg":
                case "eggs":
                    eachAdditionPrice = 0.27;
                    break;

                case "lentil":
                case "lentils":
                    eachAdditionPrice = 0.75;
                    break;

                default:
                    super.AddAddionalItemWithCount(addition,allowItmes);
            }
            if (eachAdditionPrice != 0) {
                additionPrice += eachAdditionPrice;
                System.out.println("Added " + addition + " for an extra " + eachAdditionPrice);
                countAddition++; // Count Each valid Addition and stop if exceed than stop adding.
                SetAdditionPrice(additionPrice); // Setting  Price to additionPrice Variable.
            }
        } else {
            System.out.println("Only 6 Addition Allow per " + GetHamburgerName() + " Hamburger or Base Price should more than zero.");
        }
    } // Function Finish.

}
