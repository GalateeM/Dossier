package eraser;

public class Eraser {
	//return string without spaces
	public static String erase(String str) {
		String nouvelle_chaine="";  
		int taille = str.length();    

		if(taille>0) {
			//premier caractère (si ce n'est pas un espace, ou qu'il y a un espace après, alors on recopie)
			if(str.charAt(0)!=' ' || str.charAt(1)==' ') {
				nouvelle_chaine+=str.charAt(0);
			}

			// tous les caractères sauf premier et dernier (si ce n'est pas un espace, ou qu'il y a un espace avant ou après, alors on recopie)
			for (int i=1; i<taille-1; i++) {
				if(str.charAt(i)!= ' ' || str.charAt(i-1)== ' ' || str.charAt(i+1)== ' ') {
					nouvelle_chaine+=str.charAt(i);
				}
			}
			
			// dernier caractère (si ce n'est pas un espace, ou que c'est un espace avec un espace avant, alors on recopie)
			if(str.charAt(taille-1)!=' ' || str.charAt(taille-2)==' ') {
				nouvelle_chaine+=str.charAt(taille-1);
			}
		}
		
		return nouvelle_chaine;
	}
}
