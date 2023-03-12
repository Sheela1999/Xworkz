public class MethodOverloading{
	public static void main(String[] args){
		byte value = 25;
		call();
		
		run();
		
		ready();
		
	}
	public static void call(){
		System.out.println("print the message");
	}
	
	public static void call(int number){
		System.out.println("print the number");
	}
	
	public static void call(String name,int num){
		System.out.println("print the name and num");
	}
	
	public static void call(Byte numOfStudents, String name,int number){
		System.out.println("name of the student with roll num");
	}
	
	public static void call(boolean question){
		System.out.println("print Mind In My Control");
	}
	
	public static int run(){
		System.out.println("print the run value");
		return 20;
	}
	
	public static String run(int num,String name){
		System.out.println("second method is run");
		return name;
	}
	
	public static void run(short salary){
		System.out.println("my salary");
	}
	
	public static void run(byte num, String name){
		System.out.println("number of students name");
	}
	
	public static void run(float percentage, int num, String name, long rollNo){
		System.out.println("percentage of the student with rollNo");
	}
	
	public static void ready(){
		System.out.println("ready to print");
	}
	
		public static int ready(int num, String name){
		System.out.println("print the name with number");
		return 500;
	}
	
		public static void ready(String name, int num){
		System.out.println("change the order of parameter");
	}
	
		public static String ready(byte number, String name, long salary){
		System.out.println("salary of the person");
		return name;
	}
	
		public static void ready(long salary, byte number,String name){
		System.out.println("number of the salary person");
	}
}