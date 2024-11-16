
import java.lang.reflect.Field;
import javax.swing.JButton;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author mirela
 */
public class homeTest {
    private home homeFrame;
    
@Before
    public void setUp() {
    // Inicializa home frame antes de cada teste
    homeFrame = new home();
    }

    @Test
    public void testBtnHospedes() throws NoSuchFieldException, IllegalAccessException {
    // Acessar o campo privado do botão Entrar 
    Field btnHospedesField = homeFrame.getClass().getDeclaredField("btnHospedes");
    btnHospedesField.setAccessible(true); 
    JButton btnHospedes = (JButton) btnHospedesField.get(homeFrame);

    assertNotNull("O botão Hospedes deve ser inicializado", btnHospedes);
    assertTrue("O botão Hospedes deve ser visivel", btnHospedes.isVisible());
    assertEquals("O texto do botão deve ser 'Hóspedes'", "Hóspedes", btnHospedes.getText());
    }
    
    @Test
    public void testBtnCheckin() throws NoSuchFieldException, IllegalAccessException {
    // Acessar o campo privado do botão Entrar 
    Field btnCheckinField = homeFrame.getClass().getDeclaredField("btnCheckin");
    btnCheckinField.setAccessible(true); 
    JButton btnCheckin = (JButton) btnCheckinField.get(homeFrame);

    assertNotNull("O botão Checkin deve ser inicializado", btnCheckin);
    assertTrue("O botão Checkin deve ser visivel", btnCheckin.isVisible());
    assertEquals("O texto do botão deve ser 'Check In'", "Check In", btnCheckin.getText());
    }
    
    @Test
    public void testBtnCheckout() throws NoSuchFieldException, IllegalAccessException {
    // Acessar o campo privado do botão Entrar 
    Field btnCheckoutField = homeFrame.getClass().getDeclaredField("btnCheckout");
    btnCheckoutField.setAccessible(true); 
    JButton btnCheckout = (JButton) btnCheckoutField.get(homeFrame);

    assertNotNull("O botão Checkout deve ser inicializado", btnCheckout);
    assertTrue("O botão Checkout deve ser visivel", btnCheckout.isVisible());
    assertEquals("O texto do botão deve ser 'Check Out'", "Check Out", btnCheckout.getText());
    }
    
    @Test
    public void testReservas() throws NoSuchFieldException, IllegalAccessException {
    // Acessar o campo privado do botão Reservas 
    Field btnReservasField = homeFrame.getClass().getDeclaredField("btnReservas");
    btnReservasField.setAccessible(true); 
    JButton btnReservas = (JButton) btnReservasField.get(homeFrame);

    assertNotNull("O botão Reservas deve ser inicializado", btnReservas);
    assertTrue("O botão Reservas deve ser visivel", btnReservas.isVisible());
    assertEquals("O texto do botão deve ser 'Reservas'", "Reservas", btnReservas.getText());
    }
    
    @Test
    public void testQuartos() throws NoSuchFieldException, IllegalAccessException {
    // Acessar o campo privado do botão Quartos
    Field btnQuartosField = homeFrame.getClass().getDeclaredField("btnQuartos");
    btnQuartosField.setAccessible(true); 
    JButton btnQuartos = (JButton) btnQuartosField.get(homeFrame);

    assertNotNull("O botão Quartos deve ser inicializado", btnQuartos);
    assertTrue("O botão Quartos deve ser visivel", btnQuartos.isVisible());
    assertEquals("O texto do botão deve ser 'Quartos'", "Quartos", btnQuartos.getText());
    }
    
    @Test
    public void testSair() throws NoSuchFieldException, IllegalAccessException {
    // Acessar o campo privado do botão Entrar 
    Field btnSairField = homeFrame.getClass().getDeclaredField("btnSair");
    btnSairField.setAccessible(true); 
    JButton btnSair = (JButton) btnSairField.get(homeFrame);

    assertNotNull("O botão Sair deve ser inicializado", btnSair);
    assertTrue("O botão Sair deve ser visivel", btnSair.isVisible());
    assertEquals("O texto do botão deve ser 'Sair'", "Sair", btnSair.getText());
    }
   
    
}
