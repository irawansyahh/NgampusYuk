/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.viewSensingVsIntution;
import View.viewThinkingVsFeeling;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;

/**
 *
 * @author Irawansyah
 */
public class controllerThinkingVsFeeling extends MouseAdapter implements ActionListener { 
    private viewThinkingVsFeeling view;
    String Array[] = new String[4];
    
    public controllerThinkingVsFeeling(String [] array){
        this.Array[0]=array[0];
        this.Array[1]=array[1];
        view = new viewThinkingVsFeeling();
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
//        }else if (source.equals(view.getBack())){
//            view.dispose();
//            new controllerSensingVsIntuition();
        }else if(source.equals(view.getNext())){
            Array[2] = view.getFeeling();
            if (view.getFeeling().equals("null")){
                
            }else{
                view.dispose();
                System.out.println(Array[2]);
                new controllerJudgingVsPerceiving(Array);
            }
//        }else if(source.equals(view.getFeeling())){
//            view.dispose();
//            new controllerJudgingVsPerceiving();
        }
    }
}
