package vistas;

import controlador.PersonalC;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
import servicios.ReportGenerator;

public class PersonalReg extends javax.swing.JFrame {

    public static DefaultTableModel modeloTabla;
    public static int tipo = 0;
    public static String dato ="";
    public static String sexo;
    public static int codigo;
    PersonalC controlador;

    public PersonalReg() {
        initComponents();
        grupoSexo.add(jrdMasculino);
        grupoSexo.add(jrdFemenino);
        grupoFiltro.add(jrdNombre);
        grupoFiltro.add(jrdDni);
        grupoFiltro.add(jrdApellido);
        controlador = new PersonalC();
        cargarValoresTabla();
    }

    public void cargarValoresTabla() {
        try {
            String columnas[] = new String[]{"Código", "Nombre", "Apellido", "Sexo", "DNI"};
            modeloTabla = new DefaultTableModel(null, columnas);
            controlador.listar();
            jtblPersonal.setModel(modeloTabla);
        } catch (Exception e) {
            System.out.println("Error en cargarValoresTabla " + e.getMessage());
        }

//        String columnas[] = new String[]{"Código", "Nombre", "Apellido", "Sexo", "DNI"};
//        modeloTabla = new DefaultTableModel(null, columnas);
//        String sql = "Select * from personal";
//        try {
//            PreparedStatement ps = Conexion.conectar().prepareStatement(sql);
//            ResultSet rs = ps.executeQuery();
//            Object datos[] = new Object[5]; // cantidad de columnas
//            while (rs.next()) {
//                for (int i = 0; i < 5; i++) {
//                    datos[i] = rs.getObject(i + 1);
//                }
//                modeloTabla.addRow(datos);
//                jtblPersonal.setModel(modeloTabla);
//            }
//            rs.close();
//            ps.close();
//        } catch (Exception e) {
//            System.out.println("Error en setFilas " + e.getMessage());
//        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        grupoSexo = new javax.swing.ButtonGroup();
        grupoFiltro = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jrdMasculino = new javax.swing.JRadioButton();
        jrdFemenino = new javax.swing.JRadioButton();
        jtxtDni = new javax.swing.JTextField();
        jtxtApellido = new javax.swing.JTextField();
        jtxtNombre = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jbtnReporte = new javax.swing.JButton();
        jbtnEliminar = new javax.swing.JButton();
        jbtnGuardar = new javax.swing.JButton();
        jbtnModificar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblPersonal = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jtxtBuscar = new javax.swing.JTextField();
        jrdNombre = new javax.swing.JRadioButton();
        jrdApellido = new javax.swing.JRadioButton();
        jrdDni = new javax.swing.JRadioButton();
        jchkTodos = new javax.swing.JCheckBox();
        btnCerrar = new javax.swing.JButton();
        jbtnNuevo = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setType(java.awt.Window.Type.UTILITY);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Nombre");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Apellidos");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Sexo");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jrdMasculino.setBackground(new java.awt.Color(204, 255, 255));
        jrdMasculino.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jrdMasculino.setText("Masculino");
        jrdMasculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrdMasculinoActionPerformed(evt);
            }
        });
        jPanel1.add(jrdMasculino, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, -1, -1));

        jrdFemenino.setBackground(new java.awt.Color(204, 255, 255));
        jrdFemenino.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jrdFemenino.setText("Femenino");
        jrdFemenino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrdFemeninoActionPerformed(evt);
            }
        });
        jPanel1.add(jrdFemenino, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, -1, -1));

        jtxtDni.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jtxtDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtDniKeyTyped(evt);
            }
        });
        jPanel1.add(jtxtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 340, -1));

        jtxtApellido.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(jtxtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 340, -1));

        jtxtNombre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(jtxtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 340, -1));

        jTextField4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField4.setText("jTextField1");
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 340, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("DNI");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 204));

        jbtnReporte.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtnReporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/reportar.png"))); // NOI18N
        jbtnReporte.setText("Reportes");
        jbtnReporte.setBorderPainted(false);
        jbtnReporte.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jbtnReporte.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jbtnReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnReporteActionPerformed(evt);
            }
        });

        jbtnEliminar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/borrar.png"))); // NOI18N
        jbtnEliminar.setText("Eliminar");
        jbtnEliminar.setBorderPainted(false);
        jbtnEliminar.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jbtnEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jbtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEliminarActionPerformed(evt);
            }
        });

        jbtnGuardar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/guardar.png"))); // NOI18N
        jbtnGuardar.setText("Guardar");
        jbtnGuardar.setBorderPainted(false);
        jbtnGuardar.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jbtnGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jbtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnGuardarActionPerformed(evt);
            }
        });

        jbtnModificar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/guardar.png"))); // NOI18N
        jbtnModificar.setText("Modificar");
        jbtnModificar.setBorderPainted(false);
        jbtnModificar.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jbtnModificar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jbtnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtnReporte)
                    .addComponent(jbtnEliminar)
                    .addComponent(jbtnGuardar)
                    .addComponent(jbtnModificar))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jbtnEliminar, jbtnGuardar, jbtnReporte});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbtnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbtnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtnReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel5.setText("Registro de Personal");

        jtblPersonal.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jtblPersonal.setModel(new javax.swing.table.DefaultTableModel(
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
        jtblPersonal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtblPersonalMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtblPersonal);

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));

        jtxtBuscar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jtxtBuscar.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jtxtBuscarCaretUpdate(evt);
            }
        });

        jrdNombre.setBackground(new java.awt.Color(204, 255, 204));
        jrdNombre.setText("Nombre");
        jrdNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrdNombreActionPerformed(evt);
            }
        });

        jrdApellido.setBackground(new java.awt.Color(204, 255, 204));
        jrdApellido.setText("Apellido");
        jrdApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrdApellidoActionPerformed(evt);
            }
        });

        jrdDni.setBackground(new java.awt.Color(204, 255, 204));
        jrdDni.setText("DNI");
        jrdDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrdDniActionPerformed(evt);
            }
        });

        jchkTodos.setBackground(new java.awt.Color(204, 255, 204));
        jchkTodos.setText("Todos");
        jchkTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jchkTodosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jrdNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jrdApellido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jrdDni)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtxtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jchkTodos)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrdApellido)
                    .addComponent(jrdNombre)
                    .addComponent(jrdDni)
                    .addComponent(jtxtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jchkTodos))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        btnCerrar.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnCerrar.setForeground(new java.awt.Color(255, 0, 102));
        btnCerrar.setText("x");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        jbtnNuevo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/nuevo.png"))); // NOI18N
        jbtnNuevo.setText("Nuevo");
        jbtnNuevo.setBorderPainted(false);
        jbtnNuevo.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jbtnNuevo.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jbtnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbtnNuevo)))
                        .addGap(30, 30, 30)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addGap(53, 53, 53)
                                .addComponent(btnCerrar))
                            .addComponent(jScrollPane1))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnCerrar)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jrdMasculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrdMasculinoActionPerformed
        if (jrdMasculino.isSelected() == true) {
            sexo = "M";
        }
    }//GEN-LAST:event_jrdMasculinoActionPerformed

    private void jrdApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrdApellidoActionPerformed
        tipo = 2;        
        buscar();
    }//GEN-LAST:event_jrdApellidoActionPerformed

    private void jrdDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrdDniActionPerformed
        tipo = 3;        
        buscar();
    }//GEN-LAST:event_jrdDniActionPerformed

    private void jbtnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNuevoActionPerformed
        try {
            PersonalC.limpiarComp();
        } catch (Exception e) {

        }
    }//GEN-LAST:event_jbtnNuevoActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void jbtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGuardarActionPerformed
        try {
            controlador.registrar();
            cargarValoresTabla();
            PersonalC.limpiarComp();
        } catch (Exception e) {
            System.out.println("Error en jbtnGuardar: " + e.getMessage());
        }
    }//GEN-LAST:event_jbtnGuardarActionPerformed

    private void jrdFemeninoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrdFemeninoActionPerformed
        if (jrdFemenino.isSelected() == true) {
            sexo = "F";
        }
    }//GEN-LAST:event_jrdFemeninoActionPerformed

    private void jbtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEliminarActionPerformed
        try {
            int fila = jtblPersonal.getSelectedRow();
            if (fila >= 0) {
                int opcion = JOptionPane.showConfirmDialog(null, "¿Deseas eliminar el registro?", "Eliminación del Registro", JOptionPane.YES_NO_OPTION);
                if (opcion == JOptionPane.YES_OPTION) {
                    codigo = Integer.parseInt(jtblPersonal.getValueAt(fila, 0).toString());
                    controlador.eliminar();
                    cargarValoresTabla();
                }
            }
        } catch (Exception e) {
            System.out.println("Error en jbtnEliminar " + e.getMessage());
        }
    }//GEN-LAST:event_jbtnEliminarActionPerformed

    private void jbtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnModificarActionPerformed
        try {
            int fila = jtblPersonal.getSelectedRow();
            if (fila >= 0) {
                int opcion = JOptionPane.showConfirmDialog(null, "¿Deseas modificar el registro?", "Actualización del Registro", JOptionPane.YES_NO_OPTION);
                if (opcion == JOptionPane.YES_OPTION) {
                    codigo = Integer.parseInt(jtblPersonal.getValueAt(fila, 0).toString());
                    controlador.modificar();
                    cargarValoresTabla();
                }
            }
        } catch (Exception e) {
            System.out.println("Error en jbtnModificar " + e.getMessage());
        }
    }//GEN-LAST:event_jbtnModificarActionPerformed

    private void jtblPersonalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtblPersonalMouseClicked
        try {
            int fila = jtblPersonal.getSelectedRow();
            if (fila >= 0) {
                codigo = Integer.parseInt(jtblPersonal.getValueAt(fila, 0).toString());
                jtxtNombre.setText(jtblPersonal.getValueAt(fila, 1).toString());
                jtxtApellido.setText(jtblPersonal.getValueAt(fila, 2).toString());
                sexo = jtblPersonal.getValueAt(fila, 3).toString();
                if (sexo.equals("M")) {
                    jrdMasculino.setSelected(true);
                    jrdFemenino.setSelected(false);
                } else {
                    jrdFemenino.setSelected(true);
                    jrdMasculino.setSelected(false);
                }
                jtxtDni.setText(jtblPersonal.getValueAt(fila, 4).toString());
            }
        } catch (Exception e) {
            System.out.println("Error en jtblPersonal " + e.getMessage());
        }
    }//GEN-LAST:event_jtblPersonalMouseClicked

    private void jrdNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrdNombreActionPerformed
        tipo = 1;
        buscar();
    }//GEN-LAST:event_jrdNombreActionPerformed

    private void buscar(){
        jtxtBuscar.requestFocus();
        jchkTodos.setSelected(false);
        jtxtBuscar.setText("");
    }
    private void jtxtBuscarCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jtxtBuscarCaretUpdate
        System.out.println("Tamaño de Texto " + jtxtBuscar.getText().length());
        try {
            dato = jtxtBuscar.getText();
            cargarValoresTabla();
        } catch (Exception e) {
            
        }
    }//GEN-LAST:event_jtxtBuscarCaretUpdate

    private void jchkTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jchkTodosActionPerformed
        try {
            if (jchkTodos.isSelected()== true){
                tipo = 0;
                cargarValoresTabla();
                jtxtBuscar.setText("");
                dato ="";
                grupoFiltro.clearSelection();
            }
        } catch (Exception e) {
            
        }
    }//GEN-LAST:event_jchkTodosActionPerformed

    private void jbtnReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnReporteActionPerformed
        try {
            JasperPrint reporte = ReportGenerator.generarReporteSimplePersonal();
//            JasperExportManager.exportReportToPdfFile(reporte,"Listado_Personal.pdf");
            JasperViewer viewer = new JasperViewer(reporte, false);
            viewer.setVisible(true);
        } catch (Exception e) {
            System.out.println("Error en jbtnReporte " + e.getMessage());
        }
    }//GEN-LAST:event_jbtnReporteActionPerformed

    private void jtxtDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtDniKeyTyped
        char car = evt.getKeyChar();
        if ( car <'0' || car > '9'){
            evt.consume();
        }
//        System.out.println("Imprimo " + car);        
    }//GEN-LAST:event_jtxtDniKeyTyped

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PersonalReg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PersonalReg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PersonalReg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PersonalReg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new PersonalReg().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(PersonalReg.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.ButtonGroup grupoFiltro;
    public static javax.swing.ButtonGroup grupoSexo;
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JButton jbtnEliminar;
    private javax.swing.JButton jbtnGuardar;
    private javax.swing.JButton jbtnModificar;
    private javax.swing.JButton jbtnNuevo;
    private javax.swing.JButton jbtnReporte;
    private javax.swing.JCheckBox jchkTodos;
    private javax.swing.JRadioButton jrdApellido;
    private javax.swing.JRadioButton jrdDni;
    public static javax.swing.JRadioButton jrdFemenino;
    public static javax.swing.JRadioButton jrdMasculino;
    private javax.swing.JRadioButton jrdNombre;
    private javax.swing.JTable jtblPersonal;
    public static javax.swing.JTextField jtxtApellido;
    private javax.swing.JTextField jtxtBuscar;
    public static javax.swing.JTextField jtxtDni;
    public static javax.swing.JTextField jtxtNombre;
    // End of variables declaration//GEN-END:variables
}
