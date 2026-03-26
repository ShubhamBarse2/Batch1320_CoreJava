package ContructorDay2_Code;

public class StudMain {

	public static void main(String[] args) {

		Student stud = new Student(123, "Amit", "pune");
		Student s1 = new Student(stud);
		s1.name = "Raj";

		stud.viewInfo();
		s1.viewInfo();
	}

}
