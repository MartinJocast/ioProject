package fr.formation.inti.io.buffered;
 
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
/**
 * Reader est une classe abstraite. c'est la classe de base pour les flux de lecture textes.  
 * @author pc
 *
 */
public class HelloReader {
 
    public static void main(String[] args) throws IOException {
        // Créez un Reader (Le flux textes), pour lire un fichier.
        // Avec le codage (encoding) par défaut.
        Reader r = new FileReader("out/test_outReader.txt");
        int i = -1;
 
        // Lisez chaque caractère à leur tour dans le flux.
        while ((i = r.read()) != -1) {
            // Changez (cast) en caractère.
            System.out.print((char) i);
        }
        r.close();
    } 
}