import acm.program.*;

import java.util.*;
import java.util.Map.Entry;

// Section 6 Handout
// Unique names program
public class Week4CountNames extends ConsoleProgram {
	HashMap<String, Integer> hMap = new HashMap<String, Integer>();
	
	public void run() {
		//HashMap<String, Integer> hMap = new HashMap<String, Integer>();
		readNames(hMap);
		printMap(hMap);
		
	}
			
		private void readNames(Map<String, Integer> map) {

			while (true) {
				String names = readLine("Name: ");

				if (names.contains(" "))  
					break; 
				
				System.out.println("Error.");
				Integer ct = map.get(names); // count
		
				if(ct == null) {
					ct = new Integer(1);
				} else {
					ct = new Integer(ct + 1);
				}
				map.put(names, ct);
			}
		}
		
		private void printMap(Map<String, Integer> map) {
			Iterator<String> it = map.keySet().iterator();
			String key = it.next();
			while (it.hasNext()) {
				int ct = hMap.get(key);
				System.out.println("Name: " + key + ", has " + ct + "entries");
			}
			
		}
		
		
		
}
