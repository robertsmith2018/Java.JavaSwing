import java.util.Arrays;

public class TestEmploye {

	public static void main(String[] args) {
	
	Employe[] tabEmploye = {

		new Employe("Emp-0001", "Pierre", "Andre", 35000),
		new Employe("Emp-0002", "Pierre", "Andre", 65000),
		new Employe("Emp-0001", "Pierre", "Andre", 15000)
	};	
		for (Employe e : tabEmploye){
			System. out.println(e );
		}
		System. out.println();
		/// Attention Arrays.sort pour trier un Array et Collection.sort pour trier un ArrayList
		Arrays.sort( tabEmploye);
		
		for (Employe e : tabEmploye){
			System. out.println(e );
		}
	}
}