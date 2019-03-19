package p1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee
{
	String name,email;
	int deptno,exp;
	public Employee(String name, String email, int deptno, int exp) {
		super();
		this.name = name;
		this.email = email;
		this.deptno = deptno;
		this.exp = exp;
	}
	
}
class emailComparator implements Comparator<Employee>
{

@Override
public int compare(Employee o1, Employee o2) {
	return (o1.email.compareTo(o2.email));

}
}
class expComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.exp>o2.exp)
		{
			return 1;
		}
		else if (o1.exp==o2.exp)
		{
		return 0;
		}
		else
		{
			return -1;
		}
	}
	
	
}
	


public class Driver {

	public static void main(String[] args) {
		ArrayList<Employee>list=new ArrayList<Employee>();
		list.add(new Employee("Hema","Hema@yahoo.com",10,10));
		list.add(new Employee("Rama","rama@yahoo.com",10,5));
		list.add(new Employee("Anil","anil@yahoo.com",30,11));
		list.add(new Employee("Hari","hari@yahoo.com",20,4));
		System.out.println("Email wise comparision");
		Collections.sort(list, new emailComparator());
		for(Employee e1:list)
		{
			System.out.println(e1.email+" "+e1.name);
		}
		System.out.println("Exp wise comparision");
		Collections.sort(list, new expComparator());
		for(Employee e1:list)
		{
			System.out.println(e1.email+" "+e1.exp);
		}
	}

}











