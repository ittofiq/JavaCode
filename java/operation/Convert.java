package operation;

public class Convert {
	
	public static void main(String[] args) {
		
		int age = 17;
		double salary = 3200.9;
		boolean isTrue = true;
		String rate = "35";
		
		// Convert to String
		// valueOf untuk convert variable type lain ke String
		String sAge = String.valueOf(age);
		String sSalary = String.valueOf(salary);
		String sTrue = String.valueOf(isTrue);
		
		// Convert to Integer
		// parseInt untuk convert variable type lain ke Integer
		int iRate = Integer.parseInt(rate);
		// (int) convert jika variable type number lain ke Integer
		int iSalary = (int) salary;
		
		// Convert to Double
		// parseDouble untuk convert variable type lain ke Double
		double dRate = Double.parseDouble(rate);
		// (double) convert jika variable type number lain ke Double
		double dAge = (double) age;
		
		
		System.out.println("Age : "+sAge);
		System.out.println("Salary : "+iSalary);
		System.out.println("True : "+sTrue);
		System.out.println("Rate : "+dRate);
				
	}

}
