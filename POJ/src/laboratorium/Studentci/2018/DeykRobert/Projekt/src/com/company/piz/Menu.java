package com.company.piz;

import java.util.Scanner;

import static com.company.piz.PizzaSize.DUZA;
import static com.company.piz.PizzaSize.MALA;
import static com.company.piz.PizzaSize.SREDNIA;

public class Menu {
    private PizzaFactory fabryka;
    private Zamowienie zamowienie;

    public Menu(PizzaFactory fabryka, Zamowienie zamowienie) {
        this.fabryka = fabryka;
        this.zamowienie = zamowienie;
    }

    private void zamowPizze(PizzaType type,PizzaSize size){
        Pizza pizza;
        pizza = fabryka.createPizza(type,size);
        zamowienie.dodajPizze(pizza);
    }
    public void Witaj(){
        PizzaType type = null;
        PizzaSize size = null;
        int typ = 0, end = 0, rozmiar = 0, test=0;

        Scanner scanner = new Scanner(System.in);


        System.out.println("Oferowane Pizze: ");
        System.out.println(fabryka.createPizza(PizzaType.WEGETARIA?SKA,MALA) + "\n   Ma?a " + fabryka.createPizza(PizzaType.WEGETARIA?SKA,MALA).getCena() + "z? ?rednia " + fabryka.createPizza(PizzaType.WEGETARIA?SKA,SREDNIA).getCena()+ "z? Du?a " + fabryka.createPizza(PizzaType.WEGETARIA?SKA,DUZA).getCena()+"z?");
        System.out.println(fabryka.createPizza(PizzaType.PEPPERONI, MALA) + "\n   Ma?a " + fabryka.createPizza(PizzaType.PEPPERONI,MALA).getCena() + "z? ?rednia " + fabryka.createPizza(PizzaType.PEPPERONI,SREDNIA).getCena()+ "z? Du?a " + fabryka.createPizza(PizzaType.PEPPERONI,DUZA).getCena()+"z?");
        System.out.println(fabryka.createPizza(PizzaType.CAPRICCIOSA, MALA)+ "\n   Ma?a " + fabryka.createPizza(PizzaType.CAPRICCIOSA,MALA).getCena() + "z? ?rednia " + fabryka.createPizza(PizzaType.CAPRICCIOSA,SREDNIA).getCena()+ "z? Du?a " + fabryka.createPizza(PizzaType.CAPRICCIOSA,DUZA).getCena()+"z?");
        do
        {
            do {


                System.out.println();
                System.out.println("Wybierz pizz?:");
                System.out.println("[1] Wegetaria?ska");
                System.out.println("[2] Pepperoni");
                System.out.println("[3] Capriciosa");
                while (!scanner.hasNextInt()) {
                    System.out.print("Wpisz cyfr?, aby wybra? pizz?: ");
                    scanner.next();
                }
                typ = scanner.nextInt();
                switch (typ) {
                    case 1:
                        type = PizzaType.WEGETARIA?SKA;
                        break;
                    case 2:
                        type = PizzaType.PEPPERONI;
                        break;
                    case 3:
                        type = PizzaType.CAPRICCIOSA;
                        break;
                }
                System.out.println("Wybierz rozmiar pizzy:");
                System.out.println("[1] Ma?a");
                System.out.println("[2] ?rednia");
                System.out.println("[3] Du?a");

                rozmiar = scanner.nextInt();
                switch (rozmiar) {
                    case 1:
                        size = MALA;
                        break;
                    case 2:
                        size = PizzaSize.SREDNIA;
                        break;
                    case 3:
                        size = PizzaSize.DUZA;
                        break;
                }

                zamowPizze(type, size);

                System.out.println("Czy zamówi? jeszcze jedn? Pizz??");
                System.out.println("[1] Tak");
                System.out.println("[2] Nie");
                test = scanner.nextInt();
            }while(test==1);
            Klient klient = new Klient();
            if (klient.isDowoz()) zamowienie.setDowoz();
            break;
        }while (end == 1);

        zamowienie.rachunek();

        System.out.println("Zapraszamy ponownie do skorzystania z naszych us?ug!");
        scanner.close();
    }
}
