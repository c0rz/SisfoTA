/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author USER
 */
public abstract class Orang {
    private String nama;
    private String keyID;
    private String NoHP;
    private String Username;
    private String Password;

    public Orang(String nama, String keyID, String NoHP, String Username, String Password) {
        this.nama = nama;
        this.keyID = keyID;
        this.NoHP = NoHP;
        this.Username = Username;
        this.Password = Password;
    }
        
    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
    
    public String getNoHP() {
        return NoHP;
    }

    public void setNoHP(String NoHP) {
        this.NoHP = NoHP;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKeyID() {
        return keyID;
    }

    public void setKeyID(String keyID) {
        this.keyID = keyID;
    }
}
