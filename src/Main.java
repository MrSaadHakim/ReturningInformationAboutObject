public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("Fiat", "Uno", 2011, 4850.0, "Blue", 42);

        System.out.println(car1.toString());

        car1.sell(17);

        System.out.println("Model: " + car1.getModel());
        System.out.println("Brand: " + car1.getBrand());
        System.out.println("Year: " + car1.getYear());
        System.out.println("Price: " + car1.getPrice());
        System.out.println("Color: " + car1.getColor());
        System.out.println("Quantity: " + car1.getQuantity());

        car1.setColor("Black");
        car1.setPrice(5540.0);

        System.out.println(car1.toString());
    }
}
