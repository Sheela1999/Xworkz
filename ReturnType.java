public class ReturnType{
	public static void main(String[] args){
	byte results = numByte();
    System.out.println(results);
	
    short res = giveShort();
	System.out.println(res);	
	
	int money = wantSalary();
	System.out.println(money);
	
	long number = phoneNumber();
    System.out.println(number);	
	
	float result = numOfStudents();
	System.out.println(result);
	
	double karnataka = literacy();
	System.out.println(karnataka);
	
	char b = name();
    System.out.println(b);
	
	boolean answers = statement();
	System.out.println(answers);
	
	String name = companyName();
	System.out.println(name);	
			
	}
	
	public static byte numByte(){
		byte num = 50;
		return num;	
	}
	
	public static short giveShort(){
		short value = 20000;
		return value;
	}
	
	public static int wantSalary(){
		int salary = 34000;
		return salary;
	}
	public static long phoneNumber(){
		long callNum = 123456789;
		return callNum;
	}
	public static float numOfStudents(){
		float percentage = 73.764f;
		return percentage;
	}
	public static double  literacy(){
		double percnt = 85.378847d;
		return 85.378847d;
	}
	
	public static char name(){
		char nameOfTheGirl = 's';
		return nameOfTheGirl;
	}
	public static boolean statement(){
		boolean question = true;
		return question;
	}
	
	public static String companyName(){
		String coName = "Wipro";
		return coName;
	}
}