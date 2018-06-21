package com.company.piz;

import java.util.List;

public abstract class Pizza {
    public abstract PizzaType getType();
    public abstract String getSize();
    public abstract double getCena();
    public abstract int getOstrosc();
    public abstract List<String> getSkladniki();
}
