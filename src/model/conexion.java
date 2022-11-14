/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author USUARIO
 */
public class conexion {
    

    private static final String URL = "jdbc:mysql//localhost:3306/Modelo_Funcionarios";
    private static final String USUARIO = "root";
    private static final String PASSWORD = "";
    
    private Connection con;

    public conexion() {
        try{
        con = DriverManager.getConnection(URL, USUARIO, PASSWORD);
        con.createStatement();
        }catch (SQLException ex){
            System.err.println(ex.getMessage());
            }
    }
    
    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }
}
