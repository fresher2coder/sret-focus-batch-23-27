package string;

public class StringDemo {

	public static void main(String[] args) {	
		
		StringDemo obj = new StringDemo();
		
		obj.demo();
		
		//obj.concatenation();
		
		//obj.comparision();
		
		//obj.findString();
		
		//obj.conversion();
		
		//obj.printSubString();
		
		//type conversion
		
		int a = 1331;
		
		if(a == Integer.valueOf(new StringBuffer(String.valueOf(a)).reverse().toString()))
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
		

	}
	
	void printSubString() {
		
		String str1 = "  abcd   ";//length=4 index = 0 to 3
		
		str1 = str1.trim();
		
		System.out.println("Substring from 2: " + str1.substring(2));
		System.out.println("Substring from 1 to 2: " + str1.substring(1, 3));	
	}
	
	void conversion() {
		String str1 = "good morning", str2 = "Java is one of the best.";
		
		String fruits[] = {"apple", "banana", "orange"};
		
		str1 = str1.toUpperCase();
		System.out.println("Upper case: " + str1);
		
		str1=str1.toLowerCase();
		System.out.println("Lower case: " + str1);
		
		char ch[] = str1.toCharArray();
		System.out.println("Second element in ch array: " + ch[1]);
		
		String words[] = str2.split(" ");
		System.out.println("3rd word in words array: " + words[2]);
		
		int a = 125;
		
		String str3 = String.valueOf(a);
		System.out.println("No of digits in a: " + str3.length());
		
		int b = Integer.valueOf("1578");
		
	}
	
	void findString() {
		String str1 = "Hellol Java";
		
		System.out.println("Is 'e' present in str1: " + str1.indexOf('e'));
		System.out.println("Is 'l' present in str1: " + str1.indexOf('l'));
		System.out.println("Is 'l' present in str1: " + str1.indexOf('l', str1.indexOf('l')+1));
		System.out.println("Is 'l' present in str1: " + str1.lastIndexOf('l'));
		
		System.out.println("Is 'z' present in str1: " + str1.indexOf('z'));
		
		System.out.println("Is 'java' present in str1: " + str1.indexOf("java"));
		
		System.out.println("Is str1 starts with Hi: " + str1.startsWith("Hi"));	
		System.out.println("Is str1 ends with python: " + str1.endsWith("Python"));	
	}
	
	void comparision() {
		//equals, equalsIgnoreCase, regionMatches, compare
		
		String str1 = "apple", str2 = "mango", str3 = "APPLE";
		
		System.out.println("Equals method: " + str1.equals(str3));
		System.out.println("EqualsIgnoreCase method: " + str1.equalsIgnoreCase(str3));
		
		System.out.println("RegionMatches method: " + "Hi Java".regionMatches(3, "Hello Java", 6, 4));
		System.out.println("RegionMatches method: " + "Hi JAVA".regionMatches(true, 3, "Hello Java", 6, 4));
		
		System.out.println("Compare method: " + str2.compareTo(str1));
		System.out.println("Compare method: " + str1.compareToIgnoreCase(str3));
		
	}
	
	void concatenation() {
		//+, concat, join
		String str1 = "Romeo", str2 = "Juliet", str3 = "Loves";
		
		String story = str1 + " " +str3 + str2 + 100;
		
		System.out.println(story);
		
		story = str1.concat(str3).concat(str2);
		
		System.out.println(String.join(" ", str1, str3, str2));
	}
	
	void demo() {
		String str1 = "Java is one of the best programming language";		
		
		String str2 = new String();
		
		String str3 = null;
		
		System.out.println("String 1 : " + str1);
		System.out.println("Length of string1: " + str1.length());
		
		System.out.println("String 2 : " + str2);
		System.out.println("String 3 : " + str3);
		
		String str4 = new String("Welcome");
		System.out.println("String 4 : " + str4);
		
		String str5 = new String(new char[] {'a','e','i','o','u'});
		System.out.println("String 5 : " + str5);
		
		String str6 = new String(new char[] {'a','e','i','o','u'}, 2, 3);
		System.out.println("String 6 : " + str6);
		
		String str7 = new String("Welcome");
		System.out.println("String 7 : " + str7);
		
		System.out.println("Obj comparision: " + (str4==str7));
		System.out.println("Content comparision: " + str4.equals(str7));
		
		String a="Java", b="Java";
		System.out.println("Content comparision: " + (a==b));
		
		System.out.println("1st char: " + a.charAt(0));	
		
		a = a.replace('J', 'j');
		System.out.println("String a: " + a);
	}
	
	

}











