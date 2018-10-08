import java.text.DecimalFormat;
import java.util.Scanner;

public class condition {

	public static void main(String[] args) {
		
		double salaireNet =0;
		String salaireEmp;
		DecimalFormat df = new DecimalFormat("#.##");
		System.out.println("Veuillez Entrer Le Salaire de l'employé:");
		Scanner sc = new Scanner(System.in);
		salaireNet = sc.nextDouble();
		salaireEmp = df.format(salaireNet);
		if(salaireNet > 0 && salaireNet < 10000 || salaireNet >100000){
			System.out.println("Le salaire"+salaireEmp+"est hors norme");
		}
	}
}
