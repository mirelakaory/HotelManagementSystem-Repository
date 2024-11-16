
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
public class forgotPasswordTest {
    private forgotPassword fpFrame;
    
    @Before
    public void setUp() {
        // Initialize the login frame before each test
        fpFrame = new forgotPassword();
    }
    
    @Test
    public void testLoginButton() throws NoSuchFieldException, IllegalAccessException {
    // Acessar o campo privado do botão Entrar 
    Field btnEntrarField = fpFrame.getClass().getDeclaredField("btnEntrar");
    btnEntrarField.setAccessible(true); 
    JButton btnEntrar = (JButton) btnEntrarField.get(fpFrame);

    assertNotNull("O botão login deve ser inicializado", btnEntrar);
    assertTrue("O botão login deve ser visivel", btnEntrar.isVisible());
    assertEquals("O texto do botão deve ser 'Entrar'", "Entrar", btnEntrar.getText());
    }
    
    @Test
    public void testSalvarButton() throws NoSuchFieldException, IllegalAccessException  {
    //Acessar o campo privado do botão EsqueciSenha
    Field btnSalvarField = fpFrame.getClass().getDeclaredField("btnSalvar");
    btnSalvarField.setAccessible(true); 
    JButton btnSalvar = (JButton) btnSalvarField.get(fpFrame);
        
    assertNotNull("O botão Salvar deve ser inicializado", btnSalvar);
    assertTrue("O botão Salvar deve ser visível", btnSalvar.isVisible());
    assertEquals("O texto do botão deve ser 'Salvar'", "Salvar", btnSalvar.getText());
    }
    
    @Test
    public void testCadastrarButton() throws NoSuchFieldException, IllegalAccessException  {
    //Acessar o campo privado do botão Cadastrar
    Field btnCadastrarField = fpFrame.getClass().getDeclaredField("btnCadastrar");
    btnCadastrarField.setAccessible(true); 
    JButton btnCadastrar = (JButton) btnCadastrarField.get(fpFrame);
        
    assertNotNull("O botão Cadastrar deve ser inicializado", btnCadastrar);
    assertTrue("O botão Cadastrar deve ser visivel", btnCadastrar.isVisible());
    assertEquals("O texto do botão deve ser 'Cadastrar'", "Cadastrar", btnCadastrar.getText());
    }
    
    @Test
    public void testBuscarButton() throws NoSuchFieldException, IllegalAccessException  {
    //Acessar o campo privado do botão Buscar
    Field btnBuscarField = fpFrame.getClass().getDeclaredField("btnBuscar");
    btnBuscarField.setAccessible(true); 
    JButton btnBuscar = (JButton) btnBuscarField.get(fpFrame);
        
    assertNotNull("O botão Buscar deve ser inicializado", btnBuscar);
    assertTrue("O botão Buscar deve ser visivel", btnBuscar.isVisible());
    assertEquals("O texto do botão deve ser 'Buscar'", "Buscar", btnBuscar.getText());
    }
    
    @Test
    public void testCamposIniciais() throws NoSuchFieldException, IllegalAccessException {
        
    // Acessar os campos privados do Email
    Field jTextEmailField = fpFrame.getClass().getDeclaredField("jTextEmail");
    jTextEmailField.setAccessible (true);
    JTextField jTextEmail = (JTextField) jTextEmailField.get(fpFrame);
        
    // Acessar os campos privados da Pergunta de Segurança
    Field jTextPerguntaField = fpFrame.getClass().getDeclaredField("jTextPergunta");
    jTextPerguntaField.setAccessible (true);
    JTextField jTextPergunta = (JTextField) jTextPerguntaField.get(fpFrame);
    
    // Acessar os campos privados da Resposta
    Field jTextRespostaField = fpFrame.getClass().getDeclaredField("jTextResposta");
    jTextRespostaField.setAccessible (true);
    JTextField jTextResposta = (JTextField) jTextRespostaField.get(fpFrame);
    
    //Acessar os campos da Senha Nova
    Field jPasswordSenhaNovaField = fpFrame.getClass().getDeclaredField("jPasswordSenhaNova");
    jPasswordSenhaNovaField.setAccessible (true);
    JPasswordField jPasswordSenhaNova = (JPasswordField) jPasswordSenhaNovaField.get(fpFrame);
        
    // Checar estado inicial dos campos nome,email,senha,resposta e endereco
    assertNotNull("O campo email deve ser inicializado", jTextEmail);
    assertEquals("O campo email deve estar vazio", "", jTextEmail.getText());

    assertNotNull("O campo senha nova deve ser inicializado", jPasswordSenhaNova);
    assertEquals("O campo senha nova deve estar vazio", "", new String(jPasswordSenhaNova.getPassword()));
        
    assertNotNull("O campo resposta deve ser inicializado", jTextResposta);
    assertEquals("O campo resposta deve estar vazio", "", jTextResposta.getText());
        
    assertNotNull("O campo Pergunta deve ser inicializado", jTextPergunta);
    assertEquals("O campo Pergunta deve estar vazio", "", jTextPergunta.getText());

    }
}
