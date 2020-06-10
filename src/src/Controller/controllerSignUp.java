package Controller;

/**
 *
 * @author 1 Irawansyah
 * @author 2 Irsyad Muhamad Al Anshori
 * 
 */

import Model.*;
import View.viewSignUp;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;

public class controllerSignUp extends MouseAdapter implements ActionListener{
    private viewSignUp view;
    private Database db;
    public static String nama;

    public controllerSignUp() {
        view = new viewSignUp();
        db = new Database();
        view.addActionListener(this);
        view.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        
        // SignUp
        if (source.equals(view.getBSignUp())){
            bSignUpActionPerformed();
        }
        // Login
        else if (source.equals(view.getBLogin())){
            view.dispose();
            new controllerLogin();
        }
    }
    
    public void bSignUpActionPerformed() {
        String nama = view.getTfFullName();
        String gender = view.getTfGender();
        String emailornohp = view.getTfEmail();
        String password = view.getTfPassword();
        
        if(nama.isEmpty() || gender.isEmpty() ||  
            emailornohp.isEmpty() || password.isEmpty()){
            view.showMessage("Semua Data Masih Kosong ", "Error", 0);
            view.dispose();
            new controllerSignUp();
        }else if (nama.isEmpty()){
                view.showMessage("Nama Masih Kosong ", "Error", 0);
                view.dispose();
                new controllerSignUp();
        }else if (gender.isEmpty()){
                view.showMessage("Gender Masih Kosong ", "Error", 0);
                view.dispose();
                new controllerSignUp();
        }else if (emailornohp.isEmpty()){
                view.showMessage("Email/No HP Masih Kosong ", "Error", 0);
                view.dispose();
                new controllerSignUp();
        }else if (password.isEmpty()){
                view.showMessage("Password Masih Kosong ", "Error", 0);
                view.dispose();
                new controllerSignUp();
        }else{
            if (db.cekDuplikatEmailOrNoHP(emailornohp)){
                view.showMessage("Username Sudah Terdaftar", "Error", 0); 
            }else {
                db.addUser(new User(nama, gender, emailornohp, password));
                view.reset();
                view.showMessage("Akun Berhasil Dibuat, Silakan Login", "Success", 1);
                view.dispose();
                new controllerLogin(); 
            }
        }
    }
}