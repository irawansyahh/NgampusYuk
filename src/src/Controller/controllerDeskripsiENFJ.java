package Controller;

import View.viewDeskripsiENFJ;
import View.viewDeskripsiENTJ;
import View.viewDeskripsiINTJ;
import View.viewDeskripsiINTP;
import View.viewInputScoreIPA;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;

/**
 *
 * @author Irawansyah
 */
public class controllerDeskripsiENFJ extends MouseAdapter implements ActionListener { 
    private viewDeskripsiENFJ view;
    
    public controllerDeskripsiENFJ(){
        view = new viewDeskripsiENFJ();
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
        }
    }
}
