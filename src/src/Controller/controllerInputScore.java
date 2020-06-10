package Controller;

import View.viewInputScore;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;

/**
 *
 * @author 1 Irawansyah
 * 
 */

public class controllerInputScore extends MouseAdapter implements ActionListener{
        private viewInputScore view;
    
    public controllerInputScore(){
        view = new viewInputScore();
        view.addActionListener(this);
        view.setVisible(true); 
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        
        // Kembali ke menu sebelumnya
        if(source.equals(view.getB3BarInputScore())){
            view.dispose();
            new controllerMenuUser();
        // Keluar dari akun
        } else if(source.equals(view.getbLogoutInputScore())){
            view.dispose();
            new controllerLogin();
        } else if(source.equals(view.getbIPA())){
            view.showMessage("Kamu Memilih Jurusan IPA", "Success", 1);
            view.dispose();
            new controllerInputScoreIPA(); 
        } else if(source.equals(view.getbIPS())){
            view.showMessage("Kamu Memilih Jurusan IPS", "Success", 1);
            view.dispose();
            new controllerInputScoreIPS();
        }
    }
}