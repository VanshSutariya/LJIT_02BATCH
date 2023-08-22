package polymorphismExample;

import java.util.*;

class student{
	
	String studName,address;
	int adhar,phone,parentPhone;
	
	student(int adhar){
		this.adhar = adhar;
		System.out.println("adhar : "+adhar);
	}
	
	student(String studName, String address) {
		this.studName = studName;
		this.address = address;
		System.out.println("Name : "+studName);
		System.out.println("Address : "+address);
	}
	
	student(int phone, int parentPhone) {
		this.phone = phone;
		System.out.println("phone : "+phone);
		this.parentPhone = parentPhone;
		System.out.println("parentPhone : "+parentPhone);
	}
}

public class InClass {
	public static void main(String[] args) {
		student s = new student("vatsal","fafsdfsfsfsfsfsd");
		student s1 = new student(1323442424);
		student s2 = new student(1323442424,23423423);
		
	}
}
