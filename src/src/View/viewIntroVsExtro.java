package View;

import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author 1 Irawansyah
 * 
 */

public class viewIntroVsExtro extends javax.swing.JFrame {

    /**
     * Creates new form vDeskripISTP
     */
    public viewIntroVsExtro() {
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

        IntrovertVsExstrovert = new javax.swing.ButtonGroup();
        btn3bar = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        Introvert = new javax.swing.JRadioButton();
        Ekstrovert = new javax.swing.JRadioButton();
        Next = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

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

        Introvert.setBackground(new java.awt.Color(255, 255, 255));
        IntrovertVsExstrovert.add(Introvert);
        Introvert.setContentAreaFilled(false);
        getContentPane().add(Introvert);
        Introvert.setBounds(35, 245, 21, 21);

        Ekstrovert.setBackground(new java.awt.Color(255, 255, 255));
        IntrovertVsExstrovert.add(Ekstrovert);
        Ekstrovert.setContentAreaFilled(false);
        getContentPane().add(Ekstrovert);
        Ekstrovert.setBounds(35, 290, 21, 21);

        Next.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Button Next.png"))); // NOI18N
        Next.setBorder(null);
        Next.setBorderPainted(false);
        Next.setContentAreaFilled(false);
        getContentPane().add(Next);
        Next.setBounds(137, 394, 87, 27);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Tes MBTI Soal 1.png"))); // NOI18N
        getContentPane().add(background);
        background.setBounds(0, 0, 360, 640);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Ekstrovert;
    private javax.swing.JRadioButton Introvert;
    private javax.swing.ButtonGroup IntrovertVsExstrovert;
    private javax.swing.JButton Next;
    private javax.swing.JLabel background;
    private javax.swing.JButton btn3bar;
    private javax.swing.JButton btnLogout;
    // End of variables declaration//GEN-END:variables
    
    public String getIntrovert() {
        if(Introvert.isSelected()){
            return "I";     //return Introvert
        } else if(Ekstrovert.isSelected()){
            return "E";     //return Extrovert
        }
        return "null";
    }
//    public JRadioButton getEkstrovert() {
//        return Ekstrovert;
//    }

    public JButton getBtn3bar() {
        return btn3bar;
    }

    public JButton getBtnLogout() {
        return btnLogout;
    }

    public JButton getNext() {
        return Next;
    }

//    public JButton getBack() {
//        return Back;
//    }
    
    public void addActionListener (ActionListener e) {
        Ekstrovert.addActionListener(e);
        Introvert.addActionListener(e);
        btn3bar.addActionListener(e);
        btnLogout.addActionListener(e);
        Next.addActionListener(e);
        //Back.addActionListener(e);
    }
}
