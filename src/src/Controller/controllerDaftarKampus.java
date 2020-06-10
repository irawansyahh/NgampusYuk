package Controller;

/**
 *
 * @author Irsyad Muhamad Al Anshori
 * 
 */

import View.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;

public class controllerDaftarKampus extends MouseAdapter implements ActionListener{
    private viewDaftarKampus view;
    
    public controllerDaftarKampus(){
        view = new viewDaftarKampus();
        view.addActionListener(this);
        view.setVisible(true); 
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        
        // Kembali ke menu sebelumnya
        if(source.equals(view.getB3BarTelU())){
            view.dispose();
            new controllerMenuUser();
        
        // Keluar dari akun
        } else if(source.equals(view.getBLogoutDaftarKampus())){
            view.dispose();
            new controllerLogin();
            
        // Masuk ke menu Profile TelU
        } else if(source.equals(view.getBProfileTelU())){
            view.dispose();
            new controllerCampProfileTelU();
            
        // Masuk ke menu Profile ITB
        } else if(source.equals(view.getBProfileITB())){
            view.dispose();
            new controllerCampProfileITB();
            
        // Masuk ke menu Profile Unpad
        }else if(source.equals(view.getBProfileUnpad())){
            view.dispose();
            new controllerCampProfileUnpad();    
            
        // Masuk ke menu Profile UPI
        }else if(source.equals(view.getBProfileUPI())){
            view.dispose();
            new controllerCampProfileUPI();        
        }
    }
}
