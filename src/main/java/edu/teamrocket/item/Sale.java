package edu.teamrocket.item;

public class Sale implements Offer{
    
    private String size;
    private Integer sale;

    public Sale(String size, Integer sale) {
        this.size = size;
        this.sale = sale;
    }

    @Override
    public int value () {
        return this.sale;
    }

    @Override
    public String size() {
        return this.size;
    }

    @Override
    public int compareTo(Offer offer) {
        return this.sale.compareTo(offer.value());
    }

    @Override
    public String toString() {
        return "\t\t" + size + "\t" + sale + "\n";
    }
}