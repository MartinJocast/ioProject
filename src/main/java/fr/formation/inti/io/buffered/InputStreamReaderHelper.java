package fr.formation.inti.io.buffered;
 
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
/**
 * Vous avez un flux binaire (binary stream). 
 * ET vous voulez le convertir en un flux des caractères (character stream)?  
 * @author pc
 *
 */
public class InputStreamReaderHelper {
 
    public static void main(String[] args) throws IOException {
 
        // Créez un binary Stream (un flux binaire), pour lire un fichier.
        InputStream in = new FileInputStream("out/test_outReader.txt");
 
        // Créez un Character stream (un flux de caractères) enveloppe (wrap) ce le dit flux binaire.
        // Avec le codage (encoding) est UTF-8.
        Reader reader = new InputStreamReader(in, "UTF-8");
 
        int i = 0;
        // Lisez respectivement des caractères.
        while ((i = reader.read()) != -1) {
            // Moulez (cast) en un caractère et l'imprimez sur l'écran.
            System.out.println((char) i + " " + i);
        }
        reader.close();
    }
}
