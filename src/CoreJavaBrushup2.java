import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJavaBrushup2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 4, 5, 6, 7, 8, 9, 10, 20, 22};
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				System.out.println(arr[i] + " is multiple of 2");
			}
			else {
				System.out.println(arr[i] + " isn't multiple of 2");
			}
		}
		
//		Array list -> Dynamically create array/string size
		ArrayList<String> a = new ArrayList<String>();
		a.add("Faysal");
		a.add("Mahmud");
		a.add("SDET");
//		a.remove(2);
		
		System.out.println(a.get(0));
		
		for(int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i));
		}
		System.out.println("**********************");
		
		for(String val :a) {
			System.out.println(val);
		}
		
//		check item existance
		System.out.println(a.contains("Automation"));
		
//		Convert array to array list
		String[] name = {"Faysal", "Mahmud", "Borshon"};
		List<String> nameArrayList = Arrays.asList(name);
		System.out.println(nameArrayList.contains("Borshon"));
	}
	
}
