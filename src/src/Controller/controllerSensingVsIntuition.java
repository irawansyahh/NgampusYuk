/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.viewIntroVsExtro;
import View.viewSensingVsIntution;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;

/**
 *
 * @author Irawansyah
 */
public class controllerSensingVsIntuition extends MouseAdapter implements ActionListener { 
    private viewSensingVsIntution view;
    String Array[] = new String[4];
    
    public controllerSensingVsIntuition(String [] array){
//        String b = a;
        this.Array[0]=array[0];
        view = new viewSensingVsIntution();
        view.addActionListener(this);
        view.setVisible(true); 
    }

    public controllerSensingVsIntuition() {
        view = new viewSensingVsIntution();
        view.addActionListener(this);
        view.setVisible(true); 
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        if(source.equals(view.getBtn3bar())){
            view.dispose();
            new controllerMenuUser();
        } else if(source.equals(view.getBtnLogout())){
            view.dispose();
            new controllerLogin();
//        }else if (source.equals(view.getBack1())){
//            view.dispose();
//            new controllerIntroVsExtro();
        } else if(source.equals(view.getNext())){
            Array[1] = view.getIntution();
            if (view.getIntution().equals("null")){
                
            }else{
                view.dispose();
                System.out.println(this.Array[1]);
                new controllerThinkingVsFeeling(Array);
            }
//            if (source.equals(view.getIntution())){
//               Array[1].equals(view.getIntution());
//            }
//            System.out.println(Array[1]);
//            view.dispose();
//            new controllerThinkingVsFeeling(Array);
//        }else if(source.equals(view.getIntution())){
//            view.dispose();
//            new controllerThinkingVsFeeling();
        }
    }
}
