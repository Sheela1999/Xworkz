public class ConstructorTest{
	
	public ConstructorTest(){
		System.out.println("default constructor");
	}
	
	public ConstructorTest(int percent){
		this();
		System.out.println("parameterized constructor");
	}
	
	public ConstructorTest(String name){
		this(99.23f);
		System.out.println("constructor with String");
	}
	
	public ConstructorTest(char letter){
		this(35000);
		System.out.println("default constructor");
	}
	
	public ConstructorTest(float percent){
		this('a');
		System.out.println("default constructor");
	}
	
	public static void main(String[] args){
		ConstructorTest obj = new ConstructorTest("sheela");
	}
}