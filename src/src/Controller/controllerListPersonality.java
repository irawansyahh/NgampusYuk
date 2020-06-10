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

public class controllerListPersonality extends MouseAdapter implements ActionListener{
    private viewListPersonality view;
    
    public controllerListPersonality(){
        view = new viewListPersonality();
        view.addActionListener(this);
        view.setVisible(true); 
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        if(source.equals(view.getB3BarMUser())){
            view.dispose();
            new controllerMenuUser();
        } else if(source.equals(view.getBLogoutMUser())){
            view.dispose();
            new controllerLogin();    
        }else if(source.equals(view.getbENFJ())){
            view.dispose();
            new controllerDeskripsiENFJ();
        }else if(source.equals(view.getbENFP())){
            view.dispose();
            new controllerDeskripsiENFP();
        }else if(source.equals(view.getbENTJ())){
            view.dispose();
            new controllerDeskripsiENTJ();
        }else if(source.equals(view.getbENTP())){
            view.dispose();
            new controllerDeskripsiENTP();
        }else if(source.equals(view.getbESFJ())){
            view.dispose();
            new controllerDeskripsiESFJ();
        }else if(source.equals(view.getbESFP())){
            view.dispose();
            new controllerDeskripsiESFP();
        }else if(source.equals(view.getbESTJ())){
            view.dispose();
            new controllerDeskripsiESTJ();
        }else if(source.equals(view.getbESTP())){
            view.dispose();
            new controllerDeskripsiESTP();
        }else if(source.equals(view.getbINFJ())){
            view.dispose();
            new controllerDeskripsiINFJ();
        }else if(source.equals(view.getbINFP())){
            view.dispose();
            new controllerDeskripsiINFP();
        }else if(source.equals(view.getbINTJ())){
            view.dispose();
            new controllerDeskripsiINTJ();
        }else if(source.equals(view.getbINTP())){
            view.dispose();
            new controllerDeskripsiINTP();
        }// else if(source.equals(view.getbISFJ())){
//            view.dispose();
//            new controllerDeskripsiISFJ();
//        }else if(source.equals(view.getbISFP())){
//            view.dispose();
//            new controllerDeskripsiISFP();
//        }else if(source.equals(view.getbISTJ())){
//            view.dispose();
//            new controllerDeskripsiISTJ();
//        }else if(source.equals(view.getbISTP())){
//            view.dispose();
//            new controllerDeskripsiISTP();
//        }
    }
}
