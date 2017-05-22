/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Design;

/**
 *
 * @author asus
 */
public class Rectangle extends javax.swing.JFrame {

    /**
     * Creates new form Rectangle
     */
     int x1, y1, x2, y2, x3, y3, x4, y4, pj, lb, ytr, xtr, she, degree;
     float skala;
     int wSize = 480 / 2, grid = 20;

    public Rectangle() {
        initComponents();
        jScrollPane2.setViewportView(new Koordinat());
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        xa = new javax.swing.JTextField();
        ya = new javax.swing.JTextField();
        Hapus = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        Back = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        l = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        sumbuX = new javax.swing.JButton();
        sumbuY = new javax.swing.JButton();
        sumbuXY = new javax.swing.JButton();
        tambahTitik = new javax.swing.JButton();
        munculKotak = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        p = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        xt = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        yt = new javax.swing.JTextField();
        translasi = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        sudut = new javax.swing.JTextField();
        rotasi = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        shear = new javax.swing.JTextField();
        xShear = new javax.swing.JButton();
        yShear = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        scale = new javax.swing.JTextField();
        scaleButton = new javax.swing.JButton();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(153, 255, 204));

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("Points");

        Hapus.setText("Clear");
        Hapus.setFocusable(false);
        Hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HapusActionPerformed(evt);
            }
        });

        jLabel14.setText("X1");

        jLabel15.setText("Y1");

        Back.setText("Back");
        Back.setFocusable(false);
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Instruction", 1, 48)); // NOI18N
        jLabel18.setText("RECTANGLE");

        sumbuX.setText("Sumbu X");
        sumbuX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumbuXActionPerformed(evt);
            }
        });
        jTabbedPane3.addTab("Sumbu X", sumbuX);

        sumbuY.setText("Sumbu Y");
        sumbuY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumbuYActionPerformed(evt);
            }
        });
        jTabbedPane3.addTab("Sumbu Y", sumbuY);

        sumbuXY.setText("Sumbu X = Y");
        sumbuXY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumbuXYActionPerformed(evt);
            }
        });
        jTabbedPane3.addTab("Sumbu X = Y", sumbuXY);

        tambahTitik.setText("Show Point");
        tambahTitik.setFocusable(false);
        tambahTitik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahTitikActionPerformed(evt);
            }
        });

        munculKotak.setText("Show Rectangle");
        munculKotak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                munculKotakActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Reflection");

        p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pActionPerformed(evt);
            }
        });

        jLabel7.setText("P");

        jLabel8.setText("L");

        jTabbedPane1.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);

        xt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xtActionPerformed(evt);
            }
        });

        jLabel16.setText("XT");

        jLabel17.setText("YT");

        translasi.setText("Translate");
        translasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                translasiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(xt, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(yt, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addComponent(translasi, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(xt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(yt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(translasi))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Translation", jPanel1);

        jLabel1.setText("Sudut");

        rotasi.setText("Rotate");
        rotasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rotasiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sudut, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(rotasi)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(sudut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rotasi))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Rotation", jPanel4);

        shear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shearActionPerformed(evt);
            }
        });

        xShear.setText("X");
        xShear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xShearActionPerformed(evt);
            }
        });

        yShear.setText("Y");
        yShear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yShearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(shear, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(xShear)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(yShear)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(xShear)
                        .addComponent(yShear))
                    .addComponent(shear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Shear", jPanel3);

        scaleButton.setText("Scale");
        scaleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scaleButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scale, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(scaleButton)
                .addGap(64, 64, 64))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(scale, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(scaleButton))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Scale", jPanel5);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator4)
                            .addComponent(jTabbedPane3)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tambahTitik, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel15)
                                            .addComponent(jLabel14))
                                        .addGap(22, 22, 22)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(xa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ya, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(36, 36, 36)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel7))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(p, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(l, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(munculKotak))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel3))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Hapus)
                        .addGap(37, 37, 37)
                        .addComponent(Back)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(225, 225, 225))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(54, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(xa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14)
                            .addComponent(p, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ya, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15)
                            .addComponent(l, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tambahTitik)
                            .addComponent(munculKotak))
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(120, 120, 120)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Hapus)
                                    .addComponent(Back))
                                .addContainerGap())))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pActionPerformed

    private void munculKotakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_munculKotakActionPerformed
        // TODO add your handling code here:
        try{
            x1 = Integer.parseInt(xa.getText());
            y1 = Integer.parseInt(ya.getText());
            pj = Integer.parseInt(p.getText());
            lb = Integer.parseInt(l.getText());
            jScrollPane2.setViewportView(new KoorKotak(x1, y1, x1+pj, y1, x1+pj, y1+lb, x1, y1+lb, 2));
        }catch(Exception e){

        }
    }//GEN-LAST:event_munculKotakActionPerformed

    private void tambahTitikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahTitikActionPerformed
        // TODO add your handling code here:
        try {
            x1 = Integer.parseInt(xa.getText());
            y1 = Integer.parseInt(ya.getText());
            try{
                pj = Integer.parseInt(p.getText());
                lb = Integer.parseInt(l.getText());
                jScrollPane2.setViewportView(new KoorKotak(x1, y1, x1+pj, y1, x1+pj, y1+lb, x1, y1+lb, 1));
            }catch(Exception e){
                jScrollPane2.setViewportView(new KoorKotak(x1+pj, y1, 30, 30, 50, 50, 80, 80, 1));
            }

        }catch(Exception e){

        }
        check(2);
    }//GEN-LAST:event_tambahTitikActionPerformed

    private void sumbuXYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumbuXYActionPerformed
        // TODO add your handling code here:
        try{
            x1 = Integer.parseInt(xa.getText());
            y1 = Integer.parseInt(ya.getText());
            pj = Integer.parseInt(p.getText());
            lb = Integer.parseInt(l.getText());
            jScrollPane2.setViewportView(new KoorKotak(x1, y1, x1+pj, y1, x1+pj, y1+lb, x1, y1+lb, 6));
        }catch(Exception e){

        }
    }//GEN-LAST:event_sumbuXYActionPerformed

    private void sumbuYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumbuYActionPerformed
        // TODO add your handling code here:
        try{
            x1 = Integer.parseInt(xa.getText());
            y1 = Integer.parseInt(ya.getText());
            pj = Integer.parseInt(p.getText());
            lb = Integer.parseInt(l.getText());
            jScrollPane2.setViewportView(new KoorKotak(x1, y1, x1+pj, y1, x1+pj, y1+lb, x1, y1+lb, 5));
        }catch(Exception e){

        }
    }//GEN-LAST:event_sumbuYActionPerformed

    private void sumbuXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumbuXActionPerformed
        // TODO add your handling code here:
        try{
            x1 = Integer.parseInt(xa.getText());
            y1 = Integer.parseInt(ya.getText());
            pj = Integer.parseInt(p.getText());
            lb = Integer.parseInt(l.getText());
            jScrollPane2.setViewportView(new KoorKotak(x1, y1, x1+pj, y1, x1+pj, y1+lb, x1, y1+lb, 4));
        }catch(Exception e){

        }
    }//GEN-LAST:event_sumbuXActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        new TitikBidang().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackActionPerformed

    private void HapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HapusActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        jScrollPane2.setViewportView(new Koordinat());
        xa.setText("");
        ya.setText("");
        xt.setText("");
        yt.setText("");
        p.setText("");
        l.setText("");
        shear.setText("");
        sudut.setText("");
        scale.setText("");
    }//GEN-LAST:event_HapusActionPerformed

    private void scaleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scaleButtonActionPerformed
        // TODO add your handling code here:
        try{
            skala = Float.parseFloat(scale.getText());
            x1 = Integer.parseInt(xa.getText());
            y1 = Integer.parseInt(ya.getText());
            pj = Integer.parseInt(p.getText());
            lb = Integer.parseInt(l.getText());
//            jScrollPane2.setViewportView(new KoorKotak(skala * x1 * grid + wSize, wSize - grid * y1 * skala, (x1+pj) * skala * grid + wSize, wSize - grid * y1 * skala,
//                (x1+pj) * skala * grid + wSize, wSize - grid * (y1+lb) * skala, x1 * skala * grid + wSize, wSize - grid * (y1+lb) * skala, skala, 9));
            
//            jScrollPane2.setViewportView(new KoorKotak((int)(skala * x1 * grid + wSize), (int)(wSize - grid * y1 * skala), 
//                    (int)((x1+pj) * skala * grid + wSize), (int)(wSize - grid * y1 * skala),
//                    (int)((x1+pj) * skala * grid + wSize), (int)(wSize - grid * (y1+lb) * skala), 
//                    (int)(x1 * skala * grid + wSize), (int)(wSize - grid * (y1+lb) * skala), skala, 9));
              jScrollPane2.setViewportView(new KoorKotak(x1, y1, x1+pj, y1, x1+pj, y1+lb, x1, y1+lb, skala, 9));
            
        }catch(Exception e){

        }
    }//GEN-LAST:event_scaleButtonActionPerformed

    private void yShearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yShearActionPerformed
        // TODO add your handling code here:
        try{
            she = Integer.parseInt(shear.getText());
            x1 = Integer.parseInt(xa.getText());
            y1 = Integer.parseInt(ya.getText());
            pj = Integer.parseInt(p.getText());
            lb = Integer.parseInt(l.getText());
            jScrollPane2.setViewportView(new KoorKotak(x1, y1, x1+pj, y1, x1+pj, y1+lb, x1, y1+lb, 0, she, 7));
            //            jScrollPane2.setViewportView(new KoorKotak(x1, y1 + (she * x1), x1+pj, y1 + (she * (x1+pj)), x1+pj,
                //                    (y1+lb) + (she * (x1+pj)) , x1, (y1+lb) + (she *x1), she, 7));
        }catch(Exception e){

        }
    }//GEN-LAST:event_yShearActionPerformed

    private void xShearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xShearActionPerformed
        // TODO add your handling code here:
        try{
            she = Integer.parseInt(shear.getText());
            x1 = Integer.parseInt(xa.getText());
            y1 = Integer.parseInt(ya.getText());
            pj = Integer.parseInt(p.getText());
            lb = Integer.parseInt(l.getText());
            jScrollPane2.setViewportView(new KoorKotak(x1, y1, x1+pj, y1, x1+pj, y1+lb, x1, y1+lb, she, 0, 7));
            //            jScrollPane2.setViewportView(new KoorKotak(x1 + (she * y1), y1, (x1+pj) + (she * y1), y1,
                //                    (x1+pj) + (she * (y1+lb)), y1+lb, x1 + (she * (y1 + lb)), y1+lb, she, 0, 7));
        }catch(Exception e){

        }
    }//GEN-LAST:event_xShearActionPerformed

    private void shearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_shearActionPerformed

    private void rotasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rotasiActionPerformed
        // TODO add your handling code here:
        try{
            degree = Integer.parseInt(sudut.getText());
            x1 = Integer.parseInt(xa.getText());
            y1 = Integer.parseInt(ya.getText());
            pj = Integer.parseInt(p.getText());
            lb = Integer.parseInt(l.getText());
            jScrollPane2.setViewportView(new KoorKotak(x1, y1, x1+pj, y1, x1+pj, y1+lb, x1, y1+lb, degree, 8));
        }catch(Exception e){

        }
    }//GEN-LAST:event_rotasiActionPerformed

    private void translasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_translasiActionPerformed
        // TODO add your handling code here:
        try{
            x1 = Integer.parseInt(xa.getText());
            y1 = Integer.parseInt(ya.getText());
            pj = Integer.parseInt(p.getText());
            lb = Integer.parseInt(l.getText());
            xtr = Integer.parseInt(xt.getText());
            ytr = Integer.parseInt(yt.getText());
            jScrollPane2.setViewportView(new KoorKotak(x1, y1, x1+pj, y1, x1+pj, y1+lb, x1, y1+lb, xtr, ytr, 3));
        }catch(Exception e){

        }
    }//GEN-LAST:event_translasiActionPerformed

    private void xtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_xtActionPerformed
    
     private void check(int x) {
        try {
            x1 = Integer.parseInt(xa.getText());
            y1 = Integer.parseInt(ya.getText());
            x2 = Integer.parseInt(xt.getText());
            y2 = Integer.parseInt(yt.getText());
            x4 = Integer.parseInt(p.getText());
            y4 = Integer.parseInt(l.getText());
            jScrollPane2.setViewportView(new Koordinat(x1, y1, x2, y2, x));
        } catch (Exception e) {
        }
    }
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Rectangle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Rectangle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Rectangle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Rectangle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Rectangle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton Hapus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField l;
    private javax.swing.JButton munculKotak;
    private javax.swing.JTextField p;
    private javax.swing.JButton rotasi;
    private javax.swing.JTextField scale;
    private javax.swing.JButton scaleButton;
    private javax.swing.JTextField shear;
    private javax.swing.JTextField sudut;
    private javax.swing.JButton sumbuX;
    private javax.swing.JButton sumbuXY;
    private javax.swing.JButton sumbuY;
    private javax.swing.JButton tambahTitik;
    private javax.swing.JButton translasi;
    private javax.swing.JButton xShear;
    private javax.swing.JTextField xa;
    private javax.swing.JTextField xt;
    private javax.swing.JButton yShear;
    private javax.swing.JTextField ya;
    private javax.swing.JTextField yt;
    // End of variables declaration//GEN-END:variables
}