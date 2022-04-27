/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package toko_elektronik;
import java.sql.Connection;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class inputElektronik extends javax.swing.JFrame {

    /**
     * Creates new form inputElektronik
     */
    public inputElektronik() {
     initComponents();
         this.setResizable(false);
        getDataComboBox();
         load_table();
         kosong();
    }
private void load_table(){
    DefaultTableModel model = new DefaultTableModel();
       model.addColumn("No");
       model.addColumn("Id Barang");
       model.addColumn("Nama Barang");
       model.addColumn("Harga Beli");
       model.addColumn("Harga Jual");
       model.addColumn("Jumlah");
     try{
         
         int no = 1;
         String sql = "SELECT * FROM `data_barang`";
         java.sql.Connection conn = (Connection) konektor.configDB();
         java.sql.Statement stm = conn.createStatement();
         java.sql.ResultSet rs = stm.executeQuery(sql);
         while(rs.next()){
             model.addRow(new Object[]{
                 no++,rs.getString(1),rs.getString(3),
                 rs.getString(4),rs.getString(5),
                 rs.getString(6),rs.getString(7)
                 
             });
         }
         jTable1.setModel(model);
     } catch(Exception e){
         
     }
}
private void  kosong(){
    idbarang.enable();
    namabarang.setText(null);
    harga_beli.setText(null);
    hargajual.setText(null);
    jumlah.setText(null);
    jComboBox1.setSelectedItem(this); 
}
 public void getDataComboBox(){
        
        String queryEtalaseItem = "SELECT  * FROM `jenis_etalase`";
        try{
        java.sql.Connection conn =(Connection )konektor.configDB();
        java.sql.PreparedStatement pst = conn.prepareStatement(queryEtalaseItem);
           java.sql.ResultSet rs = pst.executeQuery(queryEtalaseItem);
           while(rs.next()){
               jComboBox1.addItem(rs.getString("jenis_etalase"));
           }
        }catch(Exception e){
            
        }        
    }
  static int posisiIndexBarang(){
            ArrayList<String> datIndex = new ArrayList<>();
         
        try{
            String sqlQuery = "SELECT * FROM `data_barang` ORDER BY `indexNo` DESC";
            java.sql.Connection conn = (Connection) konektor.configDB();
            java.sql.PreparedStatement prs = conn.prepareStatement(sqlQuery);
            java.sql.ResultSet rs = prs.executeQuery();
        
              while(rs.next()){
                  datIndex.add(rs.getString("IndexNo"));
             }
             
        } catch(Exception e){
            e.printStackTrace();
        }
        
        
        return Integer.parseInt(datIndex.get(0));
    }
      static int posisiIndexTransaksi(){
            ArrayList<String> dataIndexTransaksi = new ArrayList<>();
         
        try{
            String sqlQuery = "SELECT * FROM `data_barang` ORDER BY `indexNo` DESC";
            java.sql.Connection conn = (Connection) konektor.configDB();
            java.sql.PreparedStatement prs = conn.prepareStatement(sqlQuery);
            java.sql.ResultSet rs = prs.executeQuery();
        
              while(rs.next()){
                  dataIndexTransaksi.add(rs.getString("IndexNo"));
             }
             
        } catch(Exception e){
            e.printStackTrace();
        }
        
        return Integer.parseInt(dataIndexTransaksi.get(0));
    }
    
       static int getPosisiDataBarang(){
            ArrayList<String> data = new ArrayList<>();
         
        try{
            String sqlQuery = "SELECT * FROM `data_barang` ORDER BY `indexNo` DESC";
            java.sql.Connection conn = (Connection) konektor.configDB();
            java.sql.PreparedStatement prs = conn.prepareStatement(sqlQuery);
            java.sql.ResultSet rs = prs.executeQuery();
        
              while(rs.next()){
                  data.add(rs.getString("idbarang"));
             }
             
        } catch(Exception e){
            e.printStackTrace();
        }
        String teksDataBarang = data.get(0).replaceAll("TB", "");
        
        return Integer.parseInt(teksDataBarang);
    }

    
    static int getPosisiTransaksiAkhir(){
            ArrayList<String> dataTF = new ArrayList<>();
         
        try{
            String sqlQuery = "SELECT * FROM `transaksi_beli` ORDER BY `indexNo` DESC";
            java.sql.Connection conn = (Connection) konektor.configDB();
            java.sql.PreparedStatement prs = conn.prepareStatement(sqlQuery);
            java.sql.ResultSet rs = prs.executeQuery();
        
              while(rs.next()){
                  dataTF.add(rs.getString("id_transaksibeli"));
                  
             }
             
        } catch(Exception e){
            e.printStackTrace();
        }
        String teksTransaksiAkhir =dataTF.get(0).replaceAll("TF", "");
        
        return Integer.parseInt(teksTransaksiAkhir);
    }

     static int c(){
         return 1;
     } 
     int posisiTerakhir = getPosisiTransaksiAkhir();
     int indexDataBarang = posisiIndexBarang() + 1;
     int indexTransaksi = posisiIndexTransaksi() + 1;
     int posisiDataBarang = getPosisiDataBarang() + 1 ;
     int posisiDataTransaksi = getPosisiTransaksiAkhir() + 1;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jumlah = new javax.swing.JTextField();
        namabarang = new javax.swing.JTextField();
        hargajual = new javax.swing.JTextField();
        harga_beli = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        hargabeli = new javax.swing.JLabel();
        idbarang = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jumlah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jumlahActionPerformed(evt);
            }
        });
        getContentPane().add(jumlah, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 360, 240, -1));

        namabarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namabarangActionPerformed(evt);
            }
        });
        getContentPane().add(namabarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 250, 240, -1));

        hargajual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hargajualActionPerformed(evt);
            }
        });
        getContentPane().add(hargajual, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 290, 240, -1));

        harga_beli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                harga_beliActionPerformed(evt);
            }
        });
        getContentPane().add(harga_beli, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 330, 240, -1));

        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 400, 240, -1));

        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 250, -1, 50));

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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 460, 870, 200));

        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 320, 60, 40));

        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 370, 60, 30));

        hargabeli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar_layout/input barang.png"))); // NOI18N
        getContentPane().add(hargabeli, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1140, 710));
        getContentPane().add(idbarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 190, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jumlahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jumlahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jumlahActionPerformed

    private void namabarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namabarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namabarangActionPerformed

    private void hargajualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hargajualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hargajualActionPerformed

    private void harga_beliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_harga_beliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_harga_beliActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    JOptionPane.showMessageDialog(null, "Input Data Berhasil");
        load_table();
        try {
String sqlx = "INSERT INTO `data_barang`(`idbarang`,`idetalase`,`namabarang`,`hargabeli`,`hargajual`,`stock` "
        + ",`tanggal`,`indexno` ) VALUES('TB" + posisiDataBarang + "'," +
jComboBox1.getSelectedIndex() +",'"+ namabarang.getText() +"'," + harga_beli.getText()  +
"," + hargajual.getText() +"," +jumlah.getText() + ", NOW(),'" + indexDataBarang +"');" ;
    
String queryInsertTransaksi = "INSERT INTO `transaksi_beli`(`id_transaksibeli`,`idBarang`,`indexno`) VALUES"
        + "('TF" + posisiDataTransaksi + "','TB" + posisiDataBarang +"','" +indexTransaksi+"');"; 

             java.sql.Connection conn = (Connection)konektor.configDB();
             java.sql.PreparedStatement pst1=conn.prepareStatement(sqlx);
            pst1.execute();
             java.sql.Connection con = (Connection) konektor.configDB();
             java.sql.PreparedStatement prc = con.prepareStatement(queryInsertTransaksi);
             prc.execute();             
         indexDataBarang ++;
         indexTransaksi++;
         posisiDataBarang ++;
         posisiDataTransaksi ++;
     } catch (Exception e) {
         JOptionPane.showMessageDialog(this, e.getMessage());            
         
     }
          load_table();
          kosong();
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
  int baris = jTable1.rowAtPoint(evt.getPoint());
        if(jTable1.getValueAt(baris, 2) == null){
            namabarang.setText("");
        } else{
            namabarang.setText(jTable1.getValueAt(baris, 2).toString());
        }
        if(jTable1.getValueAt(baris,3) == null){
            harga_beli.setText("");
        } else{
            harga_beli.setText(jTable1.getValueAt(baris,3).toString());
        }        
        if(jTable1.getValueAt(baris, 4) == null){
            hargajual.setText("");
        } else{
            hargajual.setText(jTable1.getValueAt(baris,4).toString());
        }
        if(jTable1.getValueAt(baris, 5) == null){
            jumlah.setText("");
        } else{
            jumlah.setText(jTable1.getValueAt(baris, 5).toString());
        }
        if(jTable1.getValueAt(baris, 1) == null){
            idbarang.setText("");
        } else{
            idbarang.setText(jTable1.getValueAt(baris, 1).toString());
        }
    
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     try {
           String sql = "FUPDATE `data_barang`"
                   + "SET NamaBarang = '"+namabarang.getText()
                   +"',HargaBeli= '"+harga_beli.getText()
                   +"',HargaJual= '"+hargajual.getText()
                   +"',stock= '"+jumlah.getText()
                   +"'WHERE data_barang.idBarang= '"+idbarang.getText()
                   +"'";
           java.sql.Connection conn=(Connection)konektor.configDB();
           java.sql.PreparedStatement pat=conn.prepareStatement(sql);
           pat.execute();
           JOptionPane.showMessageDialog(null, "data berhasil di edit");
       }catch (Exception e){
           JOptionPane.showMessageDialog(null, "Perubahan Data Gagal"
           +e.getMessage());
       }
       load_table();
       kosong();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       try{
        String sql = "DELETE FROM `transaksi_beli` WHERE `idBarang` = '" + idbarang.getText().toString() +"';";
        String sql1 =  "DELETE FROM `data_barang` WHERE `idBarang` = '" + idbarang.getText().toString() +"';";
        java.sql.Connection conn = (Connection) konektor.configDB();
        java.sql.Statement smt_2 = conn.createStatement();
        java.sql.Statement smt_1 = conn.createStatement();
        smt_2.execute(sql);
        smt_1.execute(sql1);
      
        JOptionPane.showMessageDialog(null, "berhasil di hapus");
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        load_table();
        kosong();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(inputElektronik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inputElektronik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inputElektronik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inputElektronik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inputElektronik().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField harga_beli;
    private javax.swing.JLabel hargabeli;
    private javax.swing.JTextField hargajual;
    private javax.swing.JTextField idbarang;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jumlah;
    private javax.swing.JTextField namabarang;
    // End of variables declaration//GEN-END:variables
}
