package Eraser;

public class Eraser_version_Simple {
	public static void Eraser_simple(String mot_avec_espace) {

		String mot_sans_espace = "";
		int taille = mot_avec_espace.length();
		if (taille == 0)
			return;
		
		
		for (int i = 0; i < taille; i++) {
			char c = mot_avec_espace.charAt(i);
			char c1='~';
		
			if(i< taille-1) {
				 c1 = mot_avec_espace.charAt(i+1);
			}
			if (c == ' ' && c1!= ' ') {
				
			}else{
				mot_sans_espace += new StringBuilder().append(c).toString();
			}
		}
		
		
		System.out.println(mot_sans_espace);
	}
}
