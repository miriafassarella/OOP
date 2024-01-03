package exercicesPOO.arrays.objectarray;

public class Main {

	public static void main(String[] args) {
		
		SchoolClass schoolClassB = new SchoolClass();
		schoolClassB.identification = "Kindergarten B";
		schoolClassB.teacherName = "Teacher Geneviève";
				
		
		Student student1 = new Student();
		student1.name = "Maggie";
		student1.age = 6;
		
		schoolClassB.studentAdd(student1);
		
		
		schoolClassB.printStudents();
	}
	
	
}
