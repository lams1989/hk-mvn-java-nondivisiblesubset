package com.lams1989.nondivisiblesubset;

import java.util.ArrayList;
import java.util.List;

public class App {
	public static void main(String[] args) {
		  List<Integer> s = new ArrayList<>();
		  int n = 4;
		  int k = 3;
		  int[] vector = {1, 7, 2, 4,};
		  
		  for (int i= 0; i<n; i++) {
			  s.add(i, vector[i]);
		  }
		  
		  int result = NonDivisibleSubset.nonDivisibleSubset(k, s);
		System.out.println(result);
		  
	}
}
