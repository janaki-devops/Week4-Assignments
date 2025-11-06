package week4.week4day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class secondLargestNumberUsingList {

	public static void main(String[] args) {
		List<Integer> Numbers = new ArrayList<Integer>();
		
		Numbers.add(3);
		Numbers.add(2);
		Numbers.add(11);
		Numbers.add(4);
		Numbers.add(6);
		Numbers.add(7);
		
		Collections.sort(Numbers);
		
		System.out.println("Sorted number: " + Numbers);
		int SecondLargest = Numbers.get(Numbers.size()-2);
		System.out.println("The second largest number is: " + SecondLargest);
		
	}

}
