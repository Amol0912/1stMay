package agsva;

public class A {
	
	public static void main(String[] args) 
	{
		String s1 = "Amol";
		String s2 = "Ashok";
		String s3 = "Patil";
		String s4  = "     ";
		
		//concat()
		
		System.out.println(s1.concat(s4).concat(s2).concat(s4).concat(s3).toLowerCase().toUpperCase());  // s1.concat(s2)
		
		System.out.println("Amol".concat(s2)); // "String".concat(s2)
		
		System.out.println("Amol"+"Ashok"+" patil");  // "String1"+"String2"+"String3"
		
		//System.out.println("Amol"+s4+"Ashok"+s4+"patil"); //"String1"+ s4+ "string2"+s4+"string3"
		
	   // length()
		int iLength = "Amol".length();
		int iLength2 = s1.length();
		System.out.println(iLength);     // int x= String.length()
		System.out.println(iLength2);   //  int y = "String".length()
		
		// equals()--------------> this method comapre and give result as true and false
		
		Boolean compareResult  = s1.equals(s2);
		Boolean compareResult2 = "Amol".equals(s1);
		System.out.println(compareResult);
		System.out.println(compareResult2);
		
		//charAt()
				char x = s1.charAt(0);                                 // char x = String.charAt(int index)
				char y = "Amol".charAt(0);                              // char y = "String".charAt(1)
						System.out.println(x);
						System.out.println(y);
		// contains()
		String popularTopic_1 = "Selenium Automation Framework";
		String popularTopic_2 = "Basic Java Tutorial";
		Boolean verify = popularTopic_1.contains("Framework");
		Boolean verify1 = popularTopic_1.contains("me");// ----------> this method checks for sequeence of characters
		Boolean verify2 = popularTopic_2.contains("Framework");  //Returns true if and only if this string contains the specifiedsequence of char values.
		Boolean verify3 = s1.contains("Am");
		Boolean verify4 = s1.contains("Ao");
		Boolean verify5 = "Amol".contains("Ao");
		System.out.println(verify);
		System.out.println(verify1);
		System.out.println(verify2);
		System.out.println(verify3);
		System.out.println(verify4);
		System.out.println(verify5);
		
		
		// indexof()---------------> it counts space too
		
		int iIndex = popularTopic_1.indexOf("Framework");
		int iIndex1 = popularTopic_1.indexOf("Sel");
		int iIndex2 = popularTopic_1.indexOf("ut");
		int iIndex3 = popularTopic_1.indexOf("Aut");
		int iIndex4 = s1.indexOf("mol");
		int iIndex5 = "Ashok".indexOf("hok");
		System.out.println(iIndex);
		System.out.println(iIndex1);
		System.out.println(iIndex2);
		System.out.println(iIndex3);
		System.out.println(iIndex4);
		System.out.println(iIndex5);
		
		// substring 
		String subst = popularTopic_1.substring(20);
		String subst1 = popularTopic_1.substring(24);
		String subst2 = "Amol".substring(2);//--------------- it will print only ol if we provide -ve value then we will get
		System.out.println(subst);                             // indexoutofboundexception and provide larger value than actual string length then we will get empty string
		System.out.println(subst1);
		System.out.println(subst2);
		
		
		// substring    (endindex -1 )
				String substinti = popularTopic_1.substring(7, 25);
				String substinti1 = popularTopic_1.substring(0, 12);
				String substinti2 = "Amol".substring(0, 2);//--------------- it will print only ol if we provide -ve value then we will get
				System.out.println(substinti);                             // indexoutofboundexception and provide larger value than actual string length then we will get empty string
				System.out.println(substinti1);
				System.out.println(substinti2);
			
				// toLowercase()
	
				String sub = popularTopic_1.substring(20).toLowerCase();
				String sub1 = s1.substring(0).toLowerCase();
				System.out.println(sub);
				System.out.println(sub1);
				
				// split()
				
				String d1 = "Amol patil nitin sandanshiv swar kinkar";
				
				/*String [] aSplit = popularTopic_1.split("Automation");
				  System.out.println("The first part of the array is : " + aSplit[0]);
				  System.out.println("The last part of the array is : " + aSplit[1]);*/
				String [] asplit = popularTopic_1.split("Automation");
				System.out.print (asplit[0]);
				System.out.println(asplit[1]);
				String [] e4 = d1.split("patil");
				System.out.print(e4[0].toUpperCase());
				System.out.println(e4[1].toUpperCase());
	}
}



