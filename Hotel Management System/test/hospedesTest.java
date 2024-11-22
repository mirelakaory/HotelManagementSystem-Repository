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
public class hospedesTest {
    private hospedes hospedesFrame;
    
        
@Before
    public void setUp() {
    // Inicializa o hospedes frame antes de cada teste 
    hospedesFrame = new hospedes();
    }
    
@Test
    public void testRegistrarBtn() throws NoSuchFieldException, IllegalAccessException {
    // Acessar o campo privado do botão Registrar 
    Field btnRegistrarField = hospedesFrame.getClass().getDeclaredField("btnRegistrar");
    btnRegistrarField.setAccessible(true); 
    JButton btnRegistrar = (JButton) btnRegistrarField.get(hospedesFrame);

    assertNotNull("O botão Registrar deve ser inicializado", btnRegistrar);
    assertTrue("O botão Registrar deve ser visivel", btnRegistrar.isVisible());
    assertEquals("O texto do botão deve ser 'Registrar'", "Registrar", btnRegistrar.getText());
    }
    
@Test
    public void testCamposIniciaisHospede() throws NoSuchFieldException, IllegalAccessException {    
    // Acessar os campos privados do CPF
    Field jTextCPFField = hospedesFrame.getClass().getDeclaredField("jTextCPF");
    jTextCPFField.setAccessible (true);
    JTextField jTextCPF = (JTextField) jTextCPFField.get(hospedesFrame);
    
    // Acessar os campos privados do Nome
    Field jTextNomeField = hospedesFrame.getClass().getDeclaredField("jTextNome");
    jTextNomeField.setAccessible (true);
    JTextField jTextNome = (JTextField) jTextNomeField.get(hospedesFrame);
    
    // Acessar os campos privados do Endereço
    Field jTextEnderecoField = hospedesFrame.getClass().getDeclaredField("jTextEndereco");
    jTextEnderecoField.setAccessible (true);
    JTextField jTextEndereco = (JTextField) jTextEnderecoField.get(hospedesFrame);
    
    // Acessar os campos privados do Email
    Field jTextEmailField = hospedesFrame.getClass().getDeclaredField("jTextEmail");
    jTextEmailField.setAccessible (true);
    JTextField jTextEmail = (JTextField) jTextEmailField.get(hospedesFrame);
    
    // Acessar os campos privados do Telefone
    Field jTextTelField = hospedesFrame.getClass().getDeclaredField("jTextTel");
    jTextTelField.setAccessible (true);
    JTextField jTextTel = (JTextField) jTextTelField.get(hospedesFrame);
    
    // Acessar os campos privados do Nascimento
    Field jTextNascimentoField = hospedesFrame.getClass().getDeclaredField("jTextNascimento");
    jTextNascimentoField.setAccessible (true);
    JTextField jTextNascimento = (JTextField) jTextNascimentoField.get(hospedesFrame);
    
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
}
