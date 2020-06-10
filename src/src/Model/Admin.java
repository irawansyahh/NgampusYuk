package Model;

/**
 *
 * @author Ifdhal Hadi
 * 
 */
public class Admin {
    private String nama;
    private char NIP;
    private String Email;

    public Admin(String nama, char NIP, String Email) {
        this.nama = nama;
        this.NIP = NIP;
        this.Email = Email;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public char getNIP() {
        return NIP;
    }

    public void setNIP(char NIP) {
        this.NIP = NIP;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    } 
}
