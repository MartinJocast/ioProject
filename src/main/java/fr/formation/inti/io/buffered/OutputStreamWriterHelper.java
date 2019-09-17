package fr.formation.inti.io.buffered;
 
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
/**
 * Vous avez un flux binaire (binary stream). 
 * ET vous voulez le convertir en un flux des caractères (character stream)? 
 * @author pc
 *
 */
public class OutputStreamWriterHelper {
 
    public static void main(String[] args) throws IOException {
         
        // Créez un OutputStream (un flux de sortie) pour écrire des données dans un fichier.
        OutputStream out = new FileOutputStream("out/test_write_utf8.txt");
 
        // Créez un Character Stream (un flux de caractères) qui contient ce OutputStream en haut.
        // Le codage (encoding) utilisé est UTF-8.
        Writer writer = new OutputStreamWriter(out, "UTF-8");
 
        String s = "صباح الخير";
        writer.write(s);
        writer.close();
    }
 
}