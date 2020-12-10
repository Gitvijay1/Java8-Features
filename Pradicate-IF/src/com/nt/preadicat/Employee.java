package com.nt.preadicat;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Employee {
	private int eid;
	private String ename;
	private Integer sal;
	public Employee(int eid, String ename,Integer sal) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.sal=sal;
	}
	public static void main(String[] args) {
		List<Employee> l=new ArrayList<>();
		l.add(new Employee(101, "raja",4563));
		l.add(new Employee(102, "kajal",53453));
		l.add(new Employee(103, "vivek",3243));
		l.add(new Employee(104, "johan",8763));
		/*for(Employee e:l) {
			if(e.sal>5000) {
				System.out.println(e.eid+" "+e.ename+"  "+e.sal);
			}
		}*/
		//using predicat
		Predicate<Employee> p=e->e.sal>=5000;
		for(Employee e1:l) {
			if(p.test(e1)) {
				System.out.println(e1.eid+" "+e1.ename+"  "+e1.sal);
			}
		}

	}

}
