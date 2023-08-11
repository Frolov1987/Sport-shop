package app;

public class BuilderPattern {
    public static void main(String[] args) {
        OrderBuilder orderBuilder = new OrderBuilder();

        Order orderA = orderBuilder.buildOrderA();
        System.out.println("Order A:");
        orderA.showItems();
        System.out.println("Total Cost: " + orderA.getTotalCost());

        Order orderB = orderBuilder.buildOrderB();
        System.out.println("\nOrder B:");
        orderB.showItems();
        System.out.println("Total Cost: " + orderB.getTotalCost());
    }
}

