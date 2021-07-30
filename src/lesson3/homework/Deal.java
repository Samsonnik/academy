package lesson3.homework;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;

public class Deal {

    private ArrayList<Product> products;
    private User seller;
    private User buyer;
    private LocalDate dealDate;
    private LocalDate dealDeadLine;

    public Deal(ArrayList<Product> products, User seller, User buyer, LocalDate dealDate) {
        this.products = products;
        this.seller = seller;
        this.buyer = buyer;
        this.dealDate = dealDate;
    }

    public Deal() {
    }

    public void dealAdd(Product product){
        products.add(product);
    }

    public void dealDelete(String productName){
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getName().equalsIgnoreCase(productName)){
                products.remove(products.get(i));
            }
        }
    }

    public void getDealInfo() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Deal date: ").append(getDealDate());
        System.out.println(stringBuilder);
        stringBuilder.setLength(0);
        stringBuilder.append("Dead line: ").append(getDealDeadLine());
        System.out.println(stringBuilder);
        System.out.printf("%-15s%-15s%-15s%-15s%-11s%n", "Products", "Category", "Quantity", "Price", "Average Price (with discount)");
        System.out.println("_________________________________________________________________________________________");
        for (Product product: products){
            System.out.printf("%-15s%-15s%-15s%-15s%-11s%n", product.getName(), product.getClass().getSimpleName(),
                    product.getQuantity(), product.getPrice(), product.averagePrice());
        }
        System.out.println("_________________________________________________________________________________________");
        System.out.printf("Deal full price: %-43s%.1f", " ", getFullPrice());

    }

    public LocalDate getDealDeadLine(){
        dealDeadLine = dealDate;
        return dealDeadLine.plusDays(10);
    }

    public double getFullPrice(){
        double fullPrice = 0;
        for (Product product : products) {
            fullPrice += product.averagePrice();
        }
        return fullPrice;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public User getSeller() {
        return seller;
    }

    public void setSeller(User seller) {
        this.seller = seller;
    }

    public User getBuyer() {
        return buyer;
    }

    public void setBuyer(User buyer) {
        this.buyer = buyer;
    }

    public LocalDate getDealDate() {
        return dealDate;
    }

    public void setDealDate(LocalDate dealDate) {
        this.dealDate = dealDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Deal deal = (Deal) o;
        return Objects.equals(products, deal.products) && Objects.equals(seller, deal.seller) && Objects.equals(buyer, deal.buyer) && Objects.equals(dealDate, deal.dealDate) && Objects.equals(dealDeadLine, deal.dealDeadLine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(products, seller, buyer, dealDate, dealDeadLine);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Deal{");
        sb.append("products=").append(products);
        sb.append(", seller=").append(seller);
        sb.append(", buyer=").append(buyer);
        sb.append(", dealDate=").append(dealDate);
        sb.append(", dealDeadLine=").append(dealDeadLine);
        sb.append('}');
        return sb.toString();
    }
}
