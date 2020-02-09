package org.types;

import java.util.ArrayList;

public class UserDefinedList {
public static void main(String[] args) {
	Employer e1=new Employer();
	e1.setI(1415168);
	e1.setS("Rajkumar");
	e1.setL(9896959794l);
	Employer e2=new Employer();
	e2.setI(1415167);
	e2.setS("Ramkumar");
	e2.setL(9698959794l);
	ArrayList<Employer> n=new ArrayList<Employer>();
	n.add(e1);
	n.add(e2);
	for (Employer e :n ) {
		System.out.println(e.getI());
		System.out.println(e.getS());
		System.out.println(e.getL());
		System.out.println(" ");
	}
	
}
}
