/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.viewDeskripsiENFJ;
import View.viewDeskripsiENTJ;
import View.viewDeskripsiESFP;
import View.viewDeskripsiINTJ;
import View.viewDeskripsiINTP;
import View.viewDeskripsiISTP;
import View.viewInputScoreIPA;
import View.viewProfileUser2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;

/**
 *
 * @author Irawansyah
 */
public class controllerProfile extends MouseAdapter implements ActionListener { 
    private viewProfileUser2 view;
    
    public controllerProfile(){
        view = new viewProfileUser2();
        view.addActionListener(this);
        view.setVisible(true);
        view.setLabelNama(controllerLogin.emailornohp);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        if(source.equals(view.getB3BarProfileUser1())){
            view.dispose();
            new controllerMenuUser();
        } else if(source.equals(view.getbLogoutProfileUser1())){
            view.dispose();
            new controllerLogin();
//        } else if(source.equals(view.getButtonOk())){
//            view.dispose();
//            new controllerMenuUser();
//            new controllerviewSoalNo_1();
        }
    }
}
