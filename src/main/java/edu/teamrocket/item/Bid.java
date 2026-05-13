package edu.teamrocket.item;

public final record Bid(String size, Integer bid) implements Offer{

    @Override
    public int value () {
        return bid;
    }

    @Override
    public String size() {
        return size;
    }

    @Override
    public int compareTo(Offer offer) {
        return bid.compareTo(offer.value());
    }

    @Override
    public String toString() {
        return "\t\t" + size + "\t" + bid + "\n";
    }
}
