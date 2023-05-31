import java.io.*;

public class FileExample {
    public static void main(String[] args) {
        try {
            // Ouverture du fichier en entrée
            FileInputStream inputFile = new FileInputStream("input.txt");
            
            // Ouverture du fichier en sortie
            FileOutputStream outputFile = new FileOutputStream("output.txt");
            
            // Lecture des données du fichier en entrée et écriture des données dans le fichier en sortie
            int data;
            while ((data = inputFile.read()) != -1) {
                outputFile.write(data);
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
