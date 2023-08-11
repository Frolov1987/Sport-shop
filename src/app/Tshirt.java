package app;

public abstract class Tshirt implements Item{
    @Override
    public Manufacturer getManufacturer() {
        return new TshirtManufacturer();
    }
}

