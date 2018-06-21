package com.company.piz;

import java.util.Scanner;

public class Klient {
    private String imie;
    private String nazwisko;
    private String tel;
    private boolean dowoz;
    private String adres;

    Scanner scanner = new Scanner(System.in);

    public boolean isDowoz() {
        return dowoz;
    }

    public Klient() {
        System.out.print("Czy ma być opcja dowozu? (T/N)? ");
        dowoz = (scanner.nextLine().toUpperCase().equals("T")) ? true : false;
        System.out.print("Imie: ");
        imie = scanner.nextLine();
        System.out.print("Nazwisko: ");
        nazwisko = scanner.nextLine();
        System.out.print("Nr. telefonu: ");
        tel = scanner.nextLine();
        if (dowoz) {
            System.out.print("Adres: ");
            adres = scanner.nextLine();
        }
        System.out.println();
    }


}
