package edu.teamrocket.item;

public final record Ask(String size, Integer ask) implements Offer{

    @Override
    public int value () {
        return ask;
    }

    @Override
    public String size() {
        return size;
    }

    @Override
    public int compareTo(Offer offer) {
        return ask.compareTo(offer.value());
    }

    @Override
    public String toString() {
        return "\t\t" + size + "\t" + ask + "\n";
    }
}
