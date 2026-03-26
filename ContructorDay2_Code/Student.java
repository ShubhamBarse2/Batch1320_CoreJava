package ContructorDay2_Code;

public class Student {

	int studId;
	String name;
	String city;

	public Student(int studId, String name, String city) {
		this.studId = studId;
		this.name = name;
		this.city = city;
	}

	public Student(Student s) {
		this.studId = s.studId;
		this.name = s.name;
		this.city = s.city;
	}

	public void viewInfo() {
		System.out.println("------------------------------");
		System.out.println(studId + " " + name + "  " + city);
	}

}
