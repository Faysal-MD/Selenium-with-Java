
public class CoreJavaBrushup3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		In java String is an object that represents sequence of characters
//		2 ways we can define string:
//		1.Literal, 
//		2.new
		
//		1. String literal => If the content is some no matter how many variables 
//		are created at the backend it creates only one object.
		String s = "Faysal";
		String s1 = "Faysal"; 
		
//		2. new memory allocate operator => Creates separate object for each variable;
		String s2 = new String("Mahmud");
		String s3 = new String("Mahmud");
		
		String s4 = "Faysal Mahmud SDET";
//		String[] splittedString = s4.split(" ");
		String[] splittedString = s4.split("Mahmud");
		
		System.out.println(splittedString[0]);
		System.out.println(splittedString[1]);
		System.out.println(splittedString[1].trim()); // trim all the left & right spaces
//		System.out.println(splittedString[2]);
		
//		print the string char by char
		for (int i=0; i<s4.length(); i++) {
			System.out.println(s4.charAt(i));
		}
		
//		print the string char by char in reverse order
		for (int i=s4.length()-1; i>0; i--) {
			System.out.println(s4.charAt(i));
		}
	}

}
