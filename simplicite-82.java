package eraser;

public class Eraser {
    public static String erase(String str) {
        //throw new UnsupportedOperationException("Unimplemented");
 
              //str=str.trim();
              StringBuilder result = new StringBuilder(str);
        
              for (int i = 0; i < result.length(); i++) {
                  if (result.charAt(i) == ' ') {
                      int cpt = 1;
        
                      while (i + cpt < result.length() && result.charAt(i + cpt) == ' ')
                          cpt += 1;
                        //Ici on peut adapter le code en fonction du nombre d'espaces que l'on veut garder.  On doit juste mettre les nombres que l'on souhaite supprimer dans le compteur.
                        //On peut adapter cet algo et demander à l'utilisateur de saisir le nombre d'espaces qu'il souhaite garder/supprimer
                      //if (cpt == 1 || cpt > 2)
                      if (cpt == 1 )
                          result.delete(i, i + cpt);
                      else
                          i = i+cpt-1;
                  }
              }
              return result.toString();
            }
        
    }

