///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
package Controlador;

import Modelo.modelo_producto;
import Vista.Principal;
import Vista.Producto;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import javax.swing.JFrame;

public class Controlador_producto implements ActionListener {

    Producto prod = new Producto();
    Principal prin = new Principal();
    modelo_producto modprod = new modelo_producto();

    public Controlador_producto() {
        prin.getBtnimg().addActionListener(this);
        prin.getBtnguardar().addActionListener(this);
        prod.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        prod.addWindowListener(new WindowAdapter() {
            public void windowClosed(WindowEvent e) {
                ControladorPrincipal princ = new ControladorPrincipal();
                princ.iniciarPrincipal(0);
            }
        });
    }

    public void controlProducto() {
        prin.setVisible(false);
        prod.setLocationRelativeTo(null);
        prod.setTitle("Producto");
        prod.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource().equals(prin.getBtnimg())){
            modprod.buscarImagen();
            File file= new File(modprod.getRuta());
            String archivo= file.getName();//obtiene solo el nombre de la ruta
            prin.getTxtimg().setText(archivo);
        }
        if(e.getSource().equals(prin.getBtnguardar())){
            modprod.setNom(prin.getTxtnombre().getText());
            modprod.setDes(prin.getTxtPanel1().getText());
            modprod.setImagen(modprod.convertirImagen(modprod.getRuta()));
            modprod.insertarProducto();
        }

    }

}
