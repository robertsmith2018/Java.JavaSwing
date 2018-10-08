import javax.swing.JOptionPane;

public class Exercise4 {

	public static void main(String[] args) {
		
		int N;
		float Somme = 0;
		String saisie;

		 

		do{
		saisie = JOptionPane.showInputDialog("Donner La valeux as N");
		N = Integer.parseInt(saisie);

		} while(N < 1) ;

		for(int i = 1;i <= N;i++){
		Somme += 1.0f / i;
		}

		JOptionPane.showMessageDialog(null, "La Somme des "+N+" premiers termes de la série harmonique : " + Somme);



	}

}
