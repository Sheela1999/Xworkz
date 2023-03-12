public class ConstructorProgram1{
	public ConstructorProgram1(){
		System.out.println("default constructor");
	}
	
	public ConstructorProgram1(String name){
		System.out.println("print the number");
	}
	
	public ConstructorProgram1(String name){
		System.out.println("name of the constructor program");
	}
	
	public ConstructorProgram1(long rent){
		System.out.println("hostel rent for one year");
	}
	
	public ConstructorProgram1(char vowel){
		System.out.println("print the vowel");
	}
	
	public static void main(String[] args){
		ConstructorProgram1 obj = new ConstructorProgram1();
		
		ConstructorProgram1 number = new ConstructorProgram1(90);
		
		ConstructorProgram1 name = new ConstructorProgram1("sheela");
		
		ConstructorProgram1 rent = new ConstructorProgram1(30000);
		
		ConstructorProgram1 vowel = new ConstructorProgram1('e');
	}
}