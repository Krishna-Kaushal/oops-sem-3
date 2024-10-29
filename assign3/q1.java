class Employee {
	// fields
	public String name;
	public int id;
	public String dept;
	public String pos;
	
	// constructors
	public Employee() {
		name = "";
		id = 0;
		dept = "";
		pos = "";
	}
	public Employee(String name, int id) {
		this.name = name;
		this.id = id;
	}
	public Employee(String name, int id, String dept, String pos) {
		this.name = name;
		this.id = id;
		this.dept = dept;
		this.pos = pos;
	}
	// overriding built in toString function for a meaningful result
	public String toString() {
		return "name: "+name+" id: "+id+" dept: "+dept+" position: "+pos;
	
	}
}

public class q1 {
	public static void main(String args[]) {
		Employee e1 = new Employee("Susan Meyers", 47899, "Accounting", "Vice President");
		Employee e2 = new Employee("Mark Jones", 39119, "IT", "Programmer");
		Employee e3 = new Employee("Joy Rogers", 81774, "Manufacturing", "Engineer");
		
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);

	}

}