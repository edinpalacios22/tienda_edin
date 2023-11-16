package Modelo;

import Controlador.Conexion;
import Controlador.ControladorPrincipal;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;

public class Modeloproveedor {

    public class Modelocliente {

        Conexion cone = new Conexion();
        Connection cn = cone.iniciarConexion();

        private int doc, sex, rol;
        private String nom, dir, tec, cor, lo, cl;
        private Date fec;

        public Conexion getCone() {
            return cone;
        }

        public void setCone(Conexion cone) {
            this.cone = cone;
        }

        public Connection getCn() {
            return cn;
        }

        public void setCn(Connection cn) {
            this.cn = cn;
        }

        public int getDoc() {
            return doc;
        }

        public void setDoc(int doc) {
            this.doc = doc;
        }

        public int getSex() {
            return sex;
        }

        public void setSex(int sex) {
            this.sex = sex;
        }

        public int getRol() {
            return rol;
        }

        public void setRol(int rol) {
            this.rol = rol;
        }

        public String getNom() {
            return nom;
        }

        public void setNom(String nom) {
            this.nom = nom;
        }

        public String getDir() {
            return dir;
        }

        public void setDir(String dir) {
            this.dir = dir;
        }

        public String getTec() {
            return tec;
        }

        public void setTec(String tec) {
            this.tec = tec;
        }

        public String getCor() {
            return cor;
        }

        public void setCor(String cor) {
            this.cor = cor;
        }

        public String getLo() {
            return lo;
        }

        public void setLo(String lo) {
            this.lo = lo;
        }

        public String getCl() {
            return cl;
        }

        public void setCl(String cl) {
            this.cl = cl;
        }

        public Date getFec() {
            return fec;
        }

        public void setFec(Date fec) {
            this.fec = fec;
        }

        public Map<String, Integer> llenarCombo() {
            String sql = "Select * from mostrar sexo";
            Map<String, Integer> llenar_combo = new HashMap<>();
            try {
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) {
                    llenar_combo.put(rs.getString(2), rs.getInt(1));
                }
            } catch (SQLException e) {
                e.printStackTrace();

            }
            return llenar_combo;
        }
public void mostrarTablaProveedor(JTable tabla, String valor, String nomPesta) {

        Conexion conect = new Conexion();
        Connection co = conect.iniciarConexion();

        //Personalizar Emcabezado
        JTableHeader encabeza = tabla.getTableHeader();
        encabeza.setDefaultRenderer(new Gestion_Encabezado());
        tabla.setTableHeader(encabeza);

        //Personalizar Celdas
        tabla.setDefaultRenderer(Object.class, new GestionCeldas());
        JButton editar = new JButton("Editar");
        JButton eliminar = new JButton("Eliminar");
        JButton agregar = new JButton("Agregar");

        editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lapiz.png")));
        eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminar.png")));
        agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/agregar-usuario.png")));

        String[] titulo = {"Documento", "Idsexo","Nombre", "Telefono", "Correo", "Direccion","condicion","Fecha de Nacimiento"};
        int total = titulo.length;
        if (nomPesta.equals("proveedor")) {
            titulo = Arrays.copyOf(titulo, titulo.length + 2);
            titulo[titulo.length - 2] = "";
            titulo[titulo.length - 1] = "";
        } else {
            titulo = Arrays.copyOf(titulo, titulo.length + 1);
            titulo[titulo.length - 1] = "";
        }

        DefaultTableModel tablaProveedor = new DefaultTableModel(null, titulo) {
            public boolean isCellEditable(int row, int column) {

                return false;

            }
        };

        String sqlproveedor;
        if (valor.equals("")) {
            sqlproveedor = "SELECT * FROM mostrar_proveedor";
        } else {
            sqlproveedor = "call consultar_proveedor('" + valor + "')";
        }
        try {
            String[] dato = new String[titulo.length];
            Statement st = cn.createStatement(); //Crea una consulta
            ResultSet rs = st.executeQuery(sqlproveedor);
            while (rs.next()) {
                for (int i = 0; i < total; i++) {
                    dato[i] = rs.getString(i + 1);
                }
                Object[] fila = {dato[0], dato[1], dato[2], dato[3], dato[4], dato[5], dato[6], dato[7],editar,eliminar};
                if (nomPesta.equals("cliente")) {
                    fila = Arrays.copyOf(fila, fila.length + 2);
                    fila[fila.length - 2] = editar;
                    fila[fila.length - 1] = eliminar;
                } else {
                    fila= Arrays.copyOf(fila, fila.length+1);
                    fila[fila.length - 1] = agregar;
                }
                tablaProveedor.addRow(fila);
            }
            co.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        tabla.setModel(tablaProveedor);
        //Darle Tamaño a cada Columna
        int cantColum = tabla.getColumnCount();
        int[] ancho = {100, 180, 100, 150, 100, 160, 100, 150,30,30};
        for (int i = 0; i < cantColum; i++) {
            TableColumn columna = tabla.getColumnModel().getColumn(i);
            columna.setPreferredWidth(ancho[i]);
        }
        conect.cerrarConexion();
    }

        public void llenarproveedor() throws SQLException {
            Conexion cone = new Conexion();
            Connection cn = cone.iniciarConexion();//instanciamos la conexion
            String sql = "call ins_usuario (?,?,?,?,?,?)";

            try {
                PreparedStatement ps = cn.prepareStatement(sql);
                ps.setInt(1, getDoc());
                ps.setString(2, getNom());
                ps.setString(3, getTec());
                ps.setString(4, getCor());
                ps.setString(5, getDir());
                ps.setInt(6, getSex());
                ps.executeUpdate();
                JOptionPane.showConfirmDialog(null, "registro finalisado");
                cn.close();

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al guardar", "Error", JOptionPane.ERROR_MESSAGE);

            }
            cone.cerrarConexion();
        }

    }

    public Map<String, Integer> llenarCombo(String sexo) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
public void windowClosed(WindowEvent e) {
        ControladorPrincipal princi = new ControladorPrincipal();
        princi.iniciarPrincipal(0);
   
    }
}
