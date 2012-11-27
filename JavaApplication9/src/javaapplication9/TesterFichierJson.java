
package timesheet;

import net.sf.json.JSONArray;
import net.sf.json.JSONException;
import net.sf.json.JSONObject;

/**
 *
 * @author lyes
 */
public class TesterFichierJson{
       
    public static boolean testerFichierJson(JSONObject employe){
       boolean malforme = false;
       int projet ,minutes ,employeId= 0;
     try{ 
         employeId = Integer.parseInt(employe.getString("numero_employe"));
     // On parcourt tout les jours de la semaine 
       for(int i = 0; i < TimeSheet.semaine.length; i++) {  
         JSONArray jourSemaine = JSONArray.fromObject(employe.getString(TimeSheet.semaine[i]));
       // On parcourt un jour de la semaine  
        for(int j = 0; j < jourSemaine.size(); j++) {
            
            JSONObject projets = jourSemaine.getJSONObject(j);
            projet = Integer.parseInt(projets.getString("projet"));
            minutes = Integer.parseInt(projets.getString("minutes"));
         }   
        } 
  
        }  catch (JSONException e) {
         
            System.out.print("erreur dans la structure du fichier");
            malforme = true;

        }
        return malforme;
        
     }
       
}    
    

