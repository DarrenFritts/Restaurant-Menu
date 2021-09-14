package restaurant;

import javax.rmi.ssl.SslRMIClientSocketFactory;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Restaurant {

    public static void main(String[] args) {

        // Create several items and add them to a menu
        MenuItem item1 = new MenuItem("Steak", 12.50, "Tender and flavorful Sirloin", "Main Course", true);
        MenuItem item2 = new MenuItem("Breaded Mushrooms", 6.50, "Crispy breaded mushrooms with horseradish sauce", "appetizer", true);
        MenuItem item3 = new MenuItem("Apple Pie ala mode", 5.50, "Delicious, warm, dutch apple pie with a scoop of vanilla bean ice cream", "Dessert", true);

        // add items to Menu
        Menu restaurantMenu = new Menu();
        restaurantMenu.addMenuItem(item1);
        restaurantMenu.addMenuItem(item2);
        restaurantMenu.addMenuItem(item3);
        /*Date updatedStamp = new Date();
        System.out.println(updatedStamp);
        int i = 0;
        while (i <= 1000000) {
            System.out.println(i);
            i++;
        }
        System.out.println(updatedStamp);*/
        // Print the entire, updated menu to the screen
        String fullMenu = restaurantMenu.toString();
        // Date updatedStamp = new Date();
        // System.out.println(updatedStamp);
        // delay 0.5 seconds
        //Thread.sleep(5000);
        // delay 5 seconds
        // TimeUnit.SECONDS.sleep(5);
        System.out.println(fullMenu);
        // System.out.println(restaurantMenu.toString());
        // Date updatedStamp = new Date();
        // System.out.println(updatedStamp);
        //System.out.println(lastUpdated.toString());
        //System.out.println(new SimpleDateFormat().toString());

        // Print an individual menu item to the screen
        // @Override toString() method in MenuItem class
        // System.out.println(item1.toString());

        // test @Override equals() method from MenuItem class
        // System.out.println(item1.equals(item1));
        // System.out.println(item1.equals(item2));

        // Delete an item from a menu, then reprint the menu
        // restaurantMenu.removeMenuItem(item2);
        // System.out.println(restaurantMenu.toString());

        // Verify that items already on menu won't be added as duplicate
        // BONUS CODE for AddMenuItem method in Menu class
        // restaurantMenu.addMenuItem(item1); // should get warning message && not add duplicate

    }

}


