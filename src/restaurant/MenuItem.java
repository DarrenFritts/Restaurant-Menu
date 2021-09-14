package restaurant;

public class MenuItem {

    // Each menu item has a price, description, and category
    private String item;
    private Double price;
    private String description;
    private String category; // appetizer, main course, or dessert

    // It should be possible to display whether a menu item is new or not
    private Boolean isNew;

    // Also consider what constructors the classes might need
    public MenuItem(String item, Double price, String description, String category, Boolean isNew) {
        this.item = item;
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNew = isNew;
    }

    // Be sure to add getters and setters as appropriate
    public String getItem() {
        return this.item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public Double getPrice() {
        return this.price;
    }

    public void setPrice(Double price) {
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


    // methods

    // tell if a menu item is new
    public boolean isNew() {
        return this.isNew;
    }

    // print out a single menu item
    public String toString() {
        String menuItemString = "";
        menuItemString += "Item Name: " + this.item + "\n";
        menuItemString += "Item Description: " + this.description + "\n";
        menuItemString += "Item Price: " + this.price + "\n";
        menuItemString += "Item Category: " + this.category + "\n";
        menuItemString += "Is Item New? " + this.isNew + "\n";

        return menuItemString;
    }

    // determine whether or not two menu items are equal
    @Override
    public boolean equals(Object obj) {
        // "obj" we're comparing is at same memory location as "this"
        if (obj == this) {
            return true;
        }
        // if menuItem is not a MenuItem
        if (obj instanceof MenuItem == false) {
            return false;
        }
        // having past the 2 tests above, we can now cast obj into a MenuItem
        MenuItem menuItem = (MenuItem) obj;
        // if item equals menuItem (in every way)
        if (menuItem.item.equals(this.item)
                && menuItem.description.equals(this.description)
                && menuItem.price.equals(this.price)
                && menuItem.category.equals(this.category)) {
            return true;
        } else {
            return false;
        }
    }
}
