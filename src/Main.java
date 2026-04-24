import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int totalWords = 0;

        try {
            // Chemin du fichier (à adapter)
            File file = new File("testExercice3.txt");
            Scanner scanner = new Scanner(file);

            // Lire ligne par ligne
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                // Ignorer les lignes vides
                if (!line.trim().isEmpty()) {

                    // Séparer par espace
                    String[] words = line.trim().split(" ");

                    // Ajouter le nombre de mots
                    totalWords += words.length;
                }
            }

            scanner.close();

            // Résultat final
            System.out.println("Nombre total de mots : " + totalWords);

        } catch (FileNotFoundException e) {
            System.out.println("Fichier non trouvé !");
        }
    }
}