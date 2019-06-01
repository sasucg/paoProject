package proiectPAO.People;

import proiectPAO.Angajat;

import java.util.*;

public class Companie {
    private static Companie firma123;

    private String adresa;
    private String numeCompanie;

    public static int numarAngajati = 0;
    static int numarPatroni = 0;
    static boolean isCritic;
    public static List<Angajat> listaAngajati = new ArrayList<Angajat>();
    public static List<Angajat> istoricAngajati = new ArrayList<Angajat>();


    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public String getNumeCompanie() {
        return numeCompanie;
    }



    public void setNumeCompanie(String numeCompanie) {
        this.numeCompanie = numeCompanie;
    }

    public static boolean isIsCritic() {
        return isCritic;
    }

    public static void setIsCritic(boolean isCritic) {
        Companie.isCritic = isCritic;
    }

    private Companie() {
        this.numeCompanie = "SCG SRL";
    }

    public static Companie getInstance()
    {
        if (firma123 == null){
            firma123 = new Companie();
        }
        return firma123;
    }
}
