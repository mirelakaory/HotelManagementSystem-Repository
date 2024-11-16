
import project.InsertUpdateDelete;
import project.*;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mirela
 */
public class hospedes extends javax.swing.JFrame {

    /**
     * Creates new form hospedes
     */
    public hospedes() {
        initComponents();
        
    }
     String Query;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        fecharBtn = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();
        jLabelEmail = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabelNascimento = new javax.swing.JLabel();
        jLabelNome = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabelEndereco = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabelTelefone = new javax.swing.JLabel();
        jLabelCpf = new javax.swing.JLabel();
        registrarBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(50, 118));
        setUndecorated(true);
        setResizable(false);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/guests.png"))); // NOI18N
        jLabel1.setText(" Hóspedes");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 42, 180, 52));

        fecharBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit.png"))); // NOI18N
        fecharBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fecharBtnActionPerformed(evt);
            }
        });
        getContentPane().add(fecharBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 10, 30, 30));

        jTextField4.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 390, 360, -1));

        jLabelEmail.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabelEmail.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEmail.setText("E-mail");
        getContentPane().add(jLabelEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 430, -1, -1));

        jTextField5.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 450, 360, -1));

        jLabelNascimento.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabelNascimento.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNascimento.setText("Data de nascimento (AAAA/MM/DD)");
        getContentPane().add(jLabelNascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 490, -1, -1));

        jLabelNome.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabelNome.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNome.setText("Nome");
        getContentPane().add(jLabelNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 140, -1, -1));

        jTextField6.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 520, 360, -1));

        jTextField1.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 170, 360, -1));

        jTextField3.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 310, 360, -1));

        jLabelEndereco.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabelEndereco.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEndereco.setText("Endereço");
        getContentPane().add(jLabelEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 210, -1, -1));

        jTextField2.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 240, 360, -1));

        jLabelTelefone.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabelTelefone.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTelefone.setText("Telefone");
        getContentPane().add(jLabelTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 280, -1, -1));

        jLabelCpf.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabelCpf.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCpf.setText("CPF");
        getContentPane().add(jLabelCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 360, -1, -1));

        registrarBtn.setFont(new java.awt.Font("Lucida Grande", 1, 16)); // NOI18N
        registrarBtn.setText("Registrar ");
        registrarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarBtnActionPerformed(evt);
            }
        });
        getContentPane().add(registrarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 580, 144, 50));

        jTable1.setBackground(new java.awt.Color(239, 239, 239));
        jTable1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.lightGray, null, null));
        jTable1.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Endereço", "Telefone", "CPF", "Email", "Nascimento", "Status"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 590, 460));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/basicbg.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 690));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fecharBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fecharBtnActionPerformed
    setVisible(false);
    }//GEN-LAST:event_fecharBtnActionPerformed

    private void registrarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarBtnActionPerformed
     String nome=jTextField1.getText();
     String endereco =jTextField2.getText();
     String telefone =jTextField3.getText();
     String cpf =jTextField4.getText();
     String email=jTextField5.getText();
     String nascimento= jTextField6.getText();
    
     try{
         
        ResultSet rs = Select.getData("select * from hospedes where cpfHospede = '"+cpf+"'");
        
        if (rs.next()){
             JOptionPane.showMessageDialog(null,"Hóspede com esse CPF já existe no sistema." );
        }
        else
        {
            
        String Query= "insert into hospedes values ('"+nome+"','"+endereco+"','"+telefone+"','"+cpf+"','"+email+"','"+nascimento+"','Sem hospedagem')";
        InsertUpdateDelete.setData(Query,"Hóspede registrado.");
        setVisible(false);
        new hospedes().setVisible(true);
        }
     }
     catch (Exception e)
    { 
        JOptionPane.showMessageDialog(null, e);
    }
    }//GEN-LAST:event_registrarBtnActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
    ResultSet rs = Select.getData("select * from hospedes");
    DefaultTableModel model =(DefaultTableModel)jTable1.getModel();
    try
    {
        while(rs.next())
            
        {
            model.addRow(new Object[] {rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5), rs.getString(6), rs.getString(7)});
        }
        rs.close();
    }
    catch (Exception e)
    { 
        JOptionPane.showMessageDialog(null, e);
    }     
    }//GEN-LAST:event_formComponentShown

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

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
            java.util.logging.Logger.getLogger(hospedes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(hospedes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(hospedes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(hospedes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new hospedes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton fecharBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelCpf;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelEndereco;
    private javax.swing.JLabel jLabelNascimento;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelTelefone;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JButton registrarBtn;
    // End of variables declaration//GEN-END:variables
}
