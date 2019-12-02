package Controller;

import Model.*;
import View.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import javax.swing.JOptionPane;

public class HandlerGUI implements ActionListener {

    private Login app;
    Database db = new Database();
    ActionEvent ae;

    public HandlerGUI() {
        app = new Login();
        app.AddActionListener(this);
        app.setVisible(true);
        
        db.connect();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object act = ae.getSource();
        if (act.equals(app.getBtnLogin())) {
            login();
        } else {
            
        }
    }
    
    public void login() {        
         if (app.getPasswor().equals(db.getPassword(app.getUsername()))){
             JOptionPane.showMessageDialog(app, "Login Berhasil!");
         } else {       
                if(db.getPassword(app.getUsername())==null){
                    JOptionPane.showMessageDialog(null, "Username belum terdaftar!");
                } else {
                    JOptionPane.showMessageDialog(null, "Password salah!");
                }   
         }
    }
}
