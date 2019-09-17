package fr.formation.inti.io.buffered;
 
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
/**
 * Writer est une classe abstraite, elle est la classe de base de flux de caractères. 
 * @author pc
 *
 */
public class HelloWriter {
 
    public static void main(String[] args) throws IOException {
        File dir = new File("out/char");
 
        // Créez le répertoire 'C:/test', s'il n'existe pas.
        dir.mkdirs();
 
        // Créez un objet Writer, pour écrire des données dans le fichier.
        // En utilisant de l'encodage (encoding).
        Writer w = new FileWriter("out/char/test_writer.txt");
 
        // Le tableau de caractères
        char[] chars = new char[] { 'H', 'e', 'l', 'l', 'o', // 
                ' ', 'w', 'r', 'i', 't', 'e', 'r' };
 
        // Écrivez respectivement des caractères dans le flux (stream).
        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];
            int j = (int) ch;
            // 
            w.write(j);
        }
        // Fermez le flux (Close stream),
        w.close();
    }
}