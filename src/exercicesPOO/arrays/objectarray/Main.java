package exercicesPOO.arrays.objectarray;

public class Main {

	public static void main(String[] args) {
		
		SchoolClass schoolClassB = new SchoolClass();
		schoolClassB.identification = "Kindergarten B";
		schoolClassB.teacherName = "Teacher Geneviève";
		schoolClassB.students = new Student[3];
		
				
		schoolClassB.students[0] = new Student();
		schoolClassB.students[0].age = 39;
		schoolClassB.students[0].name = "Miria";
		
		Student student1 = new Student();
		student1.name = "Maggie";
		student1.age = 6;
		
		schoolClassB.students[1] = student1;
		
		
		schoolClassB.printStudents();
	}
	
	
}
