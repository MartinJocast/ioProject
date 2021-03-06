package fr.formation.inti.io.buffered;
 
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
 
/**
 * Si vous voulez lire chaque ligne de données d'un fichier texte. BufferedReader est un bon choix.
 * 
 * @author pc
 *
 */
public class BufferedReaderHelper {
 
    public static void main(String[] args) throws IOException {
 
        InputStream in = new FileInputStream("out/test_multi_lines.txt");
        Reader reader = new InputStreamReader(in, "UTF-8");
        BufferedReader br = new BufferedReader(reader);
 
        String s = null;
        int i = 0;
 
        // Lire chaque ligne (line) de données.
        // S'il renvoie null, cela signifie de la termination du Stream.
        while ((s = br.readLine()) != null) {
            i++;
            System.out.println(i + " : " + s);
        }
        br.close();
    }
 
}