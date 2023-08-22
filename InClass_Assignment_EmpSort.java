package mycollection;

import java.util.*;

class emp{
	private int empId,empSalary;
	private String empName;
	public emp(int empId, int empSalary, String empName) {
		super();
		this.empId = empId;
		this.empSalary = empSalary;
		this.empName = empName;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public int getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	@Override
	public String toString() {
		return "emp [empId=" + empId + ", empSalary=" + empSalary + ", empName=" + empName + "]";
	}
	
}
class idCompare implements Comparator<emp>{
	@Override
	public int compare(emp e,emp e1) {
		
		if(e.getEmpId() == e1.getEmpId()) {return 0;}
		else if(e.getEmpId() > e1.getEmpId()){return 1;}
		else{return -1;}
		
	}
}

class salaryCompare implements Comparator<emp>{
	@Override
	public int compare(emp e,emp e1) {
		
		if(e.getEmpSalary() == e1.getEmpSalary()) {return 0;}
		else if(e.getEmpSalary() > e1.getEmpSalary()){return 1;}
		else{return -1;}
		
	}
}

class nameCompare implements Comparator<emp>{
	@Override
	public int compare(emp e,emp e1) {
		
		return e.getEmpName().compareTo(e1.getEmpName());
		
	}
}

public class InClass_Assignment_EmpSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<emp> emp1 = new ArrayList<emp>();
		emp1.add(new emp(11,10000,"ram"));
		emp1.add(new emp(91,65000,"jay"));
		emp1.add(new emp(81,9000,"raj"));
		emp1.add(new emp(1,25000,"vatsal"));
		emp1.add(new emp(62,40000,"sky"));
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1 : id Sort , 2 : Salary sort , 3 : Name sort");
		int a = sc.nextInt();
		
		switch(a) {
		
			case 1 : 
				System.out.println("------Sorted based on id------");
				Collections.sort(emp1, new idCompare());
				for(emp e : emp1) {
					System.out.println(e);
				}
				break;
			case 2 : 
				System.out.println("------Sorted based on salary------");
				Collections.sort(emp1, new salaryCompare());
				for(emp e : emp1) {
					System.out.println(e);
				}
				break;
			case 3 : 
				System.out.println("------Sorted based on Name------");
				Collections.sort(emp1, new nameCompare());
				for(emp e : emp1) {
					System.out.println(e);
				}
				break;
			default :
				System.out.println("Invalid Input");
				break;
		}
	}	
}
