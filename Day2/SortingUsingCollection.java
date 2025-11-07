package week4.week4day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {
		List<String> CompanyName = new ArrayList<String>();
		CompanyName.add("HCL");
		CompanyName.add("WIPRO");
		CompanyName.add("Aspire systems");
		CompanyName.add("CTS");
		
		Collections.sort(CompanyName);
		System.out.println(CompanyName);
	}
	
}
