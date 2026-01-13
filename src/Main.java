import java.sql.Connection;
import java.sql.Date;

public class Main {

    public static void main(String[] args) {

        try {
            Connection conn = DBConnection.getConnection();
            System.out.println("Connected to PTMS database");

            PTMS2DAO dao = new PTMS2DAO(conn);

            // INSERT DATA
            dao.insertDepot("Central Depot", "Almaty");
            dao.insertDriver("Askar", 5);
            dao.insertRoute("A", "B", 15);
            dao.insertBus("25A", 50, 1);
            dao.insertCommuter("Ali", 1500);
            dao.insertTrip(1, 1, 1, Date.valueOf("2026-01-13"));
            dao.insertPayment(1, 1, 300);
            dao.insertInspector("Nurlan", "Morning");

            System.out.println("All data inserted successfully");

            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
