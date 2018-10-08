
public class CopyVsRef {

	public static void main(String[] args) {
		int[] arOriginal = {10, 20, 30};
		System.out.println("Original before:" + arOriginal[0]);
		incrementValue(arOriginal);
		System.out.println("Original After:" + arOriginal[0]);
	}
	
	public static void incrementValue(int[] inFunction) {
		inFunction[0]++;
		System.out.println("In Function Value:"+ inFunction[0]);
		
	}
	
	

}
