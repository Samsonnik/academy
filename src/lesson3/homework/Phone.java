package lesson3.homework;

import java.math.BigDecimal;
import java.util.Objects;

public class Phone extends Product{
    private String OS;
    private String screenResolution;
    private Integer batteryCapacity;

    public Phone(String name, double price, Integer quantity, String OS, String screenResolution, Integer batteryCapacity) {
        super(name, price, quantity);
        this.OS = OS;
        this.screenResolution = screenResolution;
        this.batteryCapacity = batteryCapacity;
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public String getScreenResolution() {
        return screenResolution;
    }

    public void setScreenResolution(String screenResolution) {
        this.screenResolution = screenResolution;
    }

    public Integer getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(Integer batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    protected double discount() {
        if (getOS().equalsIgnoreCase("Android")){
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
        Phone phone = (Phone) o;
        return Objects.equals(OS, phone.OS) && Objects.equals(screenResolution, phone.screenResolution) && Objects.equals(batteryCapacity, phone.batteryCapacity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), OS, screenResolution, batteryCapacity);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Phone{");
        sb.append("OS='").append(OS).append('\'');
        sb.append(", screenResolution='").append(screenResolution).append('\'');
        sb.append(", batteryCapacity=").append(batteryCapacity);
        sb.append(", name='").append(name).append('\'');
        sb.append(", price=").append(price);
        sb.append(", quantity=").append(quantity);
        sb.append('}');
        return sb.toString();
    }
}
