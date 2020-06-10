package Controller;

import View.viewAnnouncement;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author 1 Irawansyah
 * 
 */

public class controllerAnnoucement extends MouseAdapter implements ActionListener {
    private viewAnnouncement view;
    
    public controllerAnnoucement(){
        view = new viewAnnouncement();
        view.addActionListener(this);
        view.setVisible(true); 
        view.getjLabel3().addMouseListener(new MouseAdapter()
        {
            public void mouseClicked(MouseEvent e){
                JOptionPane.showMessageDialog(null, "Succes Memilih Jalur JPA1");
                view.dispose();
                new controllerAnnoucement1();
            }
        }
        );
        view.getjLabel4().addMouseListener(new MouseAdapter()
        {
            public void mouseClicked(MouseEvent e){
                JOptionPane.showMessageDialog(null, "Succes Memilih Jalur D3 ke S1");
                view.dispose();
                new controllerAnnoucement3();      
            }
        }
        );
        view.getjLabel1().addMouseListener(new MouseAdapter()
        {
            public void mouseClicked(MouseEvent e){
                JOptionPane.showMessageDialog(null, "Succes Memilih Jalur Internasional 2020");
                view.dispose();
                new controllerAnnoucement2();
            }
        }
        );
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        
        // Kembali ke menu sebelumnya
        if(source.equals(view.getB3Bar())){
            view.dispose();
            new controllerMenuUser();
            
        // Keluar dari akun
        } else if(source.equals(view.getBLogout())){
            view.dispose();
            new controllerLogin();
        }
    }
}
    