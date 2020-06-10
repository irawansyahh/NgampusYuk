/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.viewAnnouncement;
import View.viewAnnouncement1;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Irawansyah
 */
public class controllerAnnoucement1 extends MouseAdapter implements ActionListener {
    private viewAnnouncement1 view;
    
    public controllerAnnoucement1(){
        view = new viewAnnouncement1();
        view.addActionListener(this);
        view.setVisible(true); 
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        
        // Kembali ke menu sebelumnya
        if(source.equals(view.getB3Bar())){
            view.dispose();
            new controllerAnnoucement();    
        // Keluar dari akun
        } else if(source.equals(view.getBLogout())){
            view.dispose();
            new controllerLogin();
        }else if (source.equals(view.getOk())){
            view.dispose();
            new controllerMenuUser();
        }
    }
}