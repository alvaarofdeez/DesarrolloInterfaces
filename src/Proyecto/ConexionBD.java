package Proyecto;

import java.sql.*;
import javax.swing.*;

public class ConexionBD {

    public Connection conect;
    public Statement sentencia;
    public ResultSet resultado;

    public Connection conexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conect = DriverManager.getConnection("jdbc:mysql://remotemysql.com/rsiScNBxOD", "rsiScNBxOD", "bOaa3kaW3a");
            sentencia = conect.createStatement();
        } catch (ClassNotFoundException | SQLException e) {

            JOptionPane.showMessageDialog(null, "Error " + e);
        }
        return conect;
    }
}