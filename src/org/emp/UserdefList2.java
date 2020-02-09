package org.emp;

import java.util.Scanner;

public class UserdefList2 {
int empId;
String name;
long phone;
int salary;
	public void Get() {
	Scanner in=new Scanner(System.in);
	System.out.print("Enter the empId: ");
    in.nextInt();
    System.out.print("Enter the Name: ");
    in.toString();
    System.out.print("Enter the Mobile Number");
    in.nextLong();
    System.out.print("Enter the Salary: ");
    in.nextInt();
    in.close();
    System.out.println("He Pinged me Enjoy Panra da");
	}
	public static void main(String[] args) {
		UserdefList2 u=new UserdefList2();
		for (int i = 0; i < 3; i++) {
			u.Get();
		}
	}
}
