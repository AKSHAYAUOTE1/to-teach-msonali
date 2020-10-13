package string_Class;

public class demo {

	public static void main(String[] args) {
		
		String str1="Velocity";
		String str2="velocity";
		String str3="city";
		
		
		System.out.println(str1.equals(str2));               //false
		
		System.out.println(str1.equalsIgnoreCase(str2));     //true
		
		System.out.println(str1.contains(str3));             //true
		
		
		//Concatanation of string
		System.out.println(str1.concat(str3));              //Velocitycity
		String str4=str1.concat("abacd");                   
		System.out.println(str4);                            //Velocityabacd
		
		
		System.out.println(str1.charAt(4));                  //c
		
		String str5="";
		System.out.println(str5.isEmpty());                  //true
		String str6=" ";
		System.out.println(str6.isEmpty());                  //false
		
		
		System.out.println(str1.startsWith("Ve"));           //true
		System.out.println(str1.endsWith("ty"));              //true
		
		System.out.println(str1.substring(3));               //ocity
		   
		System.out.println(str1.substring(4,6));              //ci
		
		System.out.println(str1.compareTo(str3));            //13 ASCII value
		
		String str7="abcdxydabcdxyz";
	    String[] ar=str7.split("d");
		System.out.println(str7);
		
		
	}

}
