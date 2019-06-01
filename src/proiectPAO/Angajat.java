package proiectPAO;

import Servicii.ServiciuScriereFisiere;
import proiectPAO.People.Companie;

public class Angajat implements Comparable<Angajat>{

    Companie c = Companie.getInstance();
    ServiciuScriereFisiere testServ = new ServiciuScriereFisiere();


    protected String prenumeAngajat;
    protected String numeAngajat;

    protected boolean studiiSuperioare;
    protected int salariuAngajat;
    protected int warnings;

    public Angajat(){
        Companie.numarAngajati ++;
        Companie.listaAngajati.add(this);
        this.salariuAngajat = 3000;
        this.warnings = 0;
        this.studiiSuperioare = true;
        testServ.scriereAudit("Constructor-Angajat-fara-parametrii");
    }

    public Angajat(String prenumeAngajat, String numeAngajat) {
        this.prenumeAngajat = prenumeAngajat;
        this.numeAngajat = numeAngajat;
        this.salariuAngajat = 3000;
        this.warnings = 0;
        Companie.numarAngajati ++;
        Companie.listaAngajati.add(this);
        testServ.scriereAudit("Constructor-Angajat-cu-parametrii");

    }


    public int getSalariuAngajat() {

        testServ.scriereAudit("get-Salariu-Angajat");
        return salariuAngajat;
    }


    public int getWarnings() {

        testServ.scriereAudit("get-warnings");
        return warnings;
    }

    public String getNumeAngajat() {
        testServ.scriereAudit("get-nume-angajat");
        return numeAngajat;
    }

    public String getPrenumeAngajat() {

        testServ.scriereAudit("get-prenume-angajat");
        return prenumeAngajat;
    }

    public boolean isStudiiSuperioare() {
        testServ.scriereAudit("check-studii-superioare");
        return studiiSuperioare;
    }



    public void setSalariuAngajat(int salariuAngajat) {

        testServ.scriereAudit("set-salariu-angajat");
        this.salariuAngajat = salariuAngajat;
    }

    public void setNumeAngajat(String nume) {
        testServ.scriereAudit("set-nume-angajat");
        this.numeAngajat = nume;
    }

    public void setPrenumeAngajat(String prenumeAngajat) {
        testServ.scriereAudit("set-prenume-angajat");
        this.prenumeAngajat = prenumeAngajat;
    }

    public void setStudiiSuperioare(boolean studiiSuperioare) {
        testServ.scriereAudit("set-studii-superioare");
        this.studiiSuperioare = studiiSuperioare;
    }

    public void changeCritic(){
        testServ.scriereAudit("stare-critica-turn");
        Companie.isCritic = true;
    } //Orice angajat poate apasa butonul de Panica





    @Override
    public String toString() {

        StringBuilder myBuild = new StringBuilder();
        myBuild.append('{' + numeAngajat + ' ' + prenumeAngajat + ':' + ' ' +
                "Companie=" + c.getNumeCompanie() +
                ", studiiSuperioare=" + studiiSuperioare +
                ", salariuAngajat=" + salariuAngajat +
                ", Avertismente= " + warnings + "/3"  +
                '}' );
        String help = new String(myBuild);
        return help;
    }


    @Override
    public int compareTo(Angajat a){
        if(this.salariuAngajat == a.salariuAngajat){
            return 0;
        }
        else if(this.salariuAngajat > a.salariuAngajat){
            return 1;
        }
            else return -1;
    }



}
