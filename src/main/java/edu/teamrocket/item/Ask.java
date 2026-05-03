package edu.teamrocket.item;

public class Ask implements Offer {
    
    private String size;
    private Integer ask;

    public Ask(String size, Integer ask) {
        this.size = size;
        this.ask = ask;
    }

    @Override
    public int value () {
        return this.ask;
    }

    @Override
    public String size() {
        return this.size;
    }
}
