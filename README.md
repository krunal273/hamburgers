 The purpose of the application is to help a fictitious company called Brampton’s Burgers to manage their process of selling hamburgers.  Our application will help “Shamim” to select types of burgers, some of the additional items (additions) to be added to the burgers and pricing.  We want to create a base hamburger, but also two other types of hamburgers that are popular ones in Brampton store. The basic hamburger should have the following items:
bread roll type, meat and up to 4 additional additions; (things like lettuce, tomato, carrot, etc) that
the customer can select to be added to the burger. Each one of these items gets charged an additional
price so you need some way to track how many items got added and to calculate the final price (base burger with all the additions). This burger has a base price and the additions are all 
separately priced (up to 4 additions, see above).
 Create a Hamburger class to deal with all the above.  The constructor should only include the roll type, meat and price, can also include name of burger or you can use setter. Also create two extra varieties of Hamburgers (subclasses) to cater for:
a) Healthy burger (on a brown rye bread roll), plus two addition items can be added.
 The healthy burger can have 6 items (Additions) in total.
 hint:  you probably want to process the 2 additional items in this new class (subclass of Hamburger), not the base class (Hamburger), since the 2 additions are only appropriate for this new class (in other words new burger type).
b) Deluxe hamburger - comes with chips and drinks as additions, but no extra additions are allowed.
hint:  You have to find a way to automatically add these new additions at the time the deluxe burger
object is created, and then prevent other additions being made.
All 3 classes should have a method that can be called anytime to show the base price of the hamburger
plus all additional, each showing the addition name, and addition price, and a grand/final total for the
 burger (base price + all additions)
 For the two additional classes this may require you to be looking at the base class for pricing and then
adding totals to final price.

Here is a possible output:

run:
Basic hamburger  on a White roll with Sausage, price is 3.56
Basic hamburger  on a White roll with Sausage, price is 3.56
Added Tomato for an extra 0.27
Added Lettuce for an extra 0.75
Added Cheese for an extra 1.13
Total Burger price is 5.71
Healthy hamburger on a Brown rye roll with Bacon, price is 5.67
Added Egg for an extra 5.43
Added Lentils for an extra 3.41
Total Healthy Burger price is 14.51
Cannot not add additional items to a deluxe burger
Deluxe hamburger on a White roll with Sausage & Bacon, price is 14.54
Added Chips for an extra 2.75
Added Drink for an extra 1.81
BUILD SUCCESSFUL (total time: 0 seconds)
