/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author SENA
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
    }

    public JButton getLblnuevo() {
        return lblnuevo;
    }

    public void setLblnuevo(JButton lblnuevo) {
        this.lblnuevo = lblnuevo;
    }

    public JButton getLblNuevo() {
        return lblNuevo2;
    }

    public void setLblNuevo(JButton lblNuevo) {
        this.lblNuevo2 = lblNuevo;
    }

    public JButton getjBproveedorp() {
        return jBproveedorp;
    }

    public void setjBproveedorp(JButton jBproveedorp) {
        this.jBproveedorp = jBproveedorp;
    }

    public JTabbedPane getJdprincipal() {
        return jdprincipal;
    }

    public void setJdprincipal(JTabbedPane jdprincipal) {
        this.jdprincipal = jdprincipal;
    }

    public JTable getJtusua() {
        return jtusua;
    }

    public void setJtusua(JTable jtusua) {
        this.jtusua = jtusua;
    }

    public JTextField getTXTbuscar() {
        return TXTbuscar;
    }

    public void setTXTbuscar(JTextField TXTbuscar) {
        this.TXTbuscar = TXTbuscar;
    }

    public JButton getBtnbuscar() {
        return btnbuscar;
    }

    public void setBtnbuscar(JButton btnbuscar) {
        this.btnbuscar = btnbuscar;
    }

    public JButton getBtnimg() {
        return btnimg;
    }

    public void setBtnimg(JButton btnimg) {
        this.btnimg = btnimg;
    }

    public JButton getBtnguardar() {
        return btnguardar;
    }

    public void setBtnguardar(JButton btnguardar) {
        this.btnguardar = btnguardar;
    }

    public JTextField getTxtimg() {
        return txtimg;
    }

    public void setTxtimg(JTextField txtimg) {
        this.txtimg = txtimg;
    }

    public JTextField getTxtnombre() {
        return txtnombre;
    }

    public void setTxtnombre(JTextField txtnombre) {
        this.txtnombre = txtnombre;
    }

    public JTextField getTxtPanel1() {
        return txtPanel1;
    }

    public void setTxtPanel1(JTextField txtPanel1) {
        this.txtPanel1 = txtPanel1;
    }

    public JLabel getLblDescrip() {
        return lblDescrip;
    }

    public void setLblDescrip(JLabel lblDescrip) {
        this.lblDescrip = lblDescrip;
    }

    public JButton getjBtnproducto() {
        return jBtnproducto;
    }

    public void setjBtnproducto(JButton jBtnproducto) {
        this.jBtnproducto = jBtnproducto;
    }

    public JTextField getTxtbuscarPro() {
        return txtbuscarPro;
    }

    public void setTxtbuscarPro(JTextField txtbuscarPro) {
        this.txtbuscarPro = txtbuscarPro;
    }

    public JTable getJpanelcliente() {
        return jpanelcliente;
    }

    public void setJpanelcliente(JTable jpanelcliente) {
        this.jpanelcliente = jpanelcliente;
    }

    public JTable getJpanelproveedor() {
        return jpanelproveedor;
    }

    public void setJpanelproveedor(JTable jpanelproveedor) {
        this.jpanelproveedor = jpanelproveedor;
    }

    public JPanel getJpcliente() {
        return jpcliente;
    }

    public void setJpcliente(JPanel jpcliente) {
        this.jpcliente = jpcliente;
    }

    public JButton getLblNuevo2() {
        return lblNuevo2;
    }

    public void setLblNuevo2(JButton lblNuevo2) {
        this.lblNuevo2 = lblNuevo2;
    }



    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jdprincipal = new javax.swing.JTabbedPane();
        jpUsuario = new javax.swing.JPanel();
        lblnuevo = new javax.swing.JButton();
        TXTbuscar = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtusua = new javax.swing.JTable();
        jpcliente = new javax.swing.JPanel();
        lblNuevo2 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jpanelcliente = new javax.swing.JTable();
        jPproveedor = new javax.swing.JPanel();
        jBproveedorp = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        jpanelproveedor = new javax.swing.JTable();
        jPfactura = new javax.swing.JPanel();
        jBtnfactura = new javax.swing.JButton();
        lbltitulo = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        lblprovedor = new javax.swing.JLabel();
        lblpago = new javax.swing.JLabel();
        lblcomprobante = new javax.swing.JLabel();
        txtusuario = new javax.swing.JTextField();
        txtprovee = new javax.swing.JTextField();
        jcbxpago = new javax.swing.JComboBox<>();
        txtcomprobante = new javax.swing.JTextField();
        txtVacio = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        BTNGUARDAR = new javax.swing.JButton();
        btnbuscar = new javax.swing.JButton();
        btnlupa = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jBtnVentas = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        jpanelventa = new javax.swing.JTable();
        jPproducto = new javax.swing.JPanel();
        jBtnproducto = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtusua1 = new javax.swing.JTable();
        lblnom = new javax.swing.JLabel();
        lblimagen = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        txtimg = new javax.swing.JTextField();
        btnimg = new javax.swing.JButton();
        lblDescrip = new javax.swing.JLabel();
        btnguardar = new javax.swing.JButton();
        txtbuscarPro = new javax.swing.JTextField();
        txtPanel1 = new javax.swing.JTextField();
        lbltienda = new javax.swing.JLabel();

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblnuevo.setIcon(new javax.swing.ImageIcon("C:\\Users\\SENA\\Documents\\NetBeansProjects\\Tienda_Com\\src\\main\\resources\\img\\nuevo_usuario.png")); // NOI18N
        lblnuevo.setText("Nuevo");

        jtusua.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jtusua);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 889, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(365, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpUsuarioLayout = new javax.swing.GroupLayout(jpUsuario);
        jpUsuario.setLayout(jpUsuarioLayout);
        jpUsuarioLayout.setHorizontalGroup(
            jpUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpUsuarioLayout.createSequentialGroup()
                .addGroup(jpUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpUsuarioLayout.createSequentialGroup()
                        .addComponent(lblnuevo)
                        .addGap(121, 121, 121)
                        .addComponent(TXTbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 547, Short.MAX_VALUE))
        );
        jpUsuarioLayout.setVerticalGroup(
            jpUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpUsuarioLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jpUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblnuevo)
                    .addComponent(TXTbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jdprincipal.addTab("Usuario", jpUsuario);

        lblNuevo2.setIcon(new javax.swing.ImageIcon("C:\\Users\\SENA\\Documents\\NetBeansProjects\\Tienda_Com\\src\\main\\resources\\img\\nuevo_usuario.png")); // NOI18N
        lblNuevo2.setText("Nuevo cliente");

        jpanelcliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane5.setViewportView(jpanelcliente);

        javax.swing.GroupLayout jpclienteLayout = new javax.swing.GroupLayout(jpcliente);
        jpcliente.setLayout(jpclienteLayout);
        jpclienteLayout.setHorizontalGroup(
            jpclienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpclienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpclienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNuevo2)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 882, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(572, Short.MAX_VALUE))
        );
        jpclienteLayout.setVerticalGroup(
            jpclienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpclienteLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblNuevo2)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(494, Short.MAX_VALUE))
        );

        jdprincipal.addTab("Cliente", jpcliente);

        jBproveedorp.setIcon(new javax.swing.ImageIcon("C:\\Users\\SENA\\Documents\\NetBeansProjects\\Tienda_Com\\src\\main\\resources\\img\\nuevo_usuario.png")); // NOI18N
        jBproveedorp.setText("Nuevo proveedor");

        jpanelproveedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane6.setViewportView(jpanelproveedor);

        javax.swing.GroupLayout jPproveedorLayout = new javax.swing.GroupLayout(jPproveedor);
        jPproveedor.setLayout(jPproveedorLayout);
        jPproveedorLayout.setHorizontalGroup(
            jPproveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPproveedorLayout.createSequentialGroup()
                .addGroup(jPproveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBproveedorp)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 882, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 578, Short.MAX_VALUE))
        );
        jPproveedorLayout.setVerticalGroup(
            jPproveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPproveedorLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jBproveedorp)
                .addGap(38, 38, 38)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(486, Short.MAX_VALUE))
        );

        jdprincipal.addTab("proveedor", jPproveedor);

        jBtnfactura.setIcon(new javax.swing.ImageIcon("C:\\Users\\SENA\\Documents\\NetBeansProjects\\Tienda_Com\\src\\main\\resources\\img\\nuevo_usuario.png")); // NOI18N
        jBtnfactura.setText("Nuevo ");

        lbltitulo.setText("NUEVA FACTURA");

        lblUsuario.setText("Usuario");

        lblprovedor.setText("Proveedor");

        lblpago.setText("Tipo de pago");

        lblcomprobante.setText("n° de comprobante");

        jcbxpago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "seleccione..." }));

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(jTable3);

        BTNGUARDAR.setIcon(new javax.swing.ImageIcon("C:\\Users\\SENA\\Documents\\NetBeansProjects\\Tienda_Com\\src\\main\\resources\\img\\salvar.png")); // NOI18N
        BTNGUARDAR.setText("GUARDAR");

        btnbuscar.setIcon(new javax.swing.ImageIcon("C:\\Users\\SENA\\Documents\\NetBeansProjects\\Tienda_Com\\src\\main\\resources\\img\\lupa.png")); // NOI18N

        btnlupa.setIcon(new javax.swing.ImageIcon("C:\\Users\\SENA\\Documents\\NetBeansProjects\\Tienda_Com\\src\\main\\resources\\img\\lupa.png")); // NOI18N

        javax.swing.GroupLayout jPfacturaLayout = new javax.swing.GroupLayout(jPfactura);
        jPfactura.setLayout(jPfacturaLayout);
        jPfacturaLayout.setHorizontalGroup(
            jPfacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPfacturaLayout.createSequentialGroup()
                .addComponent(jBtnfactura)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPfacturaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPfacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 882, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPfacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lbltitulo)
                        .addGroup(jPfacturaLayout.createSequentialGroup()
                            .addGroup(jPfacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblUsuario)
                                .addComponent(lblprovedor))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPfacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPfacturaLayout.createSequentialGroup()
                                    .addComponent(txtusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnbuscar))
                                .addGroup(jPfacturaLayout.createSequentialGroup()
                                    .addComponent(txtprovee, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnlupa)))
                            .addGap(71, 71, 71)
                            .addGroup(jPfacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPfacturaLayout.createSequentialGroup()
                                    .addComponent(lblpago)
                                    .addGap(60, 60, 60)
                                    .addComponent(jcbxpago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPfacturaLayout.createSequentialGroup()
                                    .addComponent(lblcomprobante)
                                    .addGroup(jPfacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPfacturaLayout.createSequentialGroup()
                                            .addGap(37, 37, 37)
                                            .addComponent(txtVacio, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPfacturaLayout.createSequentialGroup()
                                            .addGap(26, 26, 26)
                                            .addComponent(txtcomprobante, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGap(16, 16, 16)
                            .addComponent(BTNGUARDAR))))
                .addGap(139, 509, Short.MAX_VALUE))
        );
        jPfacturaLayout.setVerticalGroup(
            jPfacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPfacturaLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jBtnfactura)
                .addGap(18, 18, 18)
                .addComponent(lbltitulo)
                .addGap(27, 27, 27)
                .addGroup(jPfacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnbuscar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPfacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblUsuario)
                        .addComponent(lblpago)
                        .addComponent(txtusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jcbxpago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPfacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblprovedor)
                    .addComponent(lblcomprobante)
                    .addComponent(txtprovee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcomprobante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTNGUARDAR)
                    .addComponent(btnlupa, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(txtVacio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(199, Short.MAX_VALUE))
        );

        jdprincipal.addTab("Factura", jPfactura);

        jBtnVentas.setIcon(new javax.swing.ImageIcon("C:\\Users\\SENA\\Documents\\NetBeansProjects\\Tienda_Com\\src\\main\\resources\\img\\nuevo_usuario.png")); // NOI18N
        jBtnVentas.setText("Nuevo ");

        jpanelventa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane7.setViewportView(jpanelventa);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBtnVentas)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 882, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 578, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jBtnVentas)
                .addGap(55, 55, 55)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(469, Short.MAX_VALUE))
        );

        jdprincipal.addTab("Ventas", jPanel2);

        jBtnproducto.setIcon(new javax.swing.ImageIcon("C:\\Users\\SENA\\Documents\\NetBeansProjects\\Tienda_Com\\src\\main\\resources\\img\\nuevo_usuario.png")); // NOI18N
        jBtnproducto.setText("Nuevo producto");

        jtusua1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jtusua1);

        lblnom.setText("nombre");

        lblimagen.setText("Imagen");

        btnimg.setIcon(new javax.swing.ImageIcon("C:\\Users\\SENA\\Documents\\NetBeansProjects\\Tienda_Com\\src\\main\\resources\\img\\lupa.png")); // NOI18N

        lblDescrip.setText("Descripcion");

        btnguardar.setIcon(new javax.swing.ImageIcon("C:\\Users\\SENA\\Documents\\NetBeansProjects\\Tienda_Com\\src\\main\\resources\\img\\salvar.png")); // NOI18N
        btnguardar.setText("guardar");

        javax.swing.GroupLayout jPproductoLayout = new javax.swing.GroupLayout(jPproducto);
        jPproducto.setLayout(jPproductoLayout);
        jPproductoLayout.setHorizontalGroup(
            jPproductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPproductoLayout.createSequentialGroup()
                .addComponent(jBtnproducto)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPproductoLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPproductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPproductoLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jScrollPane2))
                    .addGroup(jPproductoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPproductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtbuscarPro, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPproductoLayout.createSequentialGroup()
                                .addGroup(jPproductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblnom)
                                    .addComponent(lblimagen))
                                .addGap(33, 33, 33)
                                .addGroup(jPproductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtnombre)
                                    .addComponent(txtimg, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE))
                                .addGroup(jPproductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPproductoLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(btnimg, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPproductoLayout.createSequentialGroup()
                                        .addGap(83, 83, 83)
                                        .addComponent(lblDescrip)))
                                .addGap(29, 29, 29)
                                .addComponent(txtPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(btnguardar)))
                        .addGap(21, 21, 21)))
                .addGap(313, 313, 313))
        );
        jPproductoLayout.setVerticalGroup(
            jPproductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPproductoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jBtnproducto)
                .addGap(18, 18, 18)
                .addGroup(jPproductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPproductoLayout.createSequentialGroup()
                        .addGroup(jPproductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblnom)
                            .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDescrip))
                        .addGap(18, 18, 18)
                        .addGroup(jPproductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblimagen)
                            .addComponent(txtimg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnimg)))
                    .addComponent(txtPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnguardar))
                .addGap(18, 18, 18)
                .addComponent(txtbuscarPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(239, Short.MAX_VALUE))
        );

        jdprincipal.addTab("Producto", jPproducto);

        lbltienda.setText("TIENDA COM");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbltienda, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jdprincipal))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lbltienda, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jdprincipal))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNGUARDAR;
    private javax.swing.JTextField TXTbuscar;
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnimg;
    private javax.swing.JButton btnlupa;
    private javax.swing.JButton jBproveedorp;
    private javax.swing.JButton jBtnVentas;
    private javax.swing.JButton jBtnfactura;
    private javax.swing.JButton jBtnproducto;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPfactura;
    private javax.swing.JPanel jPproducto;
    private javax.swing.JPanel jPproveedor;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JComboBox<String> jcbxpago;
    private javax.swing.JTabbedPane jdprincipal;
    private javax.swing.JPanel jpUsuario;
    private javax.swing.JTable jpanelcliente;
    private javax.swing.JTable jpanelproveedor;
    private javax.swing.JTable jpanelventa;
    private javax.swing.JPanel jpcliente;
    private javax.swing.JTable jtusua;
    private javax.swing.JTable jtusua1;
    private javax.swing.JLabel lblDescrip;
    private javax.swing.JButton lblNuevo2;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JLabel lblcomprobante;
    private javax.swing.JLabel lblimagen;
    private javax.swing.JLabel lblnom;
    private javax.swing.JButton lblnuevo;
    private javax.swing.JLabel lblpago;
    private javax.swing.JLabel lblprovedor;
    private javax.swing.JLabel lbltienda;
    private javax.swing.JLabel lbltitulo;
    private javax.swing.JTextField txtPanel1;
    private javax.swing.JTextField txtVacio;
    private javax.swing.JTextField txtbuscarPro;
    private javax.swing.JTextField txtcomprobante;
    private javax.swing.JTextField txtimg;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtprovee;
    private javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables

}
