package Controlador;

// import Modelo.ModeloUsuario;
import Modelo.ModeloUsuario;
import Modelo.modelo_producto;
import Vista.Nuevo_Cliente;
import Vista.Nuevo_usuario;
import Vista.Proveedor;
import Vista.Principal;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
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
    modelo_producto modpro = new modelo_producto();

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
        gestionUsuario();
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
        if (e.getSource().equals(prin.getLblnuevo())) {
            
        }
        if (e.getSource().equals(prin.getjBtnproducto())) {
            modpro.buscarImagen();
            File file = new File (modpro.getRuta());
            String archivo = file.getName();
            prin.getTxtimg().setText(archivo);
        }
        if (e.getSource().equals(prin.getBtnimg())) {
            modpro.setNom(prin.getTxtnombre().getText());
            modpro.setDes(prin.getTxtPanel1().getText());
            modpro.setImagen(modpro.convertirImagen(modpro.getRuta()));
        }
    }

    public void gestionUsuario() {
         modusu.mostrarTablaUsuario(prin.getJtusua(), "", "usuario");

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
//                int columna = prin.getJtusua().columnAtPoint(e.getPoint());
                modUsu.setDoc(Integer.parseInt((String) prin.getJtusua().getValueAt(fila, 1).toString()));
//                if (columna == 9) {
//                    prin.setVisible(false);
////                    us.
//                }

            }
        });
    }
// @Override
    public void actionPerformed1 (ActionEvent e) {
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
        if (e.getSource().equals(prin.getLblnuevo())) {

        }
        if (e.getSource().equals(prin.getjBtnproducto())) {
            modpro.buscarImagen();
            File file = new File(modpro.getRuta());
            String archivo = file.getName();
            prin.getTxtimg().setText(archivo);

        }
        if (e.getSource().equals(prin.getBtnimg())) {
            modpro.setNom(prin.getTxtnombre().getText());
            modpro.setDes(prin.getTxtPanel1().getText());
            modpro.setImagen(modpro.convertirImagen(modpro.getRuta()));
        }
    }
         public void limpiar(Component[] panel) {
        for (Object control : panel) {
            if (control instanceof JTextField) {
                ((JTextField) control).setText("");
            }
            if (control instanceof JScrollPane) {
                Component[] limpio = ((JScrollPane) control).getViewport().getComponents();
                for (Object controltext : limpio) {
                    if (controltext instanceof JTextArea) {
                        ((JTextArea) control).setText("");
                    }
                }
            }
        
        }
    }

  

    @Override
    public void stateChanged(ChangeEvent e) {
        int seleccion = prin.getJdprincipal().getSelectedIndex();
        if (seleccion == 1) {
            ModeloUsuario modUsu = new ModeloUsuario();
            modUsu.mostrarTablaUsuario(prin.getJtusua(), "", "usuario");
        }
        ModeloUsuario modUsu = new ModeloUsuario();
        prin.getTXTbuscar().addMouseListener(new MouseAdapter() {
            public void MouseClickd(MouseAdapter e) {
                prin.getTXTbuscar().setText("color BLACK");
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
//                    modUsu.actualizarUsuario(modusu.getDoc());
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

//    @Override
//    public void stateChanged(ChangeEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }



