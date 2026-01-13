import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {

    private static final String URL = "jdbc:postgresql://localhost:5432/PTMS";
    private static final String USER = "postgres";
    private static final String PASSWORD = "2008";

    public static void main(String[] args) {

        try {
            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Connected to database!");

            String insertBus = "INSERT INTO buses(route_number, capacity) VALUES (?, ?)";
            PreparedStatement psBus = conn.prepareStatement(insertBus);
            psBus.setString(1, "25A");
            psBus.setInt(2, 50);
            psBus.executeUpdate();
            System.out.println("Bus inserted");

            String insertCommuter =
                    "INSERT INTO commuters(name, card_balance) VALUES (?, ?)";
            PreparedStatement psCom = conn.prepareStatement(insertCommuter);
            psCom.setString(1, "Ali");
            psCom.setDouble(2, 1500);
            psCom.executeUpdate();
            System.out.println("Commuter inserted");

            System.out.println("\nBuses:");
            Statement st1 = conn.createStatement();
            ResultSet rs1 = st1.executeQuery("SELECT * FROM buses");

            while (rs1.next()) {
                System.out.println(
                        rs1.getInt("id") + " | " +
                                rs1.getString("route_number") + " | " +
                                rs1.getInt("capacity")
                );
            }

            System.out.println("\nCommuters:");
            Statement st2 = conn.createStatement();
            ResultSet rs2 = st2.executeQuery("SELECT * FROM commuters");

            while (rs2.next()) {
                System.out.println(
                        rs2.getInt("id") + " | " +
                                rs2.getString("name") + " | " +
                                rs2.getDouble("card_balance")
                );
            }

            String update =
                    "UPDATE commuters SET card_balance = ? WHERE id = ?";
            PreparedStatement psUp = conn.prepareStatement(update);
            psUp.setDouble(1, 2000);
            psUp.setInt(2, 1);
            psUp.executeUpdate();
            System.out.println("\nCommuter updated");

            String delete =
                    "DELETE FROM buses WHERE id = ?";
            PreparedStatement psDel = conn.prepareStatement(delete);
            psDel.setInt(1, 1);
            psDel.executeUpdate();
            System.out.println("Bus deleted");

            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
