package hu.petrik;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    static List<Bejegyzes> bejegyzesLista = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Bejegyzes bejegyzes1 = new Bejegyzes("Lee","Igen, ez jó");
        Bejegyzes bejegyzes2 = new Bejegyzes("Pee","Nem jó");
	    bejegyzesLista.add(bejegyzes1);
	    bejegyzesLista.add(bejegyzes2);

        System.out.print("Kérek egy darabszámot: ");
        int darabszam = sc.nextInt();
        for (int i = 0; i < darabszam; i++) {
            Bejegyzes b = new Bejegyzes("Sz","Létrehozás");
            bejegyzesLista.add(b);
        }


    }


}
