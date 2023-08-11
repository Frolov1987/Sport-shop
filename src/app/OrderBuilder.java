package app;

public class OrderBuilder {
    public Order buildOrderA() {
        Order order = new Order();
        order.addItem(new TshirtRed());
        order.addItem(new CapWhite());
        return order;
    }

    public Order buildOrderB() {
        Order order = new Order();
        order.addItem(new TshirtBlue());
        order.addItem(new CapBlack());
        return order;
    }
}

