
public class CoreJavaBrushup1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Array
		int[] arr = new int[5]; // new stores memory for data
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		
		int[] arr2 = {1, 2, 4, 5, 6};
		
		// for loop
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		String[] name = {"Faysal", "Mahmud", "Borshon"};
		
//		for(int i = 0; i < name.length; i++) {
//			System.out.println(name[i]);
//		}
		
//		enhanced for loop
		for(String s: name) {
			System.out.println(s);
		}

	}

}
