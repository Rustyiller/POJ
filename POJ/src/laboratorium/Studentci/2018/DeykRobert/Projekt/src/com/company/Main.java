package com.company;
import com.company.piz.*;


public class Main {

    public static void main(String[] args) {
        PizzaFactory fabryka = new PizzaFactory();
        Zamowienie zamowienie = new Zamowienie();
        Menu menu = new Menu(fabryka,zamowienie);

        menu.Witaj();
    }
}
