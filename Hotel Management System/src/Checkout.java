import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import project.*;


/**
 *
 * @author mirela
 */
public class Checkout extends javax.swing.JFrame {
    //getters
    public JButton getCheckoutBtn()
    {
        return CheckoutBtn;
    }
    public JTextField getjTextNumQuarto()
    {
        return jTextNumQuarto;
    }



    /**
     * Creates new form Checkout
     */
    public Checkout() {
        initComponents();
        
        jTextNome.setEditable (false);
        jTextCheckin.setEditable (false);
        jTextCheckout.setEditable (false);
        jTextTel.setEditable (false);
        jTextPreco.setEditable (false);
        jTextEstadia.setEditable (false);
        jTextValorFinal.setEditable (false);
        jTextCPF.setEditable (false);
              
    }
    
    int id=0;
    String Query;
    String tipoQuarto;
    String cama;
    String numQuarto;
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextNumQuarto = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        BuscarBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Telefone = new javax.swing.JLabel();
        jTextNome = new javax.swing.JTextField();
        jTextCheckin = new javax.swing.JTextField();
        jTextCheckout = new javax.swing.JTextField();
        jTextTel = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextPreco = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextEstadia = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextValorFinal = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextCPF = new javax.swing.JTextField();
        CheckoutBtn = new javax.swing.JButton();
        LimparBtn = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(70, 120));
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
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/check-out.png"))); // NOI18N
        jLabel1.setText("Check Out de Hóspedes");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 360, 47));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Número do Quarto:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, -1, 20));

        jTextNumQuarto.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        getContentPane().add(jTextNumQuarto, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 120, 168, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 20, 30, 30));

        BuscarBtn.setBackground(new java.awt.Color(204, 204, 204));
        BuscarBtn.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        BuscarBtn.setText("Buscar");
        BuscarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarBtnActionPerformed(evt);
            }
        });
        getContentPane().add(BuscarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 120, -1, -1));

        jTable1.setBackground(new java.awt.Color(239, 239, 239));
        jTable1.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Num. Quarto", "Nome", "Endereço", "Telefone", "CPF", "Email", "Nascimento", "Data Check in", "Tipo Quarto", "Qtd. Hóspedes", "Preço diária"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, 1090, 210));

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nome do Hóspede");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Data de Check-in");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 190, -1, -1));

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Data Check-out (Hoje)");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 300, -1, -1));

        Telefone.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        Telefone.setForeground(new java.awt.Color(255, 255, 255));
        Telefone.setText("Telefone");
        getContentPane().add(Telefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, -1, -1));

        jTextNome.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        getContentPane().add(jTextNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 240, -1));

        jTextCheckin.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        getContentPane().add(jTextCheckin, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 220, 230, -1));

        jTextCheckout.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        getContentPane().add(jTextCheckout, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 330, 230, -1));

        jTextTel.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        getContentPane().add(jTextTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 220, 230, -1));

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Preço da diária");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

        jTextPreco.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        getContentPane().add(jTextPreco, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 240, -1));

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Dias de estadia");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, -1, -1));

        jTextEstadia.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        getContentPane().add(jTextEstadia, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 330, 230, -1));

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Valor Final");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 300, -1, -1));

        jTextValorFinal.setBackground(new java.awt.Color(255, 204, 204));
        jTextValorFinal.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        getContentPane().add(jTextValorFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 330, 230, -1));

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("CPF");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 190, -1, -1));

        jTextCPF.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        getContentPane().add(jTextCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 220, 230, -1));

        CheckoutBtn.setBackground(new java.awt.Color(204, 204, 204));
        CheckoutBtn.setFont(new java.awt.Font("Lucida Grande", 1, 16)); // NOI18N
        CheckoutBtn.setText("Check Out");
        CheckoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckoutBtnActionPerformed(evt);
            }
        });
        getContentPane().add(CheckoutBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 380, 170, 60));

        LimparBtn.setBackground(new java.awt.Color(204, 204, 204));
        LimparBtn.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        LimparBtn.setText("Limpar");
        LimparBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimparBtnActionPerformed(evt);
            }
        });
        getContentPane().add(LimparBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/basicbg.jpg"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 690));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setVisible(false);  
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        ResultSet rs= Select.getData("select * from checkin where dataCheckout is NULL");
        DefaultTableModel model= (DefaultTableModel)jTable1.getModel();
        try
        {
            while(rs.next())
            {
                model.addRow(new Object[]{rs.getString(7),rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(14),rs.getString(8),rs.getString(10),rs.getString(11)});
                
            }
            rs.close();
        }
        catch (Exception e)   
        {
        JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_formComponentShown

    private void BuscarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarBtnActionPerformed
        String numQuarto = jTextNumQuarto.getText();
        
        try 
        {   
            ResultSet rs = Select.getData("select * from checkin where numQuarto = '"+numQuarto+"' and dataCheckout is NULL");
            if(rs.next())
            {
                jTextNumQuarto.setEditable(false);
                jTextNome.setText(rs.getString(1));
                jTextCheckin.setText(rs.getString(14));
                jTextTel.setText(rs.getString(3));
                jTextPreco.setText(rs.getString(11));
                
                SimpleDateFormat myFormat = new SimpleDateFormat("yyyy/MM/dd");
                Calendar cal = Calendar.getInstance();
                jTextCheckout.setText(myFormat.format(cal.getTime()));
                String dateBeforeString=rs.getString(14);
                java.util.Date dateBefore = myFormat.parse(dateBeforeString);
                String dateAfterString=myFormat.format(cal.getTime());
                java.util.Date dateAfter=myFormat.parse(dateAfterString);
                long difference = dateAfter.getTime() - dateBefore.getTime();
                int numEstadia =(int) (difference/(1000*60*60*24));
                if (numEstadia ==0)
                    numEstadia =1;
                jTextEstadia.setText(String.valueOf(numEstadia));
                float preco = Float.parseFloat(jTextPreco.getText());
                
                jTextValorFinal.setText(String.valueOf(numEstadia*preco));
                
                jTextCPF.setText(rs.getString(4));
                
                tipoQuarto = rs.getString(8);
                cama= rs.getString(9);

                
            }
            
            else
                JOptionPane.showMessageDialog(null,"Número do quarto incorreto ou não existe.");
                
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
        
        
    }//GEN-LAST:event_BuscarBtnActionPerformed

    private void LimparBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimparBtnActionPerformed
        setVisible(false);
        new Checkout().setVisible(true);
    }//GEN-LAST:event_LimparBtnActionPerformed

    private void CheckoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckoutBtnActionPerformed
        String nome= jTextNome.getText();
        String tel = jTextTel.getText();
        String cpf = jTextCPF.getText();
        
        String checkout = jTextCheckout.getText();
        String numEstadia = jTextEstadia.getText();
        String valorFinal = jTextValorFinal.getText();
        numQuarto = jTextNumQuarto.getText();
        
        Query = "update checkin set estadia = '"+numEstadia+"', valorTotal = '"+valorFinal+"', dataCheckout = '"+checkout+"' where cpfHospede = '"+cpf+"'";
        InsertUpdateDelete.setData(Query,"");
        Query = "update quarto set status = 'Sem reserva' where numQuarto ='"+numQuarto+"'";
        InsertUpdateDelete.setData(Query,"");
        Query = "update hospedes set status = 'Sem hospedagem' where cpfHospede ='"+cpf+"'";
                InsertUpdateDelete.setData(Query,"");
        JOptionPane.showMessageDialog (null, "Check Out concluído!");
        setVisible(false);
        new Checkout().setVisible(true);
        
        
    }//GEN-LAST:event_CheckoutBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Checkout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Checkout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Checkout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Checkout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Checkout().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BuscarBtn;
    private javax.swing.JButton CheckoutBtn;
    private javax.swing.JButton LimparBtn;
    private javax.swing.JLabel Telefone;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextCPF;
    private javax.swing.JTextField jTextCheckin;
    private javax.swing.JTextField jTextCheckout;
    private javax.swing.JTextField jTextEstadia;
    private javax.swing.JTextField jTextNome;
    private javax.swing.JTextField jTextNumQuarto;
    private javax.swing.JTextField jTextPreco;
    private javax.swing.JTextField jTextTel;
    private javax.swing.JTextField jTextValorFinal;
    // End of variables declaration//GEN-END:variables
}
