public class ConstructorChainning{
	
	public ConstructorChainning(){
		System.out.println("default constructor");
	}
	
	public ConstructorChainning(int num){
		this();
		System.out.println("parameterized constructor");
	}
	
	public ConstructorChainning(String name){
		this('a');
		System.out.println("parameterized constructor with int");
	}
	
	public ConstructorChainning(float number){
		this(127);
		System.out.println("constructor inside the constructor");
	}
	
	public ConstructorChainning(char letter){
		this(89.23f);
		System.out.println("constructor calling");
	}
	
	public static void main(String[] args){
		ConstructorChainning obj = new ConstructorChainning("sheela");
	}
}