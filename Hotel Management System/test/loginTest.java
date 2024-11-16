import org.junit.Before;
import org.junit.Test;
import javax.swing.*;
import static org.junit.Assert.*;
import java.lang.reflect.Field;


public class loginTest {
    private login loginFrame;

    @Before
    public void setUp() {
        // Initialize the login frame before each test
        loginFrame = new login();
    }
    
    @Test
    public void testLoginButton() throws NoSuchFieldException, IllegalAccessException {
    // Acessar o campo privado do botão Entrar 
    Field btnEntrarField = loginFrame.getClass().getDeclaredField("btnEntrar");
    btnEntrarField.setAccessible(true); 

    JButton btnEntrar = (JButton) btnEntrarField.get(loginFrame);

    assertNotNull("O botão login deve ser inicializado", btnEntrar);
    assertTrue("O botão login deve ser visivel", btnEntrar.isVisible());
    assertEquals("O texto do botão deve ser 'Entrar'", "Entrar", btnEntrar.getText());
    }
    
    @Test
    public void testEsqueciSenhaButton() throws NoSuchFieldException, IllegalAccessException  {
        //Acessar o campo privado do botão EsqueciSenha
        Field btnEsqueciSenhaField = loginFrame.getClass().getDeclaredField("btnEsqueciSenha");
        btnEsqueciSenhaField.setAccessible(true); 
        JButton btnEsqueciSenha = (JButton) btnEsqueciSenhaField.get(loginFrame);
    
        
        assertNotNull("O botão Esqueci Senha deve ser inicializado", btnEsqueciSenha);
        assertTrue("O botão Esqueci Senha deve ser visível", btnEsqueciSenha.isVisible());
        assertEquals("O texto do botão deve ser 'Esqueci a Senha'", "Esqueci a Senha", btnEsqueciSenha.getText());
    }

    @Test
    public void testCadastrarButton() throws NoSuchFieldException, IllegalAccessException  {
        //Acessar o campo privado do botão Cadastrar
        Field btnCadastrarField = loginFrame.getClass().getDeclaredField("btnCadastrar");
        btnCadastrarField.setAccessible(true); 

        JButton btnCadastrar = (JButton) btnCadastrarField.get(loginFrame);
        
        // Check if 'Cadastrar' button is present and visible
        assertNotNull("O botão Cadastrar deve ser inicializado", btnCadastrar);
        assertTrue("O botão Cadastrar deve ser visivel", btnCadastrar.isVisible());
        assertEquals("O texto do botão deve ser 'Cadastrar'", "Cadastrar", btnCadastrar.getText());
    }
    
    @Test
    public void testCamposIniciais() throws NoSuchFieldException, IllegalAccessException {
        // Acessar os campos privados do Email
        Field jTextEmailField = loginFrame.getClass().getDeclaredField("jTextEmail");
        jTextEmailField.setAccessible (true);
        JTextField jTextEmail = (JTextField) jTextEmailField.get(loginFrame);
        
        //Acessar os campos da senha
        Field jPasswordField1Field = loginFrame.getClass().getDeclaredField("jPasswordField1");
        jPasswordField1Field.setAccessible (true);
        JPasswordField jPasswordField1 = (JPasswordField) jPasswordField1Field.get(loginFrame);
        
        //Acessar os campos do ComboBox
        Field jComboBoxFuncaoField = loginFrame.getClass().getDeclaredField("jComboBoxFuncao");
        jComboBoxFuncaoField.setAccessible (true);
        JComboBox jComboBoxFuncao = (JComboBox) jComboBoxFuncaoField.get(loginFrame);
        
        
        // Checar estado inicial dos campos email e senha
        assertNotNull("O campo email deve ser inicializado", jTextEmail);
        assertEquals("O campo email deve estar vazio", "", jTextEmail.getText());

        assertNotNull("O campo senha deve ser inicializado", jPasswordField1);
        assertEquals("O campo senha deve estar vazio", "", new String(jPasswordField1.getPassword()));

        // Checa o combo box
        assertNotNull("O combo box deve ser inicializado", jComboBoxFuncao);
        assertEquals("Role combo deve estar no 'Gerente'", "Gerente", jComboBoxFuncao.getSelectedItem());
    }


}
