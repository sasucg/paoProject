package proiectPAO;

public final class FemeieServici extends Angajat{


    public FemeieServici(String prenumeAngajat, String numeAngajat) {
        super(prenumeAngajat, numeAngajat);
        this.studiiSuperioare = false;
        this.salariuAngajat = 2000;
    }

    public FemeieServici(){
        this.studiiSuperioare = false;
        this.salariuAngajat = 2000;
    }


    protected void spalaGeamuri(){
        System.out.println("Spala Geamuri");
    }

    protected void spalaPeJos(){
        System.out.println("Spala pe jos");
    }

}
