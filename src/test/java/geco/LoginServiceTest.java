package geco;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LoginServiceTest {

    LoginService loginService;

    @Before
    public void setUp() throws Exception {
        String[] loginsExistants = {"Xx_D4rkToto_du_69_xX", "Xx_ZeB35T_xX", "RobertPatachon"};
        loginService = new LoginService(loginsExistants);
    }

    @Test
    public void testLoginExists() {
        assertTrue("Ce login devrait exister", loginService.loginExists("RobertPatachon"));
    }

    @Test
    public void testLoginDoesNotExist() {
        assertFalse("Ce login ne devrait pas exister", loginService.loginExists("KillerRabbit"));
    }

    @Test
    public void testAddLogin() {
        loginService.addLogin("KillerRabbit");
        assertTrue("Le login \"Killer Rabbit\" devrait exister", loginService.loginExists("KillerRabbit"));
        // ^ On ne devrait pas tester une méthode en utilisant une méthode qui doit elle-même être testée,
        // mais vu qu'on ne peut pas accéder à loginService.loginsExistants d'une quelconque façon...
    }

    @Test
    public void findAllLoginsStartingWith() {
        String[] resultatsAttendus = {"Xx_D4rkToto_du_69_xX", "Xx_ZeB35T_xX"};
        assertArrayEquals("Les deux listes devraient être identiques", resultatsAttendus, loginService.findAllLoginsStartingWith("Xx").toArray());
    }

    @Test
    public void findAllLogins() {
        String[] resultatsAttendus = {"RobertPatachon", "Xx_D4rkToto_du_69_xX", "Xx_ZeB35T_xX"};
        assertArrayEquals("Les deux listes devraient être identiques", resultatsAttendus, loginService.findAllLogins().toArray());
    }
}