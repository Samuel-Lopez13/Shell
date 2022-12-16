/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package shellversion1;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import static java.lang.Thread.sleep;
import java.util.ArrayList;
import javax.swing.JButton;

public class Shell extends javax.swing.JFrame {

    ArrayList<Integer> arreglo = new ArrayList<>();
    ArrayList<Integer> posicion = new ArrayList<>();
    int intercambio;
    int comparacion;

    public Shell() {
        initComponents();
        setSize(616, 639);
        setLocationRelativeTo(null);
        flecha1.setVisible(false);
        flecha2.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        txtAceptar = new javax.swing.JTextField();
        data = new javax.swing.JLabel();
        btnEjecutar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        panelInferior = new javax.swing.JPanel();
        saltos = new javax.swing.JLabel();
        flecha1 = new javax.swing.JLabel();
        flecha2 = new javax.swing.JLabel();
        resultado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(37, 151, 244));

        jLabel1.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Shell");

        btnAceptar.setBackground(new java.awt.Color(233, 121, 26));
        btnAceptar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAceptar.setForeground(new java.awt.Color(255, 255, 255));
        btnAceptar.setText("Aceptar");
        btnAceptar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAceptar.setFocusPainted(false);
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        txtAceptar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtAceptar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAceptar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        data.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        data.setForeground(new java.awt.Color(255, 255, 255));
        data.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        data.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnEjecutar.setBackground(new java.awt.Color(233, 121, 26));
        btnEjecutar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEjecutar.setForeground(new java.awt.Color(255, 255, 255));
        btnEjecutar.setText("Ejecutar");
        btnEjecutar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEjecutar.setFocusPainted(false);
        btnEjecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEjecutarActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(233, 121, 26));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Información");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(data, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAceptar, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(65, 65, 65)
                        .addComponent(btnEjecutar, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 43, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEjecutar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(data, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 170));

        panelInferior.setBackground(new java.awt.Color(37, 151, 244));
        panelInferior.setLayout(null);

        saltos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        saltos.setForeground(new java.awt.Color(255, 255, 255));
        saltos.setText("Valor del Salto: ");
        panelInferior.add(saltos);
        saltos.setBounds(10, 0, 150, 40);

        flecha1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/flecha.png"))); // NOI18N
        flecha1.setText("jLabel2");
        panelInferior.add(flecha1);
        flecha1.setBounds(500, 350, 40, 80);

        flecha2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/flecha.png"))); // NOI18N
        flecha2.setText("jLabel2");
        panelInferior.add(flecha2);
        flecha2.setBounds(550, 350, 40, 80);

        resultado.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        resultado.setForeground(new java.awt.Color(255, 255, 255));
        resultado.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        panelInferior.add(resultado);
        resultado.setBounds(170, 0, 420, 40);

        jScrollPane1.setViewportView(panelInferior);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 610, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        arreglo.add(Integer.parseInt(txtAceptar.getText()));
        txtAceptar.setText("");
        String valores = "";
        for (Integer integer : arreglo) {
            valores += "[" + integer + "] ";
        }
        data.setText(valores);
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnEjecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEjecutarActionPerformed
        generarBotones();
        shell();
    }//GEN-LAST:event_btnEjecutarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Info info = new Info();
        info.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    int tiempo = 2000;

    public void shell() {
        Thread hilo = new Thread() {

            @Override
            public void run() {
                int posicionY = 125;
                try {
                    int salto, i, j, k, auxiliar;
                    salto = arreglo.size() / 2;
                    saltos.setText("Valor de salto: " + salto);
                    while (salto > 0) {
                        for (i = salto; i < arreglo.size(); i++) {
                            j = i - salto;
                            while (j >= 0) {
                                k = j + salto;
                                if (arreglo.get(j) <= arreglo.get(k)) {
                                    sleep(tiempo);
                                    flecha1.setVisible(true);
                                    flecha2.setVisible(true);
                                    resultado.setText("Se estan comparando " + arreglo.get(j) + " y " + arreglo.get(k));
                                    flecha1.setLocation(posicion.get(j), posicionY);
                                    flecha2.setLocation(posicion.get(k), posicionY);
                                    sleep(tiempo);
                                    comparacion++;
                                    j = - 1;
                                } else {
                                    comparacion++;
                                    intercambio++;
                                    sleep(tiempo);
                                    flecha1.setVisible(true);
                                    flecha2.setVisible(true);
                                    resultado.setText("Se estan comparando " + arreglo.get(j) + " y " + arreglo.get(k));
                                    flecha1.setLocation(posicion.get(j), posicionY);
                                    flecha2.setLocation(posicion.get(k), posicionY);
                                    sleep(tiempo);
                                    resultado.setText("Se estan intercambiando " + arreglo.get(j) + " y " + arreglo.get(k));
                                    auxiliar = arreglo.get(j);
                                    //auxiliar == arreglo.get(j) = 4
                                    arreglo.set(j, arreglo.get(k));
                                    //Arreglo[j] == arreglo.get(k) = 3
                                    arreglo.set(k, auxiliar);
                                    //Arreglo[k] == auxiliar = 4
                                    sleep(tiempo);
                                    for (Integer integer : arreglo) {
                                        System.out.println(arreglo);
                                    }

//                                        panelInferior.remove(btn);
                                    sleep(tiempo);
                                    x = 10;
                                    y += 70;
                                    flecha1.setVisible(false);
                                    flecha2.setVisible(false);
                                    posicionY += 70;
                                    for (int l = 0; l < arreglo.size(); l++) {
                                        JButton btn;
                                        btn = new JButton(arreglo.get(l) + "");
                                        btn.setBackground(new Color(233, 121, 26));
                                        btn.setFont(new Font("Segoe UI", Font.BOLD, 12));
                                        btn.setForeground(Color.WHITE);
                                        btn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                                        btn.setBounds(x, y, 60, 60);
                                        x += 70;
                                        panelInferior.add(btn);

                                        panelInferior.setPreferredSize(new Dimension(599, y + 140));

                                        repaint();
                                    }
                                    j -= salto;
                                }
                            }
                        }
                        salto = salto / 2;
                        saltos.setText("Valor de salto: " + salto);
                    }
                } catch (InterruptedException ex) {

                }
            }
        };
        hilo.start();
    }

    int x = 10;
    int y = 50;

    public void generarBotones() {
        posicion = new ArrayList<>();
        int valor = 20;
        posicion.add(valor);
        for (int i = 0; i < arreglo.size(); i++) {
            JButton btn;
            btn = new JButton(arreglo.get(i) + "");
            btn.setBackground(new Color(233, 121, 26));
            btn.setFont(new Font("Segoe UI", Font.BOLD, 12));
            btn.setForeground(Color.WHITE);
            btn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            btn.setBounds(x, y, 60, 60);
            x += 70;
            valor += 70;
            posicion.add(valor);

            panelInferior.add(btn);
            repaint();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnEjecutar;
    private javax.swing.JLabel data;
    private javax.swing.JLabel flecha1;
    private javax.swing.JLabel flecha2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelInferior;
    private javax.swing.JLabel resultado;
    private javax.swing.JLabel saltos;
    private javax.swing.JTextField txtAceptar;
    // End of variables declaration//GEN-END:variables
}
