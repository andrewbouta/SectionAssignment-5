import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import acm.program.ConsoleProgram;

// Lecture 16 - 18:20
public class Week4Histograms_AB extends ConsoleProgram {
	String line = null;
	BufferedReader br = null;
//	private static final int SENTINEL = -1;
//	private static final int MAX_SIZE = 100;

	public void run() {
		
		// int[] mid = new int[MAX_SIZE];

		// How many scores do we have?
		// int numScores = 0; // 0 because we have none at the moment

		/*
		 * while (true) { int score = readInt("?"); if (score == SENTINEL) break;
		 * mid[numScores++] = score; // numscore is the effective size of array }
		 */
		
	}

	private void readScores() throws FileNotFoundException {
		int[] counter = new int[53];

		Scanner rf = new Scanner(new File ("MidtermScores.txt"));
		//Scanner array = rf;
		// reading the scores into array 'counter' and adds to it
		while (rf.hasNextInt()) {
			int score = rf.nextInt();
			counter[score]++;
		}
	
		
		
		
		
		
		
		/*
		try {
			br = new BufferedReader(new FileReader("MidtermScores.txt"));
			while (true) {
				
			}

		} catch (IOException ex) {
			System.err.println("Invalid Code.");
		} */
		
	}
	
	private void stars() {
		for(int )
	}
}