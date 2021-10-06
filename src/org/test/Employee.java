package org.test;


import java.util.LinkedList;
import java.util.List;


public class Employee {
	public void no1() {

		System.out.println("Sample 1");
		System.out.println("Sample 2");
		System.out.println("Sample 3");
	}
	public static void main(String[] args) {
		List<Integer>l=new LinkedList<Integer>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		l.add(60);
		
		l.add(2,50);
		System.out.println(l);
			
		}
		
	
	}


