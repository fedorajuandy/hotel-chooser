package utsimk_2019130032;

import java.text.DecimalFormat;
import java.util.Date;
import java.util.HashMap;
import javax.swing.JOptionPane;

/**
 *
 * @author 2019130032 - Fedora Yoshe Juandy
 */
public class FrmUTSIMK_2019130032 extends javax.swing.JFrame {
    DecimalFormat dfRp = new DecimalFormat("Rp #,###,##0");
    Date today = new Date();
    private final HashMap<String, Object> hargaPokok = new HashMap<>();
    private final HashMap<String, Integer> biayaTambahan = new HashMap<>();

    public FrmUTSIMK_2019130032() {
        initComponents();
        
        inisialisasi();
        //melarang copas; agar tidak lolos validasi begitu saja
        TxtNama.setTransferHandler(null);
        clear();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGBalkon = new javax.swing.ButtonGroup();
        btnGShower = new javax.swing.ButtonGroup();
        btnGView = new javax.swing.ButtonGroup();
        LbAnak = new javax.swing.JLabel();
        LbJudul = new javax.swing.JLabel();
        LbIdentitas = new javax.swing.JLabel();
        SpnAnak = new javax.swing.JSpinner();
        SpnDewasa = new javax.swing.JSpinner();
        LbJumlah = new javax.swing.JLabel();
        LbShower = new javax.swing.JLabel();
        LbDewasa = new javax.swing.JLabel();
        LbIn = new javax.swing.JLabel();
        LbFasilitas = new javax.swing.JLabel();
        LbOut = new javax.swing.JLabel();
        TxtNama = new javax.swing.JTextField();
        CBJenis = new javax.swing.JComboBox<>();
        BtnKeluar = new javax.swing.JButton();
        SeparatorV = new javax.swing.JSeparator();
        LbNama = new javax.swing.JLabel();
        LbJenis = new javax.swing.JLabel();
        LbTotal = new javax.swing.JLabel();
        Separator = new javax.swing.JSeparator();
        BtnSubmit = new javax.swing.JButton();
        BtnClear = new javax.swing.JButton();
        LbOutput = new javax.swing.JLabel();
        DCOut = new com.toedter.calendar.JDateChooser();
        DCIn = new com.toedter.calendar.JDateChooser();
        RBBalcony = new javax.swing.JRadioButton();
        RBNon = new javax.swing.JRadioButton();
        LbBalcony = new javax.swing.JLabel();
        LbBonus = new javax.swing.JLabel();
        LbGarden = new javax.swing.JLabel();
        LbCity = new javax.swing.JLabel();
        LbPool = new javax.swing.JLabel();
        RBCity = new javax.swing.JRadioButton();
        LbView = new javax.swing.JLabel();
        RBGarden = new javax.swing.JRadioButton();
        RBPool = new javax.swing.JRadioButton();
        LbNon = new javax.swing.JLabel();
        LbType = new javax.swing.JLabel();
        RBTidakAda = new javax.swing.JRadioButton();
        RBBathtub = new javax.swing.JRadioButton();
        RBJacuzzi = new javax.swing.JRadioButton();
        LbBathtub = new javax.swing.JLabel();
        LbJacuzzi = new javax.swing.JLabel();
        LbBg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("JENIS KAMAR HOTEL");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(1160, 735));
        setSize(new java.awt.Dimension(1160, 735));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LbAnak.setFont(new java.awt.Font("Comfortaa Light", 1, 14)); // NOI18N
        LbAnak.setForeground(new java.awt.Color(0, 0, 0));
        LbAnak.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LbAnak.setText("Anak         :");
        getContentPane().add(LbAnak, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 80, -1));

        LbJudul.setFont(new java.awt.Font("Comfortaa Light", 1, 48)); // NOI18N
        LbJudul.setForeground(new java.awt.Color(0, 0, 0));
        LbJudul.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LbJudul.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utsimk_2019130032/Title.png"))); // NOI18N
        getContentPane().add(LbJudul, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 15, 1130, -1));

        LbIdentitas.setFont(new java.awt.Font("Comfortaa Light", 1, 12)); // NOI18N
        LbIdentitas.setForeground(new java.awt.Color(0, 0, 0));
        LbIdentitas.setText("2019130032 - Fedora Yoshe Juandy");
        getContentPane().add(LbIdentitas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 670, 230, -1));

        SpnAnak.setFont(new java.awt.Font("Comfortaa Light", 1, 14)); // NOI18N
        SpnAnak.setModel(new javax.swing.SpinnerNumberModel(0, 0, 2, 1));
        getContentPane().add(SpnAnak, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 50, -1));

        SpnDewasa.setFont(new java.awt.Font("Comfortaa Light", 1, 14)); // NOI18N
        SpnDewasa.setModel(new javax.swing.SpinnerNumberModel(0, 0, 2, 1));
        getContentPane().add(SpnDewasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, 50, -1));

        LbJumlah.setFont(new java.awt.Font("Comfortaa Light", 1, 18)); // NOI18N
        LbJumlah.setForeground(new java.awt.Color(0, 0, 0));
        LbJumlah.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LbJumlah.setText("Jumlah Tamu     :");
        getContentPane().add(LbJumlah, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 160, -1));

        LbShower.setFont(new java.awt.Font("Comfortaa Light", 1, 18)); // NOI18N
        LbShower.setForeground(new java.awt.Color(0, 0, 0));
        LbShower.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LbShower.setText("Shower Room   :");
        getContentPane().add(LbShower, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 80, 150, -1));

        LbDewasa.setFont(new java.awt.Font("Comfortaa Light", 1, 14)); // NOI18N
        LbDewasa.setForeground(new java.awt.Color(0, 0, 0));
        LbDewasa.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LbDewasa.setText("Dewasa    :");
        getContentPane().add(LbDewasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 80, -1));

        LbIn.setFont(new java.awt.Font("Comfortaa Light", 1, 18)); // NOI18N
        LbIn.setForeground(new java.awt.Color(0, 0, 0));
        LbIn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LbIn.setLabelFor(DCIn);
        LbIn.setText("Tanggal cek in :");
        getContentPane().add(LbIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 365, 150, -1));

        LbFasilitas.setFont(new java.awt.Font("Comfortaa Light", 1, 18)); // NOI18N
        LbFasilitas.setForeground(new java.awt.Color(0, 0, 0));
        LbFasilitas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LbFasilitas.setText("Fasilitas               :");
        getContentPane().add(LbFasilitas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 160, -1));

        LbOut.setFont(new java.awt.Font("Comfortaa Light", 1, 18)); // NOI18N
        LbOut.setForeground(new java.awt.Color(0, 0, 0));
        LbOut.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LbOut.setLabelFor(DCOut);
        LbOut.setText("Tanggal cek out :");
        getContentPane().add(LbOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 365, 160, -1));

        TxtNama.setFont(new java.awt.Font("Comfortaa Light", 1, 14)); // NOI18N
        TxtNama.setForeground(new java.awt.Color(0, 0, 0));
        TxtNama.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        TxtNama.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtNamaKeyTyped(evt);
            }
        });
        getContentPane().add(TxtNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 350, -1));

        CBJenis.setBackground(new java.awt.Color(255, 255, 255));
        CBJenis.setFont(new java.awt.Font("Comfortaa Light", 1, 14)); // NOI18N
        CBJenis.setForeground(new java.awt.Color(0, 0, 0));
        CBJenis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "King Size", "Twin Bed" }));
        getContentPane().add(CBJenis, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 150, -1));

        BtnKeluar.setBackground(new java.awt.Color(153, 153, 255));
        BtnKeluar.setFont(new java.awt.Font("Comfortaa Light", 1, 14)); // NOI18N
        BtnKeluar.setForeground(new java.awt.Color(0, 0, 0));
        BtnKeluar.setText("KELUAR");
        BtnKeluar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnKeluar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnKeluarActionPerformed(evt);
            }
        });
        getContentPane().add(BtnKeluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 640, 100, 30));

        SeparatorV.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(SeparatorV, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 70, -1, 340));

        LbNama.setFont(new java.awt.Font("Comfortaa Light", 1, 18)); // NOI18N
        LbNama.setForeground(new java.awt.Color(0, 0, 0));
        LbNama.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LbNama.setLabelFor(TxtNama);
        LbNama.setText("Nama Lengkap  :");
        getContentPane().add(LbNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 160, -1));

        LbJenis.setFont(new java.awt.Font("Comfortaa Light", 1, 18)); // NOI18N
        LbJenis.setForeground(new java.awt.Color(0, 0, 0));
        LbJenis.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LbJenis.setLabelFor(CBJenis);
        LbJenis.setText("Jenis Bed            :");
        getContentPane().add(LbJenis, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 160, -1));

        LbTotal.setFont(new java.awt.Font("Comfortaa Light", 1, 18)); // NOI18N
        LbTotal.setForeground(new java.awt.Color(0, 0, 102));
        LbTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LbTotal.setText("Harga Total: [jumlah hari] * ( [harga pokok] + [biaya balkon] + [biaya shower] ) = [total]");
        getContentPane().add(LbTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 580, 1120, -1));
        getContentPane().add(Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 475, 1120, -1));

        BtnSubmit.setBackground(new java.awt.Color(153, 153, 255));
        BtnSubmit.setFont(new java.awt.Font("Comfortaa Light", 1, 14)); // NOI18N
        BtnSubmit.setForeground(new java.awt.Color(0, 0, 0));
        BtnSubmit.setText("SUBMIT");
        BtnSubmit.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnSubmit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSubmitActionPerformed(evt);
            }
        });
        getContentPane().add(BtnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 430, 100, 30));

        BtnClear.setBackground(new java.awt.Color(153, 153, 255));
        BtnClear.setFont(new java.awt.Font("Comfortaa Light", 1, 14)); // NOI18N
        BtnClear.setForeground(new java.awt.Color(0, 0, 0));
        BtnClear.setText("CLEAR");
        BtnClear.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnClear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnClearActionPerformed(evt);
            }
        });
        getContentPane().add(BtnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 430, 100, 30));

        LbOutput.setFont(new java.awt.Font("Comfortaa Light", 1, 18)); // NOI18N
        LbOutput.setForeground(new java.awt.Color(0, 0, 102));
        LbOutput.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LbOutput.setText("[Type] [Jenis] Bed [Balkon] [VIew] View ( [Bonus] )");
        getContentPane().add(LbOutput, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, 1120, -1));

        DCOut.setFont(new java.awt.Font("Comfortaa Light", 1, 14)); // NOI18N
        DCOut.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                DCOutPropertyChange(evt);
            }
        });
        getContentPane().add(DCOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 390, 150, -1));

        DCIn.setFont(new java.awt.Font("Comfortaa Light", 1, 14)); // NOI18N
        DCIn.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                DCInPropertyChange(evt);
            }
        });
        getContentPane().add(DCIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 390, 150, -1));

        btnGBalkon.add(RBBalcony);
        RBBalcony.setFont(new java.awt.Font("Comfortaa Light", 1, 14)); // NOI18N
        RBBalcony.setForeground(new java.awt.Color(0, 0, 0));
        RBBalcony.setSelected(true);
        RBBalcony.setText("Balcony");
        RBBalcony.setOpaque(false);
        getContentPane().add(RBBalcony, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, -1, -1));

        btnGBalkon.add(RBNon);
        RBNon.setFont(new java.awt.Font("Comfortaa Light", 1, 14)); // NOI18N
        RBNon.setForeground(new java.awt.Color(0, 0, 0));
        RBNon.setText("Non Balcony");
        RBNon.setOpaque(false);
        getContentPane().add(RBNon, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, -1, -1));

        LbBalcony.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utsimk_2019130032/Balcony.png"))); // NOI18N
        LbBalcony.setLabelFor(RBBalcony);
        getContentPane().add(LbBalcony, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, -1, -1));

        LbBonus.setLabelFor(RBNon);
        getContentPane().add(LbBonus, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 500, 150, 150));

        LbGarden.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utsimk_2019130032/Garden.png"))); // NOI18N
        LbGarden.setLabelFor(RBGarden);
        getContentPane().add(LbGarden, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 250, -1, -1));

        LbCity.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utsimk_2019130032/City.png"))); // NOI18N
        LbCity.setLabelFor(RBCity);
        getContentPane().add(LbCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 250, -1, -1));

        LbPool.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utsimk_2019130032/Pool.png"))); // NOI18N
        LbPool.setLabelFor(RBPool);
        getContentPane().add(LbPool, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 250, -1, -1));

        btnGView.add(RBCity);
        RBCity.setFont(new java.awt.Font("Comfortaa Light", 1, 14)); // NOI18N
        RBCity.setForeground(new java.awt.Color(0, 0, 0));
        RBCity.setText("City");
        RBCity.setOpaque(false);
        getContentPane().add(RBCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 220, -1, -1));

        LbView.setFont(new java.awt.Font("Comfortaa Light", 1, 18)); // NOI18N
        LbView.setForeground(new java.awt.Color(0, 0, 0));
        LbView.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LbView.setText("View                    :");
        getContentPane().add(LbView, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 220, 150, -1));

        btnGView.add(RBGarden);
        RBGarden.setFont(new java.awt.Font("Comfortaa Light", 1, 14)); // NOI18N
        RBGarden.setForeground(new java.awt.Color(0, 0, 0));
        RBGarden.setSelected(true);
        RBGarden.setText("Garden");
        RBGarden.setOpaque(false);
        getContentPane().add(RBGarden, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 220, -1, -1));

        btnGView.add(RBPool);
        RBPool.setFont(new java.awt.Font("Comfortaa Light", 1, 14)); // NOI18N
        RBPool.setForeground(new java.awt.Color(0, 0, 0));
        RBPool.setText("Pool");
        RBPool.setOpaque(false);
        getContentPane().add(RBPool, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 220, -1, -1));

        LbNon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utsimk_2019130032/Non Balcony.png"))); // NOI18N
        LbNon.setLabelFor(RBNon);
        getContentPane().add(LbNon, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, -1, -1));

        LbType.setLabelFor(RBNon);
        getContentPane().add(LbType, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 150, 150));

        btnGShower.add(RBTidakAda);
        RBTidakAda.setFont(new java.awt.Font("Comfortaa Light", 1, 14)); // NOI18N
        RBTidakAda.setForeground(new java.awt.Color(0, 0, 0));
        RBTidakAda.setSelected(true);
        RBTidakAda.setText("Tidak Ada");
        RBTidakAda.setOpaque(false);
        getContentPane().add(RBTidakAda, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 80, -1, -1));

        btnGShower.add(RBBathtub);
        RBBathtub.setFont(new java.awt.Font("Comfortaa Light", 1, 14)); // NOI18N
        RBBathtub.setForeground(new java.awt.Color(0, 0, 0));
        RBBathtub.setText("Bathtub");
        RBBathtub.setOpaque(false);
        getContentPane().add(RBBathtub, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 80, -1, -1));

        btnGShower.add(RBJacuzzi);
        RBJacuzzi.setFont(new java.awt.Font("Comfortaa Light", 1, 14)); // NOI18N
        RBJacuzzi.setForeground(new java.awt.Color(0, 0, 0));
        RBJacuzzi.setText("Private Jacuzzi");
        RBJacuzzi.setToolTipText("");
        RBJacuzzi.setOpaque(false);
        getContentPane().add(RBJacuzzi, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 80, -1, -1));

        LbBathtub.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utsimk_2019130032/Bathtub.png"))); // NOI18N
        LbBathtub.setLabelFor(RBBathtub);
        getContentPane().add(LbBathtub, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 110, -1, -1));

        LbJacuzzi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utsimk_2019130032/Jacuzzi.png"))); // NOI18N
        LbJacuzzi.setLabelFor(RBJacuzzi);
        getContentPane().add(LbJacuzzi, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 110, -1, -1));

        LbBg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utsimk_2019130032/BgImage.png"))); // NOI18N
        LbBg.setToolTipText("");
        getContentPane().add(LbBg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnKeluarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BtnKeluarActionPerformed

    private void BtnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSubmitActionPerformed
        if((int)SpnDewasa.getValue() != 0 || (int)SpnAnak.getValue() != 0) {
            submit();
        }
        else {
            JOptionPane.showMessageDialog(rootPane,"Tidak ada orang yang mereservasi. (Jumlah Tamu = 0)");
        }
    }//GEN-LAST:event_BtnSubmitActionPerformed

    private void BtnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnClearActionPerformed
        clear();
    }//GEN-LAST:event_BtnClearActionPerformed

    //nama tidak boleh karakter yang tidak termasuk alfabetik
    //spasi boleh, kosong boleh
    private void TxtNamaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtNamaKeyTyped
       char test = evt.getKeyChar();
       if(!Character.isAlphabetic(test) && test != ' ') evt.consume();
    }//GEN-LAST:event_TxtNamaKeyTyped

    //cek bila tanggal CEK IN yang dimasukkan melebihi tanggal cek out
    private void DCInPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_DCInPropertyChange
        if(DCIn.getDate() != null && DCOut.getDate() != null) {
            if("date".equals(evt.getPropertyName())) {
                if(lamaInap() < 0) {
                    JOptionPane.showMessageDialog(rootPane,"Tanggal cek in TIDAK BOLEH LEBIH AKHIR dari tanggal cek out.");
                    DCIn.setDate(DCOut.getDate());
                }
            }
        }
    }//GEN-LAST:event_DCInPropertyChange

    //cek bila tanggal CEK OUT yang dimasukkan kurang dari tanggal cek in
    private void DCOutPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_DCOutPropertyChange
        if(DCIn.getDate() != null && DCOut.getDate() != null) {
            if("date".equals(evt.getPropertyName())) {
                if(lamaInap() < 0) {
                    JOptionPane.showMessageDialog(rootPane,"Tanggal cek out TIDAK BOLEH LEBIH AWAL dari tanggal cek in.");
                    DCOut.setDate(DCIn.getDate());
                }
            }
        }
    }//GEN-LAST:event_DCOutPropertyChange

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
            java.util.logging.Logger.getLogger(FrmUTSIMK_2019130032.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmUTSIMK_2019130032.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmUTSIMK_2019130032.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmUTSIMK_2019130032.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmUTSIMK_2019130032().setVisible(true);
            }
        });
    }
    
    //memasukkan data ke variabel
    private void inisialisasi() {
        hargaPokok.put(1 + "type", "Deluxe");
        hargaPokok.put(1 + "bonus", "Breakfast");
        hargaPokok.put(1 + "harga", 799000);
        hargaPokok.put(2 + "type", "Deluxe");
        hargaPokok.put(2 + "bonus", "Breakfast");
        hargaPokok.put(2 + "harga", 1049000);
        hargaPokok.put(3 + "type", "Premier Suite");
        hargaPokok.put(3 + "bonus", "Breakfast & Afternoon Tea");
        hargaPokok.put(3 + "harga", 1349000);
        hargaPokok.put(4 + "type", "Family Suite");
        hargaPokok.put(4 + "bonus", "Breakfast & Afternoon Tea");
        hargaPokok.put(4 + "harga", 1749000);
        
        biayaTambahan.put(RBNon.getText(), 0);
        biayaTambahan.put(RBBalcony.getText(), 199000);
        biayaTambahan.put(RBBathtub.getText(), 199000);
        biayaTambahan.put(RBJacuzzi.getText(), 499000);
    }
    
    private void submit() {
        int dewasa = (int)SpnDewasa.getValue();
        int anak = (int)SpnAnak.getValue();
        int tamu = dewasa + anak;
        String type = "";
        String bonus = "";
        int pokok = 0;
        
        if(RBJacuzzi.isSelected()) {
            type = String.valueOf(hargaPokok.get(4 + "type"));
            bonus = String.valueOf(hargaPokok.get(4 + "bonus"));
            pokok = (int)hargaPokok.get(4 + "harga");
        }
        else {
            switch(tamu) {
                case 1:
                    type = String.valueOf(hargaPokok.get(1 + "type"));
                    bonus = String.valueOf(hargaPokok.get(1 + "bonus"));
                    pokok = (int)hargaPokok.get(1 + "harga");
                    break;
                case 2:
                    type = String.valueOf(hargaPokok.get(2 + "type"));
                    bonus = String.valueOf(hargaPokok.get(2 + "bonus"));
                    pokok = (int)hargaPokok.get(2 + "harga");
                    break;
                case 3:
                    type = String.valueOf(hargaPokok.get(3 + "type"));
                    bonus = String.valueOf(hargaPokok.get(3 + "bonus"));
                    pokok = (int)hargaPokok.get(3 + "harga");
                    break;
                case 4:
                    type = String.valueOf(hargaPokok.get(4 + "type"));
                    bonus = String.valueOf(hargaPokok.get(4 + "bonus"));
                    pokok = (int)hargaPokok.get(4 + "harga");
                    break;
            }
        }
        
        String balcony = "";
        if(RBBalcony.isSelected()) {
            balcony = RBBalcony.getText();
        }
        else if(RBNon.isSelected()) {
            balcony = RBNon.getText();
        }
        int balkon = biayaTambahan.get(balcony);
        
        int shower = 0;
        if(RBBathtub.isSelected()) {
            shower = biayaTambahan.get(RBBathtub.getText());
        }
        else if(RBJacuzzi.isSelected()) {
            shower = biayaTambahan.get(RBJacuzzi.getText());
        }
        
        String view = "";
        if(RBGarden.isSelected()) {
            view = RBGarden.getText();
        }
        else if(RBPool.isSelected()) {
            view = RBPool.getText();
        }
        else if(RBCity.isSelected()) {
            view = RBCity.getText();
        }
        
        long hari = lamaInap();
        long total = hari * (pokok + balkon + shower);
        LbOutput.setText(type + " " + CBJenis.getSelectedItem().toString().substring(0, 4) + " Bed " + balcony + " " + view + " View " +
                "( Free " + bonus + " )");
        LbTotal.setText("Harga Total: " + hari + " * " + "( " + dfRp.format(pokok) + " + " + dfRp.format(balkon) + " + " + dfRp.format(shower) + 
                " ) = " + dfRp.format(total));
        LbType.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utsimk_2019130032/" + type + ".png")));
        LbBonus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utsimk_2019130032/" + bonus + ".png")));
    }
    
    private void clear() {
        TxtNama.setText("");
        SpnDewasa.setValue(0);
        SpnAnak.setValue(0);
        CBJenis.setSelectedIndex(0);
        RBBalcony.setSelected(true);
        RBTidakAda.setSelected(true);
        RBGarden.setSelected(true);
        
        if(DCIn.getDate() != null && DCOut.getDate() != null) {
            if(DCOut.getDate().getTime() < today.getTime()) {
                DCOut.setDate(today);
                DCIn.setDate(today);
            }
            else {
                DCIn.setDate(today);
                DCOut.setDate(today);
            }
        }
        //untuk awal inisialisasi, sebelum ada isi
        else {
            DCIn.setDate(today);
            DCOut.setDate(today);
        }
        
        LbOutput.setText("Apa jenis kamarmu?");
        LbTotal.setText("Berapa harga totalnya?");
        LbType.setIcon(null);
        LbBonus.setIcon(null);
        
        TxtNama.grabFocus();
    }
    
    //0 tidak apa-apa, anggap intip layanan dan harga tanpa total
    private long lamaInap() {
        Date cekIn = DCIn.getDate();
        Date cekOut = DCOut.getDate();
        long selisih = cekOut.getTime() - cekIn.getTime();
        long lama = selisih / (1000*60*60*24);

        return lama;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnClear;
    private javax.swing.JButton BtnKeluar;
    private javax.swing.JButton BtnSubmit;
    private javax.swing.JComboBox<String> CBJenis;
    private com.toedter.calendar.JDateChooser DCIn;
    private com.toedter.calendar.JDateChooser DCOut;
    private javax.swing.JLabel LbAnak;
    private javax.swing.JLabel LbBalcony;
    private javax.swing.JLabel LbBathtub;
    private javax.swing.JLabel LbBg;
    private javax.swing.JLabel LbBonus;
    private javax.swing.JLabel LbCity;
    private javax.swing.JLabel LbDewasa;
    private javax.swing.JLabel LbFasilitas;
    private javax.swing.JLabel LbGarden;
    private javax.swing.JLabel LbIdentitas;
    private javax.swing.JLabel LbIn;
    private javax.swing.JLabel LbJacuzzi;
    private javax.swing.JLabel LbJenis;
    private javax.swing.JLabel LbJudul;
    private javax.swing.JLabel LbJumlah;
    private javax.swing.JLabel LbNama;
    private javax.swing.JLabel LbNon;
    private javax.swing.JLabel LbOut;
    private javax.swing.JLabel LbOutput;
    private javax.swing.JLabel LbPool;
    private javax.swing.JLabel LbShower;
    private javax.swing.JLabel LbTotal;
    private javax.swing.JLabel LbType;
    private javax.swing.JLabel LbView;
    private javax.swing.JRadioButton RBBalcony;
    private javax.swing.JRadioButton RBBathtub;
    private javax.swing.JRadioButton RBCity;
    private javax.swing.JRadioButton RBGarden;
    private javax.swing.JRadioButton RBJacuzzi;
    private javax.swing.JRadioButton RBNon;
    private javax.swing.JRadioButton RBPool;
    private javax.swing.JRadioButton RBTidakAda;
    private javax.swing.JSeparator Separator;
    private javax.swing.JSeparator SeparatorV;
    private javax.swing.JSpinner SpnAnak;
    private javax.swing.JSpinner SpnDewasa;
    private javax.swing.JTextField TxtNama;
    private javax.swing.ButtonGroup btnGBalkon;
    private javax.swing.ButtonGroup btnGShower;
    private javax.swing.ButtonGroup btnGView;
    // End of variables declaration//GEN-END:variables
}
