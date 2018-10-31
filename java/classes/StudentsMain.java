package classes;

public class StudentsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Students st = new Students("John", Gender.Male);
		
		System.out.println("FirstName : "+st.firstname);
		System.out.println("Gender : "+st.gender);
	}

}
