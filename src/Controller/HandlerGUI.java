package Controller;

import Model.*;
import View.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import javax.swing.JOptionPane;

public class HandlerGUI implements ActionListener {

    private final Login_View app;
    private final Admin_View admin;
    private Admin siAdmin;
    Database db = new Database();
    ActionEvent ae;

    public HandlerGUI() {
        app = new Login_View();
        app.AddActionListener(this);
        app.setVisible(true);
        admin = new Admin_View();
        admin.AddActionListener(this);
        admin.setVisible(false);
        db.connect();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object act = ae.getSource();
        if (act.equals(app.getBtnLogin())) {
            login();
        }
        if (act.equals(admin.getBtnLogout())) {
            app.resetLogin();
            int a = JOptionPane.showConfirmDialog(app, "Confirm Logout ?", "Logout", 0);
            if (a == 0) {
                app.setVisible(true);
                admin.setVisible(false);
            }
        }
        if (act.equals(admin.getBtnMahasiswa())) {
            admin.TampilanMahasiswa();
        }
        if (act.equals(admin.getBtnMCreate())) {
            admin.TampilanMahasiswa();
        }
    }

    public void login() {
        if (app.getPasswor().equals(db.getPassword(app.getUsername()))) {
            JOptionPane.showMessageDialog(app, "Login Berhasil!");
            siAdmin = db.loadAdmin(app.getUsername());
            if (db.getLevel(app.getUsername()).equals("Admin")) {
                admin.setVisible(true);
                admin.setHeader(siAdmin.getNama());
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
