import java.io.*;

public class InputOutputExample {
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

/* NOTE: Dans cet exemple, nous ouvrons un fichier en entrée ("input.txt") et un fichier en sortie ("output.txt"). 
Nous lisons les données du fichier en entrée et les écrivons dans le fichier en sortie. Ensuite, nous fermons les fichiers.
