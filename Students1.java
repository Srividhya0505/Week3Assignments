package week3.day1;

public class Students1 {

	private void getStudentInfo(int id) {
		System.out.println(id);

	}
	
	private void getStudentInfo(int id, String name, String emailID, String phNo) {
		System.out.println(id);
		System.out.println(name);
		System.out.println(emailID);
		System.out.println(phNo);

	}
public static void main(String[] args) {
	Students1 mystud = new Students1();
    mystud.getStudentInfo(100);
    mystud.getStudentInfo(101, "Srividhya", "srisrini05@gmail.com", "8754595830");
    mystud.getStudentInfo(102, "Harivatsan", "harivatsgmail.com", "9962040678");
    mystud.getStudentInfo(201);
}

}
