
public class MethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodsDemo md = new MethodsDemo();
		String name = md.getData();
		System.out.println(name);
		
		String name2 = getData2();
		System.out.println(name2);
		
		MethodsDemo2 md2 = new MethodsDemo2();
		md2.getUserData();	
	}
	
	public String getData() {
		System.out.println("Hello SDET");
		
		return "Faysal Mahmud"; 
	}
	
//	We can call this method without creating an object by making the class static,
//	Now it's belong to the class not tied to the object
	public static String getData2() {
		System.out.println("Hello Automation");
		
		return "Faysal Mahmud"; 
	}
}
