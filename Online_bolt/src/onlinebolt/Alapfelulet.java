package onlinebolt;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.*;


public class Alapfelulet extends javax.swing.JFrame {
    Tarolo t = new Tarolo();
    DefaultListModel dlm = new DefaultListModel();
    DefaultListModel listModel = new DefaultListModel();
    
    /**
     * Creates new form Alapfelulet
     */
    public Alapfelulet() {
        initComponents();
        this.setLocationRelativeTo(this);
        this.bindDataTermek();
        this.bindDataKategoria();
        this.getContentPane().setBackground(new Color(144,238,144)); 
    }

    private ArrayList getTermeknev()
    {
        ArrayList termeknev = new ArrayList();
        
        String line;
        int j = 0;
        try
        {
            BufferedReader objReader = new BufferedReader(new FileReader("termekek.txt"));
            try
            {
                while((line = objReader.readLine()) != null)
                {
                    String [] elemek = line.split(";");
                    termeknev.add(j, elemek[0]);
                    j++;
                }
            }catch(IOException e)
            {
                JOptionPane.showMessageDialog(this, e + "HIBA az IO művelettel", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }catch(FileNotFoundException ex)
        {
            JOptionPane.showMessageDialog(this, ex + "A fajl nem letezik", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return termeknev;
    } 
    private ArrayList getKategoria()
    {
         ArrayList kategoria = new ArrayList();
        
        String line;
        int j = 0;
        try
        {
            BufferedReader objReader = new BufferedReader(new FileReader("termekek.txt"));
            try
            {
                while((line = objReader.readLine()) != null)
                {
                    String [] elemek = line.split(";");
                    kategoria.add(j, elemek[2]);
                    j++;
                }
            }catch(IOException e)
            {
                JOptionPane.showMessageDialog(this, e + "HIBA az IO művelettel", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }catch(FileNotFoundException ex)
        {
            JOptionPane.showMessageDialog(this, ex + "A fajl nem letezik", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return kategoria;

    }
    private ArrayList getAr()
    {
        ArrayList vetelar = new ArrayList();
        
        String line;
        int j = 0;
        try
        {
            BufferedReader objReader = new BufferedReader(new FileReader("termekek.txt"));
            try
            {
                while((line = objReader.readLine()) != null)
                {
                    String [] elemek = line.split(";");
                    vetelar.add(j, elemek[1]);
                    j++;
                }
            }catch(IOException e)
            {
                JOptionPane.showMessageDialog(this, e + "HIBA az IO művelettel", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }catch(FileNotFoundException ex)
        {
            JOptionPane.showMessageDialog(this, ex + "A fajl nem letezik", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return vetelar;
    }
    
    
    private void bindDataTermek()
    {
        getTermeknev().stream().forEach((termeknev) -> {
            dlm.addElement(termeknev);
        });
        jList1.setModel(dlm);
        jList1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }
    private void bindDataKategoria()
    {
        getKategoria().stream().forEach((kategoria) -> {
            dlm.addElement(kategoria);
        });
        jList1.setModel(dlm);
        jList1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

    }
    private void bindDataAr()
    {
       getAr().stream().forEach((vetelar) -> {
            dlm.addElement(vetelar);
        });
        jList1.setModel(dlm);
        jList1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); 
    }
    
    
    private void searchFilterTermek(String searchTerm)
    {
        DefaultListModel filteredItems = new DefaultListModel();
        ArrayList termeknev = getTermeknev();
        for(Termekek t : t.termekek){
            termeknev.stream().forEach((termek) -> {
                if(termek.equals(t.getTermekNeve())){
                    String termekNeve = termek.toString().toLowerCase();
                    if(termekNeve.contains(searchTerm.toLowerCase())){
                        filteredItems.addElement(termek + " - " + t.getVetelar() + "Ft - " + t.getKategoria() + " - " + t.getRaktariDarabszam());
                    }   
                }
            });
        }
        dlm = filteredItems;
        jList1.setModel(dlm);
    }
    private void searchFilterKategoria(String searchTerm)
    {
        DefaultListModel filteredItems = new DefaultListModel();
        ArrayList kategoria = getKategoria();
        for(Termekek t : t.termekek){
            kategoria.stream().forEach((kat) -> {
                if(kat.equals(t.getKategoria())){
                    String termekNeve = kat.toString().toLowerCase();
                    if(termekNeve.contains(searchTerm.toLowerCase())){
                        filteredItems.addElement(t.getTermekNeve() + " - " + t.getVetelar() + "Ft - " + kat + " - " + t.getRaktariDarabszam());
                    }   
                }
            });
        }
        dlm = filteredItems;
        jList1.setModel(dlm);
    }
    private void searchFilterVetelAr(String searchTerm)
    {
        DefaultListModel filteredItems = new DefaultListModel();
        ArrayList vetelar = getAr();
        for(Termekek t : t.termekek){
            vetelar.stream().forEach((ar) -> {
                if(Integer.parseInt(ar.toString()) == t.getVetelar()){
                    String termekNeve = ar.toString().toLowerCase();
                    if(termekNeve.contains(searchTerm.toLowerCase())){
                        filteredItems.addElement(t.getTermekNeve() + " - " + ar + "Ft - " + t.getKategoria() + " - " + t.getRaktariDarabszam());
                    }   
                }
            });
        }
        dlm = filteredItems;
        jList1.setModel(dlm);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldSearch = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jRadioButtonTermek = new javax.swing.JRadioButton();
        jRadioButtonKategoria = new javax.swing.JRadioButton();
        jRadioButtonAr = new javax.swing.JRadioButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 255, 153));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/onlinebolt/cím.png"))); // NOI18N

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Üdvözöljük a bolt felületén!");

        jTextFieldSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldSearchKeyReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        jLabel3.setText("Keresés:");

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/onlinebolt/bevasarlokocsi.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/onlinebolt/whislist.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jList1.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jList1);

        buttonGroup2.add(jRadioButtonTermek);
        jRadioButtonTermek.setText("Termék név");

        buttonGroup2.add(jRadioButtonKategoria);
        jRadioButtonKategoria.setText("Kategória");

        buttonGroup2.add(jRadioButtonAr);
        jRadioButtonAr.setText("Ár");

        jMenu1.setText("File");

        jMenuItem1.setText("Kilépés");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Info");
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldSearch)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jRadioButtonTermek)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jRadioButtonKategoria)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jRadioButtonAr)
                                        .addGap(0, 0, Short.MAX_VALUE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 90, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 3, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButtonTermek)
                            .addComponent(jRadioButtonKategoria)
                            .addComponent(jRadioButtonAr))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextFieldSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        JOptionPane.showMessageDialog(this, "Készítette: Kőrösi Krisztofer\nProgram verziószáma: v1.0\nKiadás dátuma: 2020.12.18");
    }//GEN-LAST:event_jMenu3MouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        t.beolvasTermekek();
        
        for(Termekek lista : t.termekek)
        {
            listModel.addElement(lista.getTermekNeve() + " - " + lista.getVetelar() + "Ft - " + lista.getKategoria() + " - " + lista.getRaktariDarabszam()+ "\n");
        }
        
        jList1.setModel(listModel);
    }//GEN-LAST:event_formWindowOpened

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false);
        Bevasarlokosar bk = new Bevasarlokosar();
        bk.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        WhisList wl = new WhisList();
        wl.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextFieldSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldSearchKeyReleased
        if(this.jRadioButtonTermek.isSelected()){
            this.searchFilterTermek(jTextFieldSearch.getText());
        }
        if(this.jRadioButtonKategoria.isSelected()){
            this.searchFilterKategoria(jTextFieldSearch.getText());
        }
        if(this.jRadioButtonAr.isSelected()){
            this.searchFilterVetelAr(jTextFieldSearch.getText());
        }
        
    }//GEN-LAST:event_jTextFieldSearchKeyReleased

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        int idx = jList1.getSelectedIndex();
        if(this.jTextFieldSearch.getText().equals("") && !(this.jRadioButtonTermek.isSelected()) && !(this.jRadioButtonKategoria.isSelected()) && !(this.jRadioButtonAr.isSelected()))
        {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            try{
                String fileName = "kosar.txt";
                File f = new File(fileName);
                FileWriter fr = new FileWriter(f,true);
                JOptionPane.showMessageDialog(this,"A " + jList1.getSelectedValue() + " termék sikeresen belekerült a kosárba.", "Értesítés", JOptionPane.INFORMATION_MESSAGE);
                t.kosar.add(t.termekek.get(idx));
                fr.append(t.termekek.get(idx).getTermekNeve() + ";" + t.termekek.get(idx).getVetelar() + ";" + t.termekek.get(idx).getKategoria() + ";" + t.termekek.get(idx).getRaktariDarabszam() + "\n");
                fr.close();
            }catch(Exception ex)
            {
                JOptionPane.showMessageDialog(this, ex, "HIBA", JOptionPane.ERROR_MESSAGE);
            }
        }
        if(!(this.jTextFieldSearch.getText().equals("")) && (this.jRadioButtonTermek.isSelected()) || (this.jRadioButtonKategoria.isSelected()) || (this.jRadioButtonAr.isSelected()))
        {
            try{
                String fileName = "kosar.txt";
                File f = new File(fileName);
                FileWriter fr = new FileWriter(f,true);
                JOptionPane.showMessageDialog(this,"A " + jList1.getSelectedValue() + " termék sikeresen belekerült a kosárba.", "Értesítés", JOptionPane.INFORMATION_MESSAGE);
                t.kosar.add(t.termekek.get(idx));
                fr.append(t.termekek.get(idx).getTermekNeve() + ";" + t.termekek.get(idx).getVetelar() + ";" + t.termekek.get(idx).getKategoria() + ";" + t.termekek.get(idx).getRaktariDarabszam() + "\n");
                fr.close();
            }catch(Exception ex){
                JOptionPane.showMessageDialog(this, ex, "HIBA", JOptionPane.ERROR_MESSAGE);
            }
        }
        if((this.jTextFieldSearch.getText().equals("")) && (this.jRadioButtonTermek.isSelected()) || (this.jRadioButtonKategoria.isSelected()) || (this.jRadioButtonAr.isSelected()))
        {
            try{
                String fileName = "kosar.txt";
                File f = new File(fileName);
                FileWriter fr = new FileWriter(f,true);
                JOptionPane.showMessageDialog(this,"A " + jList1.getSelectedValue() + " termék sikeresen belekerült a kosárba.", "Értesítés", JOptionPane.INFORMATION_MESSAGE);
                t.kosar.add(t.termekek.get(idx));
                fr.append(t.termekek.get(idx).getTermekNeve() + ";" + t.termekek.get(idx).getVetelar() + ";" + t.termekek.get(idx).getKategoria() + ";" + t.termekek.get(idx).getRaktariDarabszam() + "\n");
                fr.close();
            }catch(Exception ex){
                JOptionPane.showMessageDialog(this, ex, "HIBA", JOptionPane.ERROR_MESSAGE);
            }
        }

        
        
            
    }//GEN-LAST:event_jList1MouseClicked

    
    
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
            /*for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }*/
            javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Alapfelulet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Alapfelulet().setVisible(true);
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JList<String> jList1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JRadioButton jRadioButtonAr;
    private javax.swing.JRadioButton jRadioButtonKategoria;
    private javax.swing.JRadioButton jRadioButtonTermek;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextFieldSearch;
    // End of variables declaration//GEN-END:variables

}
