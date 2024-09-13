package projectjavadimas;

import java.awt.Color;
import java.awt.Cursor;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import projectjavadimas.connection.myConnection;
import projectjavadimas.dao.dao;
import projectjavadimas.model.modelProject;

public class Login extends javax.swing.JFrame {

    modelProject mod = new modelProject();
    dao crud = new dao();
    Connection koneksi = new myConnection().buatKoneksi();
    Statement stm;
    DefaultTableModel tb;
    ResultSet r;
    
    public Login() {
        initComponents();
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        logUser = new javax.swing.JTextField();
        logPass = new javax.swing.JPasswordField();
        masuk = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        daftar = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setMaximumSize(new java.awt.Dimension(1200, 650));
        setPreferredSize(new java.awt.Dimension(1200, 650));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 77, 67));

        jLabel2.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Pegadaian Digital");

        jLabel1.setFont(new java.awt.Font("Google Sans", 3, 10)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Mengatasi Masalah Tanpa Masalah");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addContainerGap(952, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(0, 0, 0)
                .addComponent(jLabel1)
                .addGap(13, 13, 13))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(1200, 650));

        jPanel2.setBackground(new java.awt.Color(245, 245, 245));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectjavadimas/img/logo1-removebg-preview.png"))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Google Sans", 1, 18)); // NOI18N
        jLabel9.setText("Pegadaian Emas Digital");

        jLabel10.setFont(new java.awt.Font("Google Sans", 1, 18)); // NOI18N
        jLabel10.setText("Masuk");

        logUser.setFont(new java.awt.Font("Google Sans", 0, 14)); // NOI18N
        logUser.setForeground(new java.awt.Color(102, 102, 102));
        logUser.setText("Masukan Username");
        logUser.setMargin(new java.awt.Insets(2, 8, 2, 8));
        logUser.setSelectionColor(new java.awt.Color(0, 77, 67));
        logUser.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                logUserFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                logUserFocusLost(evt);
            }
        });
        logUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logUserActionPerformed(evt);
            }
        });

        logPass.setFont(new java.awt.Font("Google Sans", 0, 14)); // NOI18N
        logPass.setForeground(new java.awt.Color(102, 102, 102));
        logPass.setMargin(new java.awt.Insets(2, 8, 2, 8));
        logPass.setSelectionColor(new java.awt.Color(0, 77, 67));
        logPass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                logPassFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                logPassFocusLost(evt);
            }
        });
        logPass.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                logPassComponentHidden(evt);
            }
        });
        logPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logPassActionPerformed(evt);
            }
        });

        masuk.setBackground(new java.awt.Color(0, 77, 67));
        masuk.setFont(new java.awt.Font("Google Sans", 1, 20)); // NOI18N
        masuk.setForeground(new java.awt.Color(255, 255, 255));
        masuk.setText("Masuk");
        masuk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                masukMouseEntered(evt);
            }
        });
        masuk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masukActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Google Sans", 0, 14)); // NOI18N
        jLabel11.setText("Belum punya akun?");

        daftar.setFont(new java.awt.Font("Google Sans", 1, 16)); // NOI18N
        daftar.setForeground(new java.awt.Color(0, 171, 78));
        daftar.setText("Daftar");
        daftar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                daftarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                daftarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                daftarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(128, 128, 128))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(86, 86, 86))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel10)
                            .addComponent(logUser, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                            .addComponent(logPass)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(masuk, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(daftar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addGap(32, 32, 32)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logUser, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(logPass, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(masuk, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(daftar))
                .addGap(48, 48, 48))
        );

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectjavadimas/img/logo2.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Google Sans", 1, 24)); // NOI18N
        jLabel4.setText("Gadas Emas Tanpa Cemas");

        jLabel5.setFont(new java.awt.Font("Google Sans", 0, 18)); // NOI18N
        jLabel5.setText("Beli dan jual emas dengan fasilitas titipan yang aman karena");

        jLabel6.setFont(new java.awt.Font("Google Sans", 0, 18)); // NOI18N
        jLabel6.setText("Pegadaian telah terdaftar dan diawasi oleh OJK. Mulai Rp 50.000,");

        jLabel7.setFont(new java.awt.Font("Google Sans", 0, 18)); // NOI18N
        jLabel7.setText("sudah bisa punya emas!");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void logUserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_logUserFocusGained
        logUser.setText("");
    }//GEN-LAST:event_logUserFocusGained

    private void logUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_logUserActionPerformed

    private void logUserFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_logUserFocusLost

        if(logUser.getText().isEmpty()){
            logUser.setText(" Masukan Username");
        }
    }//GEN-LAST:event_logUserFocusLost

    private void logPassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_logPassFocusGained
        logPass.setText("");
        logPass.setEchoChar((char) '*');
    }//GEN-LAST:event_logPassFocusGained

    private void logPassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_logPassFocusLost
        if(logPass.getText().isEmpty()){
            logPass.setEchoChar((char) 0);
            logPass.setText(" Masukan Password");
        }
    }//GEN-LAST:event_logPassFocusLost

    private void logPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_logPassActionPerformed

    private void logPassComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_logPassComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_logPassComponentHidden

    private void daftarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_daftarMouseEntered
        daftar.setForeground(new Color(0,77,67));
        daftar.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_daftarMouseEntered

    private void daftarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_daftarMouseExited
        daftar.setForeground(new Color(0,171,78));
    }//GEN-LAST:event_daftarMouseExited

    private void masukMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_masukMouseEntered
        masuk.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_masukMouseEntered

    private void masukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masukActionPerformed
        
        try{
            stm = koneksi.createStatement();
            mod.setUsername(logUser.getText());
            mod.setPassword(logPass.getText());
            r = stm.executeQuery("select username, pass from anggota where username = '" + logUser.getText() + "' and pass = '" + logPass.getText() + "'");
            if(r.next()){
                crud.login(mod);
                String user = logUser.getText().toString();
                MenuUtama main = new MenuUtama(user);
                main.setVisible(true);
                this.dispose();
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Login Gagal");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan pada : " + ex);
        }
    }//GEN-LAST:event_masukActionPerformed

    private void daftarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_daftarMouseClicked
        Daftar daf = new Daftar();
        daf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_daftarMouseClicked

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel daftar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField logPass;
    private javax.swing.JTextField logUser;
    private javax.swing.JButton masuk;
    // End of variables declaration//GEN-END:variables
}
