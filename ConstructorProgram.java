public class ConstructorProgram{
	public ConstructorProgram(){
		System.out.println("default constructor");
	}
	
	public ConstructorProgram(String name){
		System.out.println("name of the constructor program");
	}
	
	public ConstructorProgram(int salary){
		System.out.println("print the salary");
	}
	
	public ConstructorProgram(long rent){
		System.out.println("hostel rent for one year");
	}
	
	public ConstructorProgram(char vowel){
		System.out.println("print the vowel");
	}
	
	public static void main(String[] args){
		ConstructorProgram obj = new ConstructorProgram();
		
		ConstructorProgram number = new ConstructorProgram("Sheela");
		
		ConstructorProgram name = new ConstructorProgram(25000);
		
		ConstructorProgram rent = new ConstructorProgram(30000);
		
		ConstructorProgram vowel = new ConstructorProgram('e');
	}
}