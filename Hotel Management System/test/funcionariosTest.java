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
    
public class funcionariosTest {
private funcionarios funcionariosFrame;
    
        
@Before
    public void setUp() {
    // Inicializa o funcionarios frame antes de cada teste 
    funcionariosFrame = new funcionarios();
    }
    
@Test
    public void testBtnAtualizar() throws NoSuchFieldException, IllegalAccessException {
    // Acessar o campo privado do botão Atualizar
    Field BtnAtualizarField = funcionariosFrame.getClass().getDeclaredField("BtnAtualizar");
    BtnAtualizarField.setAccessible(true); 
    JButton BtnAtualizar = (JButton) BtnAtualizarField.get(funcionariosFrame);

    assertNotNull("O botão Atualizar deve ser inicializado", BtnAtualizar);
    assertTrue("O botão Atualizar deve ser visivel", BtnAtualizar.isVisible());
    assertEquals("O texto do botão deve ser 'Atualizar'", "Atualizar", BtnAtualizar.getText());
    }
    
@Test
    public void testBuscarBtn() throws NoSuchFieldException, IllegalAccessException {
    // Acessar o campo privado do botão Buscar 
    Field BuscarBtnField = funcionariosFrame.getClass().getDeclaredField("BuscarBtn");
    BuscarBtnField.setAccessible(true); 

    JButton BuscarBtn = (JButton) BuscarBtnField.get(funcionariosFrame);

    assertNotNull("O botão Buscar deve ser inicializado", BuscarBtn);
    assertTrue("O botão Buscar deve ser visivel", BuscarBtn.isVisible());
    assertEquals("O texto do botão deve ser 'Buscar'", "Buscar", BuscarBtn.getText());
    }
    
@Test
    public void testCamposIniciaisHospede() throws NoSuchFieldException, IllegalAccessException {    
    // Acessar os campos privados do Email
    Field jTextFieldEmailField = funcionariosFrame.getClass().getDeclaredField("jTextFieldEmail");
    jTextFieldEmailField.setAccessible (true);
    JTextField jTextFieldEmail = (JTextField) jTextFieldEmailField.get(funcionariosFrame); 
    
    // Acessar os campos privados do Nome
    Field jTextFieldNomeField = funcionariosFrame.getClass().getDeclaredField("jTextFieldNome");
    jTextFieldNomeField.setAccessible (true);
    JTextField jTextFieldNome = (JTextField) jTextFieldNomeField.get(funcionariosFrame);
    
    // Acessar os campos privados do Endereço
    Field jTextEnderecoField = funcionariosFrame.getClass().getDeclaredField("jTextEndereco");
    jTextEnderecoField.setAccessible (true);
    JTextField jTextEndereco = (JTextField) jTextEnderecoField.get(funcionariosFrame);
    
    // Acessar os campos privados do Telefone
    Field jTextTelField = funcionariosFrame.getClass().getDeclaredField("jTextTel");
    jTextTelField.setAccessible (true);
    JTextField jTextTel = (JTextField) jTextTelField.get(funcionariosFrame);
    
    // Acessar os campos privados do CPF
    Field jTextCPFField = funcionariosFrame.getClass().getDeclaredField("jTextCPF");
    jTextCPFField.setAccessible (true);
    JTextField jTextCPF = (JTextField) jTextCPFField.get(funcionariosFrame);
    
    //Acessar os campos do ComboBox
    Field jComboBoxFuncaoField = funcionariosFrame.getClass().getDeclaredField("jComboBoxFuncao");
    jComboBoxFuncaoField.setAccessible (true);
    JComboBox jComboBoxFuncao = (JComboBox) jComboBoxFuncaoField.get(funcionariosFrame);
    
    assertNotNull("O campo email deve ser inicializado", jTextFieldEmail);
    assertEquals("O campo email deve estar vazio", "", jTextFieldEmail.getText());
    
    assertNotNull("O campo nome deve ser inicializado", jTextFieldNome);
    assertEquals("O campo nome deve estar vazio", "", jTextFieldNome.getText());
    
    assertNotNull("O campo Endereço deve ser inicializado", jTextEndereco);
    assertEquals("O campo Endereço deve estar vazio", "", jTextEndereco.getText());
     
    assertNotNull("O campo Telefone deve ser inicializado", jTextTel);
    assertEquals("O campo Telefone deve estar vazio", "", jTextTel.getText());
    
    assertNotNull("O campo CPF deve ser inicializado", jTextCPF);
    assertEquals("O campo CPF deve estar vazio", "", jTextCPF.getText()); 
    
    // Checa o combo box
    assertNotNull("O combo box deve ser inicializado", jComboBoxFuncao);
    assertEquals("Role combo deve estar no 'Funcionário'", "Funcionário", jComboBoxFuncao.getSelectedItem());
    
    
    }
}
