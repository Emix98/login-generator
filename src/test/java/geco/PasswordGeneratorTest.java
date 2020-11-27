package geco;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PasswordGeneratorTest {

    PasswordGenerator pg;

    @Before
    public void setUp() {
        pg = new PasswordGenerator();
    }

    @Test
    public void getRandomPasswordTest() {
        String passwordGenerated = pg.getRandomPassword();
        String regex = "[!-}]{8}";
        assertTrue("Le mot de passe n'a pas la bonne forme", passwordGenerated.matches(regex));
    }
}