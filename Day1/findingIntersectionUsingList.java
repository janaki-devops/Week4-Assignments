package week4.week4day1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class findingIntersectionUsingList {

	public static void main(String[] args) {
		
		List<Integer> array1 = new ArrayList<Integer>();
		List<Integer> array2 = new ArrayList<Integer>();
		array1.add(3);
		array1.add(2);
		array1.add(11);
		array1.add(4);
		array1.add(6);
		array1.add(7);
		System.out.println("array1" + array1);
		array2.add(1);
		array2.add(2);
		array2.add(8);
		array2.add(4);
		array2.add(9);
		array2.add(7);
		System.out.println("array2" + array2);
		
		System.out.println("Intersection values:");

		for(int i =0; i<array1.size(); i++) {
			
		for(int j=0; j<array2.size(); j++) {
			if (array1.get(i) == array2.get(j)) {
				System.out.println(array1.get(i));
		
		}
		}
		
		}
	}

}
