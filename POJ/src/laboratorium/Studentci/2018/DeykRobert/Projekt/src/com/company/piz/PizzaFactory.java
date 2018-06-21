package com.company.piz;
import com.company.piz.Skladnik.*;

import java.util.ArrayList;
import java.util.List;


public class PizzaFactory {
    public static Pizza createPizza(PizzaType type,PizzaSize zzz){
        Pizza pizza = null;
        double Cena =0;
        int Ostrosc;
        List<String> Skladniki = new ArrayList<String>();
        switch(type){
            case WEGETARIAÑSKA:
                 Ostrosc = 0;
                 Skladniki.add(String.valueOf(new Sos()));
                 Skladniki.add(String.valueOf(new Pomidor()));
                 Skladniki.add(String.valueOf(new Papryka()));
                 Skladniki.add(String.valueOf(new Ser()));

                pizza = new Wege(type,zzz,Cena,Ostrosc,Skladniki);
                break;
            case PEPPERONI:

                Ostrosc = 5;
                Skladniki.add(String.valueOf(new Sos()));
                Skladniki.add(String.valueOf(new Ser()));
                Skladniki.add(String.valueOf(new Salami()));
                Skladniki.add(String.valueOf(new Paprykaostra()));
                Skladniki.add(String.valueOf(new Cebula()));

                pizza = new Pepperoni(type,zzz,Cena,Ostrosc,Skladniki);
                break;
            case CAPRICCIOSA:

                Ostrosc = 1;
                Skladniki.add(String.valueOf(new Sos()));
                Skladniki.add(String.valueOf(new Szynka()));
                Skladniki.add(String.valueOf(new Pieczarki()));

                pizza = new Capricciosa(type,zzz,Cena,Ostrosc,Skladniki);
                break;
        }
        return pizza;
    }
}
