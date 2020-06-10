package Controller;

/**
 *
 * @author Irawansyah
 * 
 */

import View.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;

public class controllerCampProfileITB extends MouseAdapter implements ActionListener {
    private viewCampProfileITB view;
    
    public controllerCampProfileITB(){
        view = new viewCampProfileITB();
        view.addActionListener(this);
        view.setVisible(true); 
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        
        // Kembali ke menu sebelumnya
        if(source.equals(view.getB3BarITB())){
            view.dispose();
            new controllerDaftarKampus();
            
        // Keluar dari akun
        } else if(source.equals(view.getBLogoutITB())){
            view.dispose();
            new controllerLogin();
        }
    }
}