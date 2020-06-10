package View;

import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author 1 Irawansyah
 * 
 */

public class viewSensingVsIntution extends javax.swing.JFrame {

    /**
     * Creates new form vDeskripISTP
     */
    public viewSensingVsIntution() {
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

        SensingVsIntution = new javax.swing.ButtonGroup();
        Sensing = new javax.swing.JRadioButton();
        Intution = new javax.swing.JRadioButton();
        btn3bar = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        Next = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        Sensing.setBackground(new java.awt.Color(255, 255, 255));
        SensingVsIntution.add(Sensing);
        Sensing.setContentAreaFilled(false);
        Sensing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SensingActionPerformed(evt);
            }
        });
        getContentPane().add(Sensing);
        Sensing.setBounds(35, 237, 21, 21);

        Intution.setBackground(new java.awt.Color(255, 255, 255));
        SensingVsIntution.add(Intution);
        Intution.setContentAreaFilled(false);
        getContentPane().add(Intution);
        Intution.setBounds(35, 285, 21, 21);

        btn3bar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Button Back.png"))); // NOI18N
        btn3bar.setBorder(null);
        btn3bar.setBorderPainted(false);
        btn3bar.setContentAreaFilled(false);
        getContentPane().add(btn3bar);
        btn3bar.setBounds(21, 45, 15, 27);

        btnLogout.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Button Logout.png"))); // NOI18N
        btnLogout.setBorder(null);
        btnLogout.setBorderPainted(false);
        btnLogout.setContentAreaFilled(false);
        getContentPane().add(btnLogout);
        btnLogout.setBounds(260, 105, 87, 27);

        Next.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Button Next.png"))); // NOI18N
        Next.setBorder(null);
        Next.setBorderPainted(false);
        Next.setContentAreaFilled(false);
        getContentPane().add(Next);
        Next.setBounds(137, 394, 87, 27);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Test MBTI Soal 2.png"))); // NOI18N
        getContentPane().add(background);
        background.setBounds(0, 0, 360, 640);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SensingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SensingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SensingActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Intution;
    private javax.swing.JButton Next;
    private javax.swing.JRadioButton Sensing;
    private javax.swing.ButtonGroup SensingVsIntution;
    private javax.swing.JLabel background;
    private javax.swing.JButton btn3bar;
    private javax.swing.JButton btnLogout;
    // End of variables declaration//GEN-END:variables
    
    public String getIntution() {
        if(Sensing.isSelected()){
            return "S";     //return Sensing
        }else if(Intution.isSelected()){
            return "N";     //return Intution
        }
        return "null";
    }

    public JButton getNext() {
        return Next;
    }
    

//    public JRadioButton getSensing() {
//        return Sensing;
//    }

    public JButton getBtn3bar() {
        return btn3bar;
    }

    public JButton getBtnLogout() {
        return btnLogout;
    }

//    public JButton getBack1() {
//        return Back1;
//    }
    
    public void addActionListener (ActionListener e) {
        Intution.addActionListener(e);
        Sensing.addActionListener(e);
        btn3bar.addActionListener(e);
        btnLogout.addActionListener(e);
        Next.addActionListener(e);
//        Back1.addActionListener(e);
    }
}
