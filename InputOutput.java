/*Il est important de noter que la méthode read() lit les données byte par byte.
Pour lire les données de manière plus efficace, nous pouvons utiliser un tampon de lecture (buffer)*/

import java.io.*;

public class InputOutputExample {
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
                outputFile.write(buffer, 0, bytesRead);
            }
            
            // Fermeture des fichiers
            inputFile.close();
            outputFile.close();
            
            System.out.println("Les données ont été copiées avec succès !");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
/*nous utilisons un tampon de lecture de 1024 octets pour lire les données du fichier en entrée. La méthode read() retourne le nombre d'octets lus dans le tampon.
Nous écrivons ensuite ces octets dans le fichier en sortie en utilisant la méthode write().
