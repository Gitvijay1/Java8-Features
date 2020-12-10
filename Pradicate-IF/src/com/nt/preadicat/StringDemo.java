package com.nt.preadicat;

import java.util.function.Predicate;

public class StringDemo {
	public static void main(String[] args) {
		String[] s= {"rahja","ranikumai","ramdevbaba","sanjiveKumar"};
		Predicate<String> p=s1->s1.length()>5;
		for(String s1:s) {
			if(p.test(s1))
			System.out.println(s1);
			else {
				//System.out.println(s1);
			}
		}
	}

}
