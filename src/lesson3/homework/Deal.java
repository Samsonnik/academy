package lesson3.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Objects;

public class Deal {

    private ArrayList<Product> products;
    private User seller;
    private User buyer;
    private Date dealDate;

    public Deal(ArrayList<Product> products, User seller, User buyer, Date dealDate) {
        this.products = products;
        this.seller = seller;
        this.buyer = buyer;
        this.dealDate = dealDate;
    }

    public Deal() {
    }

    public ArrayList<Product> getProducts() {
        return products;
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

    public Date getDealDate() {
        return dealDate;
    }

    public void setDealDate(Date dealDate) {
        this.dealDate = dealDate;
    }

    public double getFullPrice(ArrayList<Product> products){
        double fullPrice = 0;
        for (int i = 0; i < products.size(); i++) {
            fullPrice += products.get(i).averagePrice();
        }
        return fullPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Deal deal = (Deal) o;
        return Objects.equals(products, deal.products) && Objects.equals(seller, deal.seller) && Objects.equals(buyer, deal.buyer) && Objects.equals(dealDate, deal.dealDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(products, seller, buyer, dealDate);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Deal{");
        sb.append("products=").append(products);
        sb.append(", seller=").append(seller);
        sb.append(", buyer=").append(buyer);
        sb.append(", dealDate=").append(dealDate);
        sb.append('}');
        return sb.toString();
    }
}
