package exercicesPOO.arrays.objectarray;

import java.util.Arrays;

public class SchoolClass {

	String identification;
	String teacherName;
	
	Student[] students = new Student[0];
	
	void studentAdd(Student student) {
		this.students = Arrays.copyOf(this.students, this.students.length + 1);
		this.students[students.length  - 1] = student;
	}
	
	void printStudents() {
		
		for(Student student : students) {
			
			if(student != null) {
			System.out.printf("%s (%d ans)%n" , student.name, student.age);
			}else {
				System.out.println(" - Vacant");
			}
		}
	}
}
