package restaurant;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MenuItem {

    // Each menu item has a price, description, and category
    private String price;
    private String description;
    private String category; // appetizer, main course, or dessert

    // It should be possible to display whether a menu item is new or not
    private Boolean isNew;

    // The app should know when the menu was last updated
    // https://mkyong.com/java/how-to-get-current-timestamps-in-java/
    private static final SimpleDateFormat currentDateTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public static SimpleDateFormat getCurrentDateTime() {
        return currentDateTime;
    }


    // Be sure to add getters and setters as appropriate
    public String getPrice() {
        return this.price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

}
