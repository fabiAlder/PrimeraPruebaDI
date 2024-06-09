/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package APP;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author fabian
 */
public class VentanaInicial extends JFrame implements ActionListener ,FocusListener{
    
    private JComboBox<Character> cuadroTIpo;
    private JTextField cuadroFilas, cuadroCol;
    private JButton botonSalir, botonMostrar;
    
    //Private VentanaImagenes ventanaImagenes;

   public VentanaInicial(){
       
       JLabel tipo = new JLabel("tipo");
       JLabel numFilas = new JLabel("filas");
       JLabel numcol = new JLabel("Columnas");
       cuadroTIpo = new JComboBox<>();
       botonSalir = new JButton("salir");
       botonMostrar = new JButton("mostrar");
       cuadroFilas = new JTextField(2);
       cuadroCol = new JTextField(2);
       
       cuadroTIpo.addItem('t');
       cuadroTIpo.addItem('i');
       
       JPanel jPanel = new JPanel();
                 
       jPanel.setLayout(new BoxLayout(jPanel, BoxLayout.Y_AXIS));
       
       jPanel.add(tipo);
       jPanel.add(cuadroTIpo);
       jPanel.add(numFilas);
       jPanel.add(cuadroFilas);
       jPanel.add(numcol);
       jPanel.add(cuadroCol);
       jPanel.add(botonMostrar);
       jPanel.add(botonSalir);
       
       botonMostrar.addActionListener(this);
       botonSalir.addActionListener(this);
       cuadroFilas.addFocusListener(this);
       cuadroCol.addActionListener(this);
       
       
       
       
       
       add(jPanel);
       setTitle("ventana inicial");
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           pack();
           setLocationRelativeTo(null);
            setVisible(true);
   }
    
    
    
    
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void focusGained(FocusEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void focusLost(FocusEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
