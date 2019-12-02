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
public class TugasAkhir {
    private ArrayList<Dosen> Pembimbing;
    private String topik;
    private String judul;
    private String nim;
    private int sid = 0;

    public TugasAkhir(String topik, String judul) {
        this.Pembimbing = new ArrayList<>();
        this.topik = topik;
        this.judul = judul;
    }
    
    public void setPembimbing(Dosen d, String nim){
        Pembimbing.add(d);
        this.nim = nim;
        sid++;
    }
    
    public int PSize() {
        return Pembimbing.size();
    }

    public Dosen getPembimbing(int i) {
        return Pembimbing.get(i);
    }
    public String getTopik() {
        return topik;
    }

    public void setTopik(String topik) {
        this.topik = topik;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }
    
    
}
