package logicalpgms;

public class Factorial {
	public static void main(String[] args) {
		int num=4;
		int factorial=1;
		
		for(int i=4;i>=1;i--) {
			
			factorial=factorial*i;
		}
			System.out.print(factorial);
		

	}
}
