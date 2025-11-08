package All_Actions;

import java.util.HashMap;
import java.util.Map;

public class practice {

		public static void main(String[] args) {
	        // Initialize a HashMap with key-value pairs
	        HashMap<Integer, String> employeeMap = new HashMap<>();

	        // Data onboarding – mapping Employee ID to Employee Name
	        employeeMap.put(101, "sylesh");
	        employeeMap.put(102, "shcs");
	        employeeMap.put(103, "Ravi");
	        employeeMap.put(104, "Priya");

	        // Data retrieval – accessing specific employee information
	        System.out.println("Employee with ID 102: " + employeeMap.get(102));

	        // Iterating through the Map – enterprise-grade visibility
	        System.out.println("\n--- Employee Directory ---");
	        for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
	            System.out.println("Employee ID: " + entry.getKey() + ", Name: " + entry.getValue());
	        }

	        // Updating data – dynamic workforce management
	        employeeMap.put(104, "Priya Sharma");

	        // Removing data – offboarding process
	        employeeMap.remove(103);

	        // Checking presence – data governance and validation
	        if (employeeMap.containsKey(101)) {
	            System.out.println("\nEmployee ID 101 is active in the system.");
	        }

	        // Final snapshot
	        System.out.println("\nFinal Employee Map: " + employeeMap);
	    }
	}