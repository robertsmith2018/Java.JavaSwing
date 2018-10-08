import javax.swing.JOptionPane;

public class PermuterEntier {
	


	public static void main(String[] args) {
		/*int a ;
		int b ;*/
		
		Integer a;
		Integer b;

	/*	a = Integer.parseInt (JOptionPane. showInputDialog( "Entrer la valeur de a?" )) ;
		b = Integer.parseInt(JOptionPane.showInputDialog( "Entrer la valeur de b?" ));*/
		a = new Integer(JOptionPane. showInputDialog( "Entrer la valeur de a?" )) ;
		b = new Integer(JOptionPane.showInputDialog( "Entrer la valeur de b?" ));
		permuter(a, b);
		JOptionPane.showMessageDialog(null, "La valeur de a est : " + a + "\nLa valeur de b est : " + b );
	}
	


/*	private static void permuter(int a, int b) {
		int temp = a;
		a = b;
		b= temp;
		
	}*/
	
	private static void permuter(Integer a, Integer b) {
		Integer temp = a;
		a = b;
		b= temp;
		
	}

}
