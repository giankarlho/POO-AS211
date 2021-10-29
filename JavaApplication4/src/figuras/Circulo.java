package figuras;

public class Circulo extends javax.swing.JPanel {
 
    public Circulo() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtxtRadio = new javax.swing.JTextField();
        jlblArea = new javax.swing.JLabel();
        jlblPerimetro = new javax.swing.JLabel();
        jlblFigura = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(710, 500));
        setMinimumSize(new java.awt.Dimension(710, 500));
        setPreferredSize(new java.awt.Dimension(710, 500));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setText("Radio");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("Area");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 200, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 0));
        jLabel4.setText("Circunferencia");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 320, -1, -1));

        jtxtRadio.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jtxtRadio.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jtxtRadioCaretUpdate(evt);
            }
        });
        jtxtRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtRadioActionPerformed(evt);
            }
        });
        add(jtxtRadio, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 100, 30));

        jlblArea.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlblArea.setForeground(new java.awt.Color(255, 255, 255));
        jlblArea.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        add(jlblArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 240, 110, 40));

        jlblPerimetro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlblPerimetro.setForeground(new java.awt.Color(255, 255, 255));
        jlblPerimetro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        add(jlblPerimetro, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 360, 100, 40));

        jlblFigura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/circulo.png"))); // NOI18N
        add(jlblFigura, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtRadioActionPerformed
//        try {
//            double radio = Double.parseDouble(jtxtRadio.getText());
//            jlblArea.setText(String.valueOf(Math.round(Math.pow(radio,2)*Math.PI)));
//            jlblPerimetro.setText(String.valueOf(radio*2*Math.PI));
//        } catch (Exception e) {
//            System.out.println("Error en " + e.getMessage());
//        }
    }//GEN-LAST:event_jtxtRadioActionPerformed

    private void jtxtRadioCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jtxtRadioCaretUpdate
        try {
            double radio = Double.parseDouble(jtxtRadio.getText());
            jlblArea.setText(String.valueOf(Math.round(Math.pow(radio,2)*Math.PI)));
            jlblPerimetro.setText(String.valueOf(radio*2*Math.PI));
        } catch (Exception e) {
            System.out.println("Error en " + e.getMessage());
        }
    }//GEN-LAST:event_jtxtRadioCaretUpdate


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jlblArea;
    private javax.swing.JLabel jlblFigura;
    private javax.swing.JLabel jlblPerimetro;
    private javax.swing.JTextField jtxtRadio;
    // End of variables declaration//GEN-END:variables
}
