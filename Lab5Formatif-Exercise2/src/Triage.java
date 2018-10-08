
public class Triage {

	public static void main(String[] args) {
		String[] listeNoms = { "Pierre André", "Milien Peterson","AIcimé Alexandra", "Dupond Marise",
		"Xavier Godin", "Abutime Judith"};
		trier(listeNoms);
		afficher(listeNoms);

	}
	
	public static void trier(String[] tab ){
		String temp;
		for(int i = 0; i < tab.length - 1; i++){
			for(int j = i + 1; j < tab.length; j++){
				if(tab[j].compareTo(tab[i]) < 0){
					temp = tab[i];
					tab[i] = tab[j];
					tab[j] = temp;
				}
			}
		}
	}
	
	public static void afficher(String[] tab){
		for(int i = 0; i < tab.length; i++){
		System.out.println(tab[i]);
		}

	}

}
