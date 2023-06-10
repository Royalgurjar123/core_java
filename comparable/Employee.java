package rays.comparable;

import java.util.*;

public class Employee implements Comparable<Employee> {
	int id;
	String name;
	String adress;

	public Employee(int id, String name, String adress) {
		this.id = id;
		this.name = name;
		this.adress = adress;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	@Override
	public String toString() {
		return id + " " + name + " " + adress;

	}

	@Override
	public int compareTo(Employee o) {

		if (this.id == o.id) {
			return this.name.compareTo(o.name);

		}
		return this.id - o.id;
	}

}

class OrderById implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.id - o2.id;
	}

}
class OrderByName implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o1.name.compareTo(o2.name);
	}
	
}
class OrderByAddress implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o1.adress.compareTo(o2.adress);
	}
	
}