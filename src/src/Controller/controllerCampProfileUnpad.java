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

public class controllerCampProfileUnpad extends MouseAdapter implements ActionListener {
    private viewCampProfileUnpad view;
    
    public controllerCampProfileUnpad(){
        view = new viewCampProfileUnpad();
        view.addActionListener(this);
        view.setVisible(true); 
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        
        // Kembali ke menu sebelumnya
        if(source.equals(view.getB3BarUnpad())){
            view.dispose();
            new controllerDaftarKampus();
            
        // Keluar dari akun
        } else if(source.equals(view.getbLogoutUnpad())){
            view.dispose();
            new controllerLogin();
        }
    }
}
