package edu.teamrocket.item;

public class Sale implements Offer{
    
    private String size;
    private Integer sale;

    public Sale(String size, Integer sale) {
        this.size = size;
        this.sale = sale;
    }    
}