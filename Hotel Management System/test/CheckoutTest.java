/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.lang.reflect.Field;
import javax.swing.JButton;
import javax.swing.JTextField;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author mirela
 */
public class CheckoutTest {
    private Checkout CheckoutFrame;
    
        
@Before
    public void setUp() {
    // Inicializa o checkin frame antes de cada teste 
    CheckoutFrame = new Checkout();
    }
    
@Test
    public void testCheckinBtn() throws NoSuchFieldException, IllegalAccessException {
    // Acessar o campo privado do botão Check out
    Field CheckoutBtnField = CheckoutFrame.getClass().getDeclaredField("CheckoutBtn");
    CheckoutBtnField.setAccessible(true); 

    JButton CheckoutBtn = (JButton) CheckoutBtnField.get(CheckoutFrame);

    assertNotNull("O botão Check out deve ser inicializado", CheckoutBtn);
    assertTrue("O botão Check out deve ser visivel", CheckoutBtn.isVisible());
    assertEquals("O texto do botão deve ser 'Check Out'", "Check Out", CheckoutBtn.getText());
    }
@Test
    public void testBuscarBtn() throws NoSuchFieldException, IllegalAccessException {
    // Acessar o campo privado do botão Buscar 
    Field BuscarBtnField = CheckoutFrame.getClass().getDeclaredField("BuscarBtn");
    BuscarBtnField.setAccessible(true); 

    JButton BuscarBtn = (JButton) BuscarBtnField.get(CheckoutFrame);

    assertNotNull("O botão Buscar deve ser inicializado", BuscarBtn);
    assertTrue("O botão Buscar deve ser visivel", BuscarBtn.isVisible());
    assertEquals("O texto do botão deve ser 'Buscar'", "Buscar", BuscarBtn.getText());
    }    
@Test
    public void testLimparBtn() throws NoSuchFieldException, IllegalAccessException {
    // Acessar o campo privado do botão Limpar
    Field LimparBtnField = CheckoutFrame.getClass().getDeclaredField("LimparBtn");
    LimparBtnField.setAccessible(true); 

    JButton LimparBtn = (JButton) LimparBtnField.get(CheckoutFrame);

    assertNotNull("O botão Limpar deve ser inicializado", LimparBtn);
    assertTrue("O botão Limpar deve ser visivel", LimparBtn.isVisible());
    assertEquals("O texto do botão deve ser 'Limpar'", "Limpar", LimparBtn.getText());
    }    
@Test
    public void testCamposIniciais() throws NoSuchFieldException, IllegalAccessException {
    // Acessar os campos privados do Nome
    Field jTextNomeField = CheckoutFrame.getClass().getDeclaredField("jTextNome");
    jTextNomeField.setAccessible (true);
    JTextField jTextNome = (JTextField) jTextNomeField.get(CheckoutFrame);
    
    // Acessar os campos privados do CPF
    Field jTextCPFField = CheckoutFrame.getClass().getDeclaredField("jTextCPF");
    jTextCPFField.setAccessible (true);
    JTextField jTextCPF = (JTextField) jTextCPFField.get(CheckoutFrame);
    
     // Acessar os campos privados do Telefone
    Field jTextTelField = CheckoutFrame.getClass().getDeclaredField("jTextTel");
    jTextTelField.setAccessible (true);
    JTextField jTextTel = (JTextField) jTextTelField.get(CheckoutFrame);
    
    // Acessar os campos privados da Data de check in
    Field jTextCheckinField = CheckoutFrame.getClass().getDeclaredField("jTextCheckin");
    jTextCheckinField.setAccessible (true);
    JTextField jTextCheckin = (JTextField) jTextCheckinField.get(CheckoutFrame);
    
    // Acessar os campos privados do Preço
    Field jTextPrecoField = CheckoutFrame.getClass().getDeclaredField("jTextPreco");
    jTextPrecoField.setAccessible (true);
    JTextField jTextPreco = (JTextField) jTextPrecoField.get(CheckoutFrame);
    
    // Acessar os campos privados da Estadia
    Field jTextEstadiaField = CheckoutFrame.getClass().getDeclaredField("jTextEstadia");
    jTextEstadiaField.setAccessible (true);
    JTextField jTextEstadia = (JTextField) jTextEstadiaField.get(CheckoutFrame);
    
    // Acessar os campos privados da Data de check out
    Field jTextCheckoutField = CheckoutFrame.getClass().getDeclaredField("jTextCheckout");
    jTextCheckoutField.setAccessible (true);
    JTextField jTextCheckout = (JTextField) jTextCheckoutField.get(CheckoutFrame);
    
    // Acessar os campos privados do Valor Final
    Field jTextValorFinalField = CheckoutFrame.getClass().getDeclaredField("jTextValorFinal");
    jTextValorFinalField.setAccessible (true);
    JTextField jTextValorFinal = (JTextField) jTextValorFinalField.get(CheckoutFrame);
    
    assertNotNull("O campo nome deve ser inicializado", jTextNome);
    assertEquals("O campo nome deve estar vazio", "", jTextNome.getText());
    
    assertNotNull("O campo Telefone deve ser inicializado", jTextTel);
    assertEquals("O campo Telefone deve estar vazio", "", jTextTel.getText());
    
    assertNotNull("O campo CPF deve ser inicializado", jTextCPF);
    assertEquals("O campo CPF deve estar vazio", "", jTextCPF.getText());
    
    assertNotNull("O campo Data Checkin deve ser inicializado", jTextCheckin);
    assertEquals("O campo Data Checkin deve estar vazio", "", jTextCheckin.getText());    
    
    assertNotNull("O campo Preco deve ser inicializado", jTextPreco);
    assertEquals("O campo Preco deve estar vazio", "", jTextPreco.getText());  
    
    assertNotNull("O campo Estadia deve ser inicializado", jTextEstadia);
    assertEquals("O campo Estadia deve estar vazio", "", jTextEstadia.getText());  
    
    assertNotNull("O campo Data Checkout deve ser inicializado", jTextCheckout);
    assertEquals("O campo Data Checkout deve estar vazio", "", jTextCheckout.getText());  
    
    assertNotNull("O campo Valor Final deve ser inicializado", jTextValorFinal);
    assertEquals("O campo Valor Final deve estar vazio", "", jTextValorFinal.getText());  
    }
    
}
