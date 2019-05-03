package proiectPAO;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Timestamp;

public class ServiciuScriereFisiere {
    public static void scriereAudit(String str)
    {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        Path p = Paths.get("./fisiereCSV/audit.csv");
        try (
                BufferedWriter out = Files.newBufferedWriter(p)) {
                out.write(str + " " + String.valueOf(timestamp) + "\n");
                out.newLine();

        } catch (
                IOException e) {
            System.out.println(":(");
        }
    }
}