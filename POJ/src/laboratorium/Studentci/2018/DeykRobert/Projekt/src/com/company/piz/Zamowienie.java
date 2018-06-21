package com.company.piz;
import java.util.ArrayList;
import java.util.List;

public class Zamowienie {
    private List<Pizza> lista = new ArrayList<>();
    private double koszt = 0;
    private boolean dowoz = false;

    public void setDowoz(){
        dowoz = true;
    }
    public void dodajPizze(Pizza pizza){
        lista.add(pizza);
        koszt += pizza.getCena();
    }

    public void rachunek() {
        System.out.println("Rachunek za zamówienie");
        for(Pizza pizza: lista){
            System.out.println(pizza.getType() + " " + pizza.getSize() + ", " + pizza.getCena() + "zł.");
        }
        if (dowoz==true){
            System.out.println("Dodatkowy koszt dowozu +4zł");
            koszt+=4.0;
        }
        System.out.println("Łączny koszt " + koszt + "zł");
    }
}
