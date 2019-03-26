package proiectPAO;

public class angajatServiceImplements implements angajatService {

    @Override
    public void afiseazaNumeAngajat(Angajat a) {
        System.out.println(a.getNumeAngajat());
    }

    @Override
    public void afiseazaPrenumeAngajat(Angajat a){
        System.out.println(a.getPrenumeAngajat());
    }

    @Override
    public void afiseazaStudiiSuperioare(Angajat a){
        if(a.studiiSuperioare == true )
            System.out.println("Angajatul are studii superioare");
        else
            System.out.println("Angajatul nu are studii superioare");
    }
}
