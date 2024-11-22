package project;

import org.junit.Before;
import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static org.junit.Assert.*;

public class ConnectionProviderTest {

    private ConnectionProvider connectionProvider;

    @Before
    public void setUp() {
        connectionProvider = new ConnectionProvider();
    }

    @Test
    public void testGetConSuccesso() {
        try {
            // Tenta obter uma conexão do banco de dados
            Connection con = connectionProvider.getCon();
            
            // Verifica se a conexão não é nula
            assertNotNull("A conexão não deve ser nula", con);
            
            // Verifica se a conexão está válida
            assertTrue("A conexão deve ser válida", con.isValid(2));

            // Fecha a conexão após o teste
            con.close();
        } catch (SQLException e) {
            fail("Ocorreu um erro durante a conexão com o banco de dados: " + e.getMessage());
        }
    }

    @Test
    public void testGetConFalha() {
        // Testa a falha de conexão simulando uma configuração inválida
        try {
            // Cria um ConnectionProvider que apontaria para um banco inválido ou inacessível
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:9999/invalidDB", "root", "wrongPassword");
            assertNull("A conexão deveria ser nula em caso de falha", con);
        } catch (SQLException e) {
            // Verifica que a exceção foi lançada corretamente
            assertTrue("Esperado SQLException ao tentar conexão inválida", e.getMessage().contains("Communications link failure"));
        }
    }
}
