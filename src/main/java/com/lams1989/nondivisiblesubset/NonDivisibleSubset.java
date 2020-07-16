package com.lams1989.nondivisiblesubset;

import java.util.ArrayList;
import java.util.List;

public class NonDivisibleSubset {
	public static void nonDivisibleSubset(int k, List<Integer> s) {


		List<Integer> a = new ArrayList<Integer>();
		for (int i = 0; i < s.size(); i++) {
			for (int j = i + 1; j < s.size(); j++) {
				a.add(s.get(i) + s.get(j));
			}

		}
		System.out.println(a);
		
	}
}
