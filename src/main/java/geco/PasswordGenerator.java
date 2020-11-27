package geco;

import java.util.Random;

/**
 * Classe représentant un générateur de mots de passe.
 */
public class PasswordGenerator {

    /**
     * Générateur d'aléatoire.
     */
    Random rnd;

    /**
     * Construit un Password generator.
     */
    public PasswordGenerator() { rnd = new Random(); }

    /**
     * Génère un mot de passe unique.
     * @return Le mot de passe généré
     */
    public String getRandomPassword() {
        String password = "";
        final char minValidChar = '!';
        final char maxValidChar = '}';
        for (int i = 0 ; i < 8 ; i++) {
            password += (char) (minValidChar + rnd.nextInt(maxValidChar - minValidChar + 1));
        }
        return password;
    }

}
