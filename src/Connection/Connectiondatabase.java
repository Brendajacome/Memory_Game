/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Connectiondatabase {

    String bd = "scores";
    String driver = "com.mysql.cj.jdbc.Driver";
    String user = "root";
    String pass = "Bb1605***";
    String url = "jdbc:mysql://localhost:3306/";
    Connection link;

    public Connectiondatabase(String bd) {
        this.bd=bd;
    }


    public Connection connect() {
        try {
            Class.forName(driver);
            link = DriverManager.getConnection(url + bd, user, pass);
            System.err.println("CONNECTION A DB " + bd);
        } catch (ClassNotFoundException | SQLException ex) {
             System.err.println("NO CONNECTION A DB " + bd);
            Logger.getLogger(Connectiondatabase.class.getName()).log(Level.SEVERE, null, ex);
           
        }
        return link;
    }
    
    public  void disconnect()  {
        try {
            link.close();
        } catch (SQLException ex) {
            Logger.getLogger(Connectiondatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void main(String[] args) {
        Connectiondatabase conexion =new Connectiondatabase("scores");
        conexion.connect();
    }

}
