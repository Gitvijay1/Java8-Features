package com.nt.preadicat;

import java.util.Scanner;
import java.util.function.Predicate;

public class PradicatDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int nu=sc.nextInt();
		Predicate<Integer> p=nu1->nu1%2==0;
		System.out.println(p.test(nu));
	}

}
