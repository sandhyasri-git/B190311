package p1;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeEx implements Comparable<EmployeeEx> {

	String name,email;
	int deptno,exp;
	
	public static void main(String[] args) {
		ArrayList<EmployeeEx>list=new ArrayList<EmployeeEx>();
		list.add(new EmployeeEx("Hema","Hema@yahoo.com",10,10));
		list.add(new EmployeeEx("Rama","rama@yahoo.com",10,5));
		list.add(new EmployeeEx("Anil","anil@yahoo.com",30,11));
		list.add(new EmployeeEx("Hari","hari@yahoo.com",20,4));
		Collections.sort(list);
		for(EmployeeEx e1:list)
		{
			System.out.println(e1.name+" "+e1.deptno+" "+e1.email+" "+e1.exp);
		}
		
	}

	public EmployeeEx(String name, String email, int deptno, int exp) {
		super();
		this.name = name;
		this.email = email;
		this.deptno = deptno;
		this.exp = exp;
	}

	@Override
	public int compareTo(EmployeeEx emp) {
		if(this.exp==emp.exp)
		{
			return 0;
		}
		else if(this.exp>emp.exp)
		{
			return 1;
		}
		else 
		{
		return -1;
		}
		
	}

}




