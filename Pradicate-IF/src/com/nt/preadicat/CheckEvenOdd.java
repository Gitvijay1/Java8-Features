package com.nt.preadicat;

import java.util.function.Predicate;

public class CheckEvenOdd {
	public static void main(String[] args) {
		int[] arr= {1,5,7,45,65,22,78,34,89,98};
		Predicate<Integer> p1=i->i%2==0;
		Predicate<Integer> p2=i->i>15;
		for(Integer i2: arr) {
			//if(p1.and(p2).test(i2))
			if(p1.negate().and(p2).test(i2)){
				System.out.println(i2);
			}
		}

	}

}
