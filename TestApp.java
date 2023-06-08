public class TestApp {
    public static void main (String[] args) {
        CoffeeKiosk kiosk = new CoffeeKiosk();

        kiosk.addMenuItem("drip coffee", 2.5);
        kiosk.addMenuItem("latte", 3.5);
        kiosk.addMenuItem("mocha", 3.5);
        kiosk.addMenuItem("cappuccino", 3.0);

        kiosk.newOrder();
    }
}