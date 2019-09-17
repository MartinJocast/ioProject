package fr.formation.inti.io.buffered;
 
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
 
/**
 * Si vous voulez lire chaque ligne de données d'un fichier texte. BufferedReader est un bon choix.
 * 
 * @author pc
 *
 */
public class BufferedWriterHelper {
 
    public static void main(String[] args) throws IOException {
 
    	// Créez l'objet Writer.
    	Writer w=new FileWriter("out/test_multi_lines.txt");
    	// Créez un objet BufferedWriter enveloppe (wrap) un writer.
    	BufferedWriter bw=new BufferedWriter(w);
    	 
    	bw.write("Bonjour..");
    	 
    	// Écrivez une nouvelle ligne de caractères '\n'.
    	bw.newLine();
    	bw.write("Les amis!!");
    	bw.newLine();
    	bw.write("fin programme");
    	//il faut fermer le flux d'ecriture
    	bw.close();
    }
 
}