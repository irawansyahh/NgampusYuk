package Controller;

import View.viewJudgingVsPerceiving;
import View.viewThinkingVsFeeling;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;

/**
 *
 * @author Irawansyah
 * 
 */

public class controllerJudgingVsPerceiving extends MouseAdapter implements ActionListener { 
    private viewJudgingVsPerceiving view;
    String Array[] = new String[4];
    
    public controllerJudgingVsPerceiving(String array[]){
        this.Array[0]=array[0];
        this.Array[1]=array[1];
        this.Array[2]=array[2];
        for(int i=0; i<4; i++){
            this.Array[i] = array[i];
        }
        view = new viewJudgingVsPerceiving();
        view.addActionListener(this);
        view.setVisible(true); 
    }
    

    @Override
    public void actionPerformed(ActionEvent ae) {
        String array[] ={"INTJ","INFP","INFJ","INTP","ENTJ","ENTP","ENFJ","ENFP","ISFJ","ISFP","ISTJ","ISTP","ESFJ","ESFP","ESTJ","ESTP"};
        Object source = ae.getSource();
        
        if(source.equals(view.getBtn3bar())){
            view.dispose();
            new controllerMenuUser();
        } else if(source.equals(view.getBtnLogout())){
            view.dispose();
            new controllerLogin();
//        }else if (source.equals(view.getBack())){
//            view.dispose();
//            new controllerIntroVsExtro();
        }else if(source.equals(view.getNext())){
            Array[3] = view.getJudging();
            String result = this.Array[0]+this.Array[1]+this.Array[2]+this.Array[3];
            if (view.getJudging().equals("null")){
                
            }else if(result.equals(array[0])){
                view.dispose();
                new controllerDeskripsiINTJ();
            }else if(result.equals(array[1])){
                view.dispose();
                new controllerDeskripsiINFP();
            }else if(result.equals(array[2])){
                view.dispose();
                new controllerDeskripsiINTJ();
            }else if(result.equals(array[3])){
                view.dispose();
                new controllerDeskripsiINFJ();
            }else if(result.equals(array[4])){
                view.dispose();
                new controllerDeskripsiINTP();
            }else if(result.equals(array[5])){
                view.dispose();
                new controllerDeskripsiENTJ();
            }else if(result.equals(array[6])){
                view.dispose();
                new controllerDeskripsiENTP();
            }else if(result.equals(array[7])){
                view.dispose();
                new controllerDeskripsiENFJ();
            }else if(result.equals(array[8])){
                view.dispose();
                new controllerDeskripsiENFP();
            }else if(result.equals(array[9])){
                view.dispose();
                new controllerDeskripsiISFJ();
            }else if(result.equals(array[10])){
                view.dispose();
                new controllerDeskripsiISFP();
            }else if(result.equals(array[11])){
                view.dispose();
                new controllerDeskripsiISTJ();
            }else if(result.equals(array[12])){
                view.dispose();
                new controllerDeskripsiISTP();
            }else if(result.equals(array[13])){
                view.dispose();
                new controllerDeskripsiESFJ();
            }else if(result.equals(array[14])){
                view.dispose();
                new controllerDeskripsiESFP();
            }else if(result.equals(array[15])){
                view.dispose();
                new controllerDeskripsiESTJ();
            }else if (result.equals(array[16])){
                view.dispose();
                new controllerDeskripsiESTP();
            }
            System.out.println(Array[3]);
        }
    }
}