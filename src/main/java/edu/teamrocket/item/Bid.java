package edu.teamrocket.item;

public class Bid implements Offer{
    
    private String size;
    private Integer bid;

    public Bid(String size, Integer bid) {
        this.size = size;
        this.bid = bid;
    }    
}
