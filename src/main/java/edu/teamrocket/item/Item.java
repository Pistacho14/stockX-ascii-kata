package edu.teamrocket.item;

import java.util.List;

public interface Item {
    
    public void add(Offer offer);

    public List<Offer> offer();

    public int getBid();

    public void setBid(int bid);

    public int getAsk();

    public void setAsk(int ask);
}
