package edu.teamrocket.item;

public interface Offer extends Comparable<Offer>{

    public int value();

    public String size();

    public int compareTo(Offer offer);
}