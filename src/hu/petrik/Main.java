package hu.petrik;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class Main {
    static List<Bejegyzes> bejegyzesLista = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    static Random rnd = new Random();

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

        fajlBeolvas("bejegyzesek.txt");


        for (Bejegyzes bejegyzes : bejegyzesLista){
            System.out.println(bejegyzes);
        }



    }

    public static void fajlBeolvas(String fajlNev) {
        try {
            FileReader fr = new FileReader(fajlNev);
            BufferedReader br = new BufferedReader(fr);
            String sor = br.readLine();
            while (sor != null){
                String[] adatok = sor.split(";");
                Bejegyzes bejegyzesek = new Bejegyzes(adatok[0],adatok[1]);
                bejegyzesLista.add(bejegyzesek);
                sor = br.readLine();
            }
            br.close();
            fr.close();


        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }

    }


}
