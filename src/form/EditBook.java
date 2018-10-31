/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import Dao.BookDao;
import Data.Book;
import javax.swing.JFileChooser;
import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import org.bson.types.ObjectId;
import image.ImagePanel;
import image.OpenFileFilter;

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
        bookName = new javax.swing.JTextField();
        bookCoverPrice = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        bookFileFormat = new javax.swing.JTextField();
        bookComboBox = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        publisherName = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        authorName = new javax.swing.JTextField();
        bookPrice = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        fileSize = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        pages = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jSelectPic = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        EditBook = new javax.swing.JButton();
        bookID = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        bookpic = new image.ImagePanel();
        jLabel21 = new javax.swing.JLabel();
        linkFile = new javax.swing.JTextField();

        setMinimumSize(new java.awt.Dimension(900, 504));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(917, 604));
        getContentPane().setLayout(null);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 0, 0));
        jLabel7.setText("รหัสหนังสือ");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(100, 50, 90, 30);

        bookName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(bookName);
        bookName.setBounds(190, 100, 210, 30);

        bookCoverPrice.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(bookCoverPrice);
        bookCoverPrice.setBounds(590, 100, 210, 30);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("ราคาปก");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(520, 100, 70, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("ชนิดไฟล์");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(510, 150, 80, 30);

        bookFileFormat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(bookFileFormat);
        bookFileFormat.setBounds(590, 150, 210, 30);

        bookComboBox.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        bookComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--เลือกหมวดหมู่หนังสือ--", "การ์ตูน", "การศึกษา", "ความรู้ทั่วไป", "ท่องเที่ยว", "คอมพิวเตอร์", "ภาษา", "อาหาร", "นิยาย", "สุขภาพ", "สัตว์เลี้ยง", "ประวัติศาสตร์", "ชีวะประวัติ", " " }));
        bookComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookComboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(bookComboBox);
        bookComboBox.setBounds(590, 200, 210, 30);

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel18.setText("หมวดหมู่หนังสือ");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(460, 200, 130, 30);

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel22.setText("รูปปกหนังสือ");
        getContentPane().add(jLabel22);
        jLabel22.setBounds(480, 250, 95, 30);

        publisherName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(publisherName);
        publisherName.setBounds(190, 150, 210, 30);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setText("สำนักพิมพ์");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(100, 150, 90, 30);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setText("ชื่อผู้แต่ง");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(120, 200, 70, 30);

        authorName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(authorName);
        authorName.setBounds(190, 200, 210, 30);

        bookPrice.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(bookPrice);
        bookPrice.setBounds(190, 250, 210, 30);

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel20.setText("ราคา");
        getContentPane().add(jLabel20);
        jLabel20.setBounds(140, 250, 50, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("บาท");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(400, 250, 50, 30);

        fileSize.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(fileSize);
        fileSize.setBounds(190, 300, 210, 30);

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel17.setText("ขนาดไฟล์");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(110, 300, 80, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("MB");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(400, 300, 20, 30);

        pages.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(pages);
        pages.setBounds(190, 350, 210, 30);

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setText("จำนวนหน้า");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(100, 350, 90, 30);

        jSelectPic.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jSelectPic.setText("เลือกรูป");
        jSelectPic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSelectPicActionPerformed(evt);
            }
        });
        getContentPane().add(jSelectPic);
        jSelectPic.setBounds(610, 450, 140, 40);

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setText("บาท");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(800, 100, 50, 30);

        EditBook.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        EditBook.setText("แก้ไขหนังสือ");
        EditBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditBookActionPerformed(evt);
            }
        });
        getContentPane().add(EditBook);
        EditBook.setBounds(390, 500, 150, 50);

        bookID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bookID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookIDActionPerformed(evt);
            }
        });
        bookID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                bookIDKeyTyped(evt);
            }
        });
        getContentPane().add(bookID);
        bookID.setBounds(190, 50, 210, 30);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("ชื่อหนังสือ");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(110, 100, 80, 30);

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(13, 67, 112));
        jLabel15.setText("แก้ไขหนังสือ");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(420, 0, 100, 40);
        getContentPane().add(bookpic);
        bookpic.setBounds(610, 270, 140, 150);

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel21.setText("ลิงค์ไฟล์");
        getContentPane().add(jLabel21);
        jLabel21.setBounds(100, 400, 90, 30);

        linkFile.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(linkFile);
        linkFile.setBounds(190, 400, 210, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bookIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookIDActionPerformed
        
    }//GEN-LAST:event_bookIDActionPerformed

    private void bookComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookComboBoxActionPerformed
      
    }//GEN-LAST:event_bookComboBoxActionPerformed

    private void jSelectPicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSelectPicActionPerformed
        JFileChooser fc = new JFileChooser();
	fc.addChoosableFileFilter(new OpenFileFilter("png","Photo in PNG format"));
        fc.addChoosableFileFilter(new OpenFileFilter("jpg","Photo in JPG format"));
	fc.setAcceptAllFileFilterUsed(false);
	int value = fc.showOpenDialog(EditBook.this);
        if(value == JFileChooser.APPROVE_OPTION) {
            filePic = fc.getSelectedFile();
            try {
		bookpic.setImage(ImageIO.read(filePic));
	    } catch (IOException ex) {
		Logger.getLogger(ImagePanel.class.getName()).log(Level.SEVERE, null, ex);
	    }
	}
    }//GEN-LAST:event_jSelectPicActionPerformed

    private void EditBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditBookActionPerformed
        boolean res = BookDao.findBookById(Integer.parseInt(bookID.getText()));
        if(!res) {
            Book b = new Book(Integer.parseInt(bookID.getText()),
                              bookName.getText(),
                              ""+bookComboBox.getSelectedItem(),
                              publisherName.getText(),
                              authorName.getText(),
                              bookFileFormat.getText(),      
                              Integer.parseInt(bookPrice.getText()),
                              Integer.parseInt(bookCoverPrice.getText()),     
                              Integer.parseInt(fileSize.getText()),
                              Integer.parseInt(pages.getText()),
                              linkFile.getText()
                              );
            
           BookDao.updateBook(b, filePic);
           JOptionPane.showMessageDialog(EditBook.this, "แก้ไขข้อมูลหนังสือสำเร็จ","ข้อความเตือนการแก้ไขข้อมูล",JOptionPane.INFORMATION_MESSAGE);
        }
        else {
           JOptionPane.showMessageDialog(EditBook.this, "แก้ไขข้อมูลหนังสือไม่สำเร็จ ไม่พบ ID ของคุณ","ข้อความเตือนการแก้ไขข้อมูล",JOptionPane.WARNING_MESSAGE);           
        }         
    }//GEN-LAST:event_EditBookActionPerformed

    private void bookIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bookIDKeyTyped
        
    }//GEN-LAST:event_bookIDKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EditBook;
    private javax.swing.JTextField authorName;
    private javax.swing.JComboBox<String> bookComboBox;
    private javax.swing.JTextField bookCoverPrice;
    private javax.swing.JTextField bookFileFormat;
    private javax.swing.JTextField bookID;
    private javax.swing.JTextField bookName;
    private javax.swing.JTextField bookPrice;
    private image.ImagePanel bookpic;
    private javax.swing.JTextField fileSize;
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
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton jSelectPic;
    private javax.swing.JTextField linkFile;
    private javax.swing.JTextField pages;
    private javax.swing.JTextField publisherName;
    // End of variables declaration//GEN-END:variables
    private File filePic;
}
