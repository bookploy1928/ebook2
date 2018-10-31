/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import java.awt.Color;

/**
 *
 * @author kong
 */
public class EditBook extends javax.swing.JInternalFrame {

    /**
     * Creates new form AddBook
     */
    public EditBook() {
        initComponents();
        getContentPane().setBackground(new Color(255,255,255)); 
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        txtBookName = new javax.swing.JTextField();
        txtPriceCover = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtType = new javax.swing.JTextField();
        comboBoxCategory = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        bookpic = new image.ImagePanel();
        txtPublisher = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtAuthor = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtFileSize = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtNumOfPages = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtBookLink = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jSelectPic = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jEditBook = new javax.swing.JButton();
        txtIdBook = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(900, 504));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(917, 604));
        getContentPane().setLayout(null);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 0, 0));
        jLabel7.setText("รหัสหนังสือ");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(100, 50, 90, 30);

        txtBookName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txtBookName);
        txtBookName.setBounds(190, 100, 210, 30);

        txtPriceCover.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txtPriceCover);
        txtPriceCover.setBounds(590, 100, 210, 30);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("ราคาปก");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(520, 100, 70, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("ชนิดไฟล์");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(510, 150, 80, 30);

        txtType.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txtType);
        txtType.setBounds(590, 150, 210, 30);

        comboBoxCategory.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        comboBoxCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--เลือกหมวดหมู่หนังสือ--", "การ์ตูน", "การศึกษา", "ความรู้ทั่วไป", "ท่องเที่ยว", "คอมพิวเตอร์", "ภาษา", "อาหาร", "นิยาย", "สุขภาพ", "สัตว์เลี้ยง", "ประวัติศาสตร์", "ชีวะประวัติ", " " }));
        getContentPane().add(comboBoxCategory);
        comboBoxCategory.setBounds(590, 200, 210, 30);

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel18.setText("หมวดหมู่หนังสือ");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(460, 200, 130, 30);

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel22.setText("รูปปกหนังสือ");
        getContentPane().add(jLabel22);
        jLabel22.setBounds(480, 250, 95, 30);

        javax.swing.GroupLayout bookpicLayout = new javax.swing.GroupLayout(bookpic);
        bookpic.setLayout(bookpicLayout);
        bookpicLayout.setHorizontalGroup(
            bookpicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
        );
        bookpicLayout.setVerticalGroup(
            bookpicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );

        getContentPane().add(bookpic);
        bookpic.setBounds(600, 250, 160, 190);

        txtPublisher.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txtPublisher);
        txtPublisher.setBounds(190, 150, 210, 30);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setText("สำนักพิมพ์");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(100, 150, 90, 30);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setText("ชื่อผู้แต่ง");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(120, 200, 70, 30);

        txtAuthor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txtAuthor);
        txtAuthor.setBounds(190, 200, 210, 30);

        txtPrice.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txtPrice);
        txtPrice.setBounds(190, 250, 210, 30);

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel20.setText("ราคา");
        getContentPane().add(jLabel20);
        jLabel20.setBounds(140, 250, 50, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("บาท");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(400, 250, 50, 30);

        txtFileSize.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txtFileSize);
        txtFileSize.setBounds(190, 300, 210, 30);

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel17.setText("ขนาดไฟล์");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(110, 300, 80, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("MB");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(400, 300, 20, 30);

        txtNumOfPages.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txtNumOfPages);
        txtNumOfPages.setBounds(190, 350, 210, 30);

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setText("จำนวนหน้า");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(100, 350, 90, 30);

        txtBookLink.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txtBookLink);
        txtBookLink.setBounds(190, 400, 210, 30);

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel23.setText("ลิงก์ไฟล์หนังสือ");
        getContentPane().add(jLabel23);
        jLabel23.setBounds(60, 400, 130, 30);

        jSelectPic.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jSelectPic.setText("เลือกรูป");
        getContentPane().add(jSelectPic);
        jSelectPic.setBounds(610, 450, 140, 40);

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setText("บาท");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(800, 100, 50, 30);

        jEditBook.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jEditBook.setText("แก้ไขหนังสือ");
        getContentPane().add(jEditBook);
        jEditBook.setBounds(390, 500, 150, 50);

        txtIdBook.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txtIdBook);
        txtIdBook.setBounds(190, 50, 210, 30);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("ชื่อหนังสือ");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(110, 100, 80, 30);

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(13, 67, 112));
        jLabel15.setText("แก้ไขหนังสือ");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(420, 0, 100, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private image.ImagePanel bookpic;
    private javax.swing.JComboBox<String> comboBoxCategory;
    private javax.swing.JButton jEditBook;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton jSelectPic;
    private javax.swing.JTextField txtAuthor;
    private javax.swing.JTextField txtBookLink;
    private javax.swing.JTextField txtBookName;
    private javax.swing.JTextField txtFileSize;
    private javax.swing.JTextField txtIdBook;
    private javax.swing.JTextField txtNumOfPages;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtPriceCover;
    private javax.swing.JTextField txtPublisher;
    private javax.swing.JTextField txtType;
    // End of variables declaration//GEN-END:variables
}
