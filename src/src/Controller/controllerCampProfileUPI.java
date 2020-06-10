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

public class controllerCampProfileUPI extends MouseAdapter implements ActionListener {
    private viewCampProfileUPI view;
    
    public controllerCampProfileUPI(){
        view = new viewCampProfileUPI();
        view.addActionListener(this);
        view.setVisible(true); 
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        
        // Kembali ke menu sebelumnya
        if(source.equals(view.getB3BarUPI())){
            view.dispose();
            new controllerDaftarKampus();
            
        // Keluar dari akun
        } else if(source.equals(view.getbLogoutUPI())){
            view.dispose();
            new controllerLogin();
        }
    }
}