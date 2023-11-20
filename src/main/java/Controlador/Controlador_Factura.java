/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Modelo_Factura;
import Vista.Factura;
import Vista.Principal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;



/**
 *
 * @author SENA
 */
public class Controlador_Factura implements ActionListener {
    
    Factura fact = new Factura();
    Principal prin = new Principal();
    Modelo_Factura modfact = new Modelo_Factura();

    public Controlador_Factura() {
        fact.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        fact.addWindowListener(new WindowAdapter() {
            public void windowClosed(WindowEvent e) {
                ControladorPrincipal princi = new ControladorPrincipal();
                princi.iniciarPrincipal(0);
            }

        });
    }
     public void llenarFactura() {
        //   us.addWindowListener(l);
        prin.setVisible(false);
        fact.setLocationRelativeTo(null);
        fact.setVisible(true);
        
        
    


          if (e.getSource().equals(prin.getjBtnfactura())) {
            if (fact.getTxtprove().getText().isEmpty()|| fact.getjCBpago().getSelectedItem().equals("seleccionar")|| fact.getTxtusua().getText().isEmpty() || fact.getTxtDescuento().getText().isEmpty());
              JOptionPane.showMessageDialog(null, "falta de informacion");
     }
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}
