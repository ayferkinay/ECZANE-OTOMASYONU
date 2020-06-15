
import com.mysql.cj.protocol.Resultset;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kinay
 */
public class hasta_kayit extends javax.swing.JFrame {

    /**
     * Creates new form hasta_kayit
     */
    public hasta_kayit() {
        initComponents();
        getConnection();
         hastalari_tabloya_aktar();
    }

   Connection getConnection(){
    Connection conn=null;
    int port=3306;
    String local="localhost";
    String db="eczane_otomasyonu";
    String kullanici_adi="root";
    String parola="";
        try {
        //   Class.forName("com.mysql.jdbc.Driver");
        conn=DriverManager.getConnection("jdbc:mysql://"+local+":"+port+"/"+db+"?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey",kullanici_adi,parola);

            return conn;
        } catch (SQLException ex) {
             System.out.println("Veritabanı bağlantısı başarısız"+ex);
              Logger.getLogger(ilac.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtadsoyad = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtyas = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_iletisim = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txttckimlik = new javax.swing.JTextField();
        txteposta = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        hasta_kaydet = new javax.swing.JButton();
        hasta_yenikayit = new javax.swing.JButton();
        hasta_kayit_temizle = new javax.swing.JButton();
        ansayfaya_donus = new javax.swing.JButton();
        cikis = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        hasta_tablo = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1000, 800));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kadın hasta.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/erkek hasta.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Ad Soyad:");

        txtadsoyad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtadsoyadActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Yaş:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("E-posta:");

        txt_iletisim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_iletisimActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("İletişim:");

        txttckimlik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttckimlikActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("TC Kimlik No:");

        hasta_kaydet.setBackground(new java.awt.Color(255, 204, 204));
        hasta_kaydet.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        hasta_kaydet.setText("KAYIT GÜNCELLE");
        hasta_kaydet.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hasta_kaydet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hasta_kaydetActionPerformed(evt);
            }
        });

        hasta_yenikayit.setBackground(new java.awt.Color(255, 204, 204));
        hasta_yenikayit.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        hasta_yenikayit.setText("KAYDET");
        hasta_yenikayit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hasta_yenikayit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hasta_yenikayitActionPerformed(evt);
            }
        });

        hasta_kayit_temizle.setBackground(new java.awt.Color(255, 204, 204));
        hasta_kayit_temizle.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        hasta_kayit_temizle.setText("KAYIT SİL");
        hasta_kayit_temizle.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hasta_kayit_temizle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hasta_kayit_temizleActionPerformed(evt);
            }
        });

        ansayfaya_donus.setBackground(new java.awt.Color(255, 204, 204));
        ansayfaya_donus.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        ansayfaya_donus.setText("ANASAYFA");
        ansayfaya_donus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ansayfaya_donus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ansayfaya_donusActionPerformed(evt);
            }
        });

        cikis.setBackground(new java.awt.Color(202, 0, 0));
        cikis.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cikis.setText("ÇIKIŞ");
        cikis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cikisActionPerformed(evt);
            }
        });

        hasta_tablo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Hasta id", "TC Kimlik No", "Ad Soyad", "Yaş", "İletişim", "E-posta"
            }
        ));
        hasta_tablo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hasta_tabloMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                hasta_tabloMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(hasta_tablo);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Hasta İd:");

        txt_id.setEnabled(false);

        jButton1.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jButton1.setText("ALAN TEMİZLE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(68, 68, 68)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtadsoyad)
                                    .addComponent(txttckimlik)
                                    .addComponent(txtyas)
                                    .addComponent(txteposta)
                                    .addComponent(txt_iletisim, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                    .addComponent(txt_id)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cikis, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(hasta_yenikayit, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addComponent(hasta_kaydet)
                        .addGap(51, 51, 51)
                        .addComponent(hasta_kayit_temizle, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(ansayfaya_donus, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(52, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 836, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txttckimlik, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtadsoyad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtyas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txt_iletisim, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txteposta, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26))
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(hasta_kayit_temizle, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hasta_kaydet, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hasta_yenikayit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ansayfaya_donus, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(cikis, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtadsoyadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtadsoyadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtadsoyadActionPerformed

    private void txt_iletisimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_iletisimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_iletisimActionPerformed

    private void txttckimlikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttckimlikActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttckimlikActionPerformed

    private void hasta_kaydetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hasta_kaydetActionPerformed
 try {
             Connection conn=getConnection();
           PreparedStatement ps=conn.prepareStatement("Update hasta SET hasta_tc=?, hasta_ad=?,hasta_yas=?,hasta_iletisim=?,hasta_eposta=? WHERE id=?");
                ps.setString(1, txttckimlik.getText());
                ps.setString(2, txtadsoyad.getText());
                ps.setString(3, txtyas.getText());
                ps.setString(4, txt_iletisim.getText());   
                ps.setString(5, txteposta.getText());   

                ps.setInt(6, Integer.valueOf(txt_id.getText()));
                ps.executeUpdate();
                hastalari_tabloya_aktar();
               JOptionPane.showMessageDialog(null, "Hasta Kaydı Güncellendi");
                txttckimlik.setText("");
                txtadsoyad.setText("");
                txtyas.setText("");
                txt_iletisim.setText("");
                txteposta.setText("");


        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_hasta_kaydetActionPerformed

    private void hasta_yenikayitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hasta_yenikayitActionPerformed
        if (kontrolet()) {
            try {
                Connection conn =getConnection();
                PreparedStatement ps=conn.prepareStatement("INSERT INTO hasta (hasta_tc,hasta_ad,hasta_yas,hasta_iletisim,hasta_eposta) value (?,?,?,?,?)");
                ps.setString(1, txttckimlik.getText());
                ps.setString(2, txtadsoyad.getText());
                ps.setString(3, txtyas.getText());
                ps.setString(4, txt_iletisim.getText());
                ps.setString(5, txteposta.getText());
                ps.executeUpdate();
                 hastalari_tabloya_aktar();
                JOptionPane.showMessageDialog(null, "Hasta Eklendi");
                
               
                txt_iletisim.setText("");
                txtadsoyad.setText("");
                txteposta.setText("");
                txtyas.setText("");
                txttckimlik.setText("");
        
            } catch (Exception e) {
            }
        }
        else {
               JOptionPane.showMessageDialog(null, "Boş DEğer Tanımlanamaz");

        }
        ;
    }//GEN-LAST:event_hasta_yenikayitActionPerformed

    private void hasta_kayit_temizleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hasta_kayit_temizleActionPerformed
        if(!txt_id.equals("")){

          try {
                
            Connection conn=getConnection();
 
                PreparedStatement ps=conn.prepareStatement("Delete From hasta where id=?");
                int hastaid=Integer.parseInt(txt_id.getText());
                ps.setInt(1, hastaid);
                ps.executeUpdate();
                hastalari_tabloya_aktar();
                JOptionPane.showMessageDialog(null, "Hasta Kaydı Silindi");
                txt_id.setText("");
                txttckimlik.setText("");
                txtadsoyad.setText("");
                txtyas.setText("");
                txt_iletisim.setText("");
                txteposta.setText("");

                
            } catch (Exception e) {
                System.out.println("Hata bulundu"+e);
                e.printStackTrace();
            }
        }
        
        else {
           JOptionPane.showMessageDialog(null, "Silinecek Kayıt Bulunamadı");
        }
       // TODO add your handling code here:
    }//GEN-LAST:event_hasta_kayit_temizleActionPerformed

    private void ansayfaya_donusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ansayfaya_donusActionPerformed
         JOptionPane.showMessageDialog(rootPane,"Anasayfa'ya Yönlendiriliyorsunuz....");        

        AnaSayfa anasayfa=new AnaSayfa();
        anasayfa.setVisible(true);
        dispose();
    }//GEN-LAST:event_ansayfaya_donusActionPerformed

    private void cikisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cikisActionPerformed
        JOptionPane.showMessageDialog(rootPane,"Sistem sonlandırılıyor");
        System.exit(0);
    }//GEN-LAST:event_cikisActionPerformed

    private void hasta_tabloMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hasta_tabloMousePressed
        txttckimlik.setText(hasta_tablo.getValueAt(hasta_tablo.getSelectedRow(), 0).toString());
        txtadsoyad.setText(hasta_tablo.getValueAt(hasta_tablo.getSelectedRow(), 1).toString());
        txtyas.setText(hasta_tablo.getValueAt(hasta_tablo.getSelectedRow(), 2).toString());
        txteposta.setText(hasta_tablo.getValueAt(hasta_tablo.getSelectedRow(), 3).toString());
        txt_iletisim.setText(hasta_tablo.getValueAt(hasta_tablo.getSelectedRow(), 4).toString());
    }//GEN-LAST:event_hasta_tabloMousePressed

    private void hasta_tabloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hasta_tabloMouseClicked
        int index =hasta_tablo.getSelectedRow();
        try {
            hasta_kayit_goster(index);
            
        } catch (Exception e) {
        }
    }//GEN-LAST:event_hasta_tabloMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    txt_id.setText("");
    txttckimlik.setText("");
    txtadsoyad.setText("");
    txtyas.setText("");
    txt_iletisim.setText("");
    txteposta.setText("");

    }//GEN-LAST:event_jButton1ActionPerformed
boolean kontrolet(){
    if (txttckimlik.getText()==null|| txtadsoyad.getText()==null|| txtyas.getText()==null || txt_iletisim.getText()==null|| txteposta.getText()==null) {
        return false;
        
    }
    else{
            return true;
    }
}
    ArrayList<hasta_kayit_sutunlar>gethasta_kayit_sutunlar() {
    ArrayList<hasta_kayit_sutunlar>hasta_listesi=new ArrayList<>();
    Connection conn=getConnection();
    String sorgu ="SELECT * FROM hasta";
        Statement st;
        try {
            ResultSet rs;
            st=conn.createStatement();
            rs=(ResultSet) st.executeQuery(sorgu);
            hasta_kayit_sutunlar hks;
            while (rs.next()) {
            hks=new hasta_kayit_sutunlar(rs.getInt("id"),rs.getString("hasta_tc"), rs.getString("hasta_ad"), rs.getString("hasta_yas"), rs.getString("hasta_iletisim"),rs.getString("hasta_eposta"));
           hasta_listesi.add(hks);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return hasta_listesi;
    }
    void hastalari_tabloya_aktar(){
        try {
            ArrayList<hasta_kayit_sutunlar>list=gethasta_kayit_sutunlar();
            DefaultTableModel model=(DefaultTableModel)hasta_tablo.getModel();
            model.setRowCount(0);
            Object [] satir=new Object[6];
            for (int i = 0; i < list.size(); i++) {
                   satir[0]=list.get(i).getHasta_id();
                   satir[1]=list.get(i).getHasta_tc();
                   satir[2]=list.get(i).getHasta_ad();
                   satir[3]=list.get(i).getHasta_yas();
                   satir[4]=list.get(i).getHasta_iletisim();
                   satir[5]=list.get(i).getHasta_eposta();
                   model.addRow(satir);
                   
                 
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    
    }
    void hasta_kayit_goster(int index){
        try {
            txt_id.setText(Integer.toString(gethasta_kayit_sutunlar().get(index).getHasta_id()));
            txttckimlik.setText(gethasta_kayit_sutunlar().get(index).getHasta_tc());
            txtadsoyad.setText(gethasta_kayit_sutunlar().get(index).getHasta_ad());
            txtyas.setText(gethasta_kayit_sutunlar().get(index).getHasta_yas());
            txt_iletisim.setText(gethasta_kayit_sutunlar().get(index).getHasta_iletisim());
            txteposta.setText(gethasta_kayit_sutunlar().get(index).getHasta_eposta());
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    
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
            java.util.logging.Logger.getLogger(hasta_kayit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(hasta_kayit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(hasta_kayit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(hasta_kayit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new hasta_kayit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ansayfaya_donus;
    private javax.swing.JButton cikis;
    private javax.swing.JButton hasta_kaydet;
    private javax.swing.JButton hasta_kayit_temizle;
    private javax.swing.JTable hasta_tablo;
    private javax.swing.JButton hasta_yenikayit;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_iletisim;
    private javax.swing.JTextField txtadsoyad;
    private javax.swing.JTextField txteposta;
    private javax.swing.JTextField txttckimlik;
    private javax.swing.JTextField txtyas;
    // End of variables declaration//GEN-END:variables
}
