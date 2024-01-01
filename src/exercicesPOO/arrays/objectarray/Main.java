package exercicesPOO.arrays.objectarray;

public class Main {

	public static void main(String[] args) {
		
		SchoolClass schoolClassB = new SchoolClass();
		schoolClassB.identification = "Kindergarten B";
		schoolClassB.teacherName = "Teacher Geneviève";
		schoolClassB.students = new Student[3];
		
		Student student1 = new Student();
		student1.age = 39;
		student1.name = "Miria";
		
		schoolClassB.students[0] = student1;
		
	}
	
	
}
