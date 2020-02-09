package org.emp;

import java.util.ArrayList;

import org.types.Employer;

public class udlistDemo1 extends Employer{
public static void main(String[] args) {
	Employer e1=new Employer(); 
	e1.setI(14151);
	e1.setS("Premkumar");
	e1.setL(9894559794l);
	Employer e2=new Employer();
	e2.setI(14167);
	e2.setS("Ram");
	e2.setL(9678959794l);
	Employer e3=new Employer();
	e3.setI(15167);
	e3.setS("Ramkumar");
	e3.setL(9698959794l);
	Employer e4=new Employer();
	e4.setI(14158);
	e4.setS("Raju");
	e4.setL(9896777794l);
	ArrayList<Employer> obj=new ArrayList<Employer>();
	obj.add(e3);
	obj.add(e2);
	obj.add(e4);
	obj.add(e1);
	System.out.println("Welcome to Employees Portal");
	for (Employer x : obj) {
		System.out.println("Employee ID: "+x.getI());
		System.out.println("Employee Name: "+x.getS());
		System.out.println("Employee Mobile: "+x.getL());
		System.out.println(" ");
	}
}
}
