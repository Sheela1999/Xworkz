public class ParametersTest{
	public static void main(String[] args){
		call("Sheela",25);
	}
	
	public static void call(){
		System.out.println("call the first method");
	}
	
	public static void call(String name, int number){
		System.out.println("call the second method");
	}
	
	public static void call(int num, String name, byte numb){
		System.out.println("call the third method");
	}
	
	public static void call(String name,byte numb, int num){
		System.out.println("call the fourth method");
	}
	
	public static void call(float percent, short salary,long rent,char letter){
		System.out.println("call the fifth method");
	}
	
	public static void call(char letters, int numbers){
		System.out.println("call the sixth method");
	}
	
}