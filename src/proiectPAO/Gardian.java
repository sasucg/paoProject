package proiectPAO;

public final class Gardian extends Angajat{


    public Gardian(){
        this.studiiSuperioare = false;
    }

    public Gardian(String prenumeAngajat, String numeAngajat, int salariuAngajat) {
        super(prenumeAngajat, numeAngajat);
        this.studiiSuperioare = false;
        this.warnings = 0;
        this.salariuAngajat = 2500;
    }

    protected void securityCheck(){
        if(Companie.isCritic == true)
            System.out.println("Securitatea a sunat la Politie! ");
    }

}
