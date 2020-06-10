package Model;

/**
 *
 * @author Ifdhal Hadi
 * @author Irsyad Muhamad Al Anshori
 * 
 */

public class AkunUser {
    private String username;
    private String password;
    
    public AkunUser(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setEmail(String email) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }
    
    public String getEmail(){
        return username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
