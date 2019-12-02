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
public class Aplikasi {

    private List<Dosen> daftarDosen = new ArrayList<>();
    private List<Mahasiswa> daftarMahasiswa = new ArrayList<>();
    private List<KelasTugasAkhir> kelasTA = new ArrayList<>();
    private List<TugasAkhir> daftarTA = new ArrayList<>();

    // method search Mahasiswa
    public Mahasiswa searchMahasiswa(String id) {
        int i = 0;
        while (i < daftarMahasiswa.size()) {
            if (!daftarMahasiswa.get(i).getNIM().equals(id)) {
                i++;
            } else {
                return daftarMahasiswa.get(i);
            }
        }
        return null;
    }

    // method search Mahasiswa
    public Dosen searchDosen(String id) {
        int i = 0;
        while (i < daftarDosen.size()) {
            if (!daftarDosen.get(i).getIdDosen().equals(id)) {
                i++;
            } else {
                return daftarDosen.get(i);
            }
        }
        return null;
    }

    // Method memasukan Mahasiswa
    public void inputMahasiswa(String nama, String NIM, String NoHP, String Username, String Password) {
        Mahasiswa seseorang = new Mahasiswa(nama, NIM, Username, NoHP, Password);
        daftarMahasiswa.add(seseorang);
    }

    // Method memasukan Mahasiswa
    public void inputDosen(String nama, String idDos, String nohp) {
        Dosen seseorang = new Dosen(nama, idDos, nohp);
        daftarDosen.add(seseorang);
    }

    public void buatTA(String idmhs, String topik, String judul) {
        Mahasiswa cek = searchMahasiswa(idmhs);
        if (cek == null) {
            System.out.println("error, tidak ditemukan mahasiswa");
        } else {
            cek.createTA(topik, judul);
        }
    }

    public void KelompokTA(String idDos, String topik) {
        Dosen cek = searchDosen(idDos);
        if (cek == null) {
            System.out.println("error, tidak ditemukan dosen");
        } else {
            cek.createKelompokTA(topik);
        }
    }

    public void tampilkanSearchDosen(String id) {
        Dosen orang = searchDosen(id);
        if (orang == null) {
            System.out.println("Data dosen masih kosong, silahkan input.");
        } else {
            System.out.println("ID TENTOR\t: " + orang.getKeyID());
            System.out.println("Nama\t\t: " + orang.NamaDosen());
            System.out.println("Nomor Telphone\t\t: " + orang.getNotelp());
            if (orang.getKelasTA() != null) {
                System.out.println("Topik TA\t\t: " + orang.getKelasTA().getTopik());
            }
            System.out.println("====================================");
        }
    }

    public void tampilkanSearchMahasiswa(String id) {
        Mahasiswa orang = searchMahasiswa(id);
        if (orang == null) {
            System.out.println("Data dosen masih kosong, silahkan input.");
        } else {
            System.out.println("Nomor Induk Mahasiswa\t: " + orang.getNIM());
            System.out.println("Nama\t\t: " + orang.getNama());
            if (orang.getTa() != null) {
                System.out.println("Topik TA\t\t: " + orang.getTa().getTopik());
                System.out.println("Judul TA\t\t: " + orang.getTa().getJudul());
            }
            System.out.println("====================================");
        }
    }

    public void MasukkanMahasiswaKeDosen(String idngajar, String idmhs) {
        Dosen pengajar = searchDosen(idngajar);
        Mahasiswa konsul = searchMahasiswa(idmhs);
        if (pengajar != null || konsul != null) {
            konsul.getTa().setPembimbing(pengajar, konsul.getNIM());
        } else {
            System.out.println("error not found mhs or dosen.");
        }
    }

    public void TampilkanPembimbing(String idmhs) {
        Mahasiswa orang = searchMahasiswa(idmhs);
        if (orang != null) {
            for (int i = 0; i < orang.getTa().PSize(); i++) {
                Dosen pengajar = orang.getTa().getPembimbing(i);
                System.out.println("\t\t Nama Dosen Pembimbing \t\t = " + pengajar.NamaDosen());
            }
        }
    }

    // Size Total Array Masing - Masing //
    public int DosenSize() {
        return daftarDosen.size();
    }

    public int MahasiswaSize() {
        return daftarMahasiswa.size();
    }

    public int TASize() {
        return daftarTA.size();
    }

    public int KelasTASize() {
        return kelasTA.size();
    }

    // End Size //
    // Get Object Masing - Massing Class //
    public Dosen getDosen(int i) {
        return daftarDosen.get(i);
    }

    public Mahasiswa getMahasiswa(int i) {
        return daftarMahasiswa.get(i);
    }

    public KelasTugasAkhir getKelasTA(int i) {
        return kelasTA.get(i);
    }

    public TugasAkhir getTA(int i) {
        return daftarTA.get(i);
    }

    // End Get Object //
}
