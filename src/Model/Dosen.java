/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USER
 */
public class Dosen extends Orang {
    private KelasTugasAkhir KelasTA;

    public Dosen(String nama, String keyID, String NoHP, String Username, String Password) {
        super(nama, keyID, NoHP, Username, Password);
    }
    
    public void createKelompokTA(String bahas_topik) {
        KelasTA = new KelasTugasAkhir(bahas_topik);
        //KelasTA.add(bahas_topik);
    }

    public KelasTugasAkhir getKelasTA() {
        return KelasTA;
    }

    public void setKelasTA(KelasTugasAkhir KelasTA) {
        this.KelasTA = KelasTA;
    }

    public String getIdDosen() {
        return super.getKeyID();
    }

    public String NamaDosen() {
        return super.getNama();
    }
    
}
