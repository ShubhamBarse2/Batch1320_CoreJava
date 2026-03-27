package EncapsulationPractiseCode;

public class MainClass {

	public static void main(String[] args) {
//		Demo d = new Demo();
//		d.setId(123);
//		System.out.println(d.getId());

//		Mobile m = new Mobile();
//		m.setUserName("Ram@gmail.com");
//		m.setPassword("Ram@123");
//
//		System.out.println(m.getUserName());
//		System.out.println(m.getPassword());

		Employee e = new Employee();
		e.setEmpId(123);
		e.setName("om");
		e.setCity("pune");
		e.setSalary(240000);
		e.setExp(2);

		System.out.println(e.getEmpId());
		System.out.println(e.getName());
		System.out.println(e.getCity());
		System.out.println(e.getSalary());
		System.out.println(e.getExp());
		System.out.println("--------------------------------");
		Employee e1 = new Employee();
		e1.setEmpId(124);
		e1.setName("ram");
		e1.setCity("pune");
		e1.setSalary(280000);
		e1.setExp(4);

		System.out.println(e1.getEmpId());
		System.out.println(e1.getName());
		System.out.println(e1.getCity());
		System.out.println(e1.getSalary());
		System.out.println(e1.getExp());
	}

}
