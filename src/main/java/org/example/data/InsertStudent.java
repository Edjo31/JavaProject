package org.example.data;

import javax.management.Query;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertStudent
{
    private String name;
    private  String age;

    public InsertStudent(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public void insertStudent(){

        Conexion conexion =new Conexion();
        String Query="Insert into prueba (nombre,edad) values (?,?)";

        try{
        PreparedStatement statement =conexion.connect().prepareStatement(Query);
        statement.setString(1,name);
        statement.setString(2,age);
        statement.executeUpdate();

        }
        catch (SQLException e){
            e.printStackTrace();
        }

    }


}
