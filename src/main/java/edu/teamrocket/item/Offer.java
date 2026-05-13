package edu.teamrocket.item;

public sealed interface Offer extends Comparable<Offer>
    permits Sale, Bid, Ask{

    public int value();

    public String size();

    public int compareTo(Offer offer);
}