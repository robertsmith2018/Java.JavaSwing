import javax.swing.JOptionPane;

public class Exercise2 {

	public static void main(String[] args) {
		int a;
		int  b;
		int c;
		int nombreMax;
		do{
		a = Integer.parseInt(JOptionPane.showInputDialog("Entrerle 1e nombre"));
		b = Integer.parseInt(JOptionPane.showInputDialog("Entrerle 2e nombre"));
		c = Integer.parseInt(JOptionPane.showInputDialog("Entrerle 3e nombre"));
		if(a != 0 && b != 0 && c != 0){
		nombreMax= plusGrand(a, b, c);
		JOptionPane.showMessageDialog(null, "Le plus grand de ces trois nombres est : "
		+ nombreMax);
		}
		}while(a != 0 && b != 0 && c != 0);

	}
	public static int plusGrand(int nombre1, int nombre2, int nombre3){
		int max;
		if(nombre1 > nombre2){
		max = nombre1;
		}
		else{
		max = nombre2;
		}
		if(nombre3 > max){
		max = nombre3;
		}
		return max;
		}

}
