package timesheet;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author lyes
 */
public class EcrireFichier {
    
 /** METHODE outputFile
 *
 * @author lyes
 */ 
    
    static void fichierResultat(String jsonContent,String cheminDuFichier){
   			
    File file = new File(cheminDuFichier);

    try {
        if (!file.exists()) {
            file.createNewFile();
        }
            FileWriter writer = new FileWriter(file);
            writer.write(jsonContent);
            writer.flush();
            writer.close();
    } catch (IOException e) {
            System.out.println("Erreur: impossible de créer le fichier '"
                            + cheminDuFichier + "'");
    }
 } 
    
}
