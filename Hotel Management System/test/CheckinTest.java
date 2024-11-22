/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.lang.reflect.Field;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author mirela
 */
public class CheckinTest {
    private Checkin CheckinFrame;
    
        
@Before
    public void setUp() {
    // Inicializa o checkin frame antes de cada teste 
    CheckinFrame = new Checkin();
    }

@Test
    public void testCheckinBtn() throws NoSuchFieldException, IllegalAccessException {
    // Acessar o campo privado do botão Check In 
    Field CheckInBtnField = CheckinFrame.getClass().getDeclaredField("CheckInBtn");
    CheckInBtnField.setAccessible(true); 

    JButton CheckInBtn = (JButton) CheckInBtnField.get(CheckinFrame);

    assertNotNull("O botão Check In deve ser inicializado", CheckInBtn);
    assertTrue("O botão Check In deve ser visivel", CheckInBtn.isVisible());
    assertEquals("O texto do botão deve ser 'Check In'", "Check In", CheckInBtn.getText());
    }
@Test
    public void testBuscarBtn() throws NoSuchFieldException, IllegalAccessException {
    // Acessar o campo privado do botão Buscar 
    Field BuscarBtnField = CheckinFrame.getClass().getDeclaredField("BuscarBtn");
    BuscarBtnField.setAccessible(true); 

    JButton BuscarBtn = (JButton) BuscarBtnField.get(CheckinFrame);

    assertNotNull("O botão Buscar deve ser inicializado", BuscarBtn);
    assertTrue("O botão Buscar deve ser visivel", BuscarBtn.isVisible());
    assertEquals("O texto do botão deve ser 'Buscar'", "Buscar", BuscarBtn.getText());
    }    
@Test
    public void testLimparBtn() throws NoSuchFieldException, IllegalAccessException {
    // Acessar o campo privado do botão Limpar
    Field LimparBtnField = CheckinFrame.getClass().getDeclaredField("LimparBtn");
    LimparBtnField.setAccessible(true); 

    JButton LimparBtn = (JButton) LimparBtnField.get(CheckinFrame);

    assertNotNull("O botão Limpar deve ser inicializado", LimparBtn);
    assertTrue("O botão Limpar deve ser visivel", LimparBtn.isVisible());
    assertEquals("O texto do botão deve ser 'Limpar'", "Limpar", LimparBtn.getText());
    }  
@Test
    public void testCamposIniciaisHospede() throws NoSuchFieldException, IllegalAccessException {    
    // Acessar os campos privados do CPF
    Field jTextCPFField = CheckinFrame.getClass().getDeclaredField("jTextCPF");
    jTextCPFField.setAccessible (true);
    JTextField jTextCPF = (JTextField) jTextCPFField.get(CheckinFrame);
    
    // Acessar os campos privados do Nome
    Field jTextNomeField = CheckinFrame.getClass().getDeclaredField("jTextNome");
    jTextNomeField.setAccessible (true);
    JTextField jTextNome = (JTextField) jTextNomeField.get(CheckinFrame);
    
    // Acessar os campos privados do Endereço
    Field jTextEnderecoField = CheckinFrame.getClass().getDeclaredField("jTextEndereco");
    jTextEnderecoField.setAccessible (true);
    JTextField jTextEndereco = (JTextField) jTextEnderecoField.get(CheckinFrame);
    
    // Acessar os campos privados do Email
    Field jTextEmailField = CheckinFrame.getClass().getDeclaredField("jTextEmail");
    jTextEmailField.setAccessible (true);
    JTextField jTextEmail = (JTextField) jTextEmailField.get(CheckinFrame);
    
    // Acessar os campos privados do Telefone
    Field jTextTelField = CheckinFrame.getClass().getDeclaredField("jTextTel");
    jTextTelField.setAccessible (true);
    JTextField jTextTel = (JTextField) jTextTelField.get(CheckinFrame);
    
    // Acessar os campos privados do Nascimento
    Field jTextNascimentoField = CheckinFrame.getClass().getDeclaredField("jTextNascimento");
    jTextNascimentoField.setAccessible (true);
    JTextField jTextNascimento = (JTextField) jTextNascimentoField.get(CheckinFrame);
    
    
    
    //Checar estado inicial dos campos CPF,nome, endereço, email, teleefone, nascimento.
    assertNotNull("O campo CPF deve ser inicializado", jTextCPF);
    assertEquals("O campo CPF deve estar vazio", "", jTextCPF.getText());    
        
    assertNotNull("O campo nome deve ser inicializado", jTextNome);
    assertEquals("O campo nome deve estar vazio", "", jTextNome.getText());
    
    assertNotNull("O campo Endereço deve ser inicializado", jTextEndereco);
    assertEquals("O campo Endereço deve estar vazio", "", jTextEndereco.getText());
        
    assertNotNull("O campo email deve ser inicializado", jTextEmail);
    assertEquals("O campo email deve estar vazio", "", jTextEmail.getText());
    
    assertNotNull("O campo Telefone deve ser inicializado", jTextTel);
    assertEquals("O campo Telefone deve estar vazio", "", jTextTel.getText());
    
    assertNotNull("O campo Nascimento deve ser inicializado", jTextNascimento);
    assertEquals("O campo Nascimento deve estar vazio", "", jTextNascimento.getText());
    }
    
@Test
    public void testCamposIniciaQuarto() throws NoSuchFieldException, IllegalAccessException {
    //Acessar os campos do ComboBoxCama
    Field jComboBoxCamaField = CheckinFrame.getClass().getDeclaredField("jComboBoxCama");
    jComboBoxCamaField.setAccessible (true);
    JComboBox jComboBoxCama = (JComboBox) jComboBoxCamaField.get(CheckinFrame);
    
    //Acessar os campos do ComboBoxTipoQuarto
    Field jComboBoxTipoQuartoField = CheckinFrame.getClass().getDeclaredField("jComboBoxTipoQuarto");
    jComboBoxTipoQuartoField.setAccessible (true);
    JComboBox jComboBoxTipoQuarto = (JComboBox) jComboBoxTipoQuartoField.get(CheckinFrame);
    
    //Acessar os campos do ComboBox Quantidade de Pessoas
    Field jComboBoxNumPessoaField = CheckinFrame.getClass().getDeclaredField("jComboBoxNumPessoa");
    jComboBoxNumPessoaField.setAccessible (true);
    JComboBox jComboBoxNumPessoa = (JComboBox) jComboBoxNumPessoaField.get(CheckinFrame);
    
    //Acessar os campos do ComboBox Numero do Quarto
    Field jComboBoxNumQuartoField = CheckinFrame.getClass().getDeclaredField("jComboBoxNumQuarto");
    jComboBoxNumQuartoField.setAccessible (true);
    JComboBox jComboBoxNumQuarto = (JComboBox) jComboBoxNumQuartoField.get(CheckinFrame);
    
        // Acessar os campos privados do Preço
    Field jTextPrecoField = CheckinFrame.getClass().getDeclaredField("jTextPreco");
    jTextPrecoField.setAccessible (true);
    JTextField jTextPreco = (JTextField) jTextPrecoField.get(CheckinFrame);
    
    // Acessar os campos privados da Data de Check In
    Field jTextDataField = CheckinFrame.getClass().getDeclaredField("jTextData");
    jTextDataField.setAccessible (true);
    JTextField jTextData = (JTextField) jTextDataField.get(CheckinFrame);
    
    
    // Checar estado inicial dos campos
    assertNotNull("O combo box de Cama deve ser inicializado", jComboBoxCama);
    assertEquals("Role combo deve estar no 'Solteiro'", "Solteiro", jComboBoxCama.getSelectedItem());
    
    assertNotNull("O combo box do Tipo Quarto deve ser inicializado", jComboBoxTipoQuarto);
    assertEquals("Role combo deve estar no 'Fumante'", "Fumante", jComboBoxTipoQuarto.getSelectedItem());
    
    assertNotNull("O combo box do Qtd. de Pessoa deve ser inicializado", jComboBoxNumPessoa);
    assertEquals("Role combo deve estar no '1'", "1", jComboBoxNumPessoa.getSelectedItem());   
    
    assertNotNull("O combo box do Num. Quarto deve ser inicializado", jComboBoxNumQuarto);
    assertEquals("Role combo deve estar no 'null'", null, jComboBoxNumQuarto.getSelectedItem()); 
    
    assertNotNull("O campo preco deve ser inicializado", jTextPreco);
    assertEquals("O campo preco deve estar vazio", "", jTextPreco.getText());
        
    assertNotNull("O campo data deve ser inicializado", jTextData);
    
    }
}
