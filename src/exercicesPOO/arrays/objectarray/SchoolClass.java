package exercicesPOO.arrays.objectarray;

public class SchoolClass {

	String identification;
	String teacherName;
	
	Student[] students;
	
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
