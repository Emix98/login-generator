package geco;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LoginGeneratorTest {

    LoginGenerator lg;

    @Before
    public void setUp() throws Exception {
        lg = new LoginGenerator(new LoginService(new String[] {"JROL", "BPER", "CGUR", "JDU", "JRAL", "JRAL1"}));
    }

    @Test
    public void CT1() {
        assertEquals("Le login généré devrait être PDUR", "PDUR", lg.generateLoginForNomAndPrenom("Durand", "Paul"));
    }

    @Test
    public void CT2() {
        assertEquals("Le login généré devrait être JRAL2", "JRAL2", lg.generateLoginForNomAndPrenom("Ralling", "John"));
    }

    @Test
    public void CT3() {
        assertEquals("Le login généré devrait être JROL1", "JROL1", lg.generateLoginForNomAndPrenom("Rolling", "Jean"));
    }

    @Test
    public void CT4() {
        assertEquals("Le login généré devrait être PDUR", "PDUR", lg.generateLoginForNomAndPrenom("Dùrand", "Paul"));
    }

}