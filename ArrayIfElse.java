public class ArrayIfElse{
	  static String city[] = {"Goa","gadag","belagavi","hubli"};
		
	public static void main(String[] args){
		
		for(int i=0; i<=3; i++){
		System.out.println(city[i]);
	
	
	if(city[i]=="gadag"){
		System.out.println("if statement execute");
	}
	else
	{
		System.out.println("else statement execute");
	}
	
	if(city[i]!="belagavi"){
		System.out.println("if statement execute");
	}
	else
	{
		System.out.println("else statement execute");
	}
	
	if(city[3]=="hubli"){
		System.out.println("if statement execute");
	}
	else
	{
		System.out.println("else statement execute");
	}
	
	if(city[i]=="goa"){
		System.out.println("if statement execute");
	}
	else
	{
		System.out.println("else statement execute");
	}
	
	if(city[0]!="gadag"){
		System.out.println("if statement execute");
	}
	else
	{
		System.out.println("else statement execute");
	}
	}
	
	}
	}
