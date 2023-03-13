public class MethodLoIn{
	 static String name = "sheela";
	 static int number = 24;
	 static double percent = 93.89;
	 static char letter = 'a';
	 static byte num = 127;
	
	public static void main(String[] args){
		MethodLoIn obj = new MethodLoIn(name);
		//MethodLoIn obj1 = new MethodLoIn(number);
		//MethodLoIn obj2 = new MethodLoIn(percent);
		//MethodLoIn obj3 = new MethodLoIn(letter);
		//MethodLoIn obj4 = new MethodLoIn(num);
	}
	
	public MethodLoIn(double percent){
		this(127);
		System.out.println(this.percent);
	}
	
	public MethodLoIn(String name){
		this(93.89d);
		System.out.println(this.name);
		
	}
	
	public MethodLoIn(int number){
		this("Sheela");
		System.out.println(this.number);
	}
	
	public MethodLoIn(char letter){
		this(24);
		System.out.println(this.letter);
		
	}
	
	public MethodLoIn(byte num){
		this('a');
		System.out.println(this.num);
		
	}
		
}