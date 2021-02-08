/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetvin;

import classMetier.Bouteille;
import classMetier.Cepage;
import classMetier.Couleur;
import classMetier.Vin;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author gmnad
 */
public class frmProjetVin extends javax.swing.JFrame {

    /**
     * Creates new form frmProjetVin
     */
    
    DefaultTableModel dtmVins;
    ArrayList<Bouteille> mesBouteilles;
    Vector v;
    
    public frmProjetVin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblVins = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtMillesime = new java.awt.TextField();
        txtPrix = new java.awt.TextField();
        txtCepage = new java.awt.TextField();
        txtCouleur = new java.awt.TextField();
        jLabel7 = new javax.swing.JLabel();
        lblCave = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtVinRouge = new java.awt.TextField();
        txtVinBlanc = new java.awt.TextField();
        txtVinRose = new java.awt.TextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        tblVins.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numéro", "Vin", " Quantite "
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblVins.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblVinsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblVins);

        jLabel1.setFont(new java.awt.Font("Vivaldi", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("       Projet Vin");

        jLabel2.setFont(new java.awt.Font("Vivaldi", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText("     Liste des bouteille :");

        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 2, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 204, 0));
        jLabel3.setText(" Millesime");

        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 2, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 204, 0));
        jLabel4.setText(" Prix");

        jLabel5.setFont(new java.awt.Font("Tw Cen MT", 2, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 204, 0));
        jLabel5.setText(" Cépage");

        jLabel6.setFont(new java.awt.Font("Tw Cen MT", 2, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 204, 0));
        jLabel6.setText(" Couleur");

        txtMillesime.setEnabled(false);

        txtPrix.setEnabled(false);

        txtCepage.setEnabled(false);

        txtCouleur.setEnabled(false);

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel7.setText("Valeur de la cave");

        lblCave.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 204, 255), 3));

        jLabel9.setFont(new java.awt.Font("Sitka Small", 1, 11)); // NOI18N
        jLabel9.setText("  Pourcentage de vin rouges");

        jLabel10.setFont(new java.awt.Font("Sitka Small", 1, 11)); // NOI18N
        jLabel10.setText("  Pourcentage de vin blanc");

        jLabel11.setFont(new java.awt.Font("Sitka Small", 1, 11)); // NOI18N
        jLabel11.setText("  Pourcentage de vin rosé");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(261, 261, 261)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(lblCave, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPrix, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtCouleur, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                                        .addComponent(txtCepage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(288, 288, 288)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                                .addComponent(txtMillesime, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(316, 316, 316)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtVinBlanc, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                                .addComponent(txtVinRouge, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(txtVinRose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addComponent(txtMillesime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtPrix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCepage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCouleur, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(28, 28, 28)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCave, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtVinRouge, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtVinBlanc, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtVinRose, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblVinsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblVinsMouseClicked
        // TODO add your handling code here:
        
        int nbBouteille; 
        nbBouteille = Integer.parseInt(tblVins.getValueAt(tblVins.getSelectedRow(),0).toString());
        
        mesBouteilles = new ArrayList();
        
        for (Bouteille btl : mesBouteilles)
        {
            if(btl.getIdBouteille() == nbBouteille)
            {
                txtMillesime.setText(String.valueOf(btl.getLeVin().getMillesimeVin()));
                txtPrix.setText(String.valueOf(btl.getLeVin().getPrixDuVin()));
                txtCepage.setText(btl.getLeVin().getLeCepage().getNomCepage());
                txtCouleur.setText(btl.getLeVin().getLaCouleur().getNomCouleur());
            }
        }
        
    }//GEN-LAST:event_tblVinsMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        
//        int numBout = tbl.getValueAt(...);
//        for(Bouteille b : mesBouteille)
//        {
//            if(b.getId()==numBout)
//            {
//                txtMillenisme.setText(b.getLeMillesiseme.getLeVin().getLaCOuLEur...);
//                //string.valueOf() = pour transformer le int en string
//                //integer.parsInt() = pour transformer le string en int
//            }
//        }

          dtmVins = (DefaultTableModel) tblVins.getModel();
          // les couleur du vin
          Couleur blanc = new Couleur("Blanc");
          Couleur rose = new Couleur("Rose");
          Couleur rouge = new Couleur("Rouge");
          
          // les cepage du vin
          Cepage beaujolais = new Cepage("Beaujolais");
          Cepage chardonnay = new Cepage("Chardonnay");
          Cepage gamay = new Cepage("Gamay");
          Cepage pinotNoir = new Cepage("Pinot noir");
          Cepage sauvignon = new Cepage("Sauvignon");
          
          // les vins
          Vin vin1 = new Vin("Juliénas", 2005, beaujolais, rouge, 13.78);
          Vin vin2 = new Vin("Saint Amour", 2012, beaujolais, blanc, 18);
          Vin vin3 = new Vin("Brouilly", 2018, beaujolais, rouge, 14.5);
          Vin vin4 = new Vin("Morgon", 2015, beaujolais, rose, 21.34);
          Vin vin5 = new Vin("Bourgonne Cote de Beaune", 2002, chardonnay, blanc, 39.5);
          Vin vin6 = new Vin("Aligoté", 2016, chardonnay, blanc, 7.12);
          Vin vin7 = new Vin("Bourgonne Cote de Nuits", 2000, chardonnay, rose, 11.67);
          Vin vin8 = new Vin("Chablis", 2011, chardonnay, blanc, 15.17);
          Vin vin9 = new Vin("Champagne", 2014, chardonnay, blanc, 24.71);
          Vin vin10 = new Vin("La Roche", 2005, gamay, rouge, 12.45);
          Vin vin11 = new Vin("Le Carquelin", 2005, gamay, rouge, 15.98);
          Vin vin12 = new Vin("Morgon Vieilles Vignes", 2005, gamay, rouge, 19.54);
          Vin vin13 = new Vin("Coeurs de terroires", 2005, pinotNoir, rouge, 17.65);
          Vin vin14 = new Vin("Alex Corton", 2005, beaujolais, rouge, 17.65);
          Vin vin15 = new Vin("Edelzwicker", 2017, pinotNoir, blanc, 23.81);
          Vin vin16 = new Vin("Romanée Conti", 2009, pinotNoir, rouge, 14.83);
          Vin vin17 = new Vin("Chateau d'Yguem", 2010, sauvignon, rose, 11.56);
          Vin vin18 = new Vin("Chateau Guiraud", 2003, sauvignon, rouge, 16.90);
          Vin vin19 = new Vin("Chateau Coutet", 2017, sauvignon, rouge, 22.74);
          Vin vin20 = new Vin("Chateau Suduiraut", 2007, sauvignon, rouge, 8.63);
          
          Bouteille b1 = new Bouteille(1, 125, vin1);
          Bouteille b2 = new Bouteille(2, 56, vin2);
          Bouteille b3 = new Bouteille(3, 23, vin3);
          Bouteille b4 = new Bouteille(4, 14, vin4);
          Bouteille b5 = new Bouteille(5, 87, vin5);
          Bouteille b6 = new Bouteille(6, 34, vin6);
          Bouteille b7 = new Bouteille(7, 78, vin7);
          Bouteille b8 = new Bouteille(8, 19, vin8);
          Bouteille b9 = new Bouteille(9, 41, vin9);
          Bouteille b10 = new Bouteille(10, 12, vin10);
          Bouteille b11 = new Bouteille(11, 25, vin11);
          Bouteille b12 = new Bouteille(12, 46, vin12);
          Bouteille b13 = new Bouteille(13, 62, vin13);
          Bouteille b14 = new Bouteille(14, 5, vin14);
          Bouteille b15 = new Bouteille(15, 44, vin15);
          Bouteille b16 = new Bouteille(16, 62, vin16);
          Bouteille b17 = new Bouteille(17, 21, vin17);
          Bouteille b18 = new Bouteille(18, 71, vin18);
          Bouteille b19 = new Bouteille(19, 37, vin19);
          Bouteille b20 = new Bouteille(20, 92, vin20);
          
         // ArrayList<Bouteille> mesBouteilles = new ArrayList();
          mesBouteilles = new ArrayList();
          //les bouteilles
          mesBouteilles.add(b1);
          mesBouteilles.add(b2);
          mesBouteilles.add(b3);
          mesBouteilles.add(b4);
          mesBouteilles.add(b5);
          mesBouteilles.add(b6);
          mesBouteilles.add(b7);
          mesBouteilles.add(b8);
          mesBouteilles.add(b9);
          mesBouteilles.add(b10);
          mesBouteilles.add(b11);
          mesBouteilles.add(b12);
          mesBouteilles.add(b13);
          mesBouteilles.add(b14);
          mesBouteilles.add(b15);
          mesBouteilles.add(b16);
          mesBouteilles.add(b17);
          mesBouteilles.add(b18);
          mesBouteilles.add(b19);
          mesBouteilles.add(b20);
          
          
          for(Bouteille btl : mesBouteilles)
          {
              v = new Vector();
              v.add(btl.getIdBouteille());
              v.add(btl.getLeVin().getNomVin());
              v.add(btl.getQuantiteBouteille());
              dtmVins.addRow(v);
          }
          
        double nbBlanc = 0;
        double nbRouges = 0;
        double nbRoses = 0;
        int i = 0;
        double valeurCave = 0;
        
        
        for(Bouteille btl : mesBouteilles)
        {
            valeurCave = (btl.getQuantiteBouteille() * btl.getLeVin().getPrixDuVin() + valeurCave);
        }
        
        lblCave.setText(String.valueOf(valeurCave));
        
        for(Bouteille btl : mesBouteilles)
        {
             if(btl.getLeVin().getLaCouleur() == blanc)
            {
                nbBlanc++; 
            }
            else if (btl.getLeVin().getLaCouleur() == rouge)
            {
                nbRouges++;
            }
            else 
            {
                nbRoses++;
            }
            i++;
        }
        
        nbRouges = (nbRouges / i) * 100;
        nbBlanc = (nbBlanc / i) * 100;
        nbRoses = (nbRoses / i) * 100;
        
        txtVinBlanc.setText(String.valueOf(nbBlanc) + " % ");
        txtVinRose.setText(String.valueOf(nbRoses) + " % ");
        txtVinRouge.setText(String.valueOf(nbRouges) + " % ");
          
          
          
          
          
          
          

 
 
 
 


        
        
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(frmProjetVin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmProjetVin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmProjetVin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmProjetVin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmProjetVin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCave;
    private javax.swing.JTable tblVins;
    private java.awt.TextField txtCepage;
    private java.awt.TextField txtCouleur;
    private java.awt.TextField txtMillesime;
    private java.awt.TextField txtPrix;
    private java.awt.TextField txtVinBlanc;
    private java.awt.TextField txtVinRose;
    private java.awt.TextField txtVinRouge;
    // End of variables declaration//GEN-END:variables
}
