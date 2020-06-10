package Model;

/**
 *
 * @author Irsyad Muhamad Al Anshori
 * 
 */

public class User {
    private String nama;
    private String gender;
    private String emailornohp;
    private String password;

    public User(String nama, String gender, String emailornohp, String password) {
        this.nama = nama;
        this.gender = gender;
        this.emailornohp = emailornohp;
        this.password = password;
    }

    public void set(String nama, String gender, String emailornohp, String password) {
        this.nama = nama;
        this.gender = gender;
        this.emailornohp = emailornohp;
        this.password = password;
    }
    
    public String getNama() {
        return nama;
    }

    public String getGender() {
        return gender;
    }

    public String getEmailornohp() {
        return emailornohp;
    }

    public String getPassword() {
        return password;
    }
    
//    public void setNama(String nama) {
//        this.nama = nama;
//    }
//
//    public void setGender(String gender) {
//        this.gender = gender;
//    }
//
//    public void setEmailornohp(String emailornohp) {
//        this.emailornohp = emailornohp;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }    
}
