package proiectPAO.People;

import proiectPAO.Angajat;
import proiectPAO.People.Companie;

public final class Gardian extends Angajat {


    public Gardian(){

        testServ.scriereAudit("constructor-gardian-fara-parametrii");
        this.studiiSuperioare = false;
    }

    public Gardian(String prenumeAngajat, String numeAngajat, int salariuAngajat) {
        super(prenumeAngajat, numeAngajat);
        testServ.scriereAudit("constructor-gardian-cu-parametrii");
        this.studiiSuperioare = false;
        this.warnings = 0;
        this.salariuAngajat = 2500;
    }

    protected void securityCheck(){
        if(Companie.isCritic == true)
            System.out.println("Securitatea a sunat la Politie! ");
    }

}
