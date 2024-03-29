package View;

import java.awt.event.ActionListener;
import javax.swing.JButton;
/**
 *
 * @author 1 Irawansyah
 * 
 */

public class viewResult extends javax.swing.JFrame {

    /**
     * Creates new form vDeskripISTP
     */
    public viewResult() {
        initComponents();
        this.setLocation(515, 45);
        setSize(360,640);
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
        btn3bar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        IntrovExtro = new javax.swing.JLabel();
        SensingvIntution = new javax.swing.JLabel();
        ThinkingvFeeling = new javax.swing.JLabel();
        JudgingvPerceiving = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(360, 640));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(360, 640));

        btn3bar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Button 3 Bar.png"))); // NOI18N
        btn3bar.setBorder(null);

        jLabel1.setFont(new java.awt.Font("Gill Sans MT", 1, 16)); // NOI18N
        jLabel1.setText("MBTI Result");

        btnLogout.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnLogout.setText("Logout");
        btnLogout.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Gill Sans MT", 1, 16)); // NOI18N
        jLabel2.setText("Result MBTI");

        jLabel3.setText("Hasil Kepribadianmu adalah");

        IntrovExtro.setText("???");

        SensingvIntution.setText("???");

        ThinkingvFeeling.setText("???");

        JudgingvPerceiving.setText("???");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btn3bar)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                        .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(IntrovExtro)
                        .addGap(0, 0, 0)
                        .addComponent(SensingvIntution)
                        .addGap(0, 0, 0)
                        .addComponent(ThinkingvFeeling)
                        .addGap(0, 0, 0)
                        .addComponent(JudgingvPerceiving)))
                .addGap(15, 15, 15))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(134, 134, 134))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(115, 115, 115))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(btn3bar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(btnLogout))))
                .addGap(35, 35, 35)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IntrovExtro)
                    .addComponent(SensingvIntution)
                    .addComponent(ThinkingvFeeling)
                    .addComponent(JudgingvPerceiving))
                .addContainerGap(436, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IntrovExtro;
    private javax.swing.JLabel JudgingvPerceiving;
    private javax.swing.JLabel SensingvIntution;
    private javax.swing.JLabel ThinkingvFeeling;
    private javax.swing.JButton btn3bar;
    private javax.swing.JButton btnLogout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables


    public JButton getBtn3bar() {
        return btn3bar;
    }

    public JButton getBtnLogout() {
        return btnLogout;
    }

    public void setIntrovExtro(String a) {
        this.IntrovExtro.setText(a);
    }

    public void setJudgingvPerceiving(String b) {
        this.JudgingvPerceiving.setText(b);
    }

    public void setSensingvIntution(String c) {
        this.SensingvIntution.setText(c);
    }

    public void setThinkingvFeeling(String d) {
        this.ThinkingvFeeling.setText(d);
    }

    public String getIntrovExtro() {
        return IntrovExtro.getText();
    }

    public String getJudgingvPerceiving() {
        return JudgingvPerceiving.getText();
    }

    public String getSensingvIntution() {
        return SensingvIntution.getText();
    }

    public String getThinkingvFeeling() {
        return ThinkingvFeeling.getText();
    }
    
    public void addActionListener (ActionListener e) {
        btn3bar.addActionListener(e);
        btnLogout.addActionListener(e);
    }
}
