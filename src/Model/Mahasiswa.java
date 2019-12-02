/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class Mahasiswa extends Orang {
    private TugasAkhir tugasAkhir;

    public Mahasiswa(String nama, String keyID) {
        super(nama, keyID);
    }

    public void createTA(String topik, String judul){
        tugasAkhir = new TugasAkhir(topik, judul);
    }
    
    public String getNIM() {
        return super.getKeyID();
    }
    
    public TugasAkhir getTa(){
        return tugasAkhir;
    }
    
}
