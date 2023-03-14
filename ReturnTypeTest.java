public class ReturnTypeTest{
	public static void main(String[] args){
		
		byte num = giveByte();
		System.out.println(num);
		
		int number = giveInt();
		System.out.println(number);
		
		String name = giveName();
		System.out.println(name);
		
		short value = giveSalary();
		System.out.println(value);
		
		char letter = giveChar();
		System.out.println(letter);
	}
	
	public static byte giveByte(){
		byte num = 127;
		return 20;
	}
	
	public static int giveInt(){
		int number = 50;
		return 10;
	}
	
	public static String giveName(){
		String name = "Sheela";
		return "ganga";
	}
	
	public static short giveSalary(){
		short salary = 32000;
		return 30000;
	}
	
	public static char giveChar(){
		 char letter = 'a';
		return 's';
	}
}