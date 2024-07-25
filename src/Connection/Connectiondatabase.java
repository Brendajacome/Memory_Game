
package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Connectiondatabase {

    String bd = "bg6cfvuhda9jpnz3solz";
    String driver = "com.mysql.cj.jdbc.Driver";
    String user = "u9rps9xmb71xhcyi";
    String pass = "wk9XHruJB82jmm7nziIx";
    String url = "jdbc:mysql://bg6cfvuhda9jpnz3solz-mysql.services.clever-cloud.com:3306/bg6cfvuhda9jpnz3solz";
    Connection link;

    public Connectiondatabase(String bd) {
        this.bd = bd;
    }

    public Connection connect() {
        try {
            Class.forName(driver);
            link = DriverManager.getConnection(url, user, pass);
            System.err.println("CONNECTION A DB " + bd);
        } catch (ClassNotFoundException | SQLException ex) {
            System.err.println("NO CONNECTION A DB " + bd);
            Logger.getLogger(Connectiondatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
        return link;
    }

    public void disconnect() {
        try {
            if (link != null && !link.isClosed()) {
                link.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(Connectiondatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void main(String[] args) {
        Connectiondatabase conexion = new Connectiondatabase("bg6cfvuhda9jpnz3solz");
        conexion.connect();
    }
}