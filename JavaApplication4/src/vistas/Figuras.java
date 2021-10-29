package vistas;

import figuras.Circulo;
import figuras.Cuadrado;
import figuras.Pentagono;
import figuras.Triangulo;
import java.awt.BorderLayout;
import java.awt.Component;

public class Figuras extends javax.swing.JFrame {

    // es el constructor
    public Figuras() {
        initComponents();
        // permite centrar el formulario
        this.setLocationRelativeTo(null);
        jgrFigura.add(jrCirculo);
        jgrFigura.add(jrCuadrado);
        jgrFigura.add(jrPentagono);
        jgrFigura.add(jrTriangulo);
        this.setSize(720, 600);
        jpPrincipal.setLocation(0, 0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jgrFigura = new javax.swing.ButtonGroup();
        jpMenu = new javax.swing.JPanel();
        jrCuadrado = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jcboFigura = new javax.swing.JComboBox<>();
        jrCirculo = new javax.swing.JRadioButton();
        jrPentagono = new javax.swing.JRadioButton();
        jrTriangulo = new javax.swing.JRadioButton();
        jpPrincipal = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(750, 650));
        setMinimumSize(new java.awt.Dimension(750, 650));
        setPreferredSize(new java.awt.Dimension(750, 650));

        jpMenu.setBackground(new java.awt.Color(204, 255, 204));
        jpMenu.setMaximumSize(new java.awt.Dimension(600, 50));
        jpMenu.setMinimumSize(new java.awt.Dimension(600, 50));
        jpMenu.setPreferredSize(new java.awt.Dimension(600, 50));

        jrCuadrado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jrCuadrado.setText("Cuadrado");
        jrCuadrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrCuadradoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Figura");

        jcboFigura.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jcboFigura.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Cuadrado", "Circulo", "Triangulo", "Pentagono" }));
        jcboFigura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcboFiguraActionPerformed(evt);
            }
        });

        jrCirculo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jrCirculo.setText("Circulo");
        jrCirculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrCirculoActionPerformed(evt);
            }
        });

        jrPentagono.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jrPentagono.setText("Pentagono");

        jrTriangulo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jrTriangulo.setText("Triangulo");

        javax.swing.GroupLayout jpMenuLayout = new javax.swing.GroupLayout(jpMenu);
        jpMenu.setLayout(jpMenuLayout);
        jpMenuLayout.setHorizontalGroup(
            jpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jcboFigura, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jrCuadrado)
                .addGap(18, 18, 18)
                .addComponent(jrCirculo)
                .addGap(10, 10, 10)
                .addComponent(jrTriangulo)
                .addGap(18, 18, 18)
                .addComponent(jrPentagono)
                .addContainerGap(100, Short.MAX_VALUE))
        );
        jpMenuLayout.setVerticalGroup(
            jpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrCuadrado)
                    .addComponent(jLabel2)
                    .addComponent(jcboFigura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jrCirculo)
                    .addComponent(jrPentagono)
                    .addComponent(jrTriangulo))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jpPrincipal.setMaximumSize(new java.awt.Dimension(710, 500));
        jpPrincipal.setMinimumSize(new java.awt.Dimension(710, 500));
        jpPrincipal.setPreferredSize(new java.awt.Dimension(710, 500));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/area.jpg"))); // NOI18N
        jLabel3.setMaximumSize(new java.awt.Dimension(710, 500));
        jLabel3.setMinimumSize(new java.awt.Dimension(710, 500));
        jLabel3.setPreferredSize(new java.awt.Dimension(710, 500));

        javax.swing.GroupLayout jpPrincipalLayout = new javax.swing.GroupLayout(jpPrincipal);
        jpPrincipal.setLayout(jpPrincipalLayout);
        jpPrincipalLayout.setHorizontalGroup(
            jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpPrincipalLayout.setVerticalGroup(
            jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jpPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 710, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jpMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcboFiguraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcboFiguraActionPerformed
//        JOptionPane.showMessageDialog(rootPane, jcboFigura.getSelectedItem().toString(), "getSelectedItem", HEIGHT);
//        System.out.println("SelectedItem :" +  jcboFigura.getSelectedItem().toString());
        String figura = jcboFigura.getSelectedItem().toString();
        if ("Cuadrado".equals(figura)) {
            Cuadrado cuadrado = new Cuadrado();
            cuadrado.setSize(700, 500);
            cuadrado.setLocation(0, 0);
            mostrar(cuadrado);
//            jpPrincipal.removeAll();
//            jpPrincipal.add(cuadrado, BorderLayout.CENTER);
//            jpPrincipal.revalidate();
//            jpPrincipal.repaint();
        } else if ("Circulo".equals(figura)) {
            Circulo circulo = new Circulo();
            circulo.setSize(700, 500);
            circulo.setLocation(0, 0);
            mostrar(circulo);
//            jpPrincipal.removeAll();
//            jpPrincipal.add(circulo, BorderLayout.CENTER);
//            jpPrincipal.revalidate();
//            jpPrincipal.repaint();
        } else if ("Triangulo".equals(figura)) {
            Triangulo triangulo = new Triangulo();
            triangulo.setSize(700, 500);
            triangulo.setLocation(0, 0);
            mostrar(triangulo);
//            jpPrincipal.removeAll();
//            jpPrincipal.add(triangulo, BorderLayout.CENTER);
//            jpPrincipal.revalidate();
//            jpPrincipal.repaint();

        } else if ("Pentagono".equals(figura)) {
            Pentagono pentagono = new Pentagono();
            pentagono.setSize(700, 500);
            pentagono.setLocation(0, 0);
            mostrar(pentagono);
//            jpPrincipal.removeAll();
//            jpPrincipal.add(pentagono,BorderLayout.CENTER);
//            jpPrincipal.revalidate();
//            jpPrincipal.repaint();
        }

    }//GEN-LAST:event_jcboFiguraActionPerformed

    private void jrCuadradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrCuadradoActionPerformed
        if (jrCuadrado.isSelected()== true){
            Cuadrado cuadrado = new Cuadrado();
            cuadrado.setSize(700, 500);
            cuadrado.setLocation(0, 0);
            mostrar(cuadrado);
        }
    }//GEN-LAST:event_jrCuadradoActionPerformed

    private void jrCirculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrCirculoActionPerformed
        if (jrCirculo.isSelected()==true){
            Circulo circulo = new Circulo();
            circulo.setSize(700, 500);
            circulo.setLocation(0, 0);
            mostrar(circulo);
        }
    }//GEN-LAST:event_jrCirculoActionPerformed

    public void mostrar(Object object) {
        jpPrincipal.removeAll();
        jpPrincipal.add((Component) object, BorderLayout.CENTER);
        jpPrincipal.revalidate();
        jpPrincipal.repaint();
    }

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
            java.util.logging.Logger.getLogger(Figuras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Figuras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Figuras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Figuras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Figuras().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JComboBox<String> jcboFigura;
    private javax.swing.ButtonGroup jgrFigura;
    private javax.swing.JPanel jpMenu;
    private javax.swing.JPanel jpPrincipal;
    private javax.swing.JRadioButton jrCirculo;
    private javax.swing.JRadioButton jrCuadrado;
    private javax.swing.JRadioButton jrPentagono;
    private javax.swing.JRadioButton jrTriangulo;
    // End of variables declaration//GEN-END:variables
}
