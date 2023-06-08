import java.util.ArrayList;
    
// Here we're creating a new data type called Order
public class Order {
    
    // MEMBER VARIABLES
    private String name; // default value of null
    private boolean ready; // default value false
    private ArrayList<Item> items; // defaults to null
    
    // CONSTRUCTOR
    public Order () {
        this.name = "Guest";
        this.items = new ArrayList<Item>();
    }
    
    // OVERLOADED CONSTRUCTOR
    public Order (String name) {
        this.name = name;
        this.items = new ArrayList<Item>();
    }
    
    // ORDER METHODS
    public void addItem (Item item) {
        ArrayList<Item> tempItems = this.getItems();
        tempItems.add(item);
        this.setItems(tempItems);
    }

    public String getStatusMessage() {
        return this.getReady() ? ("Your order is ready.") : ("Thank you for waiting. Your order will be ready soon.");
    }

    public double getOrderTotal() {
        double total = 0;
        for (Item item : this.items) {
            total += item.getPrice();
        }
        return total;
    }

    public void display () {
        System.out.printf("Customer name: %s\n", this.name);
        for (Item item : this.items) {
            System.out.printf("%s - $%.2f\n", item.getName(), item.getPrice());
        }
        System.out.printf("Total: $%.2f\n", this.getOrderTotal());
    }
    
    // GETTERS & SETTERS
    public String getName () {
        return name;
    }

    public boolean getReady () {
        return ready;
    }

    public ArrayList<Item> getItems () {
        return items;
    }
    
    public void setName (String name) {
        this.name = name;
    }

    public void setReady (boolean ready) {
        this.ready = ready;
    }
    
    public void setItems (ArrayList<Item> items) {
        this.items = items;
    }
}
