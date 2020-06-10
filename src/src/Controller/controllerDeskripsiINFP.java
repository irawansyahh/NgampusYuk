package Controller;

import View.viewDeskripsiINFP;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;

/**
 *
 * @author Irawansyah
 * 
 */

public class controllerDeskripsiINFP extends MouseAdapter implements ActionListener { 
    private viewDeskripsiINFP view;
    
    public controllerDeskripsiINFP(){
        view = new viewDeskripsiINFP();
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
