package Controller;

/**
 *
 * @author Irsyad Muhamad Al Anshori
 * 
 */

import Model.*;
import View.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;

public class controllerMenuUser extends MouseAdapter implements ActionListener{
    private viewMenuUser view;
    public static String emailornohp;
    
    public controllerMenuUser(){
        view = new viewMenuUser();
        view.addActionListener(this);
        view.setVisible(true); 
        view.setEmail(controllerLogin.emailornohp);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        if(source.equals(view.getB3BarMUser())){
            view.dispose();
        } else if(source.equals(view.getBCollegeInfo())){
            view.dispose();
            new controllerDaftarKampus();
        } else if(source.equals(view.getBLogoutMUser())){
            view.dispose();
            new controllerLogin();
        }else if(source.equals(view.getBMBTIResult())){
            view.dispose();
            new controllerListPersonality();       
        }else if(source.equals(view.getBTestMBTI())){
            view.dispose();
            new controllerInputScore();       
        }else if(source.equals(view.getBAnnounce())){
            view.dispose();
            new controllerAnnoucement();
        }else if (source.equals(view.getProfile())){
            view.dispose();
            new controllerProfile();
        }
    }
}
