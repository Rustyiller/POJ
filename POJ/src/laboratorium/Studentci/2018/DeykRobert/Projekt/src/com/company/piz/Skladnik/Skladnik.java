package com.company.piz.Skladnik;

public abstract class Skladnik {
    public abstract String getSkladnik();

    @Override
    public String toString() {
        return getSkladnik();
    }
}
