/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package toko_elektronik;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class input_barang extends javax.swing.JFrame {

    /**
     * Creates new form input_barang
     */
    public input_barang() {
        initComponents(); 
     
         this.setResizable(false);
        load_table();
        getDataComboBox();
       
       
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_input = new javax.swing.JButton();
        btn_edit = new javax.swing.JButton();
        btn_hapus = new javax.swing.JButton();
        txt_stock = new javax.swing.JTextField();
        txt_nama = new javax.swing.JTextField();
        txt_harga_jual = new javax.swing.JTextField();
        txt_harga_beli = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jComboBox2 = new javax.swing.JComboBox<>();
        txt_idbarang = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inputActionPerformed(evt);
            }
        });
        getContentPane().add(btn_input, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 240, 130, 40));

        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
            }
        });
        getContentPane().add(btn_edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 320, 130, 30));
        getContentPane().add(btn_hapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 370, 100, 30));

        txt_stock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_stockActionPerformed(evt);
            }
        });
        getContentPane().add(txt_stock, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 360, 230, -1));
        getContentPane().add(txt_nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 250, 230, -1));
        getContentPane().add(txt_harga_jual, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 290, 230, -1));
        getContentPane().add(txt_harga_beli, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 320, 230, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 480, 810, 200));

        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 400, 230, -1));
        getContentPane().add(txt_idbarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(594, 190, 160, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar_layout/input barang.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1140, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inputActionPerformed

        try {
            String sql = "INSERT INTO `barang_elektronik` VALUES ('" + txt_idbarang.getText() +  "','" + txt_nama.getText()
                    + "','" + txt_stock.getText() + jComboBox2.getSelectedIndex() +"','" + txt_harga_jual.getText() + "','"+ txt_harga_beli.getText() + "')";
            java.sql.Connection conn = (Connection) konektor.configDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Barang Berhasil ditambahkan");

        } catch (HeadlessException | SQLException e) {
         
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        kosong();
        load_table();
    
    }//GEN-LAST:event_btn_inputActionPerformed

    private void txt_stockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_stockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_stockActionPerformed

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed
//    try {
//          String sql = "UPDATE `data_barang`"
//                   + "SET NamaBarang = '"+namabarang.getText()
//                   +"',HargaBeli= '"+hargabeli.getText()
//                   +"',HargaJual= '"+hargajual.getText()
//                   +"',stock= '"+jumlah.getText()
//                   +"'WHERE data_barang.idBarang= '"+idbarang.getText()
//                   +"'";
//           java.sql.Connection conn=(Connection)konektor.configDB();
//           java.sql.PreparedStatement pat=conn.prepareStatement(sql);
//           pat.execute();
//           JOptionPane.showMessageDialog(null, "data berhasil di edit");
//       }catch (Exception e){
//           JOptionPane.showMessageDialog(null, "Perubahan Data Gagal"
//           +e.getMessage());
//       }
//       load_table();
//       kosong();
//               
    }//GEN-LAST:event_btn_editActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void load_table() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("No");
        model.addColumn("Id Barang");
        model.addColumn("Nama Barang");
        model.addColumn("Harga Beli");
        model.addColumn("Harga Jual");
        model.addColumn("Jumlah");
        try {

            int no = 1;
            String sql = "SELECT * FROM `barang_elektronik`";
            java.sql.Connection conn = (Connection) konektor.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {
                model.addRow(new Object[]{
                    no++, rs.getString(1), rs.getString(2),
                    rs.getString(6), rs.getString(5),
                    rs.getString(3),

                });
            }
            jTable1.setModel(model);
        } catch (Exception e) {

        }

    }
private void  kosong(){
    jComboBox2.setSelectedItem(this); 
}
    public void getDataComboBox(){
        
       
        try{
             String queryEtalaseItem = "SELECT  * FROM `jenis_barang`";
        
        java.sql.Connection conn =(Connection )konektor.configDB();
        java.sql.PreparedStatement pst = conn.prepareStatement(queryEtalaseItem);
           java.sql.ResultSet rs = pst.executeQuery(queryEtalaseItem);
           while(rs.next()){
               jComboBox2.addItem(rs.getString("id_jenis_barang"));
           }
         }catch(Exception e){
             JOptionPane.showMessageDialog(this, e.getMessage());
         
            
        }        
    }
    private void autonumber() {
       try {
           String sql = "SELECT MAX(id_barang) AS ID FROM barang_elektronik";
           java.sql.Connection conn = (Connection)konektor.configDB();
           java.sql.Statement pst = conn.createStatement();
           java.sql.ResultSet rs = pst.executeQuery(sql);
           while(rs.next()) {
               Object[] obj = new Object[1];
               obj[0] = rs.getString("ID");
               if(obj[0] == null) {
                   obj[0] = "BE00";
               }
               String str_id = (String) obj[0];
               String kd = str_id.substring(2, 5);
               int int_code = Integer.parseInt(kd);
               int_code++;
               String a = String.format("%03d", int_code);
               String b = "SP" + a;
               txt_idbarang.setText(b);
               txt_idbarang.setEditable(false);
                }
           } catch (NumberFormatException | SQLException e) {      
       }
    }
    
    
    
    

    /**
     *
     * @param args
     */
 

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
            java.util.logging.Logger.getLogger(input_barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(input_barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(input_barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(input_barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new input_barang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_edit;
    private javax.swing.JButton btn_hapus;
    private javax.swing.JButton btn_input;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txt_harga_beli;
    private javax.swing.JTextField txt_harga_jual;
    private javax.swing.JTextField txt_idbarang;
    private javax.swing.JTextField txt_nama;
    private javax.swing.JTextField txt_stock;
    // End of variables declaration//GEN-END:variables
}
