package eraser;

public class Eraser {
	
	/*
	 * retire tous les espaces blancs d'une chaînes de caractères sans compter les espaces blancs consécutif
	 * @param str : la chaînes de caractères 
	 * return la chaîne de caratères sans les occurences
	 */
    public static String erase(String str) {
    	String resultat = "";
    	
    	for(int i = 0; i < str.length(); i++) {
    		if(str.charAt(i) == 32) {
    			if(i != 0 && str.charAt(i-1) == 32) {
    				resultat += str.charAt(i);
    			} else if(i+1 < str.length() && str.charAt(i+1) == 32) {
    				resultat += str.charAt(i);
    			}
    		} else {
    			resultat += str.charAt(i);
    		}
    	}
		return resultat;
    }
 
}
