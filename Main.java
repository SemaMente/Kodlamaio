
public class Main {

	public static void main(String[] args) {

		Student student = new Student();
		student.setFirstName("Sema");

		Instructor instructor = new Instructor();
		instructor.setFirstName("Engin");

		StudentManager studentManager = new StudentManager();
		studentManager.updateSProfil(student);

	}
}