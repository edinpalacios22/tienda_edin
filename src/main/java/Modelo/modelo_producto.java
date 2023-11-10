/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Controlador.Conexion;
import java.awt.Component;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.JTableHeader;

/**
 *
 * @author SENA
 */
public class modelo_producto {

    private String nom, des, ruta;
    private byte imagen[];

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public byte[] getImagen() {
        return imagen;
    }

    public void setImagen(byte[] imagen) {
        this.imagen = imagen;
    }

    public void buscarImagen() {
        JFileChooser archivos = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("jpg,png & gif", "jpg", "png", "gif");
        archivos.setFileFilter(filtro);
        if (archivos.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
             setRuta(archivos.getSelectedFile().getAbsolutePath());
        }
    }
 public byte[] convertirImagen(String ruta) {
        try {
            File archivo = new File(ruta);
            byte[] foto = new byte[(int) archivo.length()];
            InputStream imgen = new FileInputStream(archivo);
            imgen.read(foto);

            return foto;

        } catch (Exception e) {
            return null;
        }
    }
//    public void limpiar (Component[] panel) {
//       for (Object control : panel) {
//           if (control instanceof JTextField) {
//               ((JTextField)control).setText("");
//           }
//           if (control instanceof JTextArea) {
//               Component[] limpio = ((JScrollPane)control).getViewport().getComponents();
//               for (Object controltext : limpio) {
//                   if (controltext instanceof JTextArea) {
//                       ((JTextArea) controltext).setText("");
//                   }
//               }
//           }
//       } 
//    }
//    public void mostrartablaproducto(JTable tabla,String valor,String nompesta) {
//        Conexion conect= new Conexion();
//        Connection cn = conect.iniciarConexion();
//        
//    //personalizar Encabezado
//    JTableHeader encabezado = tabla.getTableHeader();
//    encabezado.setDefaultRenderer(new GestionEncabezado());
//    tabla.setTableHeader(encabezado);
//    }

    public void insertarProducto() {
        Conexion conect = new Conexion();
        Connection co = conect.iniciarConexion();
        String instProducto = "call inst_producto(?,?,?,?)";
        try {
            PreparedStatement ps = co.prepareStatement(instProducto);
            ps.setString(1,getNom());
            ps.setString(2, getDes());
            ps.setBytes(3, getImagen());
            ps.setString(4, getRuta());
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Registro Guardado");
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
  public void limpiar1 (Component[] panel) {
       for (Object control : panel) {
           if (control instanceof JTextField) {
               ((JTextField)control).setText("");
           }
           if (control instanceof JTextArea) {
               Component[] limpio = ((JScrollPane)control).getViewport().getComponents();
               for (Object controltext : limpio) {
                   if (controltext instanceof JTextArea) {
                       ((JTextArea) controltext).setText("");
                   }
               }
           }
       } 
    }
    public void mostrartablaproducto1(JTable tabla,String valor,String nompesta) {
        Conexion conect= new Conexion();
        Connection cn = conect.iniciarConexion();
        
    //personalizar Encabezado
    JTableHeader encabezado = tabla.getTableHeader();
    encabezado.setDefaultRenderer(new GestionEncabezado());
    tabla.setTableHeader(encabezado);
    
    tabla.setDefaultRenderer(Object.class, new GestionCeldas());
    JButton editar = new JButton();
    JButton eliminar = new JButton();
    JButton agregar = new JButton();
    
    editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/editar.png")));
    eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminar.png")));
    editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/editar.png")));
    
//    String [] titulo = ("idProducto","nombre","descripcion","cantidad","imagen","precio");
    }

}

