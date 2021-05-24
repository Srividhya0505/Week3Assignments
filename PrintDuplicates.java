package week3.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class PrintDuplicates {

	public static void main(String[] args) {

		int[] data = { 1, 3, 8, 3, 11, 5, 6, 4, 7, 6, 7 };

		// Define Arraylist
		List<Integer> inputdata = new ArrayList<Integer>();

		for (Integer numarray : data) {
			inputdata.add(numarray);
		}
        //Sorting the Arraylist
		Collections.sort(inputdata);
		//System.out.print(inputdata + "  ");

		for (int i = 0; i < inputdata.size() - 1; i++) {
			for (int j = i + 1; j < inputdata.size() - 1; j++) {
				if (inputdata.get(i) == inputdata.get(j)) {
					System.out.print(inputdata.get(i) + "     ");
					// Removing j from arraylist
					inputdata.remove(j);
					// i added with 2 numbers as j is replaced
					i = j + 2;
				}

			}

		}

	}
}
