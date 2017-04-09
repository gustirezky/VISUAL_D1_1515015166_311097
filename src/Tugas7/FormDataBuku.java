package Tugas7; // program berada pada package Tugas7

/**
 *
 * @author rezkyananda
 */
import java.sql.*; //agar saling terkait dengan jdbc
import javax.swing.JOptionPane; // membuat suatu peringatan atau pesan
import javax.swing.table.DefaultTableModel; // mendeklarasikan

public class FormDataBuku extends javax.swing.JFrame { //class turunan dari javax.swing.JFrame, artinya class Tugas7 dapat mengakses data/fungsi yang ada di parentnya javax.swing.JFrame
    
private DefaultTableModel model;  // untuk menghubungkan tabel diframe
private Connection con=koneksi.getConnection();  // koneksi fisik dengan database
private Statement stt;  // mengeksekusi query yang static dengan tipe data private
private ResultSet rss;  // menyatakan jumlah row dar query dengan tipe data private
    /**
     * Creates new form FormDataBuku
     */
    public FormDataBuku() { //method FormDataBuku dengan hak akses publik
        initComponents();  //adalah method yang di generate oleh netbeans secara default. Kemudian juga terlihat ada method getter dan setter untuk variabel userList
    }
    
    private void InitTable(){
        model = new DefaultTableModel(); // mendeklarasikan model yang terhubung dengan tabel model
        model.addColumn("JUDUL"); // mendeklarasikan kolom pertama dengan nama judul 
        model.addColumn("PENULIS"); // mendeklarasikan kolom kedua dengan nama penulis
        model.addColumn("HARGA"); // mendeklarasikan kolom ketiga dengan nama harga
        
        jTable4.setModel(model); // menghubungkan frame tabel dengan deklarasi tabel model
    }
    
    private void TampilData(){ // method tampil data dengan type private
        try{ //
            String sql = "SELECT * FROM buku"; // memanggil dari php dengan tabel buku
            stt = con.createStatement(); // membuat statement baru dengan mengkonekan ke database
            rss = stt.executeQuery(sql); 
            while (rss.next()){ 
                Object[] o = new Object [3]; // membuat array 3 dimensi dengan nama object
              
                o[0] = rss.getString("judul"); // yang pertama dengan ketentuan judul
                o[1] = rss.getString("penulis"); // yang kedua dengan ketentuan penulis
                o[2] = rss.getInt("harga"); // yang ketiga dengan ketentuan harga
                model.addRow(o); // memasukkan baris dengan mengkonekan di tabel model
            } 
            }catch(SQLException e){ // memanipulasi kesalahan
                System.out.println("ini error"); // menampilkan pesan ini error
        }
    }
    
    private void TambahData(String judul,String penulis,String harga){ // method tambah data dengan type private dan param judul, penulis dan harga dengan type string
        try{ // memanipulasi kesalahan
            String sql = "INSERT INTO buku VALUES(NULL,'"+judul+"','"+penulis+"',"+harga+")"; // menambahkan data dengan mengkonekan dari php
            stt = con.createStatement();  // membuat statement baru dengan mengkonekan ke database
            stt.executeUpdate(sql); 
            model.addRow(new Object[]{judul,penulis,harga}); // datanya akan tertambah dibaris baru di tabel model
            
            }catch(SQLException e){ // memanipulasi kesalahan
                System.out.println("ini error"); // menampilkan pesan ini error
        }
    }
    
//    public boolean UbahData(String id,String judul,String penulis, String harga){
//        try{
//            String sql = "update buku set  judul='"+judul+"',penulis= '"+penulis+"',"
//                    + "harga="+harga+"where id="+id+";";
//            stt = con.createStatement();
//            stt.executeUpdate(sql);
//            return true;
//        } catch(SQLException e){
//            System.out.println(e.getMessage());
//            return false;
//        }
//    }
//    public boolean HapusData(String id){
//        try{
//            String sql = "delete from buku where id ="+id+";";
//            stt = con.createStatement();
//            stt.executeUpdate(sql);
//            return true;
//        } catch(SQLException e){
//            System.out.println(e.getMessage());
//            return false;
//        }
//    }
    
//    private void PencarianData(String by, String cari){
//        try{
//            String sql = "select * from buku where"+by+"like'%"+cari+"%';";
//            stt = con.createStatement();
//            rss = stt.executeQuery(sql);
//            while(rss.next()){
//                Object[] data = new Object [4];
//                data[0] = rss.getString("id");                       
//                data[1] = rss.getString("judul");
//                data[2] = rss.getString("penulis");
//                data[3] = rss.getInt("harga");
//                model.addRow(data);
//            }
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//        }
//    }
    
            
            
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked") //@SuppressWarnings digunakan untuk memberitahu compiler untuk menahan (suppress) warnings tertentu yang terhasil. Biasanya jika kita membuat deprecated method, warning yang terhasil dapat ditahan dengan menggunakan @SuppressWarnings.
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtJudul = new javax.swing.JTextField();
        txtHarga = new javax.swing.JTextField();
        cmbPenulis = new javax.swing.JComboBox();
        jPanel3 = new javax.swing.JPanel();
        bSimpan = new javax.swing.JButton();
        bUbah = new javax.swing.JButton();
        bHapus = new javax.swing.JButton();
        bKeluar = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        pencarian = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtCari = new javax.swing.JTextField();
        cari = new javax.swing.JComboBox();

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

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "JUDUL", "PENULIS", "HARGA"
            }
        ));
        jTable2.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jTable2ComponentShown(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(jTable3);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(153, 153, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("FORM DATA BUKU");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(153, 153, 0));

        jLabel2.setText("JUDUL");

        jLabel3.setText("PENULIS");

        jLabel4.setText("HARGA");

        txtJudul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJudulActionPerformed(evt);
            }
        });

        txtHarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHargaActionPerformed(evt);
            }
        });

        cmbPenulis.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tere Liye", "W.S Rendra", "Felix Siauw", "Asma Nadia", "Dewi Lestari" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbPenulis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtJudul, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtJudul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cmbPenulis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(153, 153, 0));
        jPanel3.setLayout(new java.awt.GridLayout(1, 0));

        bSimpan.setText("SIMPAN");
        bSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSimpanActionPerformed(evt);
            }
        });
        jPanel3.add(bSimpan);

        bUbah.setText("UBAH");
        bUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bUbahActionPerformed(evt);
            }
        });
        jPanel3.add(bUbah);

        bHapus.setText("HAPUS");
        bHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bHapusActionPerformed(evt);
            }
        });
        jPanel3.add(bHapus);

        bKeluar.setText("KELUAR");
        bKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bKeluarActionPerformed(evt);
            }
        });
        jPanel3.add(bKeluar);

        jTable4.setBackground(new java.awt.Color(153, 153, 0));
        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "JUDUL", "PENULIS", "HARGA"
            }
        ));
        jTable4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable4MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTable4);

        pencarian.setBackground(new java.awt.Color(153, 153, 0));

        jLabel5.setText("Cari : ");

        jLabel6.setText("Berdasarkan :");

        txtCari.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtCariCaretUpdate(evt);
            }
        });
        txtCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCariActionPerformed(evt);
            }
        });
        txtCari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCariKeyTyped(evt);
            }
        });

        cari.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "JUDUL", "PENULIS", "HARGA" }));

        javax.swing.GroupLayout pencarianLayout = new javax.swing.GroupLayout(pencarian);
        pencarian.setLayout(pencarianLayout);
        pencarianLayout.setHorizontalGroup(
            pencarianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pencarianLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pencarianLayout.setVerticalGroup(
            pencarianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pencarianLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pencarianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE)
                    .addComponent(pencarian, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pencarian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtJudulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJudulActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtJudulActionPerformed

    private void txtHargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHargaActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        InitTable(); // untuk terhubung di frame formdatabuku
        TampilData(); // untuk terhubung di frame formdatabuku
    }//GEN-LAST:event_formComponentShown

    private void bUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bUbahActionPerformed
        // TODO add your handling code here:
//        int baris = jTable4.getSelectedRow();
//        String id = jTable4.getValueAt(baris,0).toString();
        
//        String judul = txtJudul.getText();
//        String penulis = cmbPenulis.getSelectedItem().toString();
//        String harga = txtHarga.getText();
//        if (UbahData(id,judul,penulis,harga))
//            JOptionPane.showMessageDialog(null, "Berhasil Ubah Data");
//        else
//           JOptionPane.showMessageDialog(null, "Gagal Ubah Data"); 
//        InitTable();TampilData();
    }//GEN-LAST:event_bUbahActionPerformed

    private void bSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSimpanActionPerformed
        // TODO add your handling code here:
       // int baris = jTable4.getSelectedRow();
        //String id = jTable4.getValueAt(baris,0).toString();
        String judul = txtJudul.getText(); // menyimpan/ mengambil data judul dengan tipe data string
        String penulis = cmbPenulis.getSelectedItem().toString(); // menyimpan/ mengambil data penulis dengan tipe data string
        String harga = txtHarga.getText(); // menyimpan/ mengambil data harga dengan tipe data string
        TambahData(judul, penulis, harga); // menyimpan data di php dengan memanggil tambahdata
        
    }//GEN-LAST:event_bSimpanActionPerformed

    private void jTable2ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jTable2ComponentShown
        // TODO add your handling code here:
        InitTable(); //menghubungkan dengan frame 
    }//GEN-LAST:event_jTable2ComponentShown

    private void bKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bKeluarActionPerformed
        // TODO add your handling code here:
        System.exit(0); // keluar dari program dan 
    }//GEN-LAST:event_bKeluarActionPerformed

    private void txtCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCariActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtCariActionPerformed

    private void jTable4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable4MouseClicked
        // TODO add your handling code here:
        int baris = jTable4.getSelectedRow(); // mendeklarasikan baris dengan tabel diframe
        
        txtJudul.setText(jTable4.getValueAt(baris,1).toString()); //memberi nilai pada baris 1 
        cmbPenulis.setSelectedItem(jTable4.getValueAt(baris, 2).toString()); // memberi nilai pada baris 2
        txtHarga.setText(jTable4.getValueAt(baris,3).toString()); // memberi nilai pada baris 3
    }//GEN-LAST:event_jTable4MouseClicked

    private void bHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bHapusActionPerformed
        // TODO add your handling code here:
       int pilih = JOptionPane.showConfirmDialog(this, "Ingin Hapus","Confirm Dihapus", JOptionPane.YES_NO_OPTION); // membuat peringatan pesan dengan confirm dihapus 
        if(pilih==JOptionPane.YES_OPTION){
            int baris = jTable4.getSelectedRow(); // peringatan tersebut jika dihapus maka baris yang dipilih dari tabel tersebut akan secara otomatis terhapus

            model.removeRow(baris); // menghapus data satu baris dalam tabel model
        }
    }//GEN-LAST:event_bHapusActionPerformed

    private void txtCariCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtCariCaretUpdate
        // TODO add your handling code here:
//        InitTable();
//        if (txtCari.getText().length()==0){
//            TampilData();
//        }else{
//            PencarianData(cmbCari.getSelectedItem().toString(),txtCari.getText());
//        }
    }//GEN-LAST:event_txtCariCaretUpdate

    private void txtCariKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCariKeyTyped
        // TODO add your handling code here:
         model.getDataVector().removeAllElements(); // 
        model.fireTableDataChanged(); //
        String caridengan = cari.getSelectedItem().toString(); // membuat variabel baru dengan tipe data caridengan dengan menghubungkan combo box cari
        try {
            
             String sql="select * from buku where "+caridengan+" like '%"+txtCari.getText()+"%'"; // mencari data dari tabel buku dengan menghubungkan isi dari variabel caridengan dengan textfield cari
           stt = con. createStatement();  // membuat statement baru dengan mengkonekan ke database
            rss = stt. executeQuery(sql);//
                       ResultSet rss=stt.executeQuery(sql); //
            while (rss.next()) { 
                Object[] o=new Object[3]; // membuat object array 3 dimensi
                o[0]=rss.getString("JUDUL");// menambahkam object dengan nama judul
                o[1]=rss.getString("PENULIS"); //  menambahkan object dengan nama penulis
                o[2]=rss.getString("HARGA"); //  menambahkan object dengan nama harga
                

            model.addRow(o); // memasukkan baris dengan mengkonekan di tabel model
            }
            stt.close(); // menutup statement yang dibuat atau menutup seleksi query
            rss.close(); // 
        }catch(SQLException e) { //memanipulasi kesalahan atau error
            System.out.println("Terjadi kesalahan");// menampilkan pesan terjadi kesalahan
        }
    }//GEN-LAST:event_txtCariKeyTyped

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
            java.util.logging.Logger.getLogger(FormDataBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormDataBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormDataBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormDataBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormDataBuku().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bHapus;
    private javax.swing.JButton bKeluar;
    private javax.swing.JButton bSimpan;
    private javax.swing.JButton bUbah;
    private javax.swing.JComboBox cari;
    private javax.swing.JComboBox cmbPenulis;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JPanel pencarian;
    private javax.swing.JTextField txtCari;
    private javax.swing.JTextField txtHarga;
    private javax.swing.JTextField txtJudul;
    // End of variables declaration//GEN-END:variables
}
