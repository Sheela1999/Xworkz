public class Parameters{
	public static void main(String[] args){
	   giveNum(25);
		
	   run(3000,"sheela");
	   
	   givenMessage(32000,"mindSet",83.876f);
	   
	   giveName(4352,73.23d,"cat",'s');
		
	}
	
	
	public static int giveNum(int num){
		System.out.println(25);
		return 100;
	}
	
	public static short run(int num,String name){
		System.out.println(num);
		System.out.println(name);
		return 1000;
	}
	
	public static char givenMessage(int salary,String novelName,float results){
		System.out.println(salary);
		System.out.println(novelName);
		System.out.println(results);
		return 's';
	}
	
	public static String giveName(long carNum,double percent,String animal,char consonant){
	    System.out.println(carNum);
		System.out.println(percent);
		System.out.println(animal);
		System.out.println(consonant);
		return "nayana";
		
	}	
}