public class Directions{
	NameOfDirections directionsName;
	int noOfDirections;
	static char firstLetterOfDirection;
    
    public static void main(String[] args){
		Directions obj = new Directions();
        Directions obj1 = new Directions(NameOfDirections.NORTH, 8, 'S');	

        System.out.println(obj1.directionsName);
        System.out.println(obj1.noOfDirections);
        System.out.println(Directions.firstLetterOfDirection);		
	} 
	
	public Directions(){
		System.out.println("Default Constructor");
	}
	
	public Directions(NameOfDirections directionsName,int noOfDirections,char firstLetterOfDirection){
		this.directionsName = directionsName;
		this.noOfDirections = noOfDirections;
		this.firstLetterOfDirection = firstLetterOfDirection;
	}
}

enum NameOfDirections{
	EAST,WEST,SOUTH,NORTH,NORTHWEST,NORTHEAST,SOUTHWEST,SOUTHEAST;
	
}