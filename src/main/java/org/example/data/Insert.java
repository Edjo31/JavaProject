package org.example.data;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert extends JFrame{
    private JTextField nombre;
    private JTextField edad;
    private JLabel label;
    private JButton btnAgregar;
    public void  insert(){
    nombre=new JTextField(20);

    edad =new JTextField(20);
    btnAgregar=new JButton("Insertar");

    setTitle("La vida no vale nada");
    setSize(600,600);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        add(panel);

        panel.add(new JLabel("Nombre:"));
        panel.add(nombre);
        panel.add(new JLabel("Edad:"));
        panel.add(edad);
        panel.add(btnAgregar);

        label=new JLabel();
        panel.add(label);


        btnAgregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name=nombre.getText();
                String age=edad.getText();
                InsertStudent insertStudent =new InsertStudent(name,age);
                insertStudent.insertStudent();



            }
        });





        setVisible(true);

    }
}
