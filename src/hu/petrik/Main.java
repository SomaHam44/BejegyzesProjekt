package hu.petrik;

import java.util.ArrayList;
import java.util.List;


public class Main {
    static List<Bejegyzes> bejegyzesLista = new ArrayList<>();

    public static void main(String[] args) {
        Bejegyzes bejegyzes1 = new Bejegyzes("Lee","Igen, ez jó");
        Bejegyzes bejegyzes2 = new Bejegyzes("Pee","Nem jó");
	    bejegyzesLista.add(bejegyzes1);
	    bejegyzesLista.add(bejegyzes2);
    }
}
