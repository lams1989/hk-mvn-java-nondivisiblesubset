package com.lams1989.nondivisiblesubset;

import java.util.List;
import java.util.TreeSet;

public class NonDivisibleSubset {
	public static int nonDivisibleSubset(int k, List<Integer> s) {

		int count = 0;
		TreeSet<Integer> nodiv = new TreeSet<Integer>();
		for (int i = 0; i < s.size(); i++) {
			for (int j = i + 1; j < s.size(); j++) {
				if ((s.get(i) + s.get(j)) % k != 0) {
					count++;
					nodiv.add(s.get(i));
				}
			}

		}
		System.out.println(nodiv);
		return count;
		
	}
}
