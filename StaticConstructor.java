public class StaticConstructor{
	String comapanyName;
	int salary;
	byte numOfEmployees;
	float percentage;
	double cgpa;
	char letters;
	boolean isSheGoing;
	short bonus;
	String name;
	int fees; 
	
	public StaticConstructor(){
		System.out.println("Default Constructor");
	} 
	
	public StaticConstructor(String comapanyName){
		this.comapanyName = comapanyName;	
		System.out.println("parameterized constructor");
	}
	
	public StaticConstructor(String comapanyName, int salary){
		this.comapanyName = comapanyName;
        this.salary = salary;
        System.out.println("print the variables");		
	}
	
	public StaticConstructor(String comapanyName, int salary, byte numOfEmployees){
		this.comapanyName = comapanyName;
        this.salary = salary;
        this.numOfEmployees = numOfEmployees;
        System.out.println("print the variables with num of employees"); 		
	}
	
	public StaticConstructor(String comapanyName, int salary, byte numOfEmployees, float percentage){
		this.comapanyName = comapanyName;
        this.salary = salary;
        this.numOfEmployees = numOfEmployees;
        this.percentage = percentage;
        System.out.println("parameterized constructor with float");		
	}
	
	public StaticConstructor(String comapanyName, int salary, byte numOfEmployees, float percentage, double cgpa){
		this.comapanyName = comapanyName;
        this.salary = salary;
        this.numOfEmployees = numOfEmployees;
        this.percentage = percentage;
        this.cgpa = cgpa;
        System.out.println("print the constuctor with cgpa");		
	}
	
	public StaticConstructor(String comapanyName, int salary, byte numOfEmployees, float percentage, double cgpa,char letters){
		this.comapanyName = comapanyName;
        this.salary = salary;
        this.numOfEmployees = numOfEmployees;
        this.percentage = percentage;
        this.cgpa = cgpa;
        this.letters = letters;
        System.out.println("first letter of the vowel");		
	}
	
	public StaticConstructor(String comapanyName,int salary,byte numOfEmployees,float percentage,double cgpa,char letters,boolean isSheGoing){
		this.comapanyName = comapanyName;
        this.salary = salary;
        this.numOfEmployees = numOfEmployees;
        this.percentage = percentage;
        this.cgpa = cgpa;
        this.letters = letters;	
        this.isSheGoing	= isSheGoing;
        System.out.println("print the answer");		
	}
	
	public StaticConstructor(String comapanyName,int salary,byte numOfEmployees,float percentage,double cgpa,char letters,boolean isSheGoing,short bonus){
		this.comapanyName = comapanyName;
        this.salary = salary;
        this.numOfEmployees = numOfEmployees;
        this.percentage = percentage;
        this.cgpa = cgpa;
        this.letters = letters;	
        this.isSheGoing	= isSheGoing;
        this.bonus = bonus;
        System.out.println("print the employees bonus");		
	}
	
	public StaticConstructor(String comapanyName,int salary,byte numOfEmployees,float percentage,double cgpa,char letters,boolean isSheGoing,short bonus,String name){
		this.comapanyName = comapanyName;
        this.salary = salary;
        this.numOfEmployees = numOfEmployees;
        this.percentage = percentage;
        this.cgpa = cgpa;
        this.letters = letters;	
        this.isSheGoing	= isSheGoing;
        this.bonus = bonus;
        this.name = name;
        System.out.println("Bosch company Employee name");		
	}
	
	public StaticConstructor(String comapanyName,int salary,byte numOfEmployees,float percentage,double cgpa,char letters,boolean isSheGoing,short bonus,String name,int fees){
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
        System.out.println("print the fees");		
	}
	
	public static void main(String[] args){
		StaticConstructor obj = new StaticConstructor();
		StaticConstructor obj1 = new StaticConstructor("Bosch");
		StaticConstructor obj2 = new StaticConstructor("Bosch",55000);
		StaticConstructor obj3 = new StaticConstructor("Bosch",55000,(byte) 127);
		StaticConstructor obj4 = new StaticConstructor("Bosch",55000,(byte) 127,68.93f);
		StaticConstructor obj5 = new StaticConstructor("Bosch",55000,(byte) 127,68.93f,7.23d);
		StaticConstructor obj6 = new StaticConstructor("Bosch",55000,(byte) 127,68.93f,7.23d,'A');
		StaticConstructor obj7 = new StaticConstructor("Bosch",55000,(byte) 127,68.93f,7.23d,'A',true);
		StaticConstructor obj8 = new StaticConstructor("Bosch",55000,(byte) 127,68.93f,7.23d,'A',true,(short) 10000);
		StaticConstructor obj9 = new StaticConstructor("Bosch",55000,(byte) 127,68.93f,7.23d,'A',true,(short) 10000,"Sheela");
		StaticConstructor obj1o = new StaticConstructor("Bosch",55000,(byte) 127,68.93f,7.23d,'A',true,(short) 10000,"Sheela",25000);
	}
}