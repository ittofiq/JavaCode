package variable;

public class Variable {
	
	/*
	 * Class variable atau static variable adalah variable yang di deklarasikan dengan menggunakan keyword "static". 
	 * Class variable di deklarasikan di dalam kelas, tetapi diluar method atau blok statement.
     * Static variable biasanya digunakan dalam mendefiniskan konstanta, yaitu variable yang mempunyai nilai tetap atau tidak dapat dirubah.
     * Sintak dasar konstanta adalah  public/prive static final nama_konstanta.
     * Static variable dibuat ketika program dijalankan dan dihancurkan ketika program berhenti.
     * Static variable mempunyai nilai default sama seperti instance variable, 
     * yaitu jika bertipe number maka nilai defaultnya 0, 
     * sedangkan kalau bertipe boolean maka nilai defaultnya false, 
     * dan kalau bertipe objek, maka nilai defaultnya adalah null.
	 *
	 */
	
	// Static Variable
	public static final int ID_NUMBER = 1234567890;
	
	
	/*
	 * Instance variable adalah variable yang di deklarasikan di dalam kelas tetapi diluar method, 
	 * konstruktor maupun blok statement.
	 * Instance variable dibuat ketika sebuah objek dibuat yaitu menggunakan keyword "new". 
	 * Instance variable dihancurkan (destroyed) ketika sebuah objek dihancurkan.
	 * Instance variable dapat menggunakan access modifier seperti private, public, protected, dan default.
	 * 
	 */
	
	// Instance variable
	String name;
	int age;
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	
	public static void main(String[] args) {
		
		/*
    	 *	Local variable adalah variable yang di deklarasikan di dalam method, 
    	 *	konstruktor ataupun blok statement.
    	 *	Dilarang memberikan access modifier pada local variable.
    	 *	Local variable tidak mempunyai default value, 
    	 *	jadi kita harus mendeklarasikan dan memberi nilai sebelum variable itu digunakan.
		 *
		 */
		
		// Local variable
		double salary = 850.6;
		char gender = 'm';	// Khusus variable tipe Char menggunakan tanda baca ''
		float pi = 3.4f;
		
		// Objek dengan instance variable dibuat
		Variable var = new Variable();
		var.setName("Ittofiq Surgawan");
		var.setAge(17);
		
		System.out.println("ID : "+ ID_NUMBER);
		System.out.println("Name : "+ var.getName());
		System.out.println("Age : "+ var.getAge());
		System.out.println("Salary : "+salary);
		System.out.println("Gender : "+gender);
		System.out.println("Pi : "+pi);
	}

}
