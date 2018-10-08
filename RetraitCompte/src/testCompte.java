
public class testCompte {

	public static void main(String[] args) {
		try {
			Compte c = new Compte("1-001","Epargne",95,"CAD");
			c.debiter(20);
		}
		catch(CompteException ex) {
			System.out.println(ex.getMessage());
		}
	}





}