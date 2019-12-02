/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.*;

/**
 *
 * @author USER
 */
public class KelasTugasAkhir {
    private List<Dosen> timDosen;
    private List<Mahasiswa> daftarMhsTA;
    private String topik;
    private static int sid = 1;
    private String status = "Pending";

    public KelasTugasAkhir(String topik) {
        this.topik = topik;
        this.timDosen = new ArrayList<>();
        this.daftarMhsTA = new ArrayList<>();
    }
    
    public void addMahasiswa(Mahasiswa m) {
        daftarMhsTA.add(m);
    }

    public void addDosen(Dosen d) {
        timDosen.add(d);
    }
    
    public Dosen getDosen(int x) {
        return timDosen.get(x);
    }
    
    public Mahasiswa getMahasiswa(int x) {
        return daftarMhsTA.get(x);
    }

    public List<Dosen> getTimDosen() {
        return timDosen;
    }

    public List<Mahasiswa> getDaftarMhsTA() {
        return daftarMhsTA;
    }

    public String getTopik() {
        return topik;
    }
    
    
}
