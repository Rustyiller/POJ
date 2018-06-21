package com.company.piz;

import java.util.ArrayList;
import java.util.List;

import static com.company.piz.PizzaSize.DUZA;
import static com.company.piz.PizzaSize.MALA;
import static com.company.piz.PizzaSize.SREDNIA;

public class Wege extends Pizza {
    private PizzaType nazwa;
    private PizzaSize size;
    private double Cena;
    private int Ostrosc;
    List<String> Skladniki;


    public Wege(PizzaType type, PizzaSize zzz, double cena, int ostrosc, List<String> skladniki) {
        nazwa = type;
        size = zzz;
        Cena = cena;
        Ostrosc = ostrosc;
        Skladniki = skladniki;

    }

    @Override
    public double getCena() {
        switch(size) {
            case MALA:
                Cena = 20.0;
                break;
            case SREDNIA:
                Cena = 25.0;
                break;
            case DUZA:
                Cena = 30.0;
                break;
        }
        return Cena;
    }

    @Override
    public PizzaType getType() {
        return nazwa    ;
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
