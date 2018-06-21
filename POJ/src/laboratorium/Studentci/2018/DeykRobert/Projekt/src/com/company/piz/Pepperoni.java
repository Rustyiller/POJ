package com.company.piz;

import java.util.ArrayList;
import java.util.List;

public class Pepperoni extends Pizza {
    private PizzaType nazwa;
    private PizzaSize size;
    private double Cena;
    private int Ostrosc;
    List<String> Skladniki;

    public Pepperoni(PizzaType type, PizzaSize zzz, double cena, int ostrosc, List<String> skladniki) {
        nazwa = type;
        size = zzz;
        Cena = cena;
        Ostrosc = ostrosc;
        Skladniki = skladniki;

    }

    @Override
    public PizzaType getType() {
        return nazwa;
    }

    @Override
    public String getSize() {
        switch(size)
        {
            case MALA: return "Mała";
            case SREDNIA: return "Średnia";
            case DUZA: return "Duża";
        }
        return "Zły rozmiar";
    }

    @Override
    public double getCena() {
        switch(size) {
            case MALA:
                Cena = 25.0;
                break;
            case SREDNIA:
                Cena = 30.0;
                break;
            case DUZA:
                Cena = 35.0;
                break;
        }
        return Cena;
    }

    @Override
    public int getOstrosc() {
        return Ostrosc;
    }

    @Override
    public List<String> getSkladniki() {
        return Skladniki;
    }



    @Override
    public String toString() {
        return  "   " + getType() +
                "   Skladniki = " + getSkladniki() +
                ", Ostrosc = " + getOstrosc();
    }
}
