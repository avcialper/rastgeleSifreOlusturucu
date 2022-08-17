
import java.awt.Toolkit;
import java.util.Random;
import javax.swing.JOptionPane;


public class AnaEkran extends javax.swing.JFrame {

    public AnaEkran() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("appIcon.jpg")));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kucukHCB = new javax.swing.JCheckBox();
        buykHCB = new javax.swing.JCheckBox();
        ozelKCB = new javax.swing.JCheckBox();
        rakamCB = new javax.swing.JCheckBox();
        uretButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        karakterSayisiText = new javax.swing.JTextField();
        sifreAlaniT = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("RASTGELE ŞİFRE ÜRETİCİ");
        setBounds(new java.awt.Rectangle(400, 250, 0, 0));
        setResizable(false);

        kucukHCB.setText("Küçük Harf");

        buykHCB.setText("Büyük Harf");

        ozelKCB.setText("Özel Karakter");

        rakamCB.setText("Rakam");

        uretButton.setText("ÜRET");
        uretButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uretButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Karakter Sayısı : ");

        karakterSayisiText.setText("0");

        sifreAlaniT.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(uretButton, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(karakterSayisiText, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(kucukHCB)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(buykHCB)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ozelKCB))
                            .addComponent(sifreAlaniT, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rakamCB)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(karakterSayisiText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kucukHCB)
                    .addComponent(buykHCB)
                    .addComponent(ozelKCB)
                    .addComponent(rakamCB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sifreAlaniT, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(uretButton)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    static boolean kucukHarf;
    static boolean buyukHarf;
    static boolean ozelKarakter;
    static boolean rakam;
    public void sifreUret() {
        String kucukHarf = "abcdefghijklmnopqrstuvwxyz";
        String buyukHarf = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String rakam = "0123456789";
        String ozelKarakter = "!#$%&'()*+,-./:;<=>?@[]^{|}~";
        String sifreKarakterleri = "";
        if(AnaEkran.kucukHarf)
            sifreKarakterleri += kucukHarf;
        if(AnaEkran.buyukHarf)
            sifreKarakterleri += buyukHarf;
        if(AnaEkran.ozelKarakter)
            sifreKarakterleri += ozelKarakter;
        if(AnaEkran.rakam)
            sifreKarakterleri += rakam;
        if(sifreKarakterleri.equals(""))
            JOptionPane.showMessageDialog(this, "Lütfen En Az Bir Adet Karakter Türü Seçin");
        else {
            int karakterSayisi = new Integer(karakterSayisiText.getText());
            if(karakterSayisi == 0)
                JOptionPane.showMessageDialog(this, "Şifre Uzunluğu 0 (Sıfır) Olamaz");
            else {
                Random random = new Random();
                String sifre = "";
                for(int i = 0; i < karakterSayisi; i++)
                    sifre += sifreKarakterleri.charAt(random.nextInt(sifreKarakterleri.length()));
                sifreAlaniT.setText(sifre);
            }
        }
    }
    
    private void uretButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uretButtonActionPerformed
        if(kucukHCB.isSelected())
            kucukHarf = true;
        else
            kucukHarf = false;
        if(buykHCB.isSelected())
            buyukHarf = true;
        else
            buyukHarf = false;
        if(ozelKCB.isSelected())
            ozelKarakter = true;
        else
            ozelKarakter = false;
        if(rakamCB.isSelected())
            rakam = true;
        else
            rakam = false;
        sifreUret();
    }//GEN-LAST:event_uretButtonActionPerformed

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
            java.util.logging.Logger.getLogger(AnaEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AnaEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AnaEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AnaEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AnaEkran().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox buykHCB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField karakterSayisiText;
    private javax.swing.JCheckBox kucukHCB;
    private javax.swing.JCheckBox ozelKCB;
    private javax.swing.JCheckBox rakamCB;
    private javax.swing.JTextField sifreAlaniT;
    private javax.swing.JButton uretButton;
    // End of variables declaration//GEN-END:variables
}
