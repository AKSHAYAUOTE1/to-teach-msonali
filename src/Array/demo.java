package Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int ar[]=new int[5];

ar[0]=10;
ar[1]=30;
ar[2]=20;
ar[3]=40;
ar[4]=12;
	
Arrays.sort(ar);
System.out.println("ascending order");
for(int i=0;i<=ar.length-1;i++)
{
	System.out.println(ar[i]);
	
}

System.out.println("Decending order");
for(int i=ar.length-1;i>=0;i--)
{
	
System.out.println(ar[i]);
	
}	
	
	
	
	
	
}



}
