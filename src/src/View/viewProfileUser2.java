package View;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author 1 Irawansyah
 * 
 */

public class viewProfileUser2 extends javax.swing.JFrame {

    /**
     * Creates new form vProfileUser2
     */
    public viewProfileUser2() {
        initComponents();
        this.setLocation(515, 45);
        setSize(375,675);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        b3BarProfileUser1 = new javax.swing.JButton();
        bLogoutProfileUser1 = new javax.swing.JButton();
        labelNama = new javax.swing.JLabel();
        labelEmaill = new javax.swing.JLabel();
        labelJKK = new javax.swing.JLabel();
        labelFullName = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        b3BarProfileUser1.setBackground(new java.awt.Color(255, 255, 255));
        b3BarProfileUser1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Button Back.png"))); // NOI18N
        b3BarProfileUser1.setBorder(null);
        b3BarProfileUser1.setBorderPainted(false);
        b3BarProfileUser1.setContentAreaFilled(false);
        getContentPane().add(b3BarProfileUser1);
        b3BarProfileUser1.setBounds(21, 45, 15, 27);

        bLogoutProfileUser1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        bLogoutProfileUser1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Button Logout.png"))); // NOI18N
        bLogoutProfileUser1.setBorder(null);
        bLogoutProfileUser1.setBorderPainted(false);
        bLogoutProfileUser1.setContentAreaFilled(false);
        getContentPane().add(bLogoutProfileUser1);
        bLogoutProfileUser1.setBounds(260, 105, 87, 27);

        labelNama.setBackground(new java.awt.Color(255, 255, 255));
        labelNama.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        labelNama.setText("{Email}");
        getContentPane().add(labelNama);
        labelNama.setBounds(60, 318, 240, 17);

        labelEmaill.setBackground(new java.awt.Color(255, 255, 255));
        labelEmaill.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        labelEmaill.setText("Irsyad Muhamad");
        getContentPane().add(labelEmaill);
        labelEmaill.setBounds(60, 255, 93, 17);

        labelJKK.setBackground(new java.awt.Color(255, 255, 255));
        labelJKK.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        labelJKK.setText("Laki-laki");
        getContentPane().add(labelJKK);
        labelJKK.setBounds(60, 380, 47, 17);

        labelFullName.setBackground(new java.awt.Color(255, 255, 255));
        labelFullName.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        labelFullName.setForeground(new java.awt.Color(255, 255, 255));
        labelFullName.setText("Email");
        getContentPane().add(labelFullName);
        labelFullName.setBounds(60, 318, 109, 17);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/BG-Account.png"))); // NOI18N
        getContentPane().add(background);
        background.setBounds(0, 0, 360, 640);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b3BarProfileUser1;
    private javax.swing.JButton bLogoutProfileUser1;
    private javax.swing.JLabel background;
    private javax.swing.JLabel labelEmaill;
    private javax.swing.JLabel labelFullName;
    private javax.swing.JLabel labelJKK;
    private javax.swing.JLabel labelNama;
    // End of variables declaration//GEN-END:variables

    public JButton getB3BarProfileUser1() {
        return b3BarProfileUser1;
    }

    public JButton getbLogoutProfileUser1() {
        return b3BarProfileUser1;
    }

//    public void setLabelEmail(String labelEmail) {
//        this.labelEmail.setText(labelEmail);
//    }

    public void setLabelNama(String labelNama) {
        this.labelNama.setText(labelNama);
    }
    
    public void setLabelFullName(String labelFullName) {
        this.labelFullName.setText(labelFullName);
    }

    
    public void addActionListener (ActionListener e) {
        b3BarProfileUser1.addActionListener(e);
        b3BarProfileUser1.addActionListener(e);
    }
}
