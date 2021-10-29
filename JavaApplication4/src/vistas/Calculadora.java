package vistas;

import servicios.CalculadoraServices;

public class Calculadora extends javax.swing.JFrame {

    char operador = ' ';
    double nro1, nro2 = 0.0;

    // el constructor es el 1er. método que se ejecuta en una clase
    // es de modo public y tiene el mismo nombre de la Clase
    public Calculadora() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPNros = new javax.swing.JPanel();
        jBtn1 = new javax.swing.JButton();
        jBtn2 = new javax.swing.JButton();
        jBtn3 = new javax.swing.JButton();
        jBtn4 = new javax.swing.JButton();
        jBtn5 = new javax.swing.JButton();
        jBtn6 = new javax.swing.JButton();
        jBtn7 = new javax.swing.JButton();
        jBtn8 = new javax.swing.JButton();
        jBtn9 = new javax.swing.JButton();
        jbtn0 = new javax.swing.JButton();
        jbtnBorrar = new javax.swing.JButton();
        JPResultado = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtxtHistoria = new javax.swing.JTextArea();
        jtxtValor = new javax.swing.JTextField();
        JPOperadores = new javax.swing.JPanel();
        jbtnSuma = new javax.swing.JButton();
        jbtnResta = new javax.swing.JButton();
        jbtnDivision = new javax.swing.JButton();
        jbtnProducto = new javax.swing.JButton();
        jbtnResultado = new javax.swing.JButton();
        JPAlgoritmos = new javax.swing.JPanel();
        jbtnPrimo = new javax.swing.JButton();
        jbtnFactorial = new javax.swing.JButton();
        jbtnPerfecto = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jbtnReset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JPNros.setBackground(new java.awt.Color(153, 255, 153));
        JPNros.setForeground(new java.awt.Color(153, 255, 153));

        jBtn1.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jBtn1.setForeground(new java.awt.Color(255, 0, 0));
        jBtn1.setText("1");
        jBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn1ActionPerformed(evt);
            }
        });

        jBtn2.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jBtn2.setForeground(new java.awt.Color(255, 0, 0));
        jBtn2.setText("2");
        jBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn2ActionPerformed(evt);
            }
        });

        jBtn3.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jBtn3.setForeground(new java.awt.Color(255, 0, 0));
        jBtn3.setText("3");
        jBtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn3ActionPerformed(evt);
            }
        });

        jBtn4.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jBtn4.setForeground(new java.awt.Color(255, 0, 0));
        jBtn4.setText("4");
        jBtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn4ActionPerformed(evt);
            }
        });

        jBtn5.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jBtn5.setForeground(new java.awt.Color(255, 0, 0));
        jBtn5.setText("5");
        jBtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn5ActionPerformed(evt);
            }
        });

        jBtn6.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jBtn6.setForeground(new java.awt.Color(255, 0, 0));
        jBtn6.setText("6");
        jBtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn6ActionPerformed(evt);
            }
        });

        jBtn7.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jBtn7.setForeground(new java.awt.Color(255, 0, 0));
        jBtn7.setText("7");
        jBtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn7ActionPerformed(evt);
            }
        });

        jBtn8.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jBtn8.setForeground(new java.awt.Color(255, 0, 0));
        jBtn8.setText("8");
        jBtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn8ActionPerformed(evt);
            }
        });

        jBtn9.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jBtn9.setForeground(new java.awt.Color(255, 0, 0));
        jBtn9.setText("9");
        jBtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn9ActionPerformed(evt);
            }
        });

        jbtn0.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jbtn0.setForeground(new java.awt.Color(255, 0, 0));
        jbtn0.setText("0");
        jbtn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn0ActionPerformed(evt);
            }
        });

        jbtnBorrar.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnBorrar.setForeground(new java.awt.Color(153, 153, 255));
        jbtnBorrar.setText("<--");
        jbtnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBorrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JPNrosLayout = new javax.swing.GroupLayout(JPNros);
        JPNros.setLayout(JPNrosLayout);
        JPNrosLayout.setHorizontalGroup(
            JPNrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPNrosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPNrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPNrosLayout.createSequentialGroup()
                        .addComponent(jBtn4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBtn5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBtn6))
                    .addGroup(JPNrosLayout.createSequentialGroup()
                        .addComponent(jBtn1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBtn2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBtn3))
                    .addGroup(JPNrosLayout.createSequentialGroup()
                        .addGroup(JPNrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jbtn0)
                            .addGroup(JPNrosLayout.createSequentialGroup()
                                .addComponent(jBtn7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jBtn8)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(JPNrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jBtn9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbtnBorrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        JPNrosLayout.setVerticalGroup(
            JPNrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPNrosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPNrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPNrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JPNrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPNrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbtn0, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                    .addComponent(jbtnBorrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        JPResultado.setBackground(new java.awt.Color(153, 255, 255));

        jtxtHistoria.setColumns(20);
        jtxtHistoria.setRows(5);
        jScrollPane1.setViewportView(jtxtHistoria);

        jtxtValor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtxtValor.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout JPResultadoLayout = new javax.swing.GroupLayout(JPResultado);
        JPResultado.setLayout(JPResultadoLayout);
        JPResultadoLayout.setHorizontalGroup(
            JPResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPResultadoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jtxtValor))
                .addContainerGap())
        );
        JPResultadoLayout.setVerticalGroup(
            JPResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPResultadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtxtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7))
        );

        JPOperadores.setBackground(new java.awt.Color(255, 204, 204));

        jbtnSuma.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jbtnSuma.setForeground(new java.awt.Color(255, 51, 153));
        jbtnSuma.setText("+");
        jbtnSuma.setMaximumSize(new java.awt.Dimension(70, 40));
        jbtnSuma.setMinimumSize(new java.awt.Dimension(70, 40));
        jbtnSuma.setPreferredSize(new java.awt.Dimension(70, 40));
        jbtnSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSumaActionPerformed(evt);
            }
        });

        jbtnResta.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jbtnResta.setForeground(new java.awt.Color(255, 51, 153));
        jbtnResta.setText("-");
        jbtnResta.setMaximumSize(new java.awt.Dimension(70, 40));
        jbtnResta.setMinimumSize(new java.awt.Dimension(70, 40));
        jbtnResta.setPreferredSize(new java.awt.Dimension(70, 40));
        jbtnResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRestaActionPerformed(evt);
            }
        });

        jbtnDivision.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jbtnDivision.setForeground(new java.awt.Color(255, 51, 153));
        jbtnDivision.setText("/");
        jbtnDivision.setMaximumSize(new java.awt.Dimension(70, 40));
        jbtnDivision.setMinimumSize(new java.awt.Dimension(70, 40));
        jbtnDivision.setPreferredSize(new java.awt.Dimension(70, 40));
        jbtnDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDivisionActionPerformed(evt);
            }
        });

        jbtnProducto.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jbtnProducto.setForeground(new java.awt.Color(255, 51, 153));
        jbtnProducto.setText("*");
        jbtnProducto.setMaximumSize(new java.awt.Dimension(70, 40));
        jbtnProducto.setMinimumSize(new java.awt.Dimension(70, 40));
        jbtnProducto.setPreferredSize(new java.awt.Dimension(70, 40));
        jbtnProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnProductoActionPerformed(evt);
            }
        });

        jbtnResultado.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jbtnResultado.setForeground(new java.awt.Color(255, 51, 153));
        jbtnResultado.setText("=");
        jbtnResultado.setMaximumSize(new java.awt.Dimension(70, 40));
        jbtnResultado.setMinimumSize(new java.awt.Dimension(70, 40));
        jbtnResultado.setPreferredSize(new java.awt.Dimension(70, 40));
        jbtnResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnResultadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JPOperadoresLayout = new javax.swing.GroupLayout(JPOperadores);
        JPOperadores.setLayout(JPOperadoresLayout);
        JPOperadoresLayout.setHorizontalGroup(
            JPOperadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPOperadoresLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPOperadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtnSuma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnResta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnDivision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPOperadoresLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbtnResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        JPOperadoresLayout.setVerticalGroup(
            JPOperadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPOperadoresLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbtnSuma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtnResta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtnProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnDivision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtnResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        JPAlgoritmos.setBackground(new java.awt.Color(102, 102, 255));

        jbtnPrimo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbtnPrimo.setText("Primo");
        jbtnPrimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPrimoActionPerformed(evt);
            }
        });

        jbtnFactorial.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbtnFactorial.setText("Factorial");
        jbtnFactorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnFactorialActionPerformed(evt);
            }
        });

        jbtnPerfecto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbtnPerfecto.setText("Perfecto");

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setText("Fibonacci");

        jbtnReset.setText("Reset");
        jbtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JPAlgoritmosLayout = new javax.swing.GroupLayout(JPAlgoritmos);
        JPAlgoritmos.setLayout(JPAlgoritmosLayout);
        JPAlgoritmosLayout.setHorizontalGroup(
            JPAlgoritmosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPAlgoritmosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPAlgoritmosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbtnFactorial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtnPrimo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JPAlgoritmosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPAlgoritmosLayout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(JPAlgoritmosLayout.createSequentialGroup()
                        .addComponent(jbtnPerfecto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbtnReset)
                        .addGap(24, 24, 24))))
        );
        JPAlgoritmosLayout.setVerticalGroup(
            JPAlgoritmosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPAlgoritmosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPAlgoritmosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnPrimo)
                    .addComponent(jbtnPerfecto)
                    .addComponent(jbtnReset))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPAlgoritmosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnFactorial)
                    .addComponent(jButton4))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JPResultado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JPAlgoritmos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JPNros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JPOperadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JPResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JPAlgoritmos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JPNros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JPOperadores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn1ActionPerformed
        jtxtValor.setText(jtxtValor.getText() + jBtn1.getText());
    }//GEN-LAST:event_jBtn1ActionPerformed

    private void jBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn2ActionPerformed
        jtxtValor.setText(jtxtValor.getText() + jBtn2.getText());
    }//GEN-LAST:event_jBtn2ActionPerformed

    private void jBtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn3ActionPerformed
        jtxtValor.setText(jtxtValor.getText() + jBtn3.getText());
    }//GEN-LAST:event_jBtn3ActionPerformed

    private void jBtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn4ActionPerformed
        jtxtValor.setText(jtxtValor.getText() + jBtn4.getText());
    }//GEN-LAST:event_jBtn4ActionPerformed

    private void jbtnSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSumaActionPerformed
        nro1 = Double.parseDouble(jtxtValor.getText());
        operador = '+';
        jtxtHistoria.setText(jtxtHistoria.getText() + " " + nro1 + " " +  operador);
        // estoy convirtiendo la cadena de tipo texto a un valor double
        
        jtxtValor.setText("");
    }//GEN-LAST:event_jbtnSumaActionPerformed

    private void jbtnRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRestaActionPerformed
        nro1 = Double.parseDouble(jtxtValor.getText());
        operador = '-';
        jtxtHistoria.setText(jtxtHistoria.getText() + " " + nro1 + " " +  operador);
        jtxtValor.setText("");
    }//GEN-LAST:event_jbtnRestaActionPerformed

    private void jbtnProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnProductoActionPerformed
        nro1 = Double.parseDouble(jtxtValor.getText());
        operador = '*';
        jtxtHistoria.setText(jtxtHistoria.getText() + " " + nro1 + " " +  operador);
        jtxtValor.setText("");
    }//GEN-LAST:event_jbtnProductoActionPerformed

    private void jbtnDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDivisionActionPerformed
        nro1 = Double.parseDouble(jtxtValor.getText());
        operador = '/';
        jtxtHistoria.setText(jtxtHistoria.getText() + " " + nro1 + " " +  operador);
        jtxtValor.setText("");
    }//GEN-LAST:event_jbtnDivisionActionPerformed

    private void jbtnResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnResultadoActionPerformed
        nro2 = Double.parseDouble(jtxtValor.getText());
        double resultado = CalculadoraServices.calcular(nro1, operador, nro2);        
        
        jtxtHistoria.setText(jtxtHistoria.getText() + " " + nro2 + " = " +  resultado);
        // estoy convirtiendo el valor de tipo double a un tipo texto
        jtxtValor.setText(String.valueOf(resultado));
        nro1 = resultado;
    }//GEN-LAST:event_jbtnResultadoActionPerformed

    private void jbtnFactorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnFactorialActionPerformed
        jtxtValor.setText(String.valueOf(CalculadoraServices.calcularFactorial(Integer.valueOf(jtxtValor.getText()))));
    }//GEN-LAST:event_jbtnFactorialActionPerformed

    private void jBtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn5ActionPerformed
        jtxtValor.setText(jtxtValor.getText() + jBtn5.getText());
    }//GEN-LAST:event_jBtn5ActionPerformed

    private void jBtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn6ActionPerformed
        jtxtValor.setText(jtxtValor.getText() + jBtn6.getText());
    }//GEN-LAST:event_jBtn6ActionPerformed

    private void jBtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn7ActionPerformed
        jtxtValor.setText(jtxtValor.getText() + jBtn7.getText());
    }//GEN-LAST:event_jBtn7ActionPerformed

    private void jBtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn8ActionPerformed
        jtxtValor.setText(jtxtValor.getText() + jBtn8.getText());
    }//GEN-LAST:event_jBtn8ActionPerformed

    private void jBtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn9ActionPerformed
        jtxtValor.setText(jtxtValor.getText() + jBtn9.getText());
    }//GEN-LAST:event_jBtn9ActionPerformed

    private void jbtn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn0ActionPerformed
        jtxtValor.setText(jtxtValor.getText() + jbtn0.getText());
    }//GEN-LAST:event_jbtn0ActionPerformed

    private void jbtnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBorrarActionPerformed
        // cuantos caracteres tengo en el texto
        int cantidadCaracter = jtxtValor.getText().length();
        if (cantidadCaracter != 0) {
            jtxtValor.setText(jtxtValor.getText().substring(0,cantidadCaracter - 1));
        }        
    }//GEN-LAST:event_jbtnBorrarActionPerformed

    private void jbtnPrimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPrimoActionPerformed
        jtxtValor.setText(CalculadoraServices.esPrimo(Double.parseDouble(jtxtValor.getText())));
    }//GEN-LAST:event_jbtnPrimoActionPerformed

    private void jbtnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnResetActionPerformed
        jtxtValor.setText("");
        nro1 = 0; nro2 = 0; 
        jtxtHistoria.setText("");
    }//GEN-LAST:event_jbtnResetActionPerformed

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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPAlgoritmos;
    private javax.swing.JPanel JPNros;
    private javax.swing.JPanel JPOperadores;
    private javax.swing.JPanel JPResultado;
    private javax.swing.JButton jBtn1;
    private javax.swing.JButton jBtn2;
    private javax.swing.JButton jBtn3;
    private javax.swing.JButton jBtn4;
    private javax.swing.JButton jBtn5;
    private javax.swing.JButton jBtn6;
    private javax.swing.JButton jBtn7;
    private javax.swing.JButton jBtn8;
    private javax.swing.JButton jBtn9;
    private javax.swing.JButton jButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtn0;
    private javax.swing.JButton jbtnBorrar;
    private javax.swing.JButton jbtnDivision;
    private javax.swing.JButton jbtnFactorial;
    private javax.swing.JButton jbtnPerfecto;
    private javax.swing.JButton jbtnPrimo;
    private javax.swing.JButton jbtnProducto;
    private javax.swing.JButton jbtnReset;
    private javax.swing.JButton jbtnResta;
    private javax.swing.JButton jbtnResultado;
    private javax.swing.JButton jbtnSuma;
    private javax.swing.JTextArea jtxtHistoria;
    private javax.swing.JTextField jtxtValor;
    // End of variables declaration//GEN-END:variables
}
