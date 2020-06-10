package Controller;

/**
 *
 * @author Irsyad Muhamad Al Anshori
 * 
 */

import Model.*;
import View.viewLogin;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;

public class controllerLogin extends MouseAdapter implements ActionListener{
    private viewLogin view;
    private Database db;
    private AkunUser Accu;
    public static String emailornohp;

    public controllerLogin() {
        view = new viewLogin();
        db = new Database();
        view.addActionListener(this);
        view.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        
        // Login
        if (source.equals(view.getBLogin())){
            bLoginActionPerformed();
        }
        // SignUp
        else if (source.equals(view.getBSignUp())){
            view.dispose();
            new controllerSignUp();
//            try {
//                new controllerSignUp();
//            } catch (Exception ex) {
//                Logger.getLogger(controllerLogin.class.getName()).log(Level.SEVERE, null, ex);
//            }
        }
    }
    
    private void bLoginActionPerformed() {
        String emailornohp = view.getTfEmail();
        String password = view.getPfPassword();
        if (emailornohp.isEmpty() && password.isEmpty()){
            view.showMessage("Anda Belum memasukkan Email/No HP dan Password", "Error", 0);
            view.dispose();
            new controllerLogin();
        }else if (emailornohp.isEmpty() ){
                view.showMessage("Anda Belum memasukkan Email/No HP", "Error", 0);
                view.dispose();
                new controllerLogin();
        }else if (password.isEmpty() ){
                view.showMessage("Anda Belum memasukkan Password", "Error", 0);
                view.dispose();
                new controllerLogin();
        }else{
            if (!db.cekDuplikatEmailOrNoHP(emailornohp)){
                view.showMessage("Email/No HP Salah atau Belum Terdaftar","Error", 0);
                view.dispose();
                new controllerLogin();
            }else{
                if(!db.cekDuplikatPassword(emailornohp,password)){
                view.showMessage("Password Salah atau Belum Terdaftar","Error", 0);
                }else {
                    controllerLogin.emailornohp = emailornohp;
                    view.showMessage("Login Berhasil","Success", 1);
                    view.showMessage("Selamat Datang di NgampusYuk!","Success", 1);
                    view.dispose();
                    new controllerMenuUser();
                }
            }
        }  
    }  
}
