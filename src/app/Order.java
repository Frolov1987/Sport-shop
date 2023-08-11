package app;

import java.util.ArrayList;
import java.util.List;

public class Order {
    List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public float getTotalCost() {
        float totalCost = 0.0f;
        for (Item item : items) {
            totalCost += item.price();
        }
        return totalCost;
    }

    public void showItems() {
        for (Item item : items) {
            System.out.println(item.name() + ", Manufacturer: " + item.getManufacturer().getManufacturerName() + ", Price: " + item.price());
        }
    }
        }


