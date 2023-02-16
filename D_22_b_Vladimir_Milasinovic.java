package DomaciOOP5;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
// Napraviti klasu Namirnica. Ona ima atribute za naziv i cenu. Dodati konstuktor i get metode za ovu klasu.
//Zatim napraviti klasu Korpa. Unutar korpe imamo listu namirnica.
//Osim konstuktora definisati:
//- metoda int suma(ArrayList<Namirnica> lista) - vraca ukupnu cenu svih namirnica iz korpe.
//- metoda boolean nalaziSe(Namirnica n) - vraca true ukoliko se neka namirnica nalazi u korpi.
//- metoda stampaj() - istampace sve namirnice iz liste.
//U glavnoj klasi napraviti listu namirnica koju cete proslediti konstruktoru klase Korpa.
        ArrayList<Namirnica> listaNamirnica = new ArrayList<>();
        Namirnica namirnica = new Namirnica("hleb", 55);
        Namirnica namirnica1 = new Namirnica("mleko", 110);
        Namirnica namirnica2 = new Namirnica("jogurt", 120);
        Namirnica namirnica3 = new Namirnica("eurokrem", 140);
listaNamirnica.add(namirnica);
listaNamirnica.add(namirnica1);
listaNamirnica.add(namirnica2);
listaNamirnica.add(namirnica3);

Korpa k1 = new Korpa(listaNamirnica);

Namirnica namirnicaZaProveru = new Namirnica("jogurt", 120);
 k1.nalaziSe(namirnicaZaProveru);
       k1.stampaj();
    }
}
