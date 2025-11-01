package All_Actions;

import java.util.ArrayList;
import java.util.Scanner;

public class hello {

	public static void main(String args[]) {
		ArrayList<String> arr = new ArrayList<String>();

		arr.add("vijay");
		arr.add(null);
		arr.add(2, "daya");
		arr.add("vijay");
		arr.removeFirst();
		System.out.println(arr);
		if (arr.contains("dayas")) {
			System.out.println("he is dumb");
		} else {
			System.out.println("he is good");
		}
	}

}
