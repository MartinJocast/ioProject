package fr.formation.inti.io.buffered;
 
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
 
public class HelloWriter2 {
 
    public static void main(String[] args) throws IOException {
 
        File dir = new File("C:/test");
        // Créez le répertoire 'C:/test' s'il n'existe pas.
        dir.mkdirs();
 
        // Créez un objet Writer pour écrire les données dans le fichier.
        Writer w = new FileWriter("C:/test/test_writer2.txt");
 
        // 
        char[] chars = new char[] { 'H', 'e', 'l', 'l', 'o', //
                ' ', 'w', 'r', 'i', 't', 'e', 'r' };
 
        // Écrivez tous les caractères dans le flux.
        w.write(chars);
 
        // Java utilise souvent des tampons (buffer)
        // pour stocker temporairement des données.
        // Lorsque le tampon (buffer) est plein,  il vide (flush) les données dans le fichier.
        // Vous pouvez vider (flush) les données de manière proactive dans le fichier.
        w.flush();
 
        w.write('\n');
 
        String s = "FileWriter";
 
        // Ghi một chuỗi vào luồng (stream).
        w.write(s);
 
 
        w.close();
    }
}