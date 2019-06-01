package proiectPAO.People;

import proiectPAO.Angajat;

public final class FemeieServici extends Angajat {

    public FemeieServici(String prenumeAngajat, String numeAngajat) {
        super(prenumeAngajat, numeAngajat);
        this.studiiSuperioare = false;
        this.salariuAngajat = 2000;
        testServ.scriereAudit("constructor-femeie-servicii-cu-parametrii");
    }

    public FemeieServici(){
        this.studiiSuperioare = false;
        this.salariuAngajat = 2000;
        testServ.scriereAudit("constructor-femeie-servici-fara-parametrii");
    }


    protected void spalaGeamuri(){
        testServ.scriereAudit("spala-geamuri");
        System.out.println("Spala-geamuri");
    }

    protected void spalaPeJos(){
        testServ.scriereAudit("spala-pe-jos");
        System.out.println("Spala pe jos");
    }

}
