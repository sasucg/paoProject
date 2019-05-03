package proiectPAO;

import jdk.nashorn.internal.ir.WhileNode;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Main {
    public static void main(String[] args) {

//        List<Gardian> gardieni = new ArrayList<Gardian>();
//        ServiciuFisiere serv = new ServiciuFisiere();
//        serv.citesteGardieni(gardieni);
//
//
//        List<FemeieServici> femeiideservici = new ArrayList<FemeieServici>();
//        serv.citesteFemei(femeiideservici);
//
//
//        List<Patron> patroni = new ArrayList<Patron>();
//        serv.citestePatroni(patroni);
//
//        List<Angajat> angajats = new ArrayList<>();
//        serv.citesteAngajati(angajats);

        Angajat A = new Angajat();
        Angajat B = new Angajat("gigel", "marcel");
        B.getNumeAngajat();


    }
}