/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.viewDeskripsiENFJ;
import View.viewDeskripsiENTJ;
import View.viewDeskripsiINTJ;
import View.viewDeskripsiINTP;
import View.viewDeskripsiISFJ;
import View.viewInputScoreIPA;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;

/**
 *
 * @author Irawansyah
 */
public class controllerDeskripsiISFJ extends MouseAdapter implements ActionListener { 
    private viewDeskripsiISFJ view;
    
    public controllerDeskripsiISFJ(){
        view = new viewDeskripsiISFJ();
        view.addActionListener(this);
        view.setVisible(true); 
    }
    

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        if(source.equals(view.getB3Bar())){
            view.dispose();
            new controllerMenuUser();
        } else if(source.equals(view.getbLogout())){
            view.dispose();
            new controllerLogin();
        } else if(source.equals(view.getButtonOk())){
            view.dispose();
            new controllerMenuUser();
//            new controllerviewSoalNo_1();
        }
    }
}
