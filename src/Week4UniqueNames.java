import java.util.ArrayList;

import acm.program.*;

public class Week4UniqueNames extends ConsoleProgram {
	
	public void run() {
		setFont("Sans-20");
		
		ArrayList<String> list = new ArrayList<String>();
		
		readNames(list);
		printArrayList(list);	
		
	}
	
	// Pass array list as 'list' - function only cares of just an arraylist (but not the TYPE of arraylist)
		private void readNames(ArrayList list) {
			while (true) {
				String name = readLine("Please enter a name: ");
				
				if (name.contains(" "))  {
					break; 
				}
				
				if (!list.contains(name)) {
					list.add(name);
				} else {
					System.out.println("Please try again");
					println("Please try again.");
				}
				println("These are the unique names: " + list);
				// nothing returned because an Array list is an object. Any changes made, will persist.		
			}
		//	println("These are the unique names: " + list);
		}
		
		
		private void printArrayList(ArrayList list) {
			println("List contains: " + list.size() + " names.");
			for(int i = 0; i < list.size(); i++) {
				println(list.get(i));
			}
		}
		
}

