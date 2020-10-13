package Pattern;

public class demo2 {

	public static void main(String[] args) {
		
		
	
		for(int i=1;i<=4;i++)
		{
			for(int sp=0;sp<=3-i;sp++)
			{
				System.out.print(" ");
			}
		for(int j=1;j<=i;j++)
		{
			System.out.print("*");
		}
		System.out.println();
		}
	}

}
