package Controller;

import Model.*;
import View.viewInputScoreIPS;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;

/**
 *
 * @author Irawansyah
 * 
 */

public class controllerInputScoreIPS extends MouseAdapter implements ActionListener { 
    private viewInputScoreIPS view;
    private Database db;
    
    public controllerInputScoreIPS(){
        view = new viewInputScoreIPS();
        db = new Database();
        view.addActionListener(this);
        view.setVisible(true); 
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        if(source.equals(view.getB3Bar())){
            view.dispose();
            new controllerInputScore();
        } else if(source.equals(view.getBLogoutInputScore())){
            view.dispose();
            new controllerLogin();
        } else if(source.equals(view.getBLanjut())){
            bLanjutActionPerformed();
        }
    }
    
    public void bLanjutActionPerformed() {
        String english = view.getTFInggris();
        String indonesian = view.getTFIindonesia();
        String math = view.getTFMtk();
        String electivesubjects = view.getTFPilihan();
        
        if(english.isEmpty() || indonesian.isEmpty() ||  
            math.isEmpty() || electivesubjects.isEmpty()){
            view.showMessage("Nilai Harus Di Isi", "Error", 0);
            view.dispose();
            new controllerInputScoreIPS();
        }else if (english.isEmpty()){
                view.showMessage("Nilai Bahasa Indonesia tidak boleh kosong", "Error", 0);
                view.dispose();
                new controllerInputScoreIPS();
        }else if (indonesian.isEmpty()){
                view.showMessage("Nilai Bahasa Inggris tidak boleh kosong", "Error", 0);
                view.dispose();
                new controllerInputScoreIPS();
        }else if (math.isEmpty()){
                view.showMessage("Nilai MTK tidak boleh kosong", "Error", 0);
                view.dispose();
                new controllerInputScoreIPS();
        }else if (electivesubjects.isEmpty()){
                view.showMessage("Nilai Mata Pelajaran Pilihan tidak boleh kosong ", "Error", 0);
                view.dispose();
                new controllerInputScoreIPS();
        }else {
            if (db.cekDuplikatEnglish(english)){
                view.showMessage("Nilai Sudah Ada", "Error", 0); 
            }else {
                db.addScoreIPS(new InputScoreIPS(english, indonesian, math, electivesubjects));
                view.reset();
                view.showMessage("Selamat Melakukan Tes MBTI", "Success", 1);
                view.dispose();
                new controllerIntroVsExtro(); 
            }
        }
    }
}
