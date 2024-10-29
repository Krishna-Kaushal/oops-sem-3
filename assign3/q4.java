class Payroll {
	// attributes
	public String name;
	public int id;
	public int rate;
	public int hours;
	
	// constructor 
	public Payroll(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	// accessors
	public String getName() {return name;}
	public int getId() {return id;}
	public int getrate() {return rate;}
	public int gethours() {return hours;}
	
	// mutators
	public void setName(String name) {this.name = name;}
	public void setId(int id) {this.id = id;}
	public void setRate(int rate) {this.rate = rate;}
	public void setHours(int hours) {this.hours = hours;}
	
	// methods
	public int grossRate() {
		return hours * rate;
	}
}

public class q4 {
	public static void main (String args[]) {
		Payroll p1 = new Payroll("Kumar", 101);
		p1.rate = 10;
		p1.hours = 10;
		System.out.println(p1.grossRate());
	}

}