import java.io.*;

public class FileExample {
    public static void main(String[] args) {
        try {
            // Ouverture du fichier en entrée
            FileInputStream inputFile = new FileInputStream("input.txt");
            
            // Ouverture du fichier en sortie
            FileOutputStream outputFile = new FileOutputStream("output.txt");
            
            // Tampon de lecture
            byte[] buffer = new byte[1024];
            
            // Lecture des données du fichier en entrée et écriture des données dans le fichier en sortie
            int bytesRead;
            while ((bytesRead = inputFile.read(buffer)) != -1) {
                outputFile.write(buffer, 
/*La méthode read() lit les données byte par byte. Pour lire les données de manière plus efficace, nous pouvons utiliser un tampon de lecture (buffer).
