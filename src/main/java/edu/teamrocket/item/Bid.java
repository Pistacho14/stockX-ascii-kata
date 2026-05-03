package edu.teamrocket.item;

public class Bid implements Offer{
    
    private String size;
    private Integer bid;

    public Bid(String size, Integer bid) {
        this.size = size;
        this.bid = bid;
    }

    @Override
    public int value () {
        return this.bid;
    }

    @Override
    public String size() {
        return this.size;
    }
}
