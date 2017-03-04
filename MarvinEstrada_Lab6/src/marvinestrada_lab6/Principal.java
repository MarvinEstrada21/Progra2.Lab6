package marvinestrada_lab6;

import java.awt.Color;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class Principal extends javax.swing.JFrame {
    public Principal() {
        initComponents();
        
        this.jd_arbol.setModal(true);
        this.jd_arbol.pack();
        this.jd_arbol.setLocationRelativeTo(this);
        this.jd_arbol.setVisible(true);
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_arbol = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_arbol = new javax.swing.JTree();
        jd_personas = new javax.swing.JDialog();
        tp_general = new javax.swing.JTabbedPane();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tf_edad_familiar = new javax.swing.JTextField();
        tf_id_familiar = new javax.swing.JTextField();
        tf_lugar_nacimiento_familiar = new javax.swing.JTextField();
        tf_nombre_familiar = new javax.swing.JTextField();
        bt_color = new javax.swing.JButton();
        tf_padre_familiar = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        cb_nacionalidad = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        tf_edad_empleado = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tf_id_empleado = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        cb_nacionalidad_empleado = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        tf_lugar_nacimiento_empleado = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        tf_nombre_nombre = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        bt_color_empleado = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        tf_he_empleado = new javax.swing.JTextField();
        tf_hs_empleado = new javax.swing.JTextField();
        tf_sueldo_empleado = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        cb_estado = new javax.swing.JComboBox<>();
        cb_sectrab = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        tf_ticket = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        tf_dinero_cliente = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        tf_edad_cliente = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        tf_id_cliente = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        cb_nacionalidad_cliente = new javax.swing.JComboBox<>();
        jLabel26 = new javax.swing.JLabel();
        tf_lugar_nacimiento_cliente = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        tf_nombre_cliente = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        bt_color_cliente = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        cb_sectra_jefe = new javax.swing.JComboBox<>();
        jLabel30 = new javax.swing.JLabel();
        tf_clientesat_jefe = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        tf_ganancia_jefe = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        tf_edad_jefe = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        tf_id_jefe = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        cb_nacionalidad_jefe = new javax.swing.JComboBox<>();
        jLabel35 = new javax.swing.JLabel();
        tf_lugar_nacimiento_jefe = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        tf_nombre_jefe = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        bt_color_jefe = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        tf_cantidad_ordenes = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        cb_empleado_ordenes = new javax.swing.JComboBox<>();
        jButton12 = new javax.swing.JButton();
        jd_arbol_familiares = new javax.swing.JDialog();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTree2 = new javax.swing.JTree();
        jd_articulos = new javax.swing.JDialog();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel7 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        tf_precio_baleada = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        tf_peso = new javax.swing.JTextField();
        tf_altura = new javax.swing.JTextField();
        tf_precio_gato = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        mi_gfam = new javax.swing.JMenuItem();
        mi_gemp = new javax.swing.JMenuItem();
        mi_gcli = new javax.swing.JMenuItem();
        mi_gjef = new javax.swing.JMenuItem();
        mi_gbal = new javax.swing.JMenuItem();
        mi_ggat = new javax.swing.JMenuItem();
        mi_gord = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Programas");
        jt_arbol.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane1.setViewportView(jt_arbol);

        javax.swing.GroupLayout jd_arbolLayout = new javax.swing.GroupLayout(jd_arbol.getContentPane());
        jd_arbol.getContentPane().setLayout(jd_arbolLayout);
        jd_arbolLayout.setHorizontalGroup(
            jd_arbolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_arbolLayout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(150, Short.MAX_VALUE))
        );
        jd_arbolLayout.setVerticalGroup(
            jd_arbolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_arbolLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        tp_general.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                tp_generalStateChanged(evt);
            }
        });

        jLabel1.setText("Edad:");

        jLabel2.setText("ID:");

        jLabel3.setText("Nacionalidad:");

        jLabel4.setText("Lugar de Nacimiento:");

        jLabel5.setText("Nombre:");

        jLabel6.setText("Color:");

        jLabel7.setText("Padre:");

        bt_color.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_colorActionPerformed(evt);
            }
        });

        jButton3.setText("Agregar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        cb_nacionalidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estado Unidense", "Canadiense", "Mexicano", "Hondureño", "Guatemalteco", "Salvadoreño", "Nicaraguense", "Costarricense", "Panameño", "Ecuatoriano", "Brazileño", "Inglés" }));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(165, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(tf_lugar_nacimiento_familiar, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_nombre_familiar)
                            .addComponent(bt_color, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_padre_familiar, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(18, 18, 18)
                            .addComponent(cb_nacionalidad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2))
                            .addGap(30, 30, 30)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tf_edad_familiar)
                                .addComponent(tf_id_familiar, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(103, 103, 103))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(254, 254, 254)
                .addComponent(jButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tf_edad_familiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tf_id_familiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cb_nacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tf_lugar_nacimiento_familiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tf_nombre_familiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(bt_color, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tf_padre_familiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 121, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(31, 31, 31))
        );

        tp_general.addTab("Familiar", jPanel6);

        jLabel8.setText("Edad:");

        jLabel9.setText("ID:");

        jLabel10.setText("Nacionalidad:");

        cb_nacionalidad_empleado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estado Unidense", "Canadiense", "Mexicano", "Hondureño", "Guatemalteco", "Salvadoreño", "Nicaraguense", "Costarricense", "Panameño", "Ecuatoriano", "Brazileño", "Inglés" }));

        jLabel11.setText("Lugar de Nacimiento:");

        jLabel12.setText("Nombre:");

        jLabel13.setText("Color:");

        bt_color_empleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_color_empleadoActionPerformed(evt);
            }
        });

        jLabel15.setText("Estado:");

        jLabel16.setText("Sueldo:");

        jLabel18.setText("Hora de Salida:");

        jLabel19.setText("Hora de Entrada:");

        jLabel20.setText("Sección de Trabajo:");

        jButton2.setText("Agregar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        cb_estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ocupado", "Disponible" }));

        cb_sectrab.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cocina", "Venta de Gatos", "Venta de Baleadas" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(161, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addGap(18, 18, 18)
                                .addComponent(tf_hs_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(tf_lugar_nacimiento_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel13))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_nombre_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bt_color_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel10)
                                    .addGap(18, 18, 18)
                                    .addComponent(cb_nacionalidad_empleado, 0, 209, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel8)
                                                .addComponent(jLabel9)
                                                .addComponent(jLabel15))
                                            .addGap(21, 21, 21))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel16)
                                            .addGap(22, 22, 22)))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(tf_edad_empleado)
                                        .addComponent(tf_id_empleado, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                                        .addComponent(tf_sueldo_empleado)
                                        .addComponent(cb_estado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel20)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(cb_sectrab, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel19)
                                    .addGap(18, 18, 18)
                                    .addComponent(tf_he_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(107, 107, 107))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(180, 180, 180))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(cb_sectrab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(tf_he_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(tf_hs_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(tf_sueldo_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(cb_estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tf_edad_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(tf_id_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(cb_nacionalidad_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(tf_lugar_nacimiento_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(tf_nombre_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(bt_color_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addGap(7, 7, 7))
        );

        tp_general.addTab("Empleado", jPanel1);

        jLabel21.setText("Ticket:");

        jLabel22.setText("Dinero:");

        jLabel23.setText("Edad:");

        jLabel24.setText("ID:");

        jLabel25.setText("Nacionalidad:");

        cb_nacionalidad_cliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estado Unidense", "Canadiense", "Mexicano", "Hondureño", "Guatemalteco", "Salvadoreño", "Nicaraguense", "Costarricense", "Panameño", "Ecuatoriano", "Brazileño", "Inglés" }));

        jLabel26.setText("Lugar de Nacimiento:");

        jLabel27.setText("Nombre:");

        jLabel28.setText("Color:");

        bt_color_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_color_clienteActionPerformed(evt);
            }
        });

        jButton4.setText("Agregar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addGap(18, 18, 18)
                        .addComponent(tf_lugar_nacimiento_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel27)
                            .addComponent(jLabel28))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_nombre_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt_color_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel25)
                            .addGap(18, 18, 18)
                            .addComponent(cb_nacionalidad_cliente, 0, 209, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel23)
                                .addComponent(jLabel24))
                            .addGap(30, 30, 30)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tf_edad_cliente, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                                .addComponent(tf_id_cliente))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22)
                            .addComponent(jLabel21))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_dinero_cliente, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                            .addComponent(tf_ticket))))
                .addContainerGap(145, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(250, 250, 250))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(tf_ticket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(tf_dinero_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(tf_edad_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(tf_id_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(cb_nacionalidad_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(tf_lugar_nacimiento_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(tf_nombre_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(bt_color_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(41, 41, 41))
        );

        tp_general.addTab("Cliente", jPanel2);

        jLabel29.setText("Sección de Trabajo:");

        cb_sectra_jefe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Venta de Gatos", "Venta de Baleadas" }));

        jLabel30.setText("Clientes Atendidos:");

        jLabel31.setText("Ganancia:");

        jLabel32.setText("Edad:");

        jLabel33.setText("ID:");

        jLabel34.setText("Nacionalidad:");

        cb_nacionalidad_jefe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estado Unidense", "Canadiense", "Mexicano", "Hondureño", "Guatemalteco", "Salvadoreño", "Nicaraguense", "Costarricense", "Panameño", "Ecuatoriano", "Brazileño", "Inglés" }));

        jLabel35.setText("Lugar de Nacimiento:");

        jLabel36.setText("Nombre:");

        jLabel37.setText("Color:");

        bt_color_jefe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_color_jefeActionPerformed(evt);
            }
        });

        jButton5.setText("Agregar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel35)
                        .addGap(18, 18, 18)
                        .addComponent(tf_lugar_nacimiento_jefe, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel36)
                            .addComponent(jLabel37))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_nombre_jefe, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt_color_jefe, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel34)
                            .addGap(18, 18, 18)
                            .addComponent(cb_nacionalidad_jefe, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel32)
                                .addComponent(jLabel33))
                            .addGap(30, 30, 30)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tf_edad_jefe)
                                .addComponent(tf_id_jefe, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel29)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cb_sectra_jefe, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel30)
                                        .addGap(18, 18, 18)
                                        .addComponent(tf_clientesat_jefe, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel31)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(tf_ganancia_jefe, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(19, 19, 19)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(45, 45, 45)))
                .addGap(105, 105, 105))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addComponent(jButton5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(cb_sectra_jefe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(tf_clientesat_jefe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(tf_ganancia_jefe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(tf_edad_jefe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(tf_id_jefe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(cb_nacionalidad_jefe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(tf_lugar_nacimiento_jefe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(tf_nombre_jefe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(bt_color_jefe, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addGap(38, 38, 38))
        );

        tp_general.addTab("Jefe", jPanel3);

        jLabel14.setText("Cantidad de Artículos:");

        jLabel17.setText("Empleado Atendedor:");

        jButton12.setText("Agregar");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(18, 18, 18)
                        .addComponent(tf_cantidad_ordenes, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton12)
                            .addComponent(cb_empleado_ordenes, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(142, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(tf_cantidad_ordenes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(cb_empleado_ordenes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(93, 93, 93)
                .addComponent(jButton12)
                .addContainerGap(185, Short.MAX_VALUE))
        );

        tp_general.addTab("Órdenes", jPanel9);

        javax.swing.GroupLayout jd_personasLayout = new javax.swing.GroupLayout(jd_personas.getContentPane());
        jd_personas.getContentPane().setLayout(jd_personasLayout);
        jd_personasLayout.setHorizontalGroup(
            jd_personasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tp_general)
        );
        jd_personasLayout.setVerticalGroup(
            jd_personasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tp_general)
        );

        treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Raíz");
        jTree2.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane2.setViewportView(jTree2);

        javax.swing.GroupLayout jd_arbol_familiaresLayout = new javax.swing.GroupLayout(jd_arbol_familiares.getContentPane());
        jd_arbol_familiares.getContentPane().setLayout(jd_arbol_familiaresLayout);
        jd_arbol_familiaresLayout.setHorizontalGroup(
            jd_arbol_familiaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_arbol_familiaresLayout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(128, Short.MAX_VALUE))
        );
        jd_arbol_familiaresLayout.setVerticalGroup(
            jd_arbol_familiaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_arbol_familiaresLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jLabel38.setText("Precio:");

        jButton6.setText("Agregar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jLabel38)
                        .addGap(32, 32, 32)
                        .addComponent(tf_precio_baleada, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(jButton6)))
                .addContainerGap(225, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(tf_precio_baleada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68)
                .addComponent(jButton6)
                .addContainerGap(259, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 614, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 478, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane2.addTab("Baleadas", jPanel7);

        jLabel39.setText("Peso:");

        jLabel40.setText("Altura:");

        jLabel41.setText("Precio:");

        jButton7.setText("Agregar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel41)
                                .addGap(18, 18, 18)
                                .addComponent(tf_precio_gato, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel40)
                                    .addComponent(jLabel39))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tf_peso, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                                    .addComponent(tf_altura)))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(223, 223, 223)
                        .addComponent(jButton7)))
                .addContainerGap(247, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(tf_peso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(tf_altura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(tf_precio_gato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addComponent(jButton7)
                .addContainerGap(220, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 614, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel8Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 478, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel8Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane2.addTab("Gatos", jPanel8);

        javax.swing.GroupLayout jd_articulosLayout = new javax.swing.GroupLayout(jd_articulos.getContentPane());
        jd_articulos.getContentPane().setLayout(jd_articulosLayout);
        jd_articulosLayout.setHorizontalGroup(
            jd_articulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jd_articulosLayout.setVerticalGroup(
            jd_articulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton8.setText("Agregar Artículos");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("Agregar Personas y Órdenes");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton1.setText("Mostrar Arbol General");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton10.setText("Mostrar Arbol de Familares");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setText("Reporte de Ganancias");

        jButton13.setText("jButton13");

        jMenu1.setText("Menu");

        jMenu2.setText("Guardar");

        mi_gfam.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        mi_gfam.setText("Guardar Familiares");
        mi_gfam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_gfamActionPerformed(evt);
            }
        });
        jMenu2.add(mi_gfam);

        mi_gemp.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        mi_gemp.setText("Guardar Empleado");
        mi_gemp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_gempActionPerformed(evt);
            }
        });
        jMenu2.add(mi_gemp);

        mi_gcli.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        mi_gcli.setText("Guardar Cliente");
        mi_gcli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_gcliActionPerformed(evt);
            }
        });
        jMenu2.add(mi_gcli);

        mi_gjef.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_J, java.awt.event.InputEvent.CTRL_MASK));
        mi_gjef.setText("Guardar Jefe");
        mi_gjef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_gjefActionPerformed(evt);
            }
        });
        jMenu2.add(mi_gjef);

        mi_gbal.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        mi_gbal.setText("Guardar Baleada");
        mi_gbal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_gbalActionPerformed(evt);
            }
        });
        jMenu2.add(mi_gbal);

        mi_ggat.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        mi_ggat.setText("Guardar Gato");
        mi_ggat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_ggatActionPerformed(evt);
            }
        });
        jMenu2.add(mi_ggat);

        mi_gord.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        mi_gord.setText("Guardar Órden");
        mi_gord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_gordActionPerformed(evt);
            }
        });
        jMenu2.add(mi_gord);

        jMenu1.add(jMenu2);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem2.setText("Guardar Como...");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem3.setText("Salir");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem4.setText("About");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton9)
                            .addComponent(jButton13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_colorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_colorActionPerformed
        bt_color.setBackground(JColorChooser.showDialog(this, "Seleccione un color", Color.WHITE));
    }//GEN-LAST:event_bt_colorActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int edad;
        long id;
        String nacionalidad, lugar_nacimiento, nombre;
        Color color;
        Familiar padre;
        try {
            edad = Integer.parseInt(tf_edad_familiar.getText());
            id = Long.parseLong(tf_id_familiar.getText());
            nacionalidad = cb_nacionalidad.getSelectedItem().toString();
            lugar_nacimiento = tf_lugar_nacimiento_familiar.getText();
            nombre = tf_nombre_familiar.getText();
            color = bt_color.getBackground();
            lista.add(new Familiar(edad, id, nacionalidad, lugar_nacimiento, nombre, color, new Familiar()));
            JOptionPane.showMessageDialog(this, "El familiar ha sdo agregado exitosamente");
            JOptionPane.showMessageDialog(this, "Si desea agregarlo a un archivo de texto, en este momento,"
                                                + " dirijase a Menu -> Guardar -> Guardar Familiar");
            
            this.jd_personas.setVisible(false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ha ocurrido un error y no se guardaron los datos");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void bt_color_empleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_color_empleadoActionPerformed
        bt_color_empleado.setBackground(JColorChooser.showDialog(this, "Seleccione un color", Color.WHITE));
    }//GEN-LAST:event_bt_color_empleadoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String seccion_trabajo, hora_entrada, hora_salida, estado, nacionalidad, lugar_nacimiento, nombre;
        double sueldo;
        int edad;
        long id;
        Color color;
        try {
            seccion_trabajo = cb_sectrab.getSelectedItem().toString();
            hora_entrada = tf_he_empleado.getText();
            hora_salida = tf_hs_empleado.getText();
            sueldo = Double.parseDouble(tf_sueldo_empleado.getText());
            estado = cb_estado.getSelectedItem().toString();
            edad = Integer.parseInt(tf_edad_empleado.getText());
            id = Long.parseLong(tf_id_empleado.getText());
            nacionalidad = cb_nacionalidad_empleado.getSelectedItem().toString();
            lugar_nacimiento = tf_lugar_nacimiento_empleado.getText();
            nombre = tf_nombre_nombre.getText();
            color = bt_color_empleado.getBackground();
            lista.add(new Empleado(seccion_trabajo, hora_entrada, hora_salida, sueldo, estado, edad, id, nacionalidad, lugar_nacimiento, nombre, null, color));
            JOptionPane.showMessageDialog(this, "El empleado ha sido agregado exitosamente");
            JOptionPane.showMessageDialog(this, "Si desea agregarlo a un archivo de texto, en este momento,"
                                                + " dirijase a Menu -> Guardar -> Guardar Empleado");

            DefaultTreeModel m = (DefaultTreeModel) jt_arbol.getModel();
            DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) m.getRoot();
            DefaultMutableTreeNode nodo_persona;
            nodo_persona = new DefaultMutableTreeNode(new Empleado(seccion_trabajo, hora_entrada, hora_salida, sueldo, estado, edad, id, nacionalidad, lugar_nacimiento, nombre, null, color));
            raiz.add(nodo_persona);
            
            this.jd_personas.setVisible(false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ocurrió un error y no se guardaron los datos");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void bt_color_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_color_clienteActionPerformed
        bt_color_cliente.setBackground(JColorChooser.showDialog(this, "Seleccione un color", Color.WHITE));
    }//GEN-LAST:event_bt_color_clienteActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String nacionalidad, lugar_nacimiento, nombre;
        double dinero;
        int edad, ticket;
        long id;
        Color color;
        try {
            ticket = 0;
            dinero = Double.parseDouble(tf_dinero_cliente.getText());
            edad = Integer.parseInt(tf_edad_cliente.getText());
            id = Long.parseLong(tf_id_cliente.getText());
            nacionalidad = cb_nacionalidad_cliente.getSelectedItem().toString();
            lugar_nacimiento = tf_lugar_nacimiento_cliente.getText();
            nombre = tf_nombre_cliente.getText();
            color = bt_color_cliente.getBackground();
            lista.add(new Clientes(ticket, dinero, edad, id, nacionalidad, lugar_nacimiento, nombre, null, color));
            JOptionPane.showMessageDialog(this, "El cliente ha sido agregado exitosamnete");
            JOptionPane.showMessageDialog(this, "Si desea agregarlo a un archivo de texto, en este momento,"
                                                + " dirijase a Menu -> Guardar -> Guardar Cliente");

            DefaultTreeModel m = (DefaultTreeModel) jt_arbol.getModel();
            DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) m.getRoot();
            DefaultMutableTreeNode nodo_persona;
            nodo_persona = new DefaultMutableTreeNode(new Clientes(ticket, dinero, edad, id, nacionalidad, lugar_nacimiento, nombre, null, color));
            raiz.add(nodo_persona);
            
            this.jd_personas.setVisible(false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ha ocurrido un error y no se guardaron los datos");
        }
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void bt_color_jefeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_color_jefeActionPerformed
        bt_color_jefe.setBackground(JColorChooser.showDialog(this, "Seleccione un color", Color.WHITE));
    }//GEN-LAST:event_bt_color_jefeActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String nacionalidad, lugar_nacimiento, nombre, seccion_trabajo;
        double ganancia;
        int edad, clientes_atendidos;
        long id;
        Color color;
        try {
            seccion_trabajo = cb_sectra_jefe.getSelectedItem().toString();
            clientes_atendidos = Integer.parseInt(tf_clientesat_jefe.getText());
            ganancia = Double.parseDouble(tf_ganancia_jefe.getText());
            edad = Integer.parseInt(tf_edad_jefe.getText());
            id = Long.parseLong(tf_id_jefe.getText());
            nacionalidad = cb_nacionalidad_jefe.getSelectedItem().toString();
            lugar_nacimiento = tf_lugar_nacimiento_jefe.getText();
            nombre = tf_nombre_jefe.getText();
            color = bt_color_jefe.getBackground();
            lista.add(new Jefes(seccion_trabajo, clientes_atendidos, ganancia, edad, id, nacionalidad, lugar_nacimiento, nombre, null, color));
            JOptionPane.showMessageDialog(this, "El jefe ha sido agregado exitosamnete");
            JOptionPane.showMessageDialog(this, "Si desea agregarlo a un archivo de texto, en este momento,"
                                                + " dirijase a Menu -> Guardar -> Guardar Jefe");
            
            DefaultTreeModel m = (DefaultTreeModel) jt_arbol.getModel();
            DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) m.getRoot();
            DefaultMutableTreeNode nodo_persona;
            nodo_persona = new DefaultMutableTreeNode(new Jefes(seccion_trabajo, clientes_atendidos, ganancia, edad, id, nacionalidad, lugar_nacimiento, nombre, null, color));
            raiz.add(nodo_persona);
            
            this.jd_personas.setVisible(false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ha ocurrido un error y no se guardaron los datos");
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        double precio;
        try {
            precio = Double.parseDouble(tf_precio_baleada.getText());
            lista.add(new Baleadas(precio));
            JOptionPane.showMessageDialog(this, "La baleada ha sido agregada exitosamente");
            JOptionPane.showMessageDialog(this, "Si desea agregarlo a un archivo de texto, en este momento,"
                                                + " dirijase a Menu -> Guardar -> Guardar Baleada");
            
            this.jd_articulos.setVisible(false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ha ocurrido un error y no se guardaron los datos");
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        double precio, peso, altura;
        try {
            precio = Double.parseDouble(tf_precio_gato.getText());
            peso = Double.parseDouble(tf_peso.getText());
            altura = Double.parseDouble(tf_altura.getText());
            lista.add(new Gatos(peso, altura, precio));
            JOptionPane.showMessageDialog(this, "El gato ha sido agregado exitosamente");
            JOptionPane.showMessageDialog(this, "Si desea agregarlo a un archivo de texto, en este momento,"
                                                + " dirijase a Menu -> Guardar -> Guardar Gato");
          
            this.jd_articulos.setVisible(false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ha ocurrido un error y no se guardaron los datos");
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        JFileChooser jfc= new JFileChooser();
        int seleccion = jfc.showSaveDialog(this);
        FileWriter fw = null;
        BufferedWriter bw = null;
        if (seleccion == JFileChooser.APPROVE_OPTION){
            try {
                File fichero = jfc.getSelectedFile();
                fw = new FileWriter(fichero);
                bw = new BufferedWriter(fw);
                bw.write(cb_sectrab.getSelectedItem().toString()+ ";");
                bw.write(tf_he_empleado.getText() + ";");
                bw.write(tf_hs_empleado.getText() + ";");
                bw.write(Integer.parseInt(tf_sueldo_empleado.getText()) + ";");
                bw.write(cb_estado.getSelectedItem().toString() + ";");
                bw.write(Integer.parseInt(tf_edad_empleado.getText()) + ";");
                bw.write(Integer.parseInt(tf_id_empleado.getText()) + ";");
                bw.write(cb_nacionalidad_empleado.getSelectedItem().toString() + ";");
                bw.write(tf_lugar_nacimiento_empleado.getText() + ";");
                bw.write(tf_nombre_nombre.getText() + ";");
                //bw.write(bt_color_empleado.getBackground());
                /*if (lista.get(0) instanceof Empleado){
                    for (Object t : lista) {
                        bw.write(t.);
                    }
                }*/
                //bw.write(ta_1.getText());
                //ta_1.setText("");
                bw.flush();
            } catch (Exception e) {
            } finally {
                try {
                    bw.close();
                    fw.close();
                } catch (IOException ex) {
                }
            }
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        tf_edad_familiar.setText("");
        tf_id_familiar.setText("");
        cb_nacionalidad.setSelectedIndex(0);
        tf_lugar_nacimiento_familiar.setText("");
        tf_nombre_familiar.setText("");
        bt_color.setBackground(Color.WHITE);
        tf_padre_familiar.setText("");
        
        cb_nacionalidad_empleado.setSelectedIndex(0);
        tf_he_empleado.setText("");
        tf_hs_empleado.setText("");
        tf_sueldo_empleado.setText("");
        cb_estado.setSelectedIndex(0);
        tf_edad_empleado.setText("");
        tf_id_empleado.setText("");
        cb_nacionalidad_empleado.setSelectedIndex(0);
        tf_lugar_nacimiento_empleado.setText("");
        tf_nombre_nombre.setText("");
        bt_color_empleado.setBackground(Color.WHITE);
        
        tf_ticket.setText("");
        tf_dinero_cliente.setText("");
        tf_edad_cliente.setText("");
        tf_id_cliente.setText("");
        cb_nacionalidad_cliente.setSelectedIndex(0);
        tf_lugar_nacimiento_cliente.setText("");
        tf_nombre_cliente.setText("");
        bt_color_cliente.setBackground(Color.WHITE);
        
        
        cb_sectra_jefe.setSelectedIndex(0);
        tf_clientesat_jefe.setText("");
        tf_ganancia_jefe.setText("");
        tf_edad_jefe.setText("");
        tf_id_jefe.setText("");
        cb_nacionalidad_jefe.setSelectedIndex(0);
        tf_lugar_nacimiento_jefe.setText("");
        tf_nombre_jefe.setText("");
        bt_color_jefe.setBackground(Color.WHITE);
        
        tf_cantidad_ordenes.setText("");
        
        this.jd_personas.setModal(true);
        this.jd_personas.pack();
        this.jd_personas.setLocationRelativeTo(this);
        this.jd_personas.setVisible(true);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        tf_precio_baleada.setText("");
        
        tf_precio_gato.setText("");
        tf_peso.setText("");
        tf_altura.setText("");
            
        this.jd_articulos.setModal(true);
        this.jd_articulos.pack();
        this.jd_articulos.setLocationRelativeTo(this);
        this.jd_articulos.setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        this.jd_arbol_familiares.setModal(true);
        this.jd_arbol_familiares.pack();
        this.jd_arbol_familiares.setLocationRelativeTo(this);
        this.jd_arbol_familiares.setVisible(true);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        int cantidad;
        Empleado empleado;
        try {
            cantidad = Integer.parseInt(tf_cantidad_ordenes.getText());
            empleado = (Empleado)cb_empleado_ordenes.getSelectedItem();
            lista.add(new Ordenes(cantidad, empleado));
            JOptionPane.showMessageDialog(this, "La orden ha sido agregada exitosamente");
            JOptionPane.showMessageDialog(this, "Si desea agregarlo a un archivo de texto, en este momento,"
                                                + " dirijase a Menu -> Guardar -> Guardar Órden");
            
            this.jd_personas.setVisible(false);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton12ActionPerformed

    private void tp_generalStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_tp_generalStateChanged
        if (tp_general.getSelectedIndex() == 4){
            DefaultComboBoxModel modelo = new DefaultComboBoxModel();
            for (Object temp : lista) {
                if (lista.get(0) instanceof Empleado){
                    modelo.addElement(temp);
                }
            }
            cb_empleado_ordenes.setModel(modelo);
        }
    }//GEN-LAST:event_tp_generalStateChanged

    private void mi_gempActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_gempActionPerformed
        String seccion_trabajo, hora_entrada, hora_salida, estado, nacionalidad, lugar_nacimiento, nombre;
        double sueldo;
        int edad;
        long id;
        Color color;
        seccion_trabajo = cb_sectrab.getSelectedItem().toString();
        hora_entrada = tf_he_empleado.getText();
        hora_salida = tf_hs_empleado.getText();
        sueldo = Double.parseDouble(tf_sueldo_empleado.getText());
        estado = cb_estado.getSelectedItem().toString();
        edad = Integer.parseInt(tf_edad_empleado.getText());
        id = Long.parseLong(tf_id_empleado.getText());
        nacionalidad = cb_nacionalidad_empleado.getSelectedItem().toString();
        lugar_nacimiento = tf_lugar_nacimiento_empleado.getText();
        nombre = tf_nombre_nombre.getText();
        color = bt_color_empleado.getBackground();
            
        AdminEmpleado ae = new AdminEmpleado("./empleado.txt");
        ae.cargarArchivo();
        ae.setEmpleado(new Empleado(seccion_trabajo, hora_entrada, hora_salida, sueldo, estado, edad, id, nacionalidad, lugar_nacimiento, nombre, null, color));
        ae.escribirArchivo();
    }//GEN-LAST:event_mi_gempActionPerformed

    private void mi_gfamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_gfamActionPerformed
        int edad;
        long id;
        String nacionalidad, lugar_nacimiento, nombre;
        Color color;
        Familiar padre;
        edad = Integer.parseInt(tf_edad_familiar.getText());
        id = Long.parseLong(tf_id_familiar.getText());
        nacionalidad = cb_nacionalidad.getSelectedItem().toString();
        lugar_nacimiento = tf_lugar_nacimiento_familiar.getText();
        nombre = tf_nombre_familiar.getText();
        color = bt_color.getBackground();
        lista.add(new Familiar(edad, id, nacionalidad, lugar_nacimiento, nombre, color, new Familiar()));
        JOptionPane.showMessageDialog(this, "El familiar ha sdo agregado exitosamente");
            
        AdminFamiliar af = new AdminFamiliar("./familiar.txt");
        af.cargarArchivo();
        af.setFamiliar(new Familiar(edad, id, nacionalidad, lugar_nacimiento, nombre, color, new Familiar()));
        af.escribirArchivo();
    }//GEN-LAST:event_mi_gfamActionPerformed

    private void mi_gcliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_gcliActionPerformed
        String nacionalidad, lugar_nacimiento, nombre;
        double dinero;
        int edad, ticket;
        long id;
        Color color;
        ticket = 0;
        dinero = Double.parseDouble(tf_dinero_cliente.getText());
        edad = Integer.parseInt(tf_edad_cliente.getText());
        id = Long.parseLong(tf_id_cliente.getText());
        nacionalidad = cb_nacionalidad_cliente.getSelectedItem().toString();
        lugar_nacimiento = tf_lugar_nacimiento_cliente.getText();
        nombre = tf_nombre_cliente.getText();
        color = bt_color_cliente.getBackground();
        lista.add(new Clientes(ticket, dinero, edad, id, nacionalidad, lugar_nacimiento, nombre, null, color));
        JOptionPane.showMessageDialog(this, "El cliente ha sido agregado exitosamnete");
    
        AdminClientes ac = new AdminClientes("./clientes.txt");
        ac.cargarArchivo();
        ac.setCliente(new Clientes(ticket, dinero, edad, id, nacionalidad, lugar_nacimiento, nombre, null, color));
        ac.escribirArchivo();
    }//GEN-LAST:event_mi_gcliActionPerformed

    private void mi_gjefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_gjefActionPerformed
        String nacionalidad, lugar_nacimiento, nombre, seccion_trabajo;
        double ganancia;
        int edad, clientes_atendidos;
        long id;
        Color color;
        seccion_trabajo = cb_sectra_jefe.getSelectedItem().toString();
        clientes_atendidos = Integer.parseInt(tf_clientesat_jefe.getText());
        ganancia = Double.parseDouble(tf_ganancia_jefe.getText());
        edad = Integer.parseInt(tf_edad_jefe.getText());
        id = Long.parseLong(tf_id_jefe.getText());
        nacionalidad = cb_nacionalidad_jefe.getSelectedItem().toString();
        lugar_nacimiento = tf_lugar_nacimiento_jefe.getText();
        nombre = tf_nombre_jefe.getText();
        color = bt_color_jefe.getBackground();
    
        AdminJefes aj = new AdminJefes("./jefes.txt");
        aj.cargarArchivo();
        aj.setJefe(new Jefes(seccion_trabajo, clientes_atendidos, ganancia, edad, id, nacionalidad, lugar_nacimiento, nombre, null, color));
        aj.escribirArchivo();
    }//GEN-LAST:event_mi_gjefActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.jd_arbol.setModal(true);
        this.jd_arbol.pack();
        this.jd_arbol.setLocationRelativeTo(this);
        this.jd_arbol.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void mi_gbalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_gbalActionPerformed
        double precio;
        precio = Double.parseDouble(tf_precio_baleada.getText());
        lista.add(new Baleadas(precio));
        JOptionPane.showMessageDialog(this, "La baleada ha sido agregada exitosamente");
        JOptionPane.showMessageDialog(this, "Si desea agregarlo a un archivo de texto, en este momento,"
                                            + " dirijase a Menu -> Guardar -> Guardar Baleada");
    
        AdminBaleadas ab = new AdminBaleadas("./baleadas.txt");
        ab.cargarArchivo();
        ab.setBaleada(new Baleadas(precio));
        ab.escribirArchivo();
    }//GEN-LAST:event_mi_gbalActionPerformed

    private void mi_ggatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_ggatActionPerformed
        double precio, peso, altura;
        precio = Double.parseDouble(tf_precio_gato.getText());
        peso = Double.parseDouble(tf_peso.getText());
        altura = Double.parseDouble(tf_altura.getText());
        lista.add(new Gatos(peso, altura, precio));
        JOptionPane.showMessageDialog(this, "El gato ha sido agregado exitosamente");
        JOptionPane.showMessageDialog(this, "Si desea agregarlo a un archivo de texto, en este momento,"
                                            + " dirijase a Menu -> Guardar -> Guardar Gato");
            
        AdminGatos ag = new AdminGatos("./gatos.txt");
        ag.cargarArchivo();
        ag.setGato(new Gatos(peso, altura, precio));
        ag.escribirArchivo();
    }//GEN-LAST:event_mi_ggatActionPerformed

    private void mi_gordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_gordActionPerformed
        int cantidad;
        Empleado empleado;
        cantidad = Integer.parseInt(tf_cantidad_ordenes.getText());
        empleado = (Empleado)cb_empleado_ordenes.getSelectedItem();
        lista.add(new Ordenes(cantidad, empleado));
        JOptionPane.showMessageDialog(this, "La orden ha sido agregada exitosamente");
        JOptionPane.showMessageDialog(this, "Si desea agregarlo a un archivo de texto, en este momento,"
                                            + " dirijase a Menu -> Guardar -> Guardar Órden");
            
        AdminOrdenes ao = new AdminOrdenes("./ordenes.txt");
        ao.cargarArchivo();
        ao.setOrden(new Ordenes(cantidad, empleado));
        ao.escribirArchivo();
    }//GEN-LAST:event_mi_gordActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        JOptionPane.showMessageDialog(this, "Este programa es sobre un local ,encargado de vendar Baleadas y Gatos,\n"
                                          + "en el cual se puede administrar todo el local. Todo lo que el dueño decida\n"
                                          + "saber, lo podrá ver aquí en la diferentes opciones que se le brindan.\n"
                                          + "HAVE A NICE DAAAAAAAAAAAAAAAY","", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_color;
    private javax.swing.JButton bt_color_cliente;
    private javax.swing.JButton bt_color_empleado;
    private javax.swing.JButton bt_color_jefe;
    private javax.swing.JComboBox<String> cb_empleado_ordenes;
    private javax.swing.JComboBox<String> cb_estado;
    private javax.swing.JComboBox<String> cb_nacionalidad;
    private javax.swing.JComboBox<String> cb_nacionalidad_cliente;
    private javax.swing.JComboBox<String> cb_nacionalidad_empleado;
    private javax.swing.JComboBox<String> cb_nacionalidad_jefe;
    private javax.swing.JComboBox<String> cb_sectra_jefe;
    private javax.swing.JComboBox<String> cb_sectrab;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTree jTree2;
    private javax.swing.JDialog jd_arbol;
    private javax.swing.JDialog jd_arbol_familiares;
    private javax.swing.JDialog jd_articulos;
    private javax.swing.JDialog jd_personas;
    private javax.swing.JTree jt_arbol;
    private javax.swing.JMenuItem mi_gbal;
    private javax.swing.JMenuItem mi_gcli;
    private javax.swing.JMenuItem mi_gemp;
    private javax.swing.JMenuItem mi_gfam;
    private javax.swing.JMenuItem mi_ggat;
    private javax.swing.JMenuItem mi_gjef;
    private javax.swing.JMenuItem mi_gord;
    private javax.swing.JTextField tf_altura;
    private javax.swing.JTextField tf_cantidad_ordenes;
    private javax.swing.JTextField tf_clientesat_jefe;
    private javax.swing.JTextField tf_dinero_cliente;
    private javax.swing.JTextField tf_edad_cliente;
    private javax.swing.JTextField tf_edad_empleado;
    private javax.swing.JTextField tf_edad_familiar;
    private javax.swing.JTextField tf_edad_jefe;
    private javax.swing.JTextField tf_ganancia_jefe;
    private javax.swing.JTextField tf_he_empleado;
    private javax.swing.JTextField tf_hs_empleado;
    private javax.swing.JTextField tf_id_cliente;
    private javax.swing.JTextField tf_id_empleado;
    private javax.swing.JTextField tf_id_familiar;
    private javax.swing.JTextField tf_id_jefe;
    private javax.swing.JTextField tf_lugar_nacimiento_cliente;
    private javax.swing.JTextField tf_lugar_nacimiento_empleado;
    private javax.swing.JTextField tf_lugar_nacimiento_familiar;
    private javax.swing.JTextField tf_lugar_nacimiento_jefe;
    private javax.swing.JTextField tf_nombre_cliente;
    private javax.swing.JTextField tf_nombre_familiar;
    private javax.swing.JTextField tf_nombre_jefe;
    private javax.swing.JTextField tf_nombre_nombre;
    private javax.swing.JTextField tf_padre_familiar;
    private javax.swing.JTextField tf_peso;
    private javax.swing.JTextField tf_precio_baleada;
    private javax.swing.JTextField tf_precio_gato;
    private javax.swing.JTextField tf_sueldo_empleado;
    private javax.swing.JTextField tf_ticket;
    private javax.swing.JTabbedPane tp_general;
    // End of variables declaration//GEN-END:variables
    ArrayList lista = new ArrayList();
}
