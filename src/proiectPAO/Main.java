package proiectPAO;

import java.util.Collections;

public class Main {
    public static void main(String[] args) {

    Angajat a = new Angajat();
    angajatServiceImplements Servicii = new angajatServiceImplements();

    a.setNumeAngajat("Sasu Catalin Gabriel");
    Servicii.afiseazaNumeAngajat(a);
    a.setPrenumeAngajat("Niqusor");
    Servicii.afiseazaPrenumeAngajat(a);

    FemeieServici f = new FemeieServici();
    f.setNumeAngajat("Mariola");
    Servicii.afiseazaNumeAngajat(f);

    Servicii.afiseazaStudiiSuperioare(a);
    Servicii.afiseazaStudiiSuperioare(f);

    Gardian g = new Gardian();
    g.setPrenumeAngajat("Androne");
    System.out.println(g.getPrenumeAngajat());
    System.out.println(g.isStudiiSuperioare());
    System.out.println(a.isStudiiSuperioare());

    Collections.sort(Companie.listaAngajati);
    System.out.println(f);

    }


}
