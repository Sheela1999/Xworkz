public class StaticVariables{
	
	public static void main(String[] args){
		
		program obj = new program();
		
		obj.companyName = "Bosch";
		obj.rent = 35000;
		obj.number = 127;
		obj.consonant = 'B';
		obj.percentage = 78.93f;
		
		System.out.println(obj.companyName);
		System.out.println(obj.rent);
		System.out.println(obj.number);
		System.out.println(obj.consonant);
		System.out.println(obj.percentage);
		
		program.mobileNo = 1256789023;
		program.area = "BTM";
		program.salary = 25000;
		program.percent = 92.33;
		program.isThisJavaEasy = true;
			
		System.out.println(program.mobileNo);
		System.out.println(program.area);
		System.out.println(program.salary);
		System.out.println(program.percent);
		System.out.println(program.isThisJavaEasy);
				
		
	}
	
	public static class program{
		
		String companyName;
		int rent;
		byte number;
		char consonant;
		float percentage;
		
		static long mobileNo;
		static String area;
		static short salary;
		static double percent;
		static boolean isThisJavaEasy; 
	}
}