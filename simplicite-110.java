package eraser;

/* 
 * Auteur      : XXX Anonymized by JMB XXX
 * Version     : 1.0
 * Date        : 10/06/2022
 */

public class Eraser {
	
	/*
	 * Fonction qui permet d'enlever un simple espace dans une chaîne de caractère (pas un double espace etc...)
	 * @param str IN châine de caractère à traiter
	 * @return châine de caractère modifiée
	 */
    public static String erase(String str) throws Exception {
    	
    	// Si la châine de caractère est vide on retourne la chaîne telle qu'elle est
    	if (str.equals("")) {
        	return str;
        }
    	
    	// Déclaraction et initialisation de variables
    	String strMod = "";
    	// On crée un tableau de char à part de str
        char[] tab = str.toCharArray();
        int taille = tab.length;
        
        // Si le premier caractère est différent d'un espace on l'ajoute automatiquement à strMod
        if (tab[0] != ' ') {
        	strMod += tab[0];
        }
        
        // Boucle qui va vérifier les simples espaces et les enlever
        for (int i = 1; i < taille-1; i++) {
        	if (tab[i] == ' ') {
        		if (tab[i-1] == ' ' || tab[i+1] == ' ') {
        			strMod += tab[i];
        		}
        	} else {
        		strMod += tab[i];
        	}
        }
        
        // Si le dernier caractère est différent d'un simple espace ET que la longueur du message est différent de 1 on l'ajoute à messageMod
        if (tab[taille-1] != ' ' && taille != 1) {
        	strMod += tab[taille-1];
        }
        
        // On retourne le message sans simple espace
        return strMod;
    }
    
    public static String erase2(String str) throws Exception {
    	
    	if (str == null || str.equals(" ")) {
        	throw new Exception("La chaîne de caractère est vide.");
        }
    	
    	/*String[] tab = str.split(" ");
    	
    	String strMod = Arrays.toString(tab);
    	
    	strMod.replaceAll(" ", "");
    	
    	for (int i = 0; i < tab.length; i++) {
    		System.out.println(tab[i]);
    	}*/
    	
    	//strMod.replaceAll("\\s{1,}", "").trim();

        /*char[] tab = str.toCharArray();
        int taille = tab.length;
        
        for (int i = 0; i < taille-1; i++) {
        	if (tab[i]  == ' ' && tab[i+1] != ' ') {
        		tab[i] = (Character) null;
        	}
        }
        
        strMod.indexOf(strMod, taille)*/
    	
    	String strMod = "";
    	String[] temp = str.split("\\s");
    	if (temp[0] != " ") {
    		strMod += temp[0];
    	}
    	for (int i = 1; i < temp.length; i++) {
    		if (temp[i].equals("")) {
    			strMod += " ";
    		} else {
    			strMod += temp[i];
    		}
    		if (temp[i].equals("") && (!temp[i-1].equals(" "))) {
    			strMod += " ";
    		}
    	}

		return strMod;
    }
    
    public static void main(String[] args) throws Exception {
    	String test = "06   07 65 19 70 ";
    	
		System.out.println(erase2(test));
	}
    
}
