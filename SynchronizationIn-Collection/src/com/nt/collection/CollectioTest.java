package com.nt.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectioTest {
	public static void main(String[] args) {
		//List<String> s=new ArrayList<String>();
		List<String> s=new LinkedList<String>();
		s.add("raja");
		s.add("mahesh");
        s.add("manku");
		s.add("divani");
		s.add("suresh");
		s.add("rakesh");
		System.out.println(s);
		s.forEach(System.out::println);
		//make list as a Asynchronized 
		Collections.synchronizedList(s); //this methos is aplicable for all List implementaion class
		s.forEach(System.out::println);
        //make set as a synchonised
		Set<Integer> i=new HashSet<Integer>();
		i.add(101);
		i.add(102);
		i.add(103);
		i.add(104);
		i.add(105);
		i.add(106);
		i.add(107);
		System.out.println(i);
		Collections.synchronizedSet(i);
		i.forEach(System.out::println);
		
		//mak map as a synchronized
		Map<Integer, String> mp=new HashMap<Integer, String>();
		mp.put(101, "raja");
		mp.put(102, "pandu");
		mp.put(103, "rohan");
		mp.put(104, "kajal");
		mp.put(105, "riya");
		mp.put(106, "rihan");
		System.out.println(mp);
		
		
		Collections.synchronizedMap(mp);
		Set<Map.Entry<Integer, String>> entry=mp.entrySet();
		for(Map.Entry<Integer, String> m:entry) {
			System.out.println(m);
		}
	}

}
