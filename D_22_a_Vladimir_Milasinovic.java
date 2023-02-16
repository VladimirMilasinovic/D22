package DomaciOOP5;

import java.util.ArrayList;

public class Korpa {
    ArrayList<Namirnica> listaNamirnica;
    int suma = 0;

    public Korpa(ArrayList<Namirnica> listaNamirnica) {
        this.listaNamirnica = listaNamirnica;
    }

    public int suma(ArrayList<Namirnica> lista) {
        for (int i = 0; i < lista.size(); i++) {
            suma = suma + lista.get(i).getCena();

        }
        return suma;

    }

    public boolean nalaziSe(Namirnica n) {
        for (int i = 0; i < listaNamirnica.size(); i++) {
            if (listaNamirnica.get(i).getCena() == n.getCena() && listaNamirnica.get(i).getNaziv().equals(n.getNaziv())) {
                return true;
            }
        }
        return false;
    }

    public void stampaj(){

        for (int i = 0; i< listaNamirnica.size();i++){
            System.out.println("Naziv namirnice je:");
            System.out.println(listaNamirnica.get(i).getNaziv());
            System.out.println("Cena namirnice je: ");
            System.out.println(listaNamirnica.get(i).getCena());
        }
    }
}



