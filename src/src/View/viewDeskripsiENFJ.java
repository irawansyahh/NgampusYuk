package View;

import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author 1 Kamila Hanum 
 * @author 2 Irawansyah
 * 
 */

public class viewDeskripsiENFJ extends javax.swing.JFrame {

    /**
     * Creates new form vDeskripsiINTJ
     */
    public viewDeskripsiENFJ() {
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

        b3Bar = new javax.swing.JButton();
        bLogout = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(null);

        b3Bar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Button Back.png"))); // NOI18N
        b3Bar.setBorder(null);
        b3Bar.setBorderPainted(false);
        b3Bar.setContentAreaFilled(false);
        getContentPane().add(b3Bar);
        b3Bar.setBounds(21, 45, 15, 27);

        bLogout.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        bLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Button Logout.png"))); // NOI18N
        bLogout.setBorderPainted(false);
        bLogout.setContentAreaFilled(false);
        getContentPane().add(bLogout);
        bLogout.setBounds(260, 105, 90, 30);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/DescENFJ.png"))); // NOI18N
        getContentPane().add(background);
        background.setBounds(0, 0, 360, 640);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b3Bar;
    private javax.swing.JButton bLogout;
    private javax.swing.JLabel background;
    // End of variables declaration//GEN-END:variables

    public JButton getB3Bar() {
        return b3Bar;
    }

    public JButton getbLogout() {
        return bLogout;
    }  
    
    public void addActionListener (ActionListener e) {
        bLogout.addActionListener(e);
        b3Bar.addActionListener(e);
    }
}
