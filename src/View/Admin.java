/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import javax.swing.SwingUtilities;
import View.*;
/**
 *
 * @author ALDY
 */
public class Admin extends javax.swing.JFrame {

    /**
     * Creates new form LoginAdmin
     */
    public Admin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelAdmin = new javax.swing.JPanel();
        MenuAdmin = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnLADosen = new javax.swing.JButton();
        btnLAMahasiswa = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        MAMahasiswa = new javax.swing.JPanel();
        panelCRUDMahasiswa = new javax.swing.JPanel();
        btnCreateMhs = new javax.swing.JButton();
        btnReadMhs = new javax.swing.JButton();
        btnUpdateMhs = new javax.swing.JButton();
        btnDeleteMhs = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnBacktoMAMahasiswa = new javax.swing.JButton();
        panelMoveMahasiswa = new javax.swing.JPanel();
        panelCreateMahasiwa = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        panelReadMahasiwa = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        panelUpdateMahasiwa = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        panelDeleteMahasiswa = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        MADosen = new javax.swing.JPanel();
        panelCRUDDosen = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        btnCreateDosen = new javax.swing.JButton();
        btnReadDosen = new javax.swing.JButton();
        btnUpdateDosen = new javax.swing.JButton();
        btnDeleteDosen = new javax.swing.JButton();
        btnBacktoMAMahasiswa1 = new javax.swing.JButton();
        panelMoveDosen = new javax.swing.JPanel();
        panelCreateDosen = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        panelReadDosen = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        panelUpdateDosen = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        panelDeleteDosen = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelAdmin.setLayout(new java.awt.CardLayout());

        MenuAdmin.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnLADosen.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        btnLADosen.setText("Dosen");
        btnLADosen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLADosenActionPerformed(evt);
            }
        });

        btnLAMahasiswa.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        btnLAMahasiswa.setText("Mahasiswa");
        btnLAMahasiswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLAMahasiswaActionPerformed(evt);
            }
        });

        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MenuAdminLayout = new javax.swing.GroupLayout(MenuAdmin);
        MenuAdmin.setLayout(MenuAdminLayout);
        MenuAdminLayout.setHorizontalGroup(
            MenuAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuAdminLayout.createSequentialGroup()
                .addGroup(MenuAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MenuAdminLayout.createSequentialGroup()
                        .addGap(371, 371, 371)
                        .addComponent(jLabel1))
                    .addGroup(MenuAdminLayout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(btnLAMahasiswa)
                        .addGap(195, 195, 195)
                        .addComponent(btnLADosen, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MenuAdminLayout.createSequentialGroup()
                        .addGap(333, 333, 333)
                        .addComponent(btnLogout)))
                .addContainerGap(174, Short.MAX_VALUE))
        );
        MenuAdminLayout.setVerticalGroup(
            MenuAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuAdminLayout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(jLabel1)
                .addGap(6, 6, 6)
                .addGroup(MenuAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLAMahasiswa)
                    .addComponent(btnLADosen, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 334, Short.MAX_VALUE)
                .addComponent(btnLogout)
                .addGap(149, 149, 149))
        );

        panelAdmin.add(MenuAdmin, "card2");

        panelCRUDMahasiswa.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnCreateMhs.setText("Create");
        btnCreateMhs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateMhsActionPerformed(evt);
            }
        });

        btnReadMhs.setText("Read");
        btnReadMhs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReadMhsActionPerformed(evt);
            }
        });

        btnUpdateMhs.setText("Update");
        btnUpdateMhs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateMhsActionPerformed(evt);
            }
        });

        btnDeleteMhs.setText("Delete");
        btnDeleteMhs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteMhsActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel2.setText("Mahasiswa");

        btnBacktoMAMahasiswa.setText("Back");
        btnBacktoMAMahasiswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBacktoMAMahasiswaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCRUDMahasiswaLayout = new javax.swing.GroupLayout(panelCRUDMahasiswa);
        panelCRUDMahasiswa.setLayout(panelCRUDMahasiswaLayout);
        panelCRUDMahasiswaLayout.setHorizontalGroup(
            panelCRUDMahasiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCRUDMahasiswaLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(panelCRUDMahasiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCRUDMahasiswaLayout.createSequentialGroup()
                        .addComponent(btnDeleteMhs)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelCRUDMahasiswaLayout.createSequentialGroup()
                        .addGroup(panelCRUDMahasiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnUpdateMhs)
                            .addComponent(btnReadMhs)
                            .addComponent(jLabel2)
                            .addComponent(btnCreateMhs))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCRUDMahasiswaLayout.createSequentialGroup()
                .addContainerGap(206, Short.MAX_VALUE)
                .addComponent(btnBacktoMAMahasiswa)
                .addGap(89, 89, 89))
        );
        panelCRUDMahasiswaLayout.setVerticalGroup(
            panelCRUDMahasiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCRUDMahasiswaLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(btnCreateMhs)
                .addGap(45, 45, 45)
                .addComponent(btnReadMhs)
                .addGap(37, 37, 37)
                .addComponent(btnUpdateMhs)
                .addGap(68, 68, 68)
                .addComponent(btnDeleteMhs)
                .addGap(50, 50, 50)
                .addComponent(btnBacktoMAMahasiswa)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelMoveMahasiswa.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelMoveMahasiswa.setLayout(new java.awt.CardLayout());

        jLabel3.setText("create mahasiswa");

        javax.swing.GroupLayout panelCreateMahasiwaLayout = new javax.swing.GroupLayout(panelCreateMahasiwa);
        panelCreateMahasiwa.setLayout(panelCreateMahasiwaLayout);
        panelCreateMahasiwaLayout.setHorizontalGroup(
            panelCreateMahasiwaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(panelCreateMahasiwaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelCreateMahasiwaLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        panelCreateMahasiwaLayout.setVerticalGroup(
            panelCreateMahasiwaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(panelCreateMahasiwaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelCreateMahasiwaLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        panelMoveMahasiswa.add(panelCreateMahasiwa, "card2");

        jLabel4.setText("view mahasiswa");

        javax.swing.GroupLayout panelReadMahasiwaLayout = new javax.swing.GroupLayout(panelReadMahasiwa);
        panelReadMahasiwa.setLayout(panelReadMahasiwaLayout);
        panelReadMahasiwaLayout.setHorizontalGroup(
            panelReadMahasiwaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 352, Short.MAX_VALUE)
            .addGroup(panelReadMahasiwaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelReadMahasiwaLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        panelReadMahasiwaLayout.setVerticalGroup(
            panelReadMahasiwaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 614, Short.MAX_VALUE)
            .addGroup(panelReadMahasiwaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelReadMahasiwaLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        panelMoveMahasiswa.add(panelReadMahasiwa, "card4");

        jLabel5.setText("update mahasiswa");

        javax.swing.GroupLayout panelUpdateMahasiwaLayout = new javax.swing.GroupLayout(panelUpdateMahasiwa);
        panelUpdateMahasiwa.setLayout(panelUpdateMahasiwaLayout);
        panelUpdateMahasiwaLayout.setHorizontalGroup(
            panelUpdateMahasiwaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 352, Short.MAX_VALUE)
            .addGroup(panelUpdateMahasiwaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelUpdateMahasiwaLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel5)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        panelUpdateMahasiwaLayout.setVerticalGroup(
            panelUpdateMahasiwaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 614, Short.MAX_VALUE)
            .addGroup(panelUpdateMahasiwaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelUpdateMahasiwaLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel5)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        panelMoveMahasiswa.add(panelUpdateMahasiwa, "card3");

        jLabel6.setText("delete mahasiswa");

        javax.swing.GroupLayout panelDeleteMahasiswaLayout = new javax.swing.GroupLayout(panelDeleteMahasiswa);
        panelDeleteMahasiswa.setLayout(panelDeleteMahasiswaLayout);
        panelDeleteMahasiswaLayout.setHorizontalGroup(
            panelDeleteMahasiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 352, Short.MAX_VALUE)
            .addGroup(panelDeleteMahasiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelDeleteMahasiswaLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel6)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        panelDeleteMahasiswaLayout.setVerticalGroup(
            panelDeleteMahasiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 614, Short.MAX_VALUE)
            .addGroup(panelDeleteMahasiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelDeleteMahasiswaLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel6)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        panelMoveMahasiswa.add(panelDeleteMahasiswa, "card5");

        javax.swing.GroupLayout MAMahasiswaLayout = new javax.swing.GroupLayout(MAMahasiswa);
        MAMahasiswa.setLayout(MAMahasiswaLayout);
        MAMahasiswaLayout.setHorizontalGroup(
            MAMahasiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MAMahasiswaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelCRUDMahasiswa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(panelMoveMahasiswa, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        MAMahasiswaLayout.setVerticalGroup(
            MAMahasiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MAMahasiswaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MAMahasiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelMoveMahasiswa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelCRUDMahasiswa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        panelAdmin.add(MAMahasiswa, "card3");

        MADosen.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        panelCRUDDosen.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel7.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel7.setText("Dosen");

        btnCreateDosen.setText("Create");
        btnCreateDosen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateDosenActionPerformed(evt);
            }
        });

        btnReadDosen.setText("Read");
        btnReadDosen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReadDosenActionPerformed(evt);
            }
        });

        btnUpdateDosen.setText("Update");
        btnUpdateDosen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateDosenActionPerformed(evt);
            }
        });

        btnDeleteDosen.setText("Delete");
        btnDeleteDosen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteDosenActionPerformed(evt);
            }
        });

        btnBacktoMAMahasiswa1.setText("Back");
        btnBacktoMAMahasiswa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBacktoMAMahasiswa1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCRUDDosenLayout = new javax.swing.GroupLayout(panelCRUDDosen);
        panelCRUDDosen.setLayout(panelCRUDDosenLayout);
        panelCRUDDosenLayout.setHorizontalGroup(
            panelCRUDDosenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCRUDDosenLayout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addGroup(panelCRUDDosenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDeleteDosen)
                    .addComponent(btnUpdateDosen)
                    .addComponent(btnReadDosen)
                    .addComponent(btnCreateDosen)
                    .addComponent(jLabel7))
                .addContainerGap(125, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCRUDDosenLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBacktoMAMahasiswa1)
                .addGap(48, 48, 48))
        );
        panelCRUDDosenLayout.setVerticalGroup(
            panelCRUDDosenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCRUDDosenLayout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jLabel7)
                .addGap(40, 40, 40)
                .addComponent(btnCreateDosen)
                .addGap(35, 35, 35)
                .addComponent(btnReadDosen)
                .addGap(18, 18, 18)
                .addComponent(btnUpdateDosen)
                .addGap(18, 18, 18)
                .addComponent(btnDeleteDosen)
                .addGap(34, 34, 34)
                .addComponent(btnBacktoMAMahasiswa1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelMoveDosen.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelMoveDosen.setLayout(new java.awt.CardLayout());

        jLabel8.setText("Create Dosen");

        javax.swing.GroupLayout panelCreateDosenLayout = new javax.swing.GroupLayout(panelCreateDosen);
        panelCreateDosen.setLayout(panelCreateDosenLayout);
        panelCreateDosenLayout.setHorizontalGroup(
            panelCreateDosenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCreateDosenLayout.createSequentialGroup()
                .addGap(177, 177, 177)
                .addComponent(jLabel8)
                .addContainerGap(139, Short.MAX_VALUE))
        );
        panelCreateDosenLayout.setVerticalGroup(
            panelCreateDosenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCreateDosenLayout.createSequentialGroup()
                .addGap(194, 194, 194)
                .addComponent(jLabel8)
                .addContainerGap(193, Short.MAX_VALUE))
        );

        panelMoveDosen.add(panelCreateDosen, "card2");

        jLabel9.setText("Read Dosen");

        javax.swing.GroupLayout panelReadDosenLayout = new javax.swing.GroupLayout(panelReadDosen);
        panelReadDosen.setLayout(panelReadDosenLayout);
        panelReadDosenLayout.setHorizontalGroup(
            panelReadDosenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelReadDosenLayout.createSequentialGroup()
                .addGap(177, 177, 177)
                .addComponent(jLabel9)
                .addContainerGap(148, Short.MAX_VALUE))
        );
        panelReadDosenLayout.setVerticalGroup(
            panelReadDosenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelReadDosenLayout.createSequentialGroup()
                .addGap(194, 194, 194)
                .addComponent(jLabel9)
                .addContainerGap(193, Short.MAX_VALUE))
        );

        panelMoveDosen.add(panelReadDosen, "card2");

        jLabel10.setText("Update Dosen");

        javax.swing.GroupLayout panelUpdateDosenLayout = new javax.swing.GroupLayout(panelUpdateDosen);
        panelUpdateDosen.setLayout(panelUpdateDosenLayout);
        panelUpdateDosenLayout.setHorizontalGroup(
            panelUpdateDosenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUpdateDosenLayout.createSequentialGroup()
                .addGap(177, 177, 177)
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelUpdateDosenLayout.setVerticalGroup(
            panelUpdateDosenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUpdateDosenLayout.createSequentialGroup()
                .addGap(194, 194, 194)
                .addComponent(jLabel10)
                .addContainerGap(193, Short.MAX_VALUE))
        );

        panelMoveDosen.add(panelUpdateDosen, "card2");

        jLabel11.setText("Delete Dosen");

        javax.swing.GroupLayout panelDeleteDosenLayout = new javax.swing.GroupLayout(panelDeleteDosen);
        panelDeleteDosen.setLayout(panelDeleteDosenLayout);
        panelDeleteDosenLayout.setHorizontalGroup(
            panelDeleteDosenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDeleteDosenLayout.createSequentialGroup()
                .addGap(177, 177, 177)
                .addComponent(jLabel11)
                .addContainerGap(141, Short.MAX_VALUE))
        );
        panelDeleteDosenLayout.setVerticalGroup(
            panelDeleteDosenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDeleteDosenLayout.createSequentialGroup()
                .addGap(194, 194, 194)
                .addComponent(jLabel11)
                .addContainerGap(193, Short.MAX_VALUE))
        );

        panelMoveDosen.add(panelDeleteDosen, "card2");

        javax.swing.GroupLayout MADosenLayout = new javax.swing.GroupLayout(MADosen);
        MADosen.setLayout(MADosenLayout);
        MADosenLayout.setHorizontalGroup(
            MADosenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MADosenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelCRUDDosen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(panelMoveDosen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        MADosenLayout.setVerticalGroup(
            MADosenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MADosenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MADosenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(panelMoveDosen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelCRUDDosen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelAdmin.add(MADosen, "card4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 762, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLADosenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLADosenActionPerformed
    panelAdmin.removeAll();
    panelAdmin.add(MADosen);
    panelAdmin.repaint();
    panelAdmin.revalidate();
    panelMoveDosen.removeAll();

    }//GEN-LAST:event_btnLADosenActionPerformed

    private void btnLAMahasiswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLAMahasiswaActionPerformed
    panelAdmin.removeAll();
    panelAdmin.add(MAMahasiswa);
    panelAdmin.repaint();
    panelAdmin.revalidate();
    panelMoveMahasiswa.removeAll();
    }//GEN-LAST:event_btnLAMahasiswaActionPerformed

    private void btnCreateMhsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateMhsActionPerformed
//        panelAdmin.removeAll();
//        panelAdmin.add(MAMahasiswa);
//        panelAdmin.repaint();
//        panelAdmin.revalidate();


        panelMoveMahasiswa.removeAll();
        panelMoveMahasiswa.add(panelCreateMahasiwa);
        SwingUtilities.updateComponentTreeUI(this);
        panelMoveMahasiswa.repaint();
        panelMoveMahasiswa.revalidate();
    }//GEN-LAST:event_btnCreateMhsActionPerformed

    private void btnReadMhsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReadMhsActionPerformed
        panelMoveMahasiswa.removeAll();
        panelMoveMahasiswa.add(panelReadMahasiwa);
        SwingUtilities.updateComponentTreeUI(this);
        panelMoveMahasiswa.repaint();
        panelMoveMahasiswa.revalidate();
        
    }//GEN-LAST:event_btnReadMhsActionPerformed

    private void btnUpdateMhsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateMhsActionPerformed
        panelMoveMahasiswa.removeAll();
        panelMoveMahasiswa.add(panelUpdateMahasiwa);
        SwingUtilities.updateComponentTreeUI(this);
        panelMoveMahasiswa.repaint();
        panelMoveMahasiswa.revalidate();
    }//GEN-LAST:event_btnUpdateMhsActionPerformed

    private void btnDeleteMhsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteMhsActionPerformed
        panelMoveMahasiswa.removeAll();
        panelMoveMahasiswa.add(panelDeleteMahasiswa);
        SwingUtilities.updateComponentTreeUI(this);
        panelMoveMahasiswa.repaint();
        panelMoveMahasiswa.revalidate();
    }//GEN-LAST:event_btnDeleteMhsActionPerformed

    private void btnBacktoMAMahasiswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBacktoMAMahasiswaActionPerformed
        panelAdmin.removeAll();
        panelAdmin.add(MenuAdmin);
        SwingUtilities.updateComponentTreeUI(this);
        panelAdmin.repaint();
        panelAdmin.revalidate();
    }//GEN-LAST:event_btnBacktoMAMahasiswaActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        //this.setVisible(false);
        
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnCreateDosenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateDosenActionPerformed
        panelMoveDosen.removeAll();
        panelMoveDosen.add(panelCreateDosen);
        panelMoveDosen.repaint();
        panelMoveDosen.revalidate();
    }//GEN-LAST:event_btnCreateDosenActionPerformed

    private void btnDeleteDosenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteDosenActionPerformed
        panelMoveDosen.removeAll();
        panelMoveDosen.add(panelDeleteDosen);
        panelMoveDosen.repaint();
        panelMoveDosen.revalidate();
    }//GEN-LAST:event_btnDeleteDosenActionPerformed

    private void btnReadDosenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReadDosenActionPerformed
        panelMoveDosen.removeAll();
        panelMoveDosen.add(panelReadDosen);
        panelMoveDosen.repaint();
        panelMoveDosen.revalidate();    }//GEN-LAST:event_btnReadDosenActionPerformed

    private void btnUpdateDosenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateDosenActionPerformed
        panelMoveDosen.removeAll();
        panelMoveDosen.add(panelUpdateDosen);
        panelMoveDosen.repaint();
        panelMoveDosen.revalidate();
    }//GEN-LAST:event_btnUpdateDosenActionPerformed

    private void btnBacktoMAMahasiswa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBacktoMAMahasiswa1ActionPerformed
        panelAdmin.removeAll();
        panelAdmin.add(MenuAdmin);
        SwingUtilities.updateComponentTreeUI(this);
        panelAdmin.repaint();
        panelAdmin.revalidate();

    }//GEN-LAST:event_btnBacktoMAMahasiswa1ActionPerformed

    public JButton getBtnLogout() {
        return btnLogout;
    }

    
    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(LoginAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(LoginAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(LoginAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(LoginAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new LoginAdmin().setVisible(true);
//            }
//        });
//    }

    
    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(LoginAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(LoginAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(LoginAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(LoginAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new LoginAdmin().setVisible(true);
//            }
//        });
//    }
    public JButton getBtnLAMahasiswa() {
        return btnLAMahasiswa;
    }
    
    public JButton getBtnLADosen() {
        return btnLADosen;
    }

    public void addActionListener(ActionListener a1){
        btnLAMahasiswa.addActionListener(a1);
        btnBacktoMAMahasiswa.addActionListener(a1);
        btnLogout.addActionListener(a1);
    }

    
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MADosen;
    private javax.swing.JPanel MAMahasiswa;
    private javax.swing.JPanel MenuAdmin;
    private javax.swing.JButton btnBacktoMAMahasiswa;
    private javax.swing.JButton btnBacktoMAMahasiswa1;
    private javax.swing.JButton btnCreateDosen;
    private javax.swing.JButton btnCreateMhs;
    private javax.swing.JButton btnDeleteDosen;
    private javax.swing.JButton btnDeleteMhs;
    private javax.swing.JButton btnLADosen;
    private javax.swing.JButton btnLAMahasiswa;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnReadDosen;
    private javax.swing.JButton btnReadMhs;
    private javax.swing.JButton btnUpdateDosen;
    private javax.swing.JButton btnUpdateMhs;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel panelAdmin;
    private javax.swing.JPanel panelCRUDDosen;
    private javax.swing.JPanel panelCRUDMahasiswa;
    private javax.swing.JPanel panelCreateDosen;
    private javax.swing.JPanel panelCreateMahasiwa;
    private javax.swing.JPanel panelDeleteDosen;
    private javax.swing.JPanel panelDeleteMahasiswa;
    private javax.swing.JPanel panelMoveDosen;
    private javax.swing.JPanel panelMoveMahasiswa;
    private javax.swing.JPanel panelReadDosen;
    private javax.swing.JPanel panelReadMahasiwa;
    private javax.swing.JPanel panelUpdateDosen;
    private javax.swing.JPanel panelUpdateMahasiwa;
    // End of variables declaration//GEN-END:variables
}
