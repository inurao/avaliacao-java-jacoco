// src/test/java/auth/LoginServiceTest.java
package auth;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LoginServiceTest {
    LoginService login = new LoginService();

    @Test
    public void testLoginCorreto() {
        assertTrue(login.autenticar("admin", "1234"));
    }

    @Test
    public void testLoginIncorreto() {
        assertFalse(login.autenticar("admin", "senhaErrada"));
        assertFalse(login.autenticar("usuarioInvalido", "1234"));
    }

    @Test
    public void testUsuarioNulo() {
        assertFalse(login.autenticar(null, "1234"));
    }

    @Test
    public void testSenhaNula() {
        assertFalse(login.autenticar("admin", null));
    }
}
