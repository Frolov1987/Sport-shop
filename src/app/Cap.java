package app;

public abstract class Cap implements Item {
    @Override
    public Manufacturer getManufacturer() {
        return new CapManufacturer();
    }
}


