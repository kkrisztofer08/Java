package onlinebolt;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import javax.swing.*;
import java.io.*;


public class Bevasarlokosar extends javax.swing.JFrame {
    Tarolo t = new Tarolo();
    DefaultListModel listModel = new DefaultListModel();
    int sum = 0;
    
    public Bevasarlokosar() {
        initComponents();
        this.setLocationRelativeTo(this);
        this.getContentPane().setBackground(new java.awt.Color(144,238,144)); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListKosar = new javax.swing.JList<>();
        jButtonKosarUrit = new javax.swing.JButton();
        jButtonVissza = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelFizetendo = new javax.swing.JLabel();
        jButtonFizetes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/onlinebolt/kosar_cim.png"))); // NOI18N

        jListKosar.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jScrollPane1.setViewportView(jListKosar);

        jButtonKosarUrit.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jButtonKosarUrit.setText("Kosár ürítése");
        jButtonKosarUrit.setToolTipText("");
        jButtonKosarUrit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonKosarUritActionPerformed(evt);
            }
        });

        jButtonVissza.setIcon(new javax.swing.ImageIcon(getClass().getResource("/onlinebolt/output-onlinepngtools (2).png"))); // NOI18N
        jButtonVissza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVisszaActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel2.setText("Tartalma:");

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel3.setText("Fizetendő összesen: ");

        jLabelFizetendo.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N

        jButtonFizetes.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jButtonFizetes.setText("Fizetés");
        jButtonFizetes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFizetesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2)))
                        .addGap(0, 37, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonFizetes, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonVissza, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonKosarUrit)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelFizetendo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 7, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonKosarUrit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelFizetendo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonFizetes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonVissza, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void beolvasKosar()
    {
        t.beolvasKosar();
        
        for(Termekek lista : t.kosar)
        {
            listModel.addElement(lista.getTermekNeve() + " - " + lista.getVetelar() + " - " + lista.getKategoria() + " - " + lista.getRaktariDarabszam()+ "\n");
        }
        jListKosar.setModel(listModel);
        
    }
    
    private int fizetendoOsszeg()
    {

        for(Termekek product : t.kosar)
        {
            sum += product.getVetelar();
        }
        jLabelFizetendo.setText(sum + " Ft");
        
        return sum;
    }
    
    public void kosarKiurit()
    {
        try {
            PrintWriter writer = new PrintWriter("kosar.txt");
            writer.print("");
            writer.close();
        } catch (FileNotFoundException ex) {
            System.out.println(ex + "A fájl nem található.");
        }
        
        JOptionPane.showMessageDialog(this,"A kosár ürítése megtörtént", "Értesítés", JOptionPane.INFORMATION_MESSAGE);
        listModel.removeAllElements();
        sum = 0;
        jLabelFizetendo.setText(sum + " Ft");
    }
    
    
    
    
    private void jButtonVisszaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVisszaActionPerformed
        this.setVisible(false);
        Alapfelulet al = new Alapfelulet();
        al.setVisible(true);
    }//GEN-LAST:event_jButtonVisszaActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.beolvasKosar();
        this.fizetendoOsszeg();
    }//GEN-LAST:event_formWindowOpened

    private void jButtonKosarUritActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonKosarUritActionPerformed
       this.kosarKiurit();
    }//GEN-LAST:event_jButtonKosarUritActionPerformed

    private void jButtonFizetesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFizetesActionPerformed
        this.setVisible(false);
        Fizetes f = new Fizetes();
        f.setVisible(true);
    }//GEN-LAST:event_jButtonFizetesActionPerformed


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
            java.util.logging.Logger.getLogger(Bevasarlokosar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bevasarlokosar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bevasarlokosar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bevasarlokosar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bevasarlokosar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonFizetes;
    private javax.swing.JButton jButtonKosarUrit;
    private javax.swing.JButton jButtonVissza;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelFizetendo;
    private javax.swing.JList<String> jListKosar;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
