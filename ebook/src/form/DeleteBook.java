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
public class DeleteBook extends javax.swing.JInternalFrame {

    /**
     * Creates new form AddBook
     */
    public DeleteBook() {
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

        bookpic = new image.ImagePanel();
        jLabel15 = new javax.swing.JLabel();
        jAddBook2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtIdBook = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(900, 504));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(917, 604));
        getContentPane().setLayout(null);

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
        bookpic.setBounds(380, 180, 160, 190);

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(13, 67, 112));
        jLabel15.setText("ลบหนังสือ");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(420, 0, 100, 40);

        jAddBook2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jAddBook2.setText("ลบหนังสือ");
        getContentPane().add(jAddBook2);
        jAddBook2.setBounds(380, 410, 150, 50);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 0, 0));
        jLabel7.setText("รหัสหนังสือ");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(260, 100, 90, 30);

        txtIdBook.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txtIdBook);
        txtIdBook.setBounds(350, 100, 210, 30);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("ค้นหา");
        getContentPane().add(jButton1);
        jButton1.setBounds(570, 100, 67, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private image.ImagePanel bookpic;
    private javax.swing.JButton jAddBook2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtIdBook;
    // End of variables declaration//GEN-END:variables
}
