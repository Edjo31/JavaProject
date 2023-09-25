package org.example.data;



import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;
import  java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;


public class Select {

    public void select() {

        Conexion conexion =new Conexion();
        String Query="Select *from country";


        try{

        PreparedStatement statement =conexion.connect().prepareStatement(Query);
        ResultSet resultSet =statement.executeQuery();
        ResultSetMetaData metaData=statement.getMetaData();
        int ColumnCount=metaData.getColumnCount();
        Vector<String> columName=new Vector<>();

        for(int i=1;i<ColumnCount;i++){
            columName.add(metaData.getColumnName(i));
        }

        Vector <Vector<Object>> data =new Vector<>();

        while (resultSet.next()){
            Vector<Object> rowData =new Vector<>();
            for(int i=1;i<ColumnCount;i++){
                rowData.add(resultSet.getObject(i));
            }
            data.add(rowData);
        }

     DefaultTableModel tableModel =new DefaultTableModel(data,columName);

        JTable table =new JTable(tableModel);

        JFrame frame =new JFrame("prueba");
        frame.add(new JScrollPane(table));

        frame.setSize(600,600);
            frame.setVisible(true);
        }
        catch (SQLException e){
            e.printStackTrace();
        }

    }

}