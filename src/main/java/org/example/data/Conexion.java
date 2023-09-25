package org.example.data;

import java.sql.Connection;
import java.sql.DriverManager;
import  java.sql.SQLException;
public class Conexion {

    public Connection connect() throws SQLException{
        String url="jdbc:mysql://localhost:3306/world?useSSL=false&serverTimezone=UTC";
        String user="root";
        String passwd="1234";

        return DriverManager.getConnection(url,user,passwd);
    }

 }


