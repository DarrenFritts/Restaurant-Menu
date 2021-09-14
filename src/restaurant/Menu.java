package restaurant;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.time.Instant;

// https://education.launchcode.org/java-independent-track/chapters/classes/studio.html

public class Menu {

    Date updatedStamp = new Date();
    String lastUpdated;

    // The menu consists of several menu items
    private ArrayList<MenuItem> menuItems = new ArrayList<>();

    // The app should know when the menu was last updated
    // https://mkyong.com/java/how-to-get-current-timestamps-in-java/
    // private static final SimpleDateFormat lastUpdated = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    // private SimpleDateFormat lastUpdated = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");


    // Also consider what constructors the classes might need
    /*public Menu() {
        this.lastUpdated = new SimpleDateFormat();
    }*/

    // Be sure to add getters and setters as appropriate
    public ArrayList<MenuItem> getMenuItems() {
        return this.menuItems;
    }

    public void setMenuItems(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    /*public SimpleDateFormat getLastUpdated() {
        return this.lastUpdated;
    }*/

    /*public void setLastUpdated(SimpleDateFormat lastUpdated) {
        this.lastUpdated = lastUpdated;
    }*/


    // methods

    // ORIGINAL WITHOUT BONUS CODE
    /*public void addMenuItem(MenuItem item) {
        // add menu items from the menu
        this.menuItems.add(item);
        // when the menu was last updated
        this.lastUpdated = new SimpleDateFormat();
        // this.lastUpdated = new Date();
    }*/

    // BONUS CODE
    public void addMenuItem(MenuItem item) {
        // check to see if item is already on menu
        for (MenuItem menuItem : this.menuItems) {
            // display a warning if already on menu AND do not add duplicate
            if (item.equals(menuItem)) {
                System.out.println("Item is already on menu, so will not be added again.");
                return;
            }
        }
        // add menu items from the menu
        this.menuItems.add(item);
        // when the menu was last updated
        // this.lastUpdated = new SimpleDateFormat();
        // this.lastUpdated = new Date();
        // updatedStamp = new Date();
        // lastUpdated = new Date().toString();
        lastUpdated = updatedStamp.toString();
    }

    public void removeMenuItem(MenuItem item) {
        // remove menu items from the menu
        this.menuItems.remove(item);
        // when the menu was last updated
        // this.lastUpdated = new SimpleDateFormat();
        // lastUpdated = new Date().toString();
        lastUpdated = updatedStamp.toString();
    }

    /*public SimpleDateFormat lastUpdated() {
        return this.lastUpdated;
    }*/

    // print out the entire menu
    @Override
    public String toString() {
        String printedMenu = "";
        for (MenuItem item : menuItems) {
            printedMenu += item.toString() + "\n----------\n";
        }
        // should print out the lastUpdated date/time stamp, but "how?"
        // String updatedLast = lastUpdated.toString();
        // String updatedLast = updatedStamp.toString();
        // printedMenu += updatedLast;
        printedMenu += "Last Updated: " + lastUpdated;
        return printedMenu;
    }
}
