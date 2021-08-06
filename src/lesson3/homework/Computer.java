package lesson3.homework;

import lesson3.homework.annotations.ProductProvider;

import java.util.Objects;


@ProductProvider(country = "USA", lifeTime = 5, parts = {"monitor", "mouse", "keyboard", "system unit"})
public class Computer extends Product{
    private String processor;
    private Integer RAM;
    private String graphicsCard;

    public Computer(String name, double price, Integer quantity, String processor, Integer RAM, String graphicsCard) {
        super(name, price, quantity);
        this.processor = processor;
        this.RAM = RAM;
        this.graphicsCard = graphicsCard;
    }

    public Computer() {
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public Integer getRAM() {
        return RAM;
    }

    public void setRAM(Integer RAM) {
        this.RAM = RAM;
    }

    public String getGraphicsCard() {
        return graphicsCard;
    }

    public void setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    @Override
    protected double discount() {
        if (getQuantity() > 1){
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
        Computer computer = (Computer) o;
        return Objects.equals(processor, computer.processor) && Objects.equals(RAM, computer.RAM) && Objects.equals(graphicsCard, computer.graphicsCard);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), processor, RAM, graphicsCard);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Computer{");
        sb.append("processor='").append(processor).append('\'');
        sb.append(", RAM=").append(RAM);
        sb.append(", graphicsCard='").append(graphicsCard).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", price=").append(price);
        sb.append(", quantity=").append(quantity);
        sb.append('}');
        return sb.toString();
    }
}
