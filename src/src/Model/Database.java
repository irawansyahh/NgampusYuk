package Model;

/**
 *
 * @author Irsyad Muhamad Al Anshori
 * 
 */

import java.sql.*;
import java.util.*;
import java.util.logging.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {
    private Connection conn = null;
    private Statement stmt = null;
    private ResultSet rs = null;
    private ArrayList<AkunUser> AccUser = new ArrayList<>();
    private ArrayList<User> Users = new ArrayList<>();
    private ArrayList<InputScoreIPA> ScoreIPA = new ArrayList<>();
    private ArrayList<InputScoreIPS> ScoreIPS = new ArrayList<>();
    
    public Database() {
        loadUser();
    }
    
    public void clearDataArray(){
        AccUser.clear();
        Users.clear();
        ScoreIPA.clear();
        ScoreIPS.clear();
    }
    
    public void connect(){
        try {
            String url = "jdbc:mysql://localhost/db_ngampusyuk";
            String user = "root";
            String pass = "";
            conn = DriverManager.getConnection(url, user, pass);
            stmt = conn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void disconnect(){
        try {
            conn.close();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public boolean manipulate(String query){
        boolean cek = false;
        try {
            int rows = stmt.executeUpdate(query);
            if (rows > 0) cek = true;
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cek;
    }
    
    public ArrayList<AkunUser> getAccUser() {
        return AccUser;
    }
    
    public void loadUser() {
        connect();
        try {
            String query = "SELECT * FROM user";
            rs = stmt.executeQuery(query);
            while (rs.next()){
                AccUser.add(new AkunUser(rs.getString("emailornohp"), 
                    rs.getString("password"))
                );
            }
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        disconnect();
    }

    public ArrayList<User> getUser() {
        return Users;
    }
    
    public void addUser(User u) {
        connect();   
        int users = 0;
        
        String sql = "INSERT INTO user(nama,gender,emailornohp,password) "
                    + "VALUES(?,?,?,?)";
        
        try (PreparedStatement pstmt = conn.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);) {
            
            // set parameters for statement
            pstmt.setString(1, u.getNama());
            pstmt.setString(2, u.getGender());
            pstmt.setString(3, u.getEmailornohp());
            pstmt.setString(4, u.getPassword());
 
            int rowAffected = pstmt.executeUpdate();
            if(rowAffected == 1)
            {
                // Get users
                rs = pstmt.getGeneratedKeys();
                if(rs.next())
                    users = rs.getInt(1);
                    Users.add(u);
 
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                if(rs != null)  rs.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
        disconnect();
    }
    
    public boolean cekDuplikatEmailOrNoHP(String emailornohp){
        boolean cek = false;
        for (AkunUser accusr : AccUser) {
            if (accusr.getUsername().equals(emailornohp)){
                cek = true;
                break;
            }
        }
        return cek;
    }
    
    public boolean cekDuplikatPassword(String username,String password){
        boolean cek = false;
        for (AkunUser accusr : AccUser) {
            if (accusr.getPassword().equals(password) && accusr.getUsername().equals(username)){
                cek = true;
                break;
            }
        }
        return cek;
    }
    
    public ArrayList<InputScoreIPA> getScoreIPA() {
        return ScoreIPA;
    }
    
    public void addScoreIPA(InputScoreIPA ipa) {
        connect();   
        int scores = 0;
        
        String sql = "INSERT INTO scoreipa(english,indonesian,math,electivesubjects) "
                    + "VALUES(?,?,?,?)";
        
        try (PreparedStatement pstmt = conn.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);) {
            
            // set parameters for statement
            pstmt.setString(1, ipa.getEnglish());
            pstmt.setString(2, ipa.getIndonesian());
            pstmt.setString(3, ipa.getMath());
            pstmt.setString(4, ipa.getElectivesubjects());
 
            int rowAffected = pstmt.executeUpdate();
            if(rowAffected == 1)
            {
                // Get users
                rs = pstmt.getGeneratedKeys();
                if(rs.next())
                    scores = rs.getInt(1);
                    ScoreIPA.add(ipa);
 
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                if(rs != null)  rs.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
        disconnect();
    }
    
    public boolean cekDuplikatEnglish(String english){
        boolean cek = false;
        for (InputScoreIPA scoreipa : ScoreIPA) {
            if (scoreipa.getEnglish().equals(english)){
                cek = true;
                break;
            }
        }
        return cek;
    }
    
    public ArrayList<InputScoreIPS> getScoreIPS() {
        return ScoreIPS;
    }
    
    public void addScoreIPS(InputScoreIPS ips) {
        connect();   
        int scores = 0;
        
        String sql = "INSERT INTO scoreips(english,indonesian,math,electivesubjects) "
                    + "VALUES(?,?,?,?)";
        
        try (PreparedStatement pstmt = conn.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);) {
            
            // set parameters for statement
            pstmt.setString(1, ips.getEnglish());
            pstmt.setString(2, ips.getIndonesian());
            pstmt.setString(3, ips.getMath());
            pstmt.setString(4, ips.getElectivesubjects());
 
            int rowAffected = pstmt.executeUpdate();
            if(rowAffected == 1)
            {
                // Get users
                rs = pstmt.getGeneratedKeys();
                if(rs.next())
                    scores = rs.getInt(1);
                    ScoreIPS.add(ips);
 
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                if(rs != null)  rs.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
        disconnect();
    }
    
}
