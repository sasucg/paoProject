package proiectPAO;

public class Patron{

    private String numePatron;
    private String prenumePatron;
    private int salariuPatron;


    public String getNumePatron() {
        return numePatron;
    }

    public void setNumePatron(String numePatron) {
        this.numePatron = numePatron;
    }

    public String getPrenumePatron() {
        return prenumePatron;
    }

    public void setPrenumePatron(String prenumePatron) {
        this.prenumePatron = prenumePatron;
    }

    public int getSalariuPatron() {
        return salariuPatron;
    }

    public void setSalariuPatron(int salariuPatron) {
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
    }

    public void scadeSalariu(Angajat a, int suma){
        a.salariuAngajat -= suma;

    }

    public void cresteSalariu(Angajat a, int suma){
        a.salariuAngajat += suma;
    }

    public void concediereAngajat(Angajat a){
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

    @Override
    public String toString() {

        StringBuilder myBuild = new StringBuilder();
        myBuild.append('{' + numePatron + ' ' + prenumePatron + ':' + ' ' +
                " salariuPatron=" + salariuPatron +
                '}' );
        String help = new String(myBuild);
        return help;
    }

    public void giveWarning(Angajat a){
        a.warnings += 1;
        if(a.warnings == 3)
            this.concediereAngajat(a);
    }
}
