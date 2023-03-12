public class EqualsN{
	public static void main(String[] args){
		String dance = "Classic";
		String dances = new String("Classic");
		System.out.println(dance==dances);
		
		String cosmetic = "Lakme";
		String cosmetics = new String("lakme");
		System.out.println(cosmetic==cosmetics);
		
		String novel = "WingsOfFire";
		String novels = new String("WingsOfFire");
		System.out.println(novel==novels);
		
		String animals = "Horse";
		String animal = new String("Horse");
		System.out.println(animals==animal);
		
		String bird = "Owl";
		String birds = new String("Owl");
		System.out.println(bird==birds);
	}
}