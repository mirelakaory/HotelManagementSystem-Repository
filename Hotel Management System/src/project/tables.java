
package project;

import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author mirela
 */
public class tables {
    public static void main (String[] args)
    {
        Connection con = null;
        Statement st = null;
        
        try
        {
            con=ConnectionProvider.getCon();
            st=con.createStatement();
            //st.executeUpdate("create table usuario ( nome varchar(200), email varchar(200), senha varchar(50), perguntaSeguranca varchar(500), resposta varchar(200), endereco varchar(200), funcao varchar(30),status varchar(200) );");
            //st.executeUpdate("create table quarto ( numQuarto varchar(10), tipoQuarto varchar(200), cama varchar(200),numPessoa varchar(200), preco int ,status varchar(20));");
            //st.executeUpdate("create table hospedes (nomeHospede varchar(200), enderecoHospede varchar(300),  telHospede varchar(50), cpfHospede varchar(50), emailHospede varchar(200), nascimentoHospede varchar (100), status varchar(30));");
            
            JOptionPane.showMessageDialog(null, "Mesa criada com sucesso");
        }
        
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        
        finally
        {
            try
            { 
                con.close();
                st.close();
            }
            catch (Exception e)
            { }
        }
        
        }
    }
    
