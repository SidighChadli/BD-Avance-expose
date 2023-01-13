import java.awt.print.PrinterException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
 

public class Principal extends javax.swing.JFrame {
 
    
    public Principal() {
        initComponents();
        data();
 
    }
 
    void reset() {
        tname.setText(null);
        tprenom.setText(null);
        tid.setText(null);
        cbsexe.setSelectedIndex(0);
        bdelete.setEnabled(false);
        bsave.setEnabled(true);
    }
 
    public void data() {
        TraitementEtudiant te = new TraitementEtudiant();
 
        String header[] = {"Id", "Name", "Prenom", "Sexe"};
        Object data[][] = new Object[te.afficher().size()][4];
        int i = 0;
 
        for (Etudiant etu : te.afficher()) {
            data[i][0] = etu.getId();
            data[i][1] = etu.getNom();
            data[i][2] = etu.getPrenom();
            data[i][3] = etu.getSexe();
            i++;
 
        }
        table.setModel(new DefaultTableModel(data, header));
 
    }
 
   
    @SuppressWarnings("unchecked")
                           
    private void initComponents() {
 
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tname = new javax.swing.JTextField();
        tprenom = new javax.swing.JTextField();
        bsave = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        cbsexe = new javax.swing.JComboBox<>();
        tid = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        bdelete = new javax.swing.JButton();
        bsave2 = new javax.swing.JButton();
        bsave3 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
 
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1000, 494));
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
 
        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Ajouter Etudiant", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(0, 51, 153))); 
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
 
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14));   
        jLabel1.setText("Id");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 81, 26));
 
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14));   
        jLabel2.setText("Prenom");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 81, 26));
 
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14));   
        jLabel3.setText("Sexe");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 81, 26));
 
        tname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tnameActionPerformed(evt);
            }
        });
        jPanel1.add(tname, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 155, 40));
        jPanel1.add(tprenom, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 155, 40));
 
        bsave.setBackground(new java.awt.Color(255, 255, 255));
        bsave.setFont(new java.awt.Font("Tahoma", 1, 14));   
        bsave.setForeground(new java.awt.Color(0, 51, 204));
        bsave.setText("Save");
        bsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsaveActionPerformed(evt);
            }
        });
        jPanel1.add(bsave, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 248, 98, 50));
 
        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14));   
        jButton2.setForeground(new java.awt.Color(0, 0, 204));
        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 248, 98, 50));
 
        cbsexe.setFont(new java.awt.Font("Tahoma", 1, 14));   
        cbsexe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculin", "Feminin" }));
        jPanel1.add(cbsexe, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 155, 35));
 
        tid.setEditable(false);
        jPanel1.add(tid, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 155, 40));
 
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14));   
        jLabel4.setText("Nom");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 81, 26));
 
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 300, 340));
 
        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
 
        bdelete.setBackground(new java.awt.Color(255, 255, 255));
        bdelete.setFont(new java.awt.Font("Tahoma", 1, 14));   
        bdelete.setForeground(java.awt.Color.red);
        bdelete.setText("Suprimer");
        bdelete.setEnabled(false);
        bdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bdeleteActionPerformed(evt);
            }
        });
        jPanel2.add(bdelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 98, 50));
 
        bsave2.setBackground(new java.awt.Color(255, 255, 255));
        bsave2.setFont(new java.awt.Font("Tahoma", 1, 14));   
        bsave2.setForeground(new java.awt.Color(0, 51, 204));
        bsave2.setText("Print");
        bsave2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsave2ActionPerformed(evt);
            }
        });
        jPanel2.add(bsave2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 98, 50));
 
        bsave3.setBackground(new java.awt.Color(255, 255, 255));
        bsave3.setFont(new java.awt.Font("Tahoma", 1, 14));   
        bsave3.setForeground(new java.awt.Color(0, 51, 204));
        bsave3.setText("Modifier");
        bsave3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsave3ActionPerformed(evt);
            }
        });
        jPanel2.add(bsave3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 98, 50));
 
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 340, 370, 70));
 
        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Table Etudiants", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(0, 51, 153)));   
 
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
 
            },
            new String [] {
 
            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);
 
        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
 
        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, 570, 250));
 
        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24));   
        jLabel5.setText("GESTION ETUDIANTS");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 300, 30));
 
        pack();
    }                      
 
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        
        reset();
    }                                        
 
    private void bsaveActionPerformed(java.awt.event.ActionEvent evt) {                                      
        Etudiant etu = new Etudiant();
        TraitementEtudiant te = new TraitementEtudiant();
        int save = 0;
 
        if (tname.getText().trim().isEmpty() || tprenom.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Tous les champs sont obligatoires!");
 
        } else {
            etu.setNom(tname.getText());
            etu.setPrenom(tprenom.getText());
            etu.setSexe(cbsexe.getSelectedItem().toString());
            save = te.save(etu);
            if (save == 1) {
                JOptionPane.showMessageDialog(null, "Etudiant ajoute avec succes");
                data();
            } else {
                JOptionPane.showMessageDialog(null, "Impossible!");
            }
        }
 
 
    }                                     
 
    private void tnameActionPerformed(java.awt.event.ActionEvent evt) {                                      
        
    }                                     
 
    private void bdeleteActionPerformed(java.awt.event.ActionEvent evt) {                                        
        
        int n = 0;
        Etudiant etu = new Etudiant();
        TraitementEtudiant te = new TraitementEtudiant();
        etu.setId(Integer.parseInt(tid.getText()));
        int y = JOptionPane.showConfirmDialog(null, "Voulez-vous vraiment Supprimer ces infos?",
                "Confirmation", JOptionPane.YES_NO_OPTION);
        if (y == 0) {
            n = te.delete_etudiant(etu);
            if (n == 1) {
                JOptionPane.showMessageDialog(null, "Produit Supprimer avec Succes !");
                data();
                reset();
                bdelete.setEnabled(false);
 
            } else {
                JOptionPane.showMessageDialog(null, "Suppresion Impossible");
            }
        }
    }                                       
 
    private void bsave2ActionPerformed(java.awt.event.ActionEvent evt) {                                       
        try {
           
            table.print();
        } catch (PrinterException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                      
 
    private void bsave3ActionPerformed(java.awt.event.ActionEvent evt) {                                       
        
        Etudiant etu = new Etudiant();
        TraitementEtudiant te = new TraitementEtudiant();
        int n = 0;
        etu.setId(Integer.parseInt(tid.getText()));
        etu.setNom(tname.getText());
        etu.setPrenom(tprenom.getText());
        etu.setSexe(cbsexe.getSelectedItem().toString());
 
        int y = JOptionPane.showConfirmDialog(null, "Voulez-vous vraiment modifier ces infos?",
                "Confirmation", JOptionPane.YES_NO_OPTION);
        if (y == 0) {
            n = te.update(etu);
 
            if (n == 1) {
                JOptionPane.showMessageDialog(null, "Produit modifie avec Succes !");
                data();
                reset();
            } else {
                JOptionPane.showMessageDialog(null, "mise a jour Impossible");
            }
 
        }
    }                                      
 
    private void tableMouseClicked(java.awt.event.MouseEvent evt) {                                   
       
        int ligne = table.getSelectedRow();
        tid.setText(table.getValueAt(ligne, 0).toString());
        tname.setText(table.getValueAt(ligne, 1).toString());
        tprenom.setText(table.getValueAt(ligne, 2).toString());
        cbsexe.setSelectedItem(table.getValueAt(ligne, 3).toString());
        bdelete.setEnabled(true);
        bsave.setEnabled(false);
 
 
    }                                  
 
   
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
 
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }
 
                       
    private javax.swing.JButton bdelete;
    private javax.swing.JButton bsave;
    private javax.swing.JButton bsave2;
    private javax.swing.JButton bsave3;
    private javax.swing.JComboBox<String> cbsexe;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    private javax.swing.JTextField tid;
    private javax.swing.JTextField tname;
    private javax.swing.JTextField tprenom;
                       
}