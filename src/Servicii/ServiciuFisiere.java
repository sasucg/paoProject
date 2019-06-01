package Servicii;

import proiectPAO.Angajat;
import proiectPAO.People.FemeieServici;
import proiectPAO.People.Gardian;
import proiectPAO.People.Patron;

import java.io.*;
import java.util.List;

public class ServiciuFisiere {

    public static List<Gardian> citesteGardieni(List<Gardian> gardieni) {
        gardieni.add(new Gardian());
        gardieni.add(new Gardian());
        gardieni.add(new Gardian());

        int i=0;

        try (InputStream in = new FileInputStream("./fisiereCSV/gardieni.csv");
             Reader reader = new InputStreamReader(in); // FileReader
             BufferedReader br = new BufferedReader(reader)) {

            String line1;
            line1 = br.readLine();
            while((line1 = br.readLine()) != null) {
                String[] valori = line1.split(",");


                gardieni.get(i).setPrenumeAngajat(valori[1]);
                gardieni.get(i).setNumeAngajat(valori[0]);
                gardieni.get(i).setSalariuAngajat(Integer.parseInt(valori[2]));

                i++;
            }
        } catch (IOException e) {
            System.out.println(":(");
        }
        System.out.println(gardieni);

        return gardieni;
    }


    public static List<FemeieServici> citesteFemei(List<FemeieServici> femeiideservici)
    {
        femeiideservici.add(new FemeieServici());
        femeiideservici.add(new FemeieServici());
        femeiideservici.add(new FemeieServici());
        int j = 0;

        try (InputStream in = new FileInputStream("./fisiereCSV/femeiservici.csv");
             Reader reader = new InputStreamReader(in); // FileReader
             BufferedReader br = new BufferedReader(reader)) {

            String line2;
            line2 = br.readLine();  //ignor prima linie
            while((line2 = br.readLine()) != null) {
                String[] valori = line2.split(",");

                femeiideservici.get(j).setPrenumeAngajat(valori[1]);
                femeiideservici.get(j).setNumeAngajat(valori[0]);
                femeiideservici.get(j).setSalariuAngajat(Integer.parseInt(valori[2]));

                j++;
            }

        } catch (IOException e) {
            System.out.println(":(");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("nu iar asta");
        }

        System.out.println(femeiideservici);


        return femeiideservici;

    }

    public static List<Patron> citestePatroni(List<Patron> patroni)
    {


        patroni.add(new Patron());
        patroni.add(new Patron());
        int t = 0;

        try (InputStream in = new FileInputStream("./fisiereCSV/patroni.csv");
             Reader reader = new InputStreamReader(in); // FileReader
             BufferedReader br = new BufferedReader(reader)) {

            String line3;
            line3 = br.readLine();  //ignor prima linie
            while((line3 = br.readLine()) != null) {
                String[] valori = line3.split(",");

                patroni.get(t).setNumePatron(valori[0]);
                patroni.get(t).setPrenumePatron(valori[1]);
                patroni.get(t).setSalariuPatron(Integer.parseInt(valori[2]));

                t++;
            }

        } catch (IOException e) {
            System.out.println(":(");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("nu iar asta");
        }

        System.out.println(patroni);

        return patroni;
    }



    public static List<Angajat> citesteAngajati(List<Angajat> angajats)
    {

        angajats.add(new Angajat());
        angajats.add(new Angajat());
        angajats.add(new Angajat());
        angajats.add(new Angajat());

        int k = 0;

        try (InputStream in = new FileInputStream("./fisiereCSV/angajati.csv");
             Reader reader = new InputStreamReader(in); // FileReader
             BufferedReader br = new BufferedReader(reader)) {

            String line4;
            line4 = br.readLine();

            while((line4 = br.readLine()) != null) {
                String[] valori = line4.split(",");

                angajats.get(k).setNumeAngajat(valori[0]);
                angajats.get(k).setPrenumeAngajat(valori[1]);
                if(Integer.parseInt(valori[2]) == 1)
                {
                    angajats.get(k).setStudiiSuperioare(true);
                }else
                {
                    angajats.get(k).setStudiiSuperioare(false);
                }
                angajats.get(k).setSalariuAngajat(Integer.parseInt(valori[3]));

                k++;
            }

        } catch (IOException e) {
            System.out.println(":(");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("nu iar asta");
        }

        System.out.println(angajats);
        return angajats;
    }

}
