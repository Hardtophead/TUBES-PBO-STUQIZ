/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.controllerH_Dosen;
import javax.swing.JTextField;

public class H_Dosen extends javax.swing.JFrame {

    controllerH_Dosen cH_Dosen;
            
    public H_Dosen() {
        initComponents();
        cH_Dosen = new controllerH_Dosen(this);
    }

    public JTextField getTxtPertanyaan(){
        return txpertanyaan;
    }
    public void setTxtPertanyaan(String pertanyaan){
        txpertanyaan.setText(pertanyaan);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnlogout = new javax.swing.JButton();
        btntampil = new javax.swing.JButton();
        btnlihatjawaban = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txpertanyaan = new javax.swing.JTextField();
        btntambah = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setForeground(new java.awt.Color(242, 242, 242));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("STUQIZ");

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel2.setText("dosen");

        btnlogout.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnlogout.setText("LOGOUT");
        btnlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogoutActionPerformed(evt);
            }
        });

        btntampil.setBackground(new java.awt.Color(255, 204, 153));
        btntampil.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btntampil.setText("Tampil Soal");
        btntampil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntampilActionPerformed(evt);
            }
        });

        btnlihatjawaban.setBackground(new java.awt.Color(102, 255, 0));
        btnlihatjawaban.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnlihatjawaban.setText("Jawaban Siswa");
        btnlihatjawaban.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlihatjawabanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnlihatjawaban, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btntampil, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addComponent(btnlogout)
                .addGap(16, 16, 16))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(btnlogout)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(btntampil)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnlihatjawaban)))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel8.setText("Pertanyaan :");

        txpertanyaan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txpertanyaanActionPerformed(evt);
            }
        });

        btntambah.setBackground(new java.awt.Color(255, 255, 51));
        btntambah.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btntambah.setText("Tambah");
        btntambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntambahActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel9.setText("Tambah Soal");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txpertanyaan, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(btntambah))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(jLabel9)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txpertanyaan, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btntambah)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogoutActionPerformed
        // TODO add your handling code here:
        cH_Dosen.logout();
    }//GEN-LAST:event_btnlogoutActionPerformed

    private void btntampilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntampilActionPerformed
        // TODO add your handling code here:
        cH_Dosen.tampilSoal();
    }//GEN-LAST:event_btntampilActionPerformed

    private void btntambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntambahActionPerformed
        // TODO add your handling code here:
        cH_Dosen.tambahData();
        cH_Dosen.kosongkan_form();
    }//GEN-LAST:event_btntambahActionPerformed

    private void txpertanyaanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txpertanyaanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txpertanyaanActionPerformed

    private void btnlihatjawabanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlihatjawabanActionPerformed
        // TODO add your handling code here:
        cH_Dosen.tampilJawaban();
    }//GEN-LAST:event_btnlihatjawabanActionPerformed

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
            java.util.logging.Logger.getLogger(H_Dosen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(H_Dosen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(H_Dosen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(H_Dosen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new H_Dosen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnlihatjawaban;
    private javax.swing.JButton btnlogout;
    private javax.swing.JButton btntambah;
    private javax.swing.JButton btntampil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txpertanyaan;
    // End of variables declaration//GEN-END:variables
}
