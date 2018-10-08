import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestEmploye {

	public static void main(String[] args) {
		ArrayList<Employe> listeEmploye = new ArrayList<Employe>();
		Employe emp1 = new Employe("Emp-0001" , " Pierre", "Andre", 35000);
		Employe emp2 = new Employe("Emp-0002", "Tremblay", "Etienne", 65000);
		Employe emp3 = new Employe("Emp-0003", "Desmarais", "Nicolas", 15000);
		listeEmploye.add(emp1);
		listeEmploye.add(emp2);
		listeEmploye.add(emp3);

		for (int i = 0; i < listeEmploye.size(); i++) {
			System.out.println(listeEmploye.get(i));
		}
		System.out.println();

		for (Employe e : listeEmploye) {
			System.out.println(e);
		}
		System.out.println();
		
		Iterator<Employe> it = listeEmploye.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println();
		Collections.sort(listeEmploye);
		
		for (Employe e : listeEmploye) {
			System.out.println(e);
		}
		
		
		
		
	}
}
