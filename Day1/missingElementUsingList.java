package week4.week4day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class missingElementUsingList {

	public static void main(String[] args) {
		List<Integer> Numbers = new ArrayList<Integer>();
		Numbers.add(1);
		Numbers.add(2);
		Numbers.add(3);
		Numbers.add(4);
		Numbers.add(10);
		Numbers.add(6);
		Numbers.add(8);
		
		Collections.sort(Numbers);
		System.out.println("Sorted Numbers: " + Numbers);
		
		System.out.println("Missing number in sequence:");
		
		for(int i = 0; i<Numbers.size()-1; i++) {
			int current = Numbers.get(i);
			int next = Numbers.get(i+1);
			for(int missing = current+1; missing<next; missing++) {
				System.out.println(missing);
			}
			
		}
	}

}
