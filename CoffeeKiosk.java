import java.util.ArrayList;

public class CoffeeKiosk {
    public ArrayList<Item> menu;
    public ArrayList<Order> orders;

    public CoffeeKiosk () {
        menu = new ArrayList<Item>();
        orders = new ArrayList<Order>();
    }

    public void addMenuItem (String name, double price) {
        menu.add(new Item(name, price));
    }

    public void displayMenu () {
        for(int x = 0; x < menu.size(); x++) {
            Item item = menu.get(x);
            System.out.printf("%d %s -- $%.2f\n", x, item.getName(), item.getPrice());
        }
    }

    public void newOrder() {
    	// Shows the user a message prompt and then sets their input to a variable, name
        System.out.println("Please enter customer name for new order:");
        String name = System.console().readLine();
    
    	// Your code:
        // Create a new order with the given input string
        Order order = new Order(name);

        // Show the user the menu, so they can choose items to add.
        this.displayMenu();
        
        ArrayList<Item> items = new ArrayList<Item>();
        
    	// Prompts the user to enter an item number
        System.out.println("Please enter a menu item index or q to quit:");
        String itemNumber = System.console().readLine();

        // Write a while loop to collect all user's order items
        while(!itemNumber.equals("q")) {
            if(itemNumber != "q") {
                int number = Integer.parseInt(itemNumber);
                // Get the item object from the menu, and add the item to the order
                items.add(menu.get(number));

                // Ask them to enter a new item index or q again, and take their input
                System.out.println("Please enter another menu item index or q to quit:");
                itemNumber = System.console().readLine();
            }
        }

        order.setItems(items);
        // After you have collected their order, print the order details 
    	// as the example below. You may use the order's display method.
        System.out.printf("Thank you, %s. Here are your order details:\n", order.getName());
        order.display();
    }
}