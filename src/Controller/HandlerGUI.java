package Controller;

import Model.*;
import View.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import javax.swing.JOptionPane;

public class HandlerGUI implements ActionListener {

    private final Login app;
    private final Admin admin;
    Database db = new Database();
    ActionEvent ae;

    public HandlerGUI() {
        app = new Login();
        app.AddActionListener(this);
        app.setVisible(true);
        admin = new Admin();
        admin.addActionListener(this);
        admin.setVisible(false);
        db.connect();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object act = ae.getSource();
        if (act.equals(app.getBtnLogin())) {
            login();
        }
    }

    public void login() {
        if (app.getPasswor().equals(db.getPassword(app.getUsername()))) {
            JOptionPane.showMessageDialog(app, "Login Berhasil!");
            if (db.getLevel(app.getUsername()).equals("Admin")) {
                admin.setVisible(true);
                app.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(null, "Cie GOBLOK");
            }
        } else {
            if (db.getPassword(app.getUsername()) == null) {
                app.resetLogin();
                JOptionPane.showMessageDialog(null, "Username belum terdaftar!");
            } else {
                app.resetLogin();
                JOptionPane.showMessageDialog(null, "Password salah!");
            }
        }
    }
}
