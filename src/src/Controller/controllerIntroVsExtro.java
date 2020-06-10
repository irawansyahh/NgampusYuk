package Controller;
import View.viewIntroVsExtro;
import View.viewJudgingVsPerceiving;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;

/**
 *
 * @author Irawansyah
 * 
 */

public class controllerIntroVsExtro extends MouseAdapter implements ActionListener { 
    private viewIntroVsExtro view;
    String Array[] = new String[4];
//    String RB = view.getIntrovert();
//    boolean cek ;
    
    public controllerIntroVsExtro(){
        view = new viewIntroVsExtro();
        view.addActionListener(this);
        view.setVisible(true); 
    }
   
    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        String False = null;
        if(source.equals(view.getBtn3bar())){
            view.dispose();
            new controllerMenuUser();
        } else if(source.equals(view.getBtnLogout())){
            view.dispose();
            new controllerLogin();
//        }else if (source.equals(view.getBack())){
//            view.dispose();
//            new controllerInputScore();
        }else if(source.equals(view.getNext())){
            Array[0]=view.getIntrovert();
            if (view.getIntrovert().equals("null")){
       
            }else{
                view.dispose();
                System.out.println(this.Array[0]);
                new controllerSensingVsIntuition(Array);
            }
//        } else if(source.equals(view.getIntrovert())){
//            view.dispose();
//            new controllerSensingVsIntuition();
        } 
    }
}
