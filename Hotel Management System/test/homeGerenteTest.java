
import java.lang.reflect.Field;
import javax.swing.JButton;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author mirela
 */
public class homeGerenteTest {
    private homeGerente homeGerenteFrame;
    
    @Before
    public void setUp() {
    // Inicializa home frame antes de cada teste
    homeGerenteFrame = new homeGerente();
    }
    
    @Test
    public void testBtnHospedes() throws NoSuchFieldException, IllegalAccessException {
    // Acessar o campo privado do botão Entrar 
    Field btnHospedesField = homeGerenteFrame.getClass().getDeclaredField("btnHospedes");
    btnHospedesField.setAccessible(true); 
    JButton btnHospedes = (JButton) btnHospedesField.get(homeGerenteFrame);

    assertNotNull("O botão Hospedes deve ser inicializado", btnHospedes);
    assertTrue("O botão Hospedes deve ser visivel", btnHospedes.isVisible());
    assertEquals("O texto do botão deve ser 'Hóspedes'", "Hóspedes", btnHospedes.getText());
    }
    
    @Test
    public void testBtnCheckin() throws NoSuchFieldException, IllegalAccessException {
    // Acessar o campo privado do botão Entrar 
    Field btnCheckinField = homeGerenteFrame.getClass().getDeclaredField("btnCheckin");
    btnCheckinField.setAccessible(true); 
    JButton btnCheckin = (JButton) btnCheckinField.get(homeGerenteFrame);

    assertNotNull("O botão Checkin deve ser inicializado", btnCheckin);
    assertTrue("O botão Checkin deve ser visivel", btnCheckin.isVisible());
    assertEquals("O texto do botão deve ser 'Check In'", "Check In", btnCheckin.getText());
    }
    
    @Test
    public void testBtnCheckout() throws NoSuchFieldException, IllegalAccessException {
    // Acessar o campo privado do botão Entrar 
    Field btnCheckoutField = homeGerenteFrame.getClass().getDeclaredField("btnCheckout");
    btnCheckoutField.setAccessible(true); 
    JButton btnCheckout = (JButton) btnCheckoutField.get(homeGerenteFrame);

    assertNotNull("O botão Checkout deve ser inicializado", btnCheckout);
    assertTrue("O botão Checkout deve ser visivel", btnCheckout.isVisible());
    assertEquals("O texto do botão deve ser 'Check Out'", "Check Out", btnCheckout.getText());
    }
    
    @Test
    public void testReservas() throws NoSuchFieldException, IllegalAccessException {
    // Acessar o campo privado do botão Reservas 
    Field btnReservasField = homeGerenteFrame.getClass().getDeclaredField("btnReservas");
    btnReservasField.setAccessible(true); 
    JButton btnReservas = (JButton) btnReservasField.get(homeGerenteFrame);

    assertNotNull("O botão Reservas deve ser inicializado", btnReservas);
    assertTrue("O botão Reservas deve ser visivel", btnReservas.isVisible());
    assertEquals("O texto do botão deve ser 'Reservas'", "Reservas", btnReservas.getText());
    }
    
    @Test
    public void testFuncionarios() throws NoSuchFieldException, IllegalAccessException {
    // Acessar o campo privado do botão Entrar 
    Field btnFuncionariosField = homeGerenteFrame.getClass().getDeclaredField("btnFuncionarios");
    btnFuncionariosField.setAccessible(true); 
    JButton btnFuncionarios = (JButton) btnFuncionariosField.get(homeGerenteFrame);
    
    assertNotNull("O botão Funcionarios deve ser inicializado", btnFuncionarios);
    assertTrue("O botão Funcionarios deve ser visivel", btnFuncionarios.isVisible());
    assertEquals("O texto do botão deve ser 'Funcionários'", "Funcionários", btnFuncionarios.getText());
    }
    
    @Test
    public void testQuartos() throws NoSuchFieldException, IllegalAccessException {
    // Acessar o campo privado do botão Quartos
    Field btnQuartosField = homeGerenteFrame.getClass().getDeclaredField("btnQuartos");
    btnQuartosField.setAccessible(true); 
    JButton btnQuartos = (JButton) btnQuartosField.get(homeGerenteFrame);

    assertNotNull("O botão Quartos deve ser inicializado", btnQuartos);
    assertTrue("O botão Quartos deve ser visivel", btnQuartos.isVisible());
    assertEquals("O texto do botão deve ser 'Quartos'", "Quartos", btnQuartos.getText());
    }
    
    @Test
    public void testSair() throws NoSuchFieldException, IllegalAccessException {
    // Acessar o campo privado do botão Entrar 
    Field btnSairField = homeGerenteFrame.getClass().getDeclaredField("btnSair");
    btnSairField.setAccessible(true); 
    JButton btnSair = (JButton) btnSairField.get(homeGerenteFrame);

    assertNotNull("O botão Sair deve ser inicializado", btnSair);
    assertTrue("O botão Sair deve ser visivel", btnSair.isVisible());
    assertEquals("O texto do botão deve ser 'Sair'", "Sair", btnSair.getText());
    }
    

}
