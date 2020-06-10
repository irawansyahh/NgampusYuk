package Controller;

/**
 *
 * @author Kamila Hanum
 * 
 */

import View.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;

public class controllerCampProfileTelU extends MouseAdapter implements ActionListener {
    private viewCampProfileTelU view;
    
    public controllerCampProfileTelU(){
        view = new viewCampProfileTelU();
        view.addActionListener(this);
        view.setVisible(true); 
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        
        // Kembali ke menu sebelumnya
        if(source.equals(view.getB3BarTelU())){
            view.dispose();
            new controllerDaftarKampus();
        
        // Keluar dari akun
        } else if(source.equals(view.getBLogoutTelU())){
            view.dispose();
            new controllerLogin();
        }
    }
}