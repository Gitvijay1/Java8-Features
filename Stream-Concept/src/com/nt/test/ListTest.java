package com.nt.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class ListTest {
	public static void main(String[] args) {
		List<Integer> l=new ArrayList<Integer>();
		l.add(0);
		l.add(5);
		l.add(10);
		l.add(20);
		l.add(25);
		l.add(30);
		l.add(35);
		System.out.println(l);
		//Integer[] t=(Integer[]) l.toArray();
		//print only even number
		
		//List<Integer> l2=new ArrayList<Integer>();
		 /* for(Integer i:l) {
			  if(i%2==0) {
				  l2.add(i);
			  }
		  }
		  System.out.println(l2);*/
		
		//using stream
		//List<Integer> l2=l.stream().filter(i->i%2==0).collect(Collectors.toList());
		//System.out.println(l2);
		
		
		//write logic to create new collection with double values of old collection
		/*List<Integer> l1=new ArrayList<Integer>();
		for(Integer i:l) {
			l1.add(i*2);
		}
		System.out.println(l1);*/
		
		
		//usint streams
		List<Integer> l1=l.stream().map(i->i*2).collect(Collectors.toList());
		//System.out.println(l1);
		
		//count method
		List<Integer> marks=new ArrayList<Integer>();
		 marks.add(30);
		 marks.add(25);
		 marks.add(19);
		 marks.add(35);
		 marks.add(45);
		 marks.add(29);
		 marks.add(15);
		 marks.add(76);
		 System.out.println(marks);
		 List<Integer> collect2 = marks.stream().sorted().collect(Collectors.toList());
		 //chek which student is pass
		 List<Integer> list = marks.stream().filter(m->m>35).collect(Collectors.toList());
		 System.out.println(list);
		 
		 //increase marks 10 whose student is fail
		 List<Integer> list2 = marks.stream().filter(m->m<35).map(m->m+10).collect(Collectors.toList());
		    // List<Integer> list3 = list2.stream().map(m->m+10).collect(Collectors.toList());
		System.out.println(list2);
		//System.out.println(list3);
		
		//conut how many student are fail
		
		long count = marks.stream().filter(m->m<35).count();
		System.out.println(count);
		
		Integer [] i= {2,20,30,3,5,60};
		List<Integer>l3=Arrays.asList(i);
		Integer[] h=l3.toArray(Integer[]::new);
		Integer f=h.length;
		System.out.println("----------------");
		System.out.println(h[f-3]);
		System.out.println(l3);
	      // l3.add(70);
	       Collections.sort(l3,new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				//Integer i1=o1;
				//Integer i2=o2;
				return o2.compareTo(o1);
			}
	    	   
		});

	       System.out.println(l3);
	       List<Integer> collect = l3.stream().filter(i1->i1<10).collect(Collectors.toList());
	       System.out.println(collect);
	       
	   	//use sorted method
           List<Integer> list3 = l3.stream().sorted(/*/using 
           Anonymous class/new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o2.compareTo(o1);
			}
		}*//*/using labmda expresion/(i1,i2)->i1>i2?-11:(i1<i2?+1:0)*/
        	// (i1,i2)->i2.compareTo(i1) this is other technique
        	 ).collect(Collectors.toList());
           System.out.println(list3);
           //i want to convert collection into array
           //Integer[] ar = list3.toArray(Integer[]::new);//using collection
           Integer[] array = list3.stream().toArray(Integer[]::new);//using stream
           
          //find second highest number
              int j=array.length;
              System.out.println(array[j-2]);

           List<String> s=new ArrayList<String>();
           System.out.println("----------------------------");
           s.add("sunny leveny");
           s.add("kajal");
           s.add("kajal raghwani");
           s.add("Anuska sharma");
           s.add("Malika saravat");
           s.add("priyanka");
           s.add("madhuri p");
           System.out.println(s);
           //convert list to Arrys
           String[] ar1 = s.stream().toArray(String[]::new);
            Stream.of(ar1).forEach(System.out::println);
           List<String> list4 = s.stream().sorted(
        		   //i want to sorting besed on the lenght
        		  // (s1,s2)->s2.compareTo(s1)
        		  //sorted acording to increasing length
        		   (s1,s2)->{
        			   int i1=s1.length();
        			   int i2=s2.length();
        			   if(i1<i2)
        				   return -1;
        			   else if(i1>i2)
        				   return +1;
        			   else return s1.compareTo(s2);			   
        		   }
        		   ).collect(Collectors.toList());
           System.out.println(list4);
           
           
           //find max element in the collection
           Integer i3 = l3.stream().max((i1,i2)->i1.compareTo(i2)).get();
           Integer i4 = l3.stream().min((i1,i2)->i1.compareTo(i2)).get();
            System.out.println(i3);
            System.out.println(i4);
           
            
            
            //stream i not only applicable for collection it is 
            //applicable for where is group of values is there we can esily apply
            //stream concept
            Stream s3=Stream.of(99,67,53,34,53,23,89,43);
            s3.forEach(System.out::println);
            System.out.println("---------------------");
            
            //array concept
            Integer[] j1= {10,2,45,76,23,32,64,21};
            //j1.forEach(System.out::println); forEach methos is only applicable
            //for collection not for array if we want to use forEach() method
            //with array then using stram we can used
            
              Stream.of(j1).forEach(System.out::println);
              System.out.println("-------------------------");
              
              //print each element from array using for each Loop
              for(Integer d:j1) {
            	  System.out.println(d);
              }   
	}

	private static List<Integer> Stream() {
		// TODO Auto-generated method stub
		return null;
	}


}

//Stram() class methos
//1 filter(pradicae)
//2 map(Function)
//3 sorted(comparator)
//4 count()
//5 max(sort data)
//6 min(sort data)
//7 get()