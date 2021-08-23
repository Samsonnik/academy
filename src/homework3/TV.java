package homework3;

import java.util.Objects;

public class TV extends Product{
    private String manufacturer;
    private double diagonal;
    private boolean smartTv;

    public TV(String name, double price, Integer quantity, String manufacturer, double diagonal, boolean smartTv) {
        super(name, price, quantity);
        this.manufacturer = manufacturer;
        this.diagonal = diagonal;
        this.smartTv = smartTv;
    }

    public TV() {
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }

    public boolean isSmartTv() {
        return smartTv;
    }

    public void setSmartTv(boolean smartTv) {
        this.smartTv = smartTv;
    }

    @Override
    protected double discount() {
        if (getPrice() > 10_000) {
            return 0.2;
        }
        else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        TV tv = (TV) o;
        return Double.compare(tv.diagonal, diagonal) == 0 && smartTv == tv.smartTv && Objects.equals(manufacturer, tv.manufacturer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), manufacturer, diagonal, smartTv);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("TV{");
        sb.append("name='").append(name).append('\'');
        sb.append(", price=").append(price);
        sb.append(", quantity=").append(quantity);
        sb.append(", manufacturer='").append(manufacturer).append('\'');
        sb.append(", diagonal=").append(diagonal);
        sb.append(", smartTv=").append(smartTv);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(Product product) {
        return getName().compareTo(product.getName());
    }
}
