package Controlador;


//import Modelo.ModeloUsuario;
import Vista.Nuevo_Cliente;
import Vista.Nuevo_usuario;
import Vista.Proveedor;
import Vista.Principal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


public class ControladorPrincipal implements ActionListener, ChangeListener{

    Proveedor nuev = new Proveedor();
    Nuevo_Cliente nue = new Nuevo_Cliente();
    Principal prin = new Principal();
    Nuevo_usuario us = new Nuevo_usuario();

    public ControladorPrincipal() {
        prin.getLblnuevo().addActionListener(this);
        prin.getLblNuevo().addActionListener(this);
        prin.getjBproveedorp().addActionListener(this);
        us.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        nue.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        nuev.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        prin.getJdprincipal().addChangeListener(this);
    }

    public void iniciarPrincipal() {
        prin.setLocationRelativeTo(null);
        prin.setTitle("Principal");
        prin.setVisible(true);
        prin.setTitle("principal panel| ventana");
        gestionpanel();
    }

    public void gestionpanel (){
        if (prin.getJdprincipal().getSelectedIndex()==0){
        
        }
        prin.getJdprincipal().addChangeListener(new ChangeListener(){
         @Override
         public void stateChanged(ChangeEvent e) {
        }
    
      });
   }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(prin.getLblnuevo())) {
            Controlador_usuario con = new Controlador_usuario();
            con.llenarcampos();
        }
        if (e.getSource().equals(prin.getLblNuevo())) {
            Controlador_Cliente con = new Controlador_Cliente();
            con.llenarcamposCliente();

        }
        if (e.getSource().equals(prin.getjBproveedorp())) {
            Controlador_proveedor con = new Controlador_proveedor();
            con.llenarproveedor();

         }
        
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        int seleccion= prin.getJdprincipal().getSelectedIndex();
        System.out.println("La pestaña esta en la posición "+seleccion);
//       if (seleccion==1){
//           ModeloUsuario modUsu = new ModeloUsuario();
//           modUsu.mostrarTablaUusario(prin.getUsuario(),"")
//       }
    }
}
   
    


