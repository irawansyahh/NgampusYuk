package Controller;

import View.viewResult;
import View.viewSensingVsIntution;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;

/**
 *
 * @author Irawansyah
 * 
 */

public class controllerResult extends MouseAdapter implements ActionListener { 
    private viewResult view;
    String Array[] = new String[4];
    
    public controllerResult(String [] array){
        view = new viewResult();
        for(int i=0; i<4; i++){
            this.Array[i] = array[i];
        }
        result();
//        show();
        view.addActionListener(this);
        view.setVisible(true); 
    }
    
    public void result(){
        view.setIntrovExtro(Array[0]);
        view.setSensingvIntution(Array[1]);
        view.setThinkingvFeeling(Array[2]);
        view.setJudgingvPerceiving(Array[3]);
    }
    
    public void show(){
        String IvE, SvN, TvF, JvP;
        
        IvE = view.getIntrovExtro();
        SvN = view.getSensingvIntution();
        TvF = view.getThinkingvFeeling();
        JvP = view.getJudgingvPerceiving();
        
        String[] joinResult = {"IvE", "SvN", "TvF", "JvP"};
        
        for (int i=0; i<joinResult.length; i++){
            System.out.println(joinResult[i]);
        }
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
        }
    }
}
