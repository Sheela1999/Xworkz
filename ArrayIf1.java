public class ArrayIf1{
	
	public static void main(String[] args){
		int price[] = {1000,2200,3500,4000,55000,6987,7436,8000,9534};
		System.out.println(price[4]);
		
		
		for(int i=0; i<price.length; i++){
			System.out.println(price[i]);
		
		
		if(price[1]==2200){
			System.out.println("if statement will execute");
		}
		else
		{
			System.out.println("else statement will execute");
		}
		
		if(price[5]!=6987){
			System.out.println("if statement will execute");
		}
		else
		{
			System.out.println("else statement will execute");
		}
		
		if(price[0]==1000){
			System.out.println("if statement will execute");
		}
		else
		{
			System.out.println("else statement will execute");
		}
		
		if(price[8]!=9534){
			System.out.println("if statement will execute");
		}
		else
		{
			System.out.println("else statement will execute");
		}
		
		if(price[3]!=0){
			System.out.println("if statement will execute");
		}
		else
		{
			System.out.println("else statement will execute");
		}
	}
}
}