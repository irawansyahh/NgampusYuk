package Model;

/**
 *
 * @author Ifdhal Hadi
 * 
 */
public class AkunAdmin {
    private String username;
    private String password;
    private String admin;

    public AkunAdmin(String username, String password, String admin) {
        this.username = username;
        this.password = password;
        this.admin = admin;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAdmin() {
        return admin;
    }

    public void setAdmin(String admin) {
        this.admin = admin;
    }
}
