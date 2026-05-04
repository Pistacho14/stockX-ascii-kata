package edu.teamrocket.item;

import java.util.List;

public interface Item {
    
    public void add(Offer offer);

    public List<Offer> offers();

    public int getBid();

    public void setBid(int bid);

    public int getAsk();

    public void setAsk(int ask);

    public void setSale(int sale);

    public int getSale();
}
