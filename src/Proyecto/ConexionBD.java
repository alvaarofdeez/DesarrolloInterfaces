package Proyecto;

import java.sql.*;
import javax.swing.*;

public class ConexionBD {

    public Connection conect;
    public Statement sentencia;
    public ResultSet resultado;

    public Connection conexion() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conect = DriverManager.getConnection("jdbc:mysql://localhost:3306/desarrollointerfaces", "root", "root");
            sentencia = conect.createStatement();
        } catch (ClassNotFoundException | SQLException e) {

            JOptionPane.showMessageDialog(null, "Error " + e);
        }
        return conect;
    }
}