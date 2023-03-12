public class Equals{
	public static void main(String[] args){
		String str1 = new String("Hello");
		String str2 = new String("Hey");
		String str3 = new String("Hello");
		System.out.println("str1 equals to str2:"+str1.equals(str2));
		System.out.println("str1 equals to str3:"+str1.equals(str3));
		
	}
}