package Controller;

import View.viewDeskripsiINFJ;
import View.viewDeskripsiINTJ;
import View.viewInputScoreIPA;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;

/**
 *
 * @author Irawansyah
 * 
 */

public class controllerDeskripsiINFJ extends MouseAdapter implements ActionListener { 
    private viewDeskripsiINFJ view;
    
    public controllerDeskripsiINFJ(){
        view = new viewDeskripsiINFJ();
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
