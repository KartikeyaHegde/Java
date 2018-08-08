package OOAD.Chapter01.RicksGuitarV02;

public class Guitar {
    private String serialNumber, model;
    double price;
    Builder builder;
    Type type;
    Wood backWood;
    Wood topWood;


    public Guitar(String serialNumber, double price, String model, Builder builder, Type type, Wood backWood, Wood topWood) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.model = model;
        this.builder = builder;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public double getPrice() {
        return price;
    }

    public String getModel() {
        return model;
    }

    public Builder getBuilder() {
        return builder;
    }

    public Type getType() {
        return type;
    }
    public Wood getBackWood() {
        return backWood;
    }

    public Wood getTopWood() {
        return topWood;
    }
}
