package View;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author 1 Ifdhal Hadi
 * @author 2 Irsyad Muhamad Al Anshori
 * 
 */

public class viewDaftarKampus extends javax.swing.JFrame {

    /**
     * Creates new form vDaftarKampus
     */
    public viewDaftarKampus() {
        initComponents();
        //setSize(360,640);
        this.setLocation(515, 45);
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
        b3BarTelU = new javax.swing.JButton();
        bLogoutDaftarKampus = new javax.swing.JButton();
        bProfileTelU = new javax.swing.JButton();
        bProfileITB = new javax.swing.JButton();
        bProfileUnpad = new javax.swing.JButton();
        bProfileUPI = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(360, 640));
        jPanel1.setLayout(null);

        b3BarTelU.setBackground(new java.awt.Color(255, 255, 255));
        b3BarTelU.setFont(new java.awt.Font("DejaVu Serif", 1, 12)); // NOI18N
        b3BarTelU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Button Back.png"))); // NOI18N
        b3BarTelU.setBorder(null);
        b3BarTelU.setBorderPainted(false);
        b3BarTelU.setContentAreaFilled(false);
        b3BarTelU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3BarTelUActionPerformed(evt);
            }
        });
        jPanel1.add(b3BarTelU);
        b3BarTelU.setBounds(15, 40, 30, 40);

        bLogoutDaftarKampus.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        bLogoutDaftarKampus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Button Logout.png"))); // NOI18N
        bLogoutDaftarKampus.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bLogoutDaftarKampus.setBorderPainted(false);
        bLogoutDaftarKampus.setContentAreaFilled(false);
        bLogoutDaftarKampus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLogoutDaftarKampusActionPerformed(evt);
            }
        });
        jPanel1.add(bLogoutDaftarKampus);
        bLogoutDaftarKampus.setBounds(260, 100, 85, 33);

        bProfileTelU.setBackground(new java.awt.Color(255, 255, 255));
        bProfileTelU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Telyu.png"))); // NOI18N
        bProfileTelU.setBorderPainted(false);
        bProfileTelU.setContentAreaFilled(false);
        bProfileTelU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bProfileTelUActionPerformed(evt);
            }
        });
        jPanel1.add(bProfileTelU);
        bProfileTelU.setBounds(35, 177, 130, 160);

        bProfileITB.setBackground(new java.awt.Color(255, 255, 255));
        bProfileITB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/ITB.png"))); // NOI18N
        bProfileITB.setBorderPainted(false);
        bProfileITB.setContentAreaFilled(false);
        bProfileITB.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bProfileITB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bProfileITBActionPerformed(evt);
            }
        });
        jPanel1.add(bProfileITB);
        bProfileITB.setBounds(177, 177, 150, 160);

        bProfileUnpad.setBackground(new java.awt.Color(255, 255, 255));
        bProfileUnpad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Unpad.png"))); // NOI18N
        bProfileUnpad.setBorderPainted(false);
        bProfileUnpad.setContentAreaFilled(false);
        bProfileUnpad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bProfileUnpadActionPerformed(evt);
            }
        });
        jPanel1.add(bProfileUnpad);
        bProfileUnpad.setBounds(10, 350, 160, 150);

        bProfileUPI.setBackground(new java.awt.Color(255, 255, 255));
        bProfileUPI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/UPI.png"))); // NOI18N
        bProfileUPI.setBorderPainted(false);
        bProfileUPI.setContentAreaFilled(false);
        bProfileUPI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bProfileUPIActionPerformed(evt);
            }
        });
        jPanel1.add(bProfileUPI);
        bProfileUPI.setBounds(177, 353, 160, 153);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/BG-Kampus.png"))); // NOI18N
        jPanel1.add(background);
        background.setBounds(0, 0, 360, 640);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bLogoutDaftarKampusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLogoutDaftarKampusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bLogoutDaftarKampusActionPerformed

    private void b3BarTelUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3BarTelUActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b3BarTelUActionPerformed

    private void bProfileTelUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bProfileTelUActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bProfileTelUActionPerformed

    private void bProfileITBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bProfileITBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bProfileITBActionPerformed

    private void bProfileUnpadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bProfileUnpadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bProfileUnpadActionPerformed

    private void bProfileUPIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bProfileUPIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bProfileUPIActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b3BarTelU;
    private javax.swing.JButton bLogoutDaftarKampus;
    private javax.swing.JButton bProfileITB;
    private javax.swing.JButton bProfileTelU;
    private javax.swing.JButton bProfileUPI;
    private javax.swing.JButton bProfileUnpad;
    private javax.swing.JLabel background;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    public void showMessage(String message, String title, int type){
        JOptionPane.showMessageDialog(null, message, title, type);
    }
    
    // BUTTON
    
    public JButton getB3BarTelU() {
        return b3BarTelU;
    }

    public JButton getBLogoutDaftarKampus() {
        return bLogoutDaftarKampus;
    }

    public JButton getBProfileITB() {
        return bProfileITB;
    }

    public JButton getBProfileTelU() {
        return bProfileTelU;
    }

    public JButton getBProfileUPI() {
        return bProfileUPI;
    }

    public JButton getBProfileUnpad() {
        return bProfileUnpad;
    }

    // ACTION LISTENER
    
    public void addActionListener (ActionListener e) {
        b3BarTelU.addActionListener(e);
        bLogoutDaftarKampus.addActionListener(e);
        bProfileTelU.addActionListener(e);
        bProfileITB.addActionListener(e);
        bProfileUnpad.addActionListener(e);
        bProfileUPI.addActionListener(e);
    }
    
}
