package Order;

public interface Beverage {
    public TaxCategory getTaxCategory();
    public float getPrice();
    public String getName();
    public String getDisplayName();
}
