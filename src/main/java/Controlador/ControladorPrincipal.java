package Controlador;

// import Modelo.ModeloUsuario;
import Modelo.ModeloUsuario;
import Vista.Nuevo_Cliente;
import Vista.Nuevo_usuario;
import Vista.Proveedor;
import Vista.Principal;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author SENA
 */
public class ControladorPrincipal implements ActionListener, ChangeListener, DocumentListener {

    ModeloUsuario modusu = new ModeloUsuario();
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

    public void iniciarPrincipal(int valor) {
        prin.setLocationRelativeTo(null);
        prin.setTitle("Principal");
        prin.setVisible(true);
        prin.setTitle("principal panel| ventana");
        prin.setExtendedState(JFrame.MAXIMIZED_BOTH);
        prin.getJdprincipal().setSelectedIndex(valor);
        prin.setVisible(true);
        gestionpanel();
    }

    public void gestionpanel() {
        if (prin.getJdprincipal().getSelectedIndex() == 0) {
            gestionUsuario();
        }

        if (prin.getJdprincipal().getSelectedIndex() == 4) {
//            gestionarFactura();

        }
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

    public void gestionUsuario() {
//    public void gestionUsuario(ChangeEvent e) {
        int seleccion = prin.getJdprincipal().getSelectedIndex();
        System.out.println("La pestaña esta en la posición " + seleccion);
        if (seleccion == 1) {
     
            modusu.mostrarTablaUsuario(prin.getJtusua(), "", "usuario");
        }
        ModeloUsuario modUsu = new ModeloUsuario();
        prin.getTXTbuscar().addMouseListener(new MouseAdapter() {
//            public void MouseClickd(MouseAdapter e) {                
            @Override
            public void mouseClicked(MouseEvent e) {
                prin.getTXTbuscar().setText("");
                prin.getTXTbuscar().setForeground(Color.BLACK);

            }

        });
        prin.getJtusua().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int fila = prin.getJtusua().rowAtPoint(e.getPoint());
                int columna = prin.getJtusua().columnAtPoint(e.getPoint());
                modUsu.setDoc(Integer.parseInt((String) prin.getJtusua().getValueAt(fila, 1).toString()));
                if (columna == 9) {
                    prin.setVisible(false);
//                    us.
                }

            }
        });
    }

    @Override
    public void insertUpdate(DocumentEvent e) {
        modusu.mostrarTablaUsuario(prin.getJtusua(), prin.getTXTbuscar().getText(), "usuario");
    }

    @Override
    public void removeUpdate(DocumentEvent e) {
        modusu.mostrarTablaUsuario(prin.getJtusua(), prin.getTXTbuscar().getText(), "usuario");
    }

    @Override
    public void changedUpdate(DocumentEvent e) {
        modusu.mostrarTablaUsuario(prin.getJtusua(), prin.getTXTbuscar().getText(), "usuario");
    }

    @Override
    public void stateChanged(ChangeEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


}
