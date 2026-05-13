package edu.teamrocket.item;

public final record Sale(String size, Integer sale) implements Offer{

    @Override
    public int value() {
        return sale;
    }

    @Override
    public String size() {
        return size;
    }

    @Override
    public int compareTo(Offer offer) {
        return sale.compareTo(offer.value());
    }

    @Override
    public String toString() {
        return "\t\t" + size + "\t" + sale + "\n";
    }
}