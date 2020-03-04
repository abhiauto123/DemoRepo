package interfaceexamples;

interface Exam{
	void percentage();
}

class Student{
	
	String name;
	int rollNo;
	int m1;
	int m2;
	int m3;
	
	Student(String name, int rollNo, int m1, int m2, int m3){
		this.name = name;
		this.rollNo = rollNo;
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
		
		System.out.println("Student Name = "+name);
		System.out.println("Student Roll No = "+rollNo);
		System.out.println("Marks in m1 = "+m1);
		System.out.println("Marks in m2 = "+m2);
		System.out.println("Marks in m3 = "+m3);
	}
}

class Results extends Student implements Exam{

	Results(String name, int rollNo, int m1, int m2, int m3) {
		super(name, rollNo, m1, m2, m3);
	}

	@Override
	public void percentage() {
		int total = m1+m2+m3;
		int percentage = total/3;
		System.out.println("The percentage marks scored = "+percentage);
		
	}	
}

public class Tester5 {

	public static void main(String[] args) {
		Results r1 = new Results("Rama",22, 80,99,98);
		r1.percentage();
		System.out.println("===========================");
		Results r2 = new Results("Shyam", 44, 88, 99, 100);
		r2.percentage();

	}

}
