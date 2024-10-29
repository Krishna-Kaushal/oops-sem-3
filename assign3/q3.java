class PersonalInfo {
	// attributes
	String name;
	String add;
	int age;
	String phone;
	
	// constructor 
	public PersonalInfo(String name, String add, int age, String phone) {
		this.name = name;
		this.add = add;
		this.age = age;
		this.phone = phone;
	}
	
	// accessors
	public String getName() {return name;}
	public String getAdd() {return add;}
	public int getAge() {return age;}
	public String getPhone() {return phone;}
	
	// modifier
	public void setName(String name) {this.name = name;}
	public void setAdd(String add) {this.add = add;}
	public void setAge(int age) {this.age = age;}
	public void setPhone(String phone) {this.phone = phone;}
}

class q3 {
	public static void main (String args[]) {
		PersonalInfo p1 = new PersonalInfo("Krishna Kaushal", "India", 18, "1234567890");
		PersonalInfo p2 = new PersonalInfo("KumarAdithya", "Singapore", 21, "0987654321");
		PersonalInfo p3 = new PersonalInfo("Janwar", "Pakistan", 22, "0987654322");
	}
}