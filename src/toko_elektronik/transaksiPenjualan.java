/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package toko_elektronik;

/**
 *
 * @author User
 */
import java.sql.*;
import java.sql.ResultSet;
import java.awt.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
class dataModelPenjualan{
    private int idPenjualan;
    private String idbarang;
    private String harga;
    private String jumlah;

    public dataModelPenjualan(int idPenjualan, String idbarang, String harga, String jumlah) {
        this.idPenjualan = idPenjualan;
        this.idbarang = idbarang;
        this.harga = harga;
        this.jumlah = jumlah;
    }

    public int getIdPenjualan() {
        return idPenjualan;
    }

    public String getIdbarang() {
        return idbarang;
    }

    public String getHarga() {
        return harga;
    }

    public String getJumlah() {
        return jumlah;
    }
}
public class transaksiPenjualan extends javax.swing.JFrame {

    /**
     * Creates new form transaksiPenjualan
     */
    public transaksiPenjualan() {
        initComponents();      
        this.setResizable(false);
        
        cariProduk objProduk = new cariProduk();
        objProduk.TampilData();
        load_table();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        txt_cari = new javax.swing.JTextField();
        namabarang = new javax.swing.JTextField();
        harga = new javax.swing.JTextField();
        jumlah = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        idbarang = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 300, 200, -1));

        txt_cari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_cariKeyReleased(evt);
            }
        });
        getContentPane().add(txt_cari, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, 250, -1));
        getContentPane().add(namabarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 200, 200, -1));
        getContentPane().add(harga, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 240, 200, -1));
        getContentPane().add(jumlah, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 270, 200, -1));

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 330, -1, -1));

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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(712, 370, 380, 130));

        table.setModel(new javax.swing.table.DefaultTableModel(
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
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, -1, 330));
        getContentPane().add(idbarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 160, 120, -1));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 560, 210, 30));

        jButton2.setText("jButton2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 520, -1, -1));

        jButton3.setText("jButton3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 570, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar_layout/transaksi penjualan.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1140, 690));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      try{
     int stockTersedia = getJumlahStock(idbarang.getText().toString());
     if(Integer.parseInt(jumlah.getText().toString()) > stockTersedia){
         JOptionPane.showMessageDialog(null, "Mohon Maaf Stock Anda Hanya Tersisa " + stockTersedia);
     } else{
     int hasilHitung = stockTersedia - Integer.parseInt(jumlah.getText().toString());
     String UPDATE_STOCK = "UPDATE `data_barang` SET `stock` = " + hasilHitung + " WHERE `idBarang` = '" +  
             idbarang.getText().toString() +"'";
     System.out.println(UPDATE_STOCK);
     java.sql.Connection con3 = (Connection) konektor.configDB();
    java.sql.Statement stm = con3.createStatement();
    stm.execute(UPDATE_STOCK);
               String sqli = "INSERT INTO `penjualan`(idbarang,harga,jumlah,tanggal_transaksi) VALUES('"
                       +idbarang.getText() + "','"                
                       +harga.getText() +"','" 
                       +jumlah.getText() +"', NOW());";
               listObj.add(new dataModelPenjualan(nomer++,namabarang.getText(),harga.getText(),jumlah.getText()));
               System.out.print(sqli);
               java.sql.Connection con = (Connection)konektor.configDB();
               java.sql.Statement pst = con.createStatement();
                          
               pst.execute(sqli);
               total += Integer.parseInt(harga.getText()) * Integer.parseInt(jumlah.getText());
               jLabel2.setText(" Rp." +String.valueOf(total));
     }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
 load_table();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt_cariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cariKeyReleased
 String key = txt_cari.getText();
    System.out.println(key);
        cariProduk objProd = new cariProduk();
    if (key!="") {
        objProd.cariData(key);
    } else {       
    }
    }//GEN-LAST:event_txt_cariKeyReleased

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
     int baris = table.rowAtPoint(evt.getPoint());
        if(table.getValueAt(baris, 1) == null){
            namabarang.setText("");
        } else{
            namabarang.setText(table.getValueAt(baris, 1).toString());
        }   
        if(table.getValueAt(baris, 2) == null){
            harga.setText("");
        } else{
            harga.setText(table.getValueAt(baris, 2).toString());
        }   
        if(table.getValueAt(baris, 0) == null){
            idbarang.setText("");
        } else{
            idbarang.setText(table.getValueAt(baris, 0).toString());
        }
    }//GEN-LAST:event_tableMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         int jA = table.getSelectedRow();
        listObj.remove(jA);
        load_table();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
  kosong();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

public class cariProduk extends javax.swing.JFrame {
    DefaultTableModel tabModel;
    ResultSet RsProduk = null;
    
     private void TampilData() {
         try {
            Object[] judul_kolom = {"idBarang"};
            tabModel = new DefaultTableModel(null,judul_kolom);
            table.setModel(tabModel);
            Connection conn = (Connection)konektor.configDB();
            Statement stt = conn.createStatement();
            tabModel.getDataVector().removeAllElements();
            
            tabModel.addColumn("Nama_Barang");
            table.setModel(tabModel);
            Statement stt1 = conn.createStatement();
            tabModel.getDataVector().removeAllElements();
            
            tabModel.addColumn("Harga");
            table.setModel(tabModel);
            Statement stt11 = conn.createStatement();
            tabModel.getDataVector().removeAllElements();
            
            RsProduk=stt.executeQuery("SELECT  * from `data_barang `");  
            while(RsProduk.next()){
                Object[] data={
                    RsProduk.getString("NamaBarang"),
                    RsProduk.getString("Harga"),
                    };
               tabModel.addRow(data);
            }                
        } catch (Exception ex) {
        System.err.println(ex.getMessage());
        }
         }
private void cariData(String key){
    try{
            tabModel=new DefaultTableModel();
                 tabModel.addColumn("idBarang");
            tabModel.addColumn("Nama_barang");
                 tabModel.addColumn("Harga");
            table.setModel(tabModel);
            
        if(key != ""){
            Connection conn=(Connection)konektor.configDB();
            Statement stt=conn.createStatement();
            tabModel.getDataVector().removeAllElements();
            String query = "SELECT  * from data_barang WHERE NamaBarang LIKE '%"+key+"%'";
        
            RsProduk=stt.executeQuery(query);  
            while(RsProduk.next()){
                Object[] data={
                    RsProduk.getString("idbarang"),
                    RsProduk.getString("namabarang"),
                RsProduk.getString("hargajual")};
               tabModel.addRow(data);
               table.setModel(tabModel);   
            }
            } else{
         Connection conn=(Connection)konektor.configDB();
            Statement stt=conn.createStatement();
            tabModel.getDataVector().removeAllElements();
            String query = "SELECT  * from data_barang WHERE NamaBarang LIKE '%"+key+"%'";
        
            RsProduk=stt.executeQuery(query);  
                Object[] data={
                    "kosong"
                    };
               tabModel.addRow(data);
            table.setModel(tabModel);   
        }               
        } catch (Exception ex) {
        System.err.println(ex.getMessage());
        }
    }
}
private void load_table(){
    DefaultTableModel model = new DefaultTableModel();
       model.addColumn("No");
       model.addColumn("Nama Barang");
       model.addColumn("Harga Jual");
       model.addColumn("Jumlah");
     try{
         
         for(int i = 0; i < listObj.size(); i++){
             
         model.addRow(new Object[]{
               listObj.get(i).getIdPenjualan(),
             listObj.get(i).getIdbarang(),
             listObj.get(i).getHarga(),
             listObj.get(i).getJumlah()
         });
         }
         jTable1.setModel(model);
     } catch(Exception e){
         
     }
}
static ArrayList<Integer> listNumber = new ArrayList<>();
static void posisiTerakhir(){
    try {
    String indexNo = "SELECT * FROM `penjualan` ORDER BY `idpenjualan` DESC";
    Connection omw = konektor.configDB();
    Statement stm = omw.createStatement();
    ResultSet rs = stm.executeQuery(indexNo);
    while(rs.next()){
        listNumber.add(Integer.parseInt(rs.getString("idpenjualan")));
    }
}
    catch(Exception e){
            e.printStackTrace();
            }
            
    
}
private void kosong() {
    namabarang.setText(null);
    harga.setText(null);
    jumlah.setText(null);
    listObj.clear();
    load_table();
}

static int total = 0;
static ArrayList<dataModelPenjualan>  listObj = new ArrayList<>();
static int nomer = 1;
public int getJumlahStock(String idBarang){
    String querySelect = "SELECT * FROM `data_Barang` WHERE `idBarang` = '" + idBarang +"'";
        try {
            java.sql.Connection con = (Connection) konektor.configDB();
            java.sql.PreparedStatement prp = con.prepareStatement(querySelect);
            java.sql.ResultSet rs = prp.executeQuery();
            while(rs.next()){
                return Integer.parseInt(rs.getString("stock"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(transaksiPenjualan.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
}
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
            java.util.logging.Logger.getLogger(transaksiPenjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(transaksiPenjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(transaksiPenjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(transaksiPenjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new transaksiPenjualan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField harga;
    private javax.swing.JTextField idbarang;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jumlah;
    private javax.swing.JTextField namabarang;
    private javax.swing.JTable table;
    private javax.swing.JTextField txt_cari;
    // End of variables declaration//GEN-END:variables
}

