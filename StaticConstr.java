public class StaticConstr{
 	static String comapanyName;
	static int salary;
	static byte numOfEmployees;
	static float percentage;
	static double cgpa;
	static char letters;
	static boolean isSheGoing;
	static short bonus;
	static String name;
	static int fees; 
	
	public StaticConstr(){
		System.out.println("Default Constructor");
	} 
	
	public StaticConstr(String comapanyName,int salary,byte numOfEmployees,float percentage,double cgpa,char letters,boolean isSheGoing,short bonus,String name,int fees){
		this.comapanyName = comapanyName;
        this.salary = salary;
        this.numOfEmployees = numOfEmployees;
        this.percentage = percentage;
        this.cgpa = cgpa;
        this.letters = letters;	
        this.isSheGoing	= isSheGoing;
        this.bonus = bonus;
        this.name = name;
        this.fees = fees;	
        System.out.println("print the all properties");		
	}
	
	public static void main(String[] args){
		StaticConstr obj = new StaticConstr();
		StaticConstr obj1 = new StaticConstr("Bosch",55000,(byte) 127,68.93f,7.23d,'A',true,(short) 10000,"Sheela",25000);
	}
}