package Repository;

import proiectPAO.Angajat;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AngajatRepository {

    private String url = "jdbc:mysql://localhost/lab12";
    private String username = "user1";
    private String password = "12345";

    public void adaugaAngajat(Angajat p) {
        String  sql = "INSERT INTO Angajat VALUES (NULL, ?, ?)";
        try (
                Connection con = DriverManager.getConnection(url, username, password);
                PreparedStatement s = con.prepareStatement(sql);
        ) {
            s.setString(1, p.getNume());
            s.setDouble(2, p.getJob());
            s.executeUpdate(); // INSERT, UPDATE, DELETE
        } catch (Exception e) { // SQLException
            e.printStackTrace();
        }
    }

    public List<Angajat> findAngajat() {
        List<Angajat> list = new ArrayList<>();

        String sql = "SELECT * FROM Angajat";

        try (
                Connection con = DriverManager.getConnection(url, username, password);
                PreparedStatement s = con.prepareStatement(sql);
                ResultSet rs = s.executeQuery();
        ) {
            while (rs.next()) {
                int id = rs.getInt("id");
                String nume = rs.getString("nume");
                double pret = rs.getDouble("job");

                list.add(new Angajat(id, nume, job));
            }
        } catch (Exception e) { // SQLException
            e.printStackTrace();
        }

        return list;
    }

    public void stergeAngajat(Angajat p) {
        String sql = "DELETE FROM Angajat WHERE id = ?";

        try (
                Connection con = DriverManager.getConnection(url, username, password);
                PreparedStatement s = con.prepareStatement(sql);
        ) {
            s.setInt(1, p.getId());
            s.executeUpdate();
        } catch (Exception e) { // SQLException
            e.printStackTrace();
        }
    }
}
