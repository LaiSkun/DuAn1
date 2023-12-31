/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poly.ui;

import com.poly.ultils.Auth;
import com.poly.ultils.MsgBox;
import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Timer;

/**
 *
 * @author Admin
 */
public class QuanLiCF extends javax.swing.JFrame {

    /**
     * Creates new form QuanLiCF
     */
    public QuanLiCF() {
        initComponents();
        init();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        btnDangXuat = new javax.swing.JButton();
        btnKetThuc = new javax.swing.JButton();
        btnHelp = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btnBanHang = new com.k33ptoo.components.KButton();
        btnNhanVien = new com.k33ptoo.components.KButton();
        btnMenu = new com.k33ptoo.components.KButton();
        btnHangHoa = new com.k33ptoo.components.KButton();
        btnKhachHang = new com.k33ptoo.components.KButton();
        btnHoaDon = new com.k33ptoo.components.KButton();
        btnThongKe = new com.k33ptoo.components.KButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblDongHo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mniDoiMK = new javax.swing.JMenuItem();
        mniDangXuat = new javax.swing.JMenuItem();
        mniKetThuc = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mniBanHang = new javax.swing.JMenuItem();
        mniNhanVien = new javax.swing.JMenuItem();
        mniKH = new javax.swing.JMenuItem();
        mniHD = new javax.swing.JMenuItem();
        mniMenu = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mniThongKe = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 51, 204));

        jToolBar1.setRollover(true);

        btnDangXuat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnDangXuat.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\QuanLyCF\\src\\main\\java\\com\\poly\\icon\\aa.png")); // NOI18N
        btnDangXuat.setText("Đăng xuất ");
        btnDangXuat.setFocusable(false);
        btnDangXuat.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDangXuat.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangXuatActionPerformed(evt);
            }
        });
        jToolBar1.add(btnDangXuat);

        btnKetThuc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnKetThuc.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\QuanLyCF\\src\\main\\java\\com\\poly\\icon\\button_exit_15724.png")); // NOI18N
        btnKetThuc.setText("Kết thúc");
        btnKetThuc.setFocusable(false);
        btnKetThuc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnKetThuc.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnKetThuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKetThucActionPerformed(evt);
            }
        });
        jToolBar1.add(btnKetThuc);

        btnHelp.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnHelp.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\QuanLyCF\\src\\main\\java\\com\\poly\\icon\\Help_icon-icons.com_73700.png")); // NOI18N
        btnHelp.setText("Trợ giúp");
        btnHelp.setFocusable(false);
        btnHelp.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHelp.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHelpActionPerformed(evt);
            }
        });
        jToolBar1.add(btnHelp);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(0, 153, 153));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.GridLayout(0, 1, 10, 25));

        btnBanHang.setText("Bán Hàng");
        btnBanHang.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnBanHang.setkBorderRadius(40);
        btnBanHang.setkEndColor(new java.awt.Color(204, 0, 204));
        btnBanHang.setkStartColor(new java.awt.Color(102, 255, 255));
        btnBanHang.setOpaque(false);
        btnBanHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBanHangActionPerformed(evt);
            }
        });
        jPanel1.add(btnBanHang);

        btnNhanVien.setText("Quản lí nhân viên");
        btnNhanVien.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnNhanVien.setkBorderRadius(40);
        btnNhanVien.setkEndColor(new java.awt.Color(204, 0, 204));
        btnNhanVien.setkStartColor(new java.awt.Color(102, 255, 255));
        btnNhanVien.setOpaque(false);
        btnNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhanVienActionPerformed(evt);
            }
        });
        jPanel1.add(btnNhanVien);

        btnMenu.setText("Quản lí Menu");
        btnMenu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnMenu.setkBorderRadius(40);
        btnMenu.setkEndColor(new java.awt.Color(204, 0, 204));
        btnMenu.setkStartColor(new java.awt.Color(102, 255, 255));
        btnMenu.setOpaque(false);
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });
        jPanel1.add(btnMenu);

        btnHangHoa.setText("Quản lí Hàng Hóa");
        btnHangHoa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnHangHoa.setkBorderRadius(40);
        btnHangHoa.setkEndColor(new java.awt.Color(204, 0, 204));
        btnHangHoa.setkStartColor(new java.awt.Color(102, 255, 255));
        jPanel1.add(btnHangHoa);

        btnKhachHang.setText("Quản lí Khách Hàng");
        btnKhachHang.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnKhachHang.setkBorderRadius(40);
        btnKhachHang.setkEndColor(new java.awt.Color(204, 0, 204));
        btnKhachHang.setkStartColor(new java.awt.Color(102, 255, 255));
        btnKhachHang.setOpaque(false);
        btnKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKhachHangActionPerformed(evt);
            }
        });
        jPanel1.add(btnKhachHang);

        btnHoaDon.setText("Quản lí Hóa Đơn");
        btnHoaDon.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnHoaDon.setkBorderRadius(40);
        btnHoaDon.setkEndColor(new java.awt.Color(204, 0, 204));
        btnHoaDon.setkStartColor(new java.awt.Color(102, 255, 255));
        btnHoaDon.setOpaque(false);
        btnHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHoaDonActionPerformed(evt);
            }
        });
        jPanel1.add(btnHoaDon);

        btnThongKe.setText("Thống kê doanh thu");
        btnThongKe.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnThongKe.setkBorderRadius(40);
        btnThongKe.setkEndColor(new java.awt.Color(204, 0, 204));
        btnThongKe.setkStartColor(new java.awt.Color(102, 255, 255));
        btnThongKe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThongKeActionPerformed(evt);
            }
        });
        jPanel1.add(btnThongKe);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\QuanLyCF\\src\\main\\java\\com\\poly\\icon\\cca1e136569841.5720ffd3c7679.gif")); // NOI18N

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\QuanLyCF\\src\\main\\java\\com\\poly\\icon\\Info.png")); // NOI18N
        jLabel1.setText("Thông tin trạng thái");

        lblDongHo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\QuanLyCF\\src\\main\\java\\com\\poly\\icon\\Clock.png")); // NOI18N
        lblDongHo.setText("Đồng hồ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDongHo)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblDongHo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jMenu1.setText("Hệ Thống");

        mniDoiMK.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\QuanLyCF\\src\\main\\java\\com\\poly\\icon\\Key.png")); // NOI18N
        mniDoiMK.setText("Đổi mật khẩu");
        mniDoiMK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDoiMKActionPerformed(evt);
            }
        });
        jMenu1.add(mniDoiMK);

        mniDangXuat.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mniDangXuat.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\QuanLyCF\\src\\main\\java\\com\\poly\\icon\\Closed door.png")); // NOI18N
        mniDangXuat.setText("Đăng xuất");
        mniDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDangXuatActionPerformed(evt);
            }
        });
        jMenu1.add(mniDangXuat);

        mniKetThuc.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mniKetThuc.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\QuanLyCF\\src\\main\\java\\com\\poly\\icon\\Exit.png")); // NOI18N
        mniKetThuc.setText("Kết thúc");
        mniKetThuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniKetThucActionPerformed(evt);
            }
        });
        jMenu1.add(mniKetThuc);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Quản lí");

        mniBanHang.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mniBanHang.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\QuanLyCF\\src\\main\\java\\com\\poly\\icon\\Dollar.png")); // NOI18N
        mniBanHang.setText("Bán hàng");
        mniBanHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniBanHangActionPerformed(evt);
            }
        });
        jMenu2.add(mniBanHang);

        mniNhanVien.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mniNhanVien.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\QuanLyCF\\src\\main\\java\\com\\poly\\icon\\User.png")); // NOI18N
        mniNhanVien.setText("Quản lí nhân viên");
        mniNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniNhanVienActionPerformed(evt);
            }
        });
        jMenu2.add(mniNhanVien);

        mniKH.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mniKH.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\QuanLyCF\\src\\main\\java\\com\\poly\\icon\\Clien list.png")); // NOI18N
        mniKH.setText("Quản lí khách hàng");
        mniKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniKHActionPerformed(evt);
            }
        });
        jMenu2.add(mniKH);

        mniHD.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mniHD.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\QuanLyCF\\src\\main\\java\\com\\poly\\icon\\Print preview.png")); // NOI18N
        mniHD.setText("Quản lí hóa đơn");
        mniHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniHDActionPerformed(evt);
            }
        });
        jMenu2.add(mniHD);

        mniMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mniMenu.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\QuanLyCF\\src\\main\\java\\com\\poly\\icon\\Full basket.png")); // NOI18N
        mniMenu.setText("Quản lí menu");
        mniMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniMenuActionPerformed(evt);
            }
        });
        jMenu2.add(mniMenu);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Thống kê");

        mniThongKe.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F6, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mniThongKe.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\QuanLyCF\\src\\main\\java\\com\\poly\\icon\\Notes.png")); // NOI18N
        mniThongKe.setText("Thống kế doanh thu");
        mniThongKe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniThongKeActionPerformed(evt);
            }
        });
        jMenu3.add(mniThongKe);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Trợ giúp");

        jMenuItem1.setText("Hướng dẫn sử dụng");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem1);

        jMenuItem2.setText("Giới thiệu");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem2);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangXuatActionPerformed
        // TODO add your handling code here:
        this.dangXuat();
        
    }//GEN-LAST:event_btnDangXuatActionPerformed

    private void btnKetThucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKetThucActionPerformed
        // TODO add your handling code here:
        this.ketthuc();
    }//GEN-LAST:event_btnKetThucActionPerformed

    private void btnHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHelpActionPerformed
        // TODO add your handling code here:
        this.openWebpage();
    }//GEN-LAST:event_btnHelpActionPerformed

    private void btnBanHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBanHangActionPerformed
        // TODO add your handling code here:
        this.openBanHang();
    }//GEN-LAST:event_btnBanHangActionPerformed

    private void btnNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhanVienActionPerformed
        // TODO add your handling code here:
        this.openNhanVien();
    }//GEN-LAST:event_btnNhanVienActionPerformed

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        // TODO add your handling code here:
        this.openMenu();
    }//GEN-LAST:event_btnMenuActionPerformed

    private void btnKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKhachHangActionPerformed
        // TODO add your handling code here:
        this.openKhachHang();
    }//GEN-LAST:event_btnKhachHangActionPerformed

    private void btnHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHoaDonActionPerformed
        // TODO add your handling code here:
        this.openHD();
    }//GEN-LAST:event_btnHoaDonActionPerformed

    private void btnThongKeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThongKeActionPerformed
        // TODO add your handling code here:
        this.openThongKe();
    }//GEN-LAST:event_btnThongKeActionPerformed

    private void mniDoiMKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDoiMKActionPerformed
        // TODO add your handling code here:
        this.openDoiMK();
    }//GEN-LAST:event_mniDoiMKActionPerformed

    private void mniDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDangXuatActionPerformed
        // TODO add your handling code here:
        this.dangXuat();
    }//GEN-LAST:event_mniDangXuatActionPerformed

    private void mniKetThucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniKetThucActionPerformed
        // TODO add your handling code here:
        this.ketthuc();
    }//GEN-LAST:event_mniKetThucActionPerformed

    private void mniBanHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniBanHangActionPerformed
        // TODO add your handling code here:
        this.openBanHang();
    }//GEN-LAST:event_mniBanHangActionPerformed

    private void mniNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniNhanVienActionPerformed
        // TODO add your handling code here:
        this.openNhanVien();
    }//GEN-LAST:event_mniNhanVienActionPerformed

    private void mniKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniKHActionPerformed
        // TODO add your handling code here:
        this.openKhachHang();
    }//GEN-LAST:event_mniKHActionPerformed

    private void mniHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniHDActionPerformed
        // TODO add your handling code here:
        this.openHD();
    }//GEN-LAST:event_mniHDActionPerformed

    private void mniMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniMenuActionPerformed
        // TODO add your handling code here:
        this.openMenu();
    }//GEN-LAST:event_mniMenuActionPerformed

    private void mniThongKeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniThongKeActionPerformed
        // TODO add your handling code here:
        this.openThongKe();
    }//GEN-LAST:event_mniThongKeActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        this.openWebpage();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        new GioiThieuJDialog(this,true).setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(QuanLiCF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLiCF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLiCF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLiCF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLiCF().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.k33ptoo.components.KButton btnBanHang;
    private javax.swing.JButton btnDangXuat;
    private com.k33ptoo.components.KButton btnHangHoa;
    private javax.swing.JButton btnHelp;
    private com.k33ptoo.components.KButton btnHoaDon;
    private javax.swing.JButton btnKetThuc;
    private com.k33ptoo.components.KButton btnKhachHang;
    private com.k33ptoo.components.KButton btnMenu;
    private com.k33ptoo.components.KButton btnNhanVien;
    private com.k33ptoo.components.KButton btnThongKe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lblDongHo;
    private javax.swing.JMenuItem mniBanHang;
    private javax.swing.JMenuItem mniDangXuat;
    private javax.swing.JMenuItem mniDoiMK;
    private javax.swing.JMenuItem mniHD;
    private javax.swing.JMenuItem mniKH;
    private javax.swing.JMenuItem mniKetThuc;
    private javax.swing.JMenuItem mniMenu;
    private javax.swing.JMenuItem mniNhanVien;
    private javax.swing.JMenuItem mniThongKe;
    // End of variables declaration//GEN-END:variables

    void init(){
        setLocationRelativeTo(null);
        new DangNhapJDialog(this,true).setVisible(true);
        new splashscreen.SplashScreen(this, true).setVisible(true);
        this.startDongHo();
    }
        void startDongHo(){
        new Timer(1000,new ActionListener() {
            SimpleDateFormat format = new SimpleDateFormat("hh:mm:ss a");
            @Override
            public void actionPerformed(ActionEvent e) {
                lblDongHo.setText(format.format(new Date()));
            }
        }).start();
    }
    void openNhanVien(){
        if(Auth.isLogin()){
            new QuanLiNhanVienJDialog(this,true).setVisible(true);
        }else{
            MsgBox.alert(this, "Vui lòng đăng nhập");
        }
    }
    void openBanHang(){
        if(Auth.isLogin()){
            BanHangJFrame bh = new BanHangJFrame();
            bh.setVisible(true);
            bh.init();
            
        }else{
            MsgBox.alert(this, "Vui lòng đăng nhập");
        }
    }
    void openKhachHang(){
       if(Auth.isLogin()){
            new QuanLiKhachHangJDialog(this,true).setVisible(true);
        }else{
            MsgBox.alert(this, "Vui lòng đăng nhập");
        }
    }
    void openMenu(){
        if(Auth.isLogin()){
            new QuanLiMenuJDialog(this,true).setVisible(true);
        }else{
            MsgBox.alert(this, "Vui lòng đăng nhập");
        }
    }
    void openHD(){
         if(Auth.isLogin()){
            new QuanLiHoaDonJDialog(this,true).setVisible(true);
        }else{
            MsgBox.alert(this, "Vui lòng đăng nhập");
        }
    }
    void openThongKe(){
        if(Auth.isLogin()){
            if(!Auth.isManager()){
                MsgBox.alert(this, "Bạn không có quyền xem thông tin doanh thu");
                return;
            }else{
                new ThongKeDoanhThuJDialog(this,true).setVisible(true);
            }
        }else{
            MsgBox.alert(this, "Vui lòng đăng nhập!");
        }
    }
    void openDoiMK(){
           if(Auth.isLogin()){
            new DoiMatKhauJDialog(this,true).setVisible(true);
        }else{
            MsgBox.alert(this, "Vui lòng đăng nhập");
        }
    }
     void dangXuat(){
        Auth.clear();
        this.dispose();
         new DangNhapJDialog(this,true).setVisible(true);
        
        
    }
     void ketthuc(){
         System.exit(0);
     }
    void openWebpage() {
        try {
        Desktop.getDesktop().browse(new URL("https://www.google.com").toURI());
        } catch (Exception e) {
        e.printStackTrace();
        }
    }
}
