package onlinebolt;

import java.io.*;
import javax.swing.*;


public class WhisList extends javax.swing.JFrame {
    Tarolo t = new Tarolo();
    DefaultListModel listModel = new DefaultListModel();

    public WhisList() {
        initComponents();
        this.setLocationRelativeTo(this);
        this.getContentPane().setBackground(new java.awt.Color(144,238,144)); 
    }

    private void whislistKiurit()
    {
        try {
            PrintWriter writer = new PrintWriter("whislist.txt");
            writer.print("");
            writer.close();
        } catch (FileNotFoundException ex) {
            System.out.println(ex + "A fájl nem található.");
        }
        
        JOptionPane.showMessageDialog(this,"A kívánság lista kiürítve", "Értesítés", JOptionPane.INFORMATION_MESSAGE);
        listModel.removeAllElements();
        jListWhisList.setModel(listModel);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldTermekNeve = new javax.swing.JTextField();
        jButtonInsert = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListWhisList = new javax.swing.JList<>();
        jButtonVissza = new javax.swing.JButton();
        jButtonListaUrit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/onlinebolt/whislist_cim.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        jLabel2.setText("Termék neve:");

        jTextFieldTermekNeve.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N

        jButtonInsert.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jButtonInsert.setText("Beszúrás");
        jButtonInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInsertActionPerformed(evt);
            }
        });

        jListWhisList.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jScrollPane1.setViewportView(jListWhisList);

        jButtonVissza.setIcon(new javax.swing.ImageIcon(getClass().getResource("/onlinebolt/back_icon.png"))); // NOI18N
        jButtonVissza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVisszaActionPerformed(evt);
            }
        });

        jButtonListaUrit.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jButtonListaUrit.setText("Lista ürítése");
        jButtonListaUrit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListaUritActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jButtonVissza, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(40, 40, 40))
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldTermekNeve, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonInsert)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonListaUrit)
                .addGap(189, 189, 189))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonVissza, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jTextFieldTermekNeve, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonInsert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonListaUrit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInsertActionPerformed
        DefaultListModel listModel = new DefaultListModel();
        String line;
        int j = 0;
        try
        {
            BufferedReader objReader = new BufferedReader(new FileReader("termekek.txt"));
            PrintWriter writer = new PrintWriter("whislist.txt");
            try
            {
                while((line = objReader.readLine()) != null)
                {
                    if(line.contains(jTextFieldTermekNeve.getText())){
                        writer.append(line);
                        listModel.addElement(line);
                    }
                    j++;
                }
                writer.close();
            }catch(IOException e)
            {
                JOptionPane.showMessageDialog(this, e + "Hiba a beolvasaskor", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
            jListWhisList.setModel(listModel);
        }catch(FileNotFoundException ex)
        {
            JOptionPane.showMessageDialog(this, ex + "A fajl nem letezik", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        
        DefaultListModel lm2 = (DefaultListModel) jListWhisList.getModel();
        
        for(int i = 0;i<t.termekek.size();i++)
        {
            if(lm2 == null)
            {
                lm2 = new DefaultListModel();
                jListWhisList.setModel(lm2);
            }
        }
        lm2.addElement(jListWhisList.getSelectedValue());
        
    }//GEN-LAST:event_jButtonInsertActionPerformed

    private void jButtonVisszaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVisszaActionPerformed
        this.setVisible(false);
        Alapfelulet al = new Alapfelulet();
        al.setVisible(true);
    }//GEN-LAST:event_jButtonVisszaActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        String line;
        int j = 0;
        try
        {
            BufferedReader objReader = new BufferedReader(new FileReader("whislist.txt"));
            try
            {
                while((line = objReader.readLine()) != null)
                {
                    listModel.addElement(line);
                    j++;
                }
            }catch(IOException e)
            {
                JOptionPane.showMessageDialog(this, e + "Hiba a beolvasaskor", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
            jListWhisList.setModel(listModel);
        }catch(FileNotFoundException ex)
        {
            JOptionPane.showMessageDialog(this, ex + "A fajl nem letezik", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        
        DefaultListModel lm2 = (DefaultListModel) jListWhisList.getModel();
        
        for(int i = 0;i<t.termekek.size();i++)
        {
            if(lm2 == null)
            {
                lm2 = new DefaultListModel();
                jListWhisList.setModel(lm2);
            }
        }
        lm2.addElement(jListWhisList.getSelectedValue());
        
    }//GEN-LAST:event_formWindowOpened

    private void jButtonListaUritActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListaUritActionPerformed
        this.whislistKiurit();
    }//GEN-LAST:event_jButtonListaUritActionPerformed

    
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
            java.util.logging.Logger.getLogger(WhisList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WhisList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WhisList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WhisList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WhisList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonInsert;
    private javax.swing.JButton jButtonListaUrit;
    private javax.swing.JButton jButtonVissza;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList<String> jListWhisList;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldTermekNeve;
    // End of variables declaration//GEN-END:variables
}
