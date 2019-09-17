package fr.formation.inti.io.buffered;
 
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
 
// Cet exemple, lire plusieurs caractères en une fois.
public class HelloReader2 {
 
    public static void main(String[] args) throws IOException {
 
        // Créez un objet Reader pour lire un ficher.
        // Avec l'encodage (encoding) par défaut.
        Reader r = new FileReader("test_reader.txt");
        // Créer un tableau de caractères temporaire.
        char[] temp = new char[10];
        int i = -1;
 
        // La méthode read(char[]):
        // Lire plusieurs caractères à la fois et leur attribuer des éléments du tableau.
        // Renvoyer le nombre de caractères lus.
        // Ou renvoie -1 si la fin du flux (stream) termine.
        while ((i = r.read(temp)) != -1) {
            String s = new String(temp, 0, i);
            System.out.println(s);
        }
        r.close(); 
    }
 
}