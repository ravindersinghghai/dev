
package com.ecommerce.shopping;

/**
 * Created by Ravinder Ghai on 9/3/17.
 */
public class Tour {

    private String id;
    private String name;
    private double price;

    public Tour(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tour)) return false;

        Tour tour = (Tour) o;

        if (getPrice() != tour.getPrice()) return false;
        if (!getId().equals(tour.getId())) return false;
        return getName().equals(tour.getName());
    }

    @Override
    public int hashCode() {
        double result = getId().hashCode();
        result = 31 * result + getName().hashCode();
        result = 31 * result + getPrice();
        return (int)result;
    }

    @Override
    public String toString() {
        return "Tour{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
