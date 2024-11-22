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
public class quartosTest {
    private quartos quartosFrame;
    
        
@Before
    public void setUp() {
    // Inicializa o checkin frame antes de cada teste 
    quartosFrame = new quartos();
    }
 
@Test
    public void testAddQuartoBtn() throws NoSuchFieldException, IllegalAccessException {
    // Acessar o campo privado do botão Entrar 
    Field addQuartoBtnField =  quartosFrame.getClass().getDeclaredField("addQuartoBtn");
    addQuartoBtnField.setAccessible(true); 

    JButton addQuartoBtn = (JButton) addQuartoBtnField.get(quartosFrame);

    assertNotNull("O botão Adicionar Quarto deve ser inicializado", addQuartoBtn);
    assertTrue("O botão Adicionar Quarto deve ser visivel", addQuartoBtn.isVisible());
    assertEquals("O texto do botão deve ser 'Adicionar Quarto'", "Adicionar Quarto", addQuartoBtn.getText());
    }

@Test
    public void testCamposIniciais() throws NoSuchFieldException, IllegalAccessException {
    // Acessar os campos privados do Num. do Quarto
    Field jTextNumQuartoField = quartosFrame.getClass().getDeclaredField("jTextNumQuarto");
    jTextNumQuartoField.setAccessible (true);
    JTextField jTextNumQuarto = (JTextField) jTextNumQuartoField.get(quartosFrame);
    
    // Acessar os campos privados do Preço
    Field jTextPrecoField = quartosFrame.getClass().getDeclaredField("jTextPreco");
    jTextPrecoField.setAccessible (true);
    JTextField jTextPreco = (JTextField) jTextPrecoField.get(quartosFrame);
    
    //Acessar os campos do ComboBox Tipo de Quarto
    Field jComboTipoQuartoField = quartosFrame.getClass().getDeclaredField("jComboTipoQuarto");
    jComboTipoQuartoField.setAccessible (true);
    JComboBox jComboTipoQuarto = (JComboBox) jComboTipoQuartoField.get(quartosFrame);
    
    //Acessar os campos do ComboBox Cama
    Field jComboCamaField = quartosFrame.getClass().getDeclaredField("jComboCama");
    jComboCamaField.setAccessible (true);
    JComboBox jComboCama = (JComboBox) jComboCamaField.get(quartosFrame);
    
    //Acessar os campos do ComboBox Num. de Pessoas
    Field jComboNumPessoaField = quartosFrame.getClass().getDeclaredField("jComboNumPessoa");
    jComboNumPessoaField.setAccessible (true);
    JComboBox jComboNumPessoa = (JComboBox) jComboNumPessoaField.get(quartosFrame);
    
    // Checar estado inicial dos campos Num do Quarto e Preco
    assertNotNull("O campo Num do Quarto deve ser inicializado", jTextNumQuarto);
    assertEquals("O campo Num do Quarto deve estar vazio", "", jTextNumQuarto.getText());

    assertNotNull("O campo Preco deve ser inicializado", jTextPreco);
    assertEquals("O campo Preco  deve estar vazio", "", jTextPreco.getText());
    
    // Checa o combo box
    assertNotNull("O combo box deve ser inicializado", jComboTipoQuarto);
    assertEquals("Role combo deve estar no 'Fumante'", "Fumante", jComboTipoQuarto.getSelectedItem());

    assertNotNull("O combo box deve ser inicializado", jComboCama);
    assertEquals("Role combo deve estar no 'Solteiro", "Solteiro", jComboCama.getSelectedItem());

    assertNotNull("O combo box deve ser inicializado", jComboNumPessoa);
    assertEquals("Role combo deve estar no '1'", "1", jComboNumPessoa.getSelectedItem());
    
}
}
    
