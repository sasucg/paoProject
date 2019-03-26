package proiectPAO;

public class Angajat implements Comparable<Angajat>{

    Companie c = Companie.getInstance();

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
    }

    public Angajat(String prenumeAngajat, String numeAngajat) {
        this.prenumeAngajat = prenumeAngajat;
        this.numeAngajat = numeAngajat;
        this.salariuAngajat = 3000;
        this.warnings = 0;
        Companie.numarAngajati ++;
        Companie.listaAngajati.add(this);

    }


    public int getSalariuAngajat() {
        return salariuAngajat;
    }

    public int getWarnings() {
        return warnings;
    }

    public void setSalariuAngajat(int salariuAngajat) {
        this.salariuAngajat = salariuAngajat;
    }

    public void setNumeAngajat(String nume) {
        this.numeAngajat = nume;
    }

    public void setPrenumeAngajat(String prenumeAngajat) {
        this.prenumeAngajat = prenumeAngajat;
    }





    public void changeCritic(){
        Companie.isCritic = true;
    } //Orice angajat poate apasa butonul de Panica





    @Override
    public String toString() {

        StringBuilder myBuild = new StringBuilder();
        myBuild.append('{' + numeAngajat + ' ' + prenumeAngajat + ':' + ' ' +
                "Companie=" + c.getNumeCompanie() +
                ", studiiSuperioare=" + studiiSuperioare +
                ", salariuAngajat=" + salariuAngajat +
                '}');
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


    public String getNumeAngajat() {
        return numeAngajat;
    }

    public String getPrenumeAngajat() {
        return prenumeAngajat;
    }

    public boolean isStudiiSuperioare() {
        return studiiSuperioare;
    }
}
