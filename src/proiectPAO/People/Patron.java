package proiectPAO.People;

import Servicii.ServiciuScriereFisiere;
import proiectPAO.Angajat;
import proiectPAO.People.Companie;

public class Patron{

    ServiciuScriereFisiere testServ = new ServiciuScriereFisiere();


    private String numePatron;
    private String prenumePatron;
    private int salariuPatron;


    public String getNumePatron() {
        testServ.scriereAudit("get-nume-patron");
        return numePatron;

    }

    public void setNumePatron(String numePatron) {
        testServ.scriereAudit("set-nume-patron");
        this.numePatron = numePatron;
    }

    public String getPrenumePatron() {

        testServ.scriereAudit("get-prenume-patron");
        return prenumePatron;
    }

    public void setPrenumePatron(String prenumePatron) {
        testServ.scriereAudit("set-prenume-patron");
        this.prenumePatron = prenumePatron;
    }

    public int getSalariuPatron() {
        testServ.scriereAudit("get-salariu-patron");
        return salariuPatron;
    }

    public void setSalariuPatron(int salariuPatron) {
        testServ.scriereAudit("set-salariu-patron");
        this.salariuPatron = salariuPatron;
    }

    public Patron() {
        Companie.numarPatroni++;
    }

    public Patron(String numePatron, String prenumePatron, int salariuPatron) {
        this.numePatron = numePatron;
        this.prenumePatron = prenumePatron;
        this.salariuPatron = salariuPatron;
        Companie.numarPatroni ++;
        testServ.scriereAudit("constructor-patron-parametrii");
    }

    public void scadeSalariu(Angajat a, int suma){
        testServ.scriereAudit("scade-salariu");
        a.salariuAngajat -= suma;

    }

    public void cresteSalariu(Angajat a, int suma){
        testServ.scriereAudit("creste-salariu");
        a.salariuAngajat += suma;
    }

    public void concediereAngajat(Angajat a){
        testServ.scriereAudit("concediere-angajat");
        a = null;
        System.out.println("Angajat concediat");
        Companie.numarAngajati--;
        Companie.istoricAngajati.add(a);        //Il sterg din lista de angajati si-l bag in istoric
        Companie.listaAngajati.remove(a);       //In istoric sunt doar cei care au lucrat la companie
        /*SAU
        proiectPAO.Angajat b = new proiectPAO.Angajat();
        proiectPAO.Angajat a = b;
        a = null;
        */
    }

    public void giveWarning(Angajat a){
        testServ.scriereAudit("give-warning");
        a.warnings += 1;
        if(a.warnings == 3)
            this.concediereAngajat(a);
    }

    @Override
    public String toString() {

        StringBuilder myBuild = new StringBuilder();
        myBuild.append('{' + numePatron + ' ' + prenumePatron + ':' + ' ' +
                " salariuPatron=" + salariuPatron +
                '}' );
        String help = new String(myBuild);
        return help;
    }


}
