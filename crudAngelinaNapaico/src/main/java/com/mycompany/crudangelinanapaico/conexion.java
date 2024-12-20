/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.crudangelinanapaico;

import java.sql.*;

public class conexion {

    String hostname = "db-persona.crday04vgglx.us-east-1.rds.amazonaws.com";
    String url = "jdbc:mysql://" + hostname + ":3306/db_persona?useSSL=false&serverTimezone=UTC";
    String user = "admin";
    String password = "ange61030797";

    Connection con;

    public conexion() {
        try {
            con = DriverManager.getConnection(url, user, password);
            System.out.println("Conexion exitosa");
        } catch (SQLException e) {
            System.out.println("ERROR clase Conexion " + e.getMessage());
        }
    }

    public Connection getConnection() {
        return con;
    }
}
