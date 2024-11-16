
import java.lang.reflect.Field;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author mirela
 */
public class signupTest {
    private signup signupFrame;
    
    @Before
    public void setUp() {
        // Initialize the login frame before each test
        signupFrame = new signup();
    }
    @Test
    public void testLoginButton() throws NoSuchFieldException, IllegalAccessException {
    // Acessar o campo privado do botão Entrar 
    Field btnEntrarField = signupFrame.getClass().getDeclaredField("btnEntrar");
    btnEntrarField.setAccessible(true); 

    JButton btnEntrar = (JButton) btnEntrarField.get(signupFrame);

    assertNotNull("O botão login deve ser inicializado", btnEntrar);
    assertTrue("O botão login deve ser visivel", btnEntrar.isVisible());
    assertEquals("O texto do botão deve ser 'Entrar'", "Entrar", btnEntrar.getText());
    }
    
    @Test
    public void testEsqueciSenhaButton() throws NoSuchFieldException, IllegalAccessException  {
        //Acessar o campo privado do botão EsqueciSenha
        Field btnEsqueciSenhaField = signupFrame.getClass().getDeclaredField("btnEsqueciSenha");
        btnEsqueciSenhaField.setAccessible(true); 
        JButton btnEsqueciSenha = (JButton) btnEsqueciSenhaField.get(signupFrame);
    
        
        assertNotNull("O botão Esqueci Senha deve ser inicializado", btnEsqueciSenha);
        assertTrue("O botão Esqueci Senha deve ser visível", btnEsqueciSenha.isVisible());
        assertEquals("O texto do botão deve ser 'Esqueci a Senha'", "Esqueci a Senha", btnEsqueciSenha.getText());
    }
       
    @Test
    public void testCadastrarButton() throws NoSuchFieldException, IllegalAccessException  {
    //Acessar o campo privado do botão Cadastrar
    Field btnCadastrarField = signupFrame.getClass().getDeclaredField("btnCadastrar");
    btnCadastrarField.setAccessible(true); 
    JButton btnCadastrar = (JButton) btnCadastrarField.get(signupFrame);
        
    assertNotNull("O botão Cadastrar deve ser inicializado", btnCadastrar);
    assertTrue("O botão Cadastrar deve ser visivel", btnCadastrar.isVisible());
    assertEquals("O texto do botão deve ser 'Cadastrar'", "Cadastrar", btnCadastrar.getText());
    }
    
    @Test
    public void testCamposIniciais() throws NoSuchFieldException, IllegalAccessException {
        
    // Acessar os campos privados do Nome
    Field jTextNomeField = signupFrame.getClass().getDeclaredField("jTextNome");
    jTextNomeField.setAccessible (true);
    JTextField jTextNome = (JTextField) jTextNomeField.get(signupFrame);
        
    // Acessar os campos privados do Email
    Field jTextEmailField = signupFrame.getClass().getDeclaredField("jTextEmail");
    jTextEmailField.setAccessible (true);
    JTextField jTextEmail = (JTextField) jTextEmailField.get(signupFrame);
        
    //Acessar os campos da Senha
    Field jPasswordField1Field = signupFrame.getClass().getDeclaredField("jPasswordField1");
    jPasswordField1Field.setAccessible (true);
    JPasswordField jPasswordField1 = (JPasswordField) jPasswordField1Field.get(signupFrame);
        
    //Acessar os campos do ComboBoxPergunta
    Field jComboBoxPerguntaField = signupFrame.getClass().getDeclaredField("jComboBoxPergunta");
    jComboBoxPerguntaField.setAccessible (true);
    JComboBox jComboBoxPergunta = (JComboBox) jComboBoxPerguntaField.get(signupFrame);
        
    // Acessar os campos privados da Resposta
    Field jTextRespostaField = signupFrame.getClass().getDeclaredField("jTextResposta");
    jTextRespostaField.setAccessible (true);
    JTextField jTextResposta = (JTextField) jTextRespostaField.get(signupFrame);
        
    // Acessar os campos privados do Endereco
    Field jTextEnderecoField = signupFrame.getClass().getDeclaredField("jTextEndereco");
    jTextEnderecoField.setAccessible (true);
    JTextField jTextEndereco = (JTextField) jTextEnderecoField.get(signupFrame);
        
    //Acessar os campos do ComboBoxFuncao
    Field jComboBoxFuncaoField = signupFrame.getClass().getDeclaredField("jComboBoxFuncao");
    jComboBoxFuncaoField.setAccessible (true);
    JComboBox jComboBoxFuncao = (JComboBox) jComboBoxFuncaoField.get(signupFrame);
        
        
    // Checar estado inicial dos campos nome,email,senha,resposta e endereco
        
    assertNotNull("O campo nome deve ser inicializado", jTextNome);
    assertEquals("O campo nome deve estar vazio", "", jTextNome.getText());
        
    assertNotNull("O campo email deve ser inicializado", jTextEmail);
    assertEquals("O campo email deve estar vazio", "", jTextEmail.getText());

    assertNotNull("O campo senha deve ser inicializado", jPasswordField1);
    assertEquals("O campo senha deve estar vazio", "", new String(jPasswordField1.getPassword()));
        
    assertNotNull("O campo resposta deve ser inicializado", jTextResposta);
    assertEquals("O campo resposta deve estar vazio", "", jTextResposta.getText());
        
    assertNotNull("O campo endereco deve ser inicializado", jTextEndereco);
    assertEquals("O campo endereco deve estar vazio", "", jTextEndereco.getText());

    //Checa os combo box
    assertNotNull("O combo box deve ser inicializado", jComboBoxPergunta);
    assertEquals("Role combo deve estar no 'Qual o nome do seu primeiro pet?'", "Qual o nome do seu primeiro pet?", jComboBoxPergunta.getSelectedItem());
        
    assertNotNull("O combo box deve ser inicializado", jComboBoxFuncao);
    assertEquals("Role combo deve estar no 'Gerente'", "Gerente", jComboBoxFuncao.getSelectedItem());
    }
    
    
}
