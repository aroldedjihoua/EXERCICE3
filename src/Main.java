import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Variable pour stocker le nombre total de mots
        int totalWords = 0;

        try {
            // Création d'un objet File représentant le fichier à lire
            //  Le fichier doit se trouver dans le bon dossier (racine du projet ou chemin absolu)
            File file = new File("testExercice3.txt");

            // Scanner pour lire le contenu du fichier
            Scanner scanner = new Scanner(file);

            // Boucle pour lire le fichier ligne par ligne
            while (scanner.hasNextLine()) {

                // Lire une ligne complète
                String line = scanner.nextLine();

                // Supprimer les espaces inutiles au début et à la fin
                // et vérifier si la ligne n'est pas vide
                if (!line.trim().isEmpty()) {

                    // Découper la ligne en mots en utilisant l'espace comme séparateur
                    // Exemple : "Bonjour tout le monde" → ["Bonjour", "tout", "le", "monde"]
                    String[] words = line.trim().split(" ");

                    // Ajouter le nombre de mots trouvés dans cette ligne
                    totalWords += words.length;
                }
            }

            // Fermer le scanner pour libérer les ressources
            scanner.close();

            // Afficher le résultat final
            System.out.println("Nombre total de mots : " + totalWords);

        } catch (FileNotFoundException e) {

            // Ce bloc s'exécute si le fichier n'est pas trouvé
            System.out.println("Fichier non trouvé !");
        }
    }
}