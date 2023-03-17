public class StaticBlock{
	
	public static void main(String[] args){
		
		Method obj = new Method("sheela", 89.90f, 7.23d);
		
		System.out.println(obj.name);
		System.out.println(obj.percentage);
		System.out.println(obj.cgpa);
		
		System.out.println(Method.university);
		System.out.println(Method.noOfColleges);
		System.out.println(Method.fees);
		System.out.println(Method.sections);
		System.out.println(Method.noOfClasses);
		
		Method.call();
		Method.run();		
	}
		
public static class Method{
	static String university;
	static byte noOfColleges;
    static int fees;
    static char sections;
    static short noOfClasses;

    String name;
    float percentage;
    double cgpa;   
 
 static{
	university = "VTU";
	noOfColleges = 127;
	fees = 35000;
	sections = 'D';
	noOfClasses = 3000;
    } 
	
public Method(){
	System.out.println("Default Constructor");
}

public Method(String name, float percentage, double cgpa){
	this.name = name;
	this.percentage = percentage; 
	this.cgpa = cgpa;
	System.out.println("parameterized constructor");
}
	public static void call(){
		System.out.println("calling the static method");
	}
	
	public static void run(){
		System.out.println("calling the static second method");
	}
	
}


}