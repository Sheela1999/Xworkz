public class Directions{
	NameOfDirections directionsName;
	int noOfDirections;
	static char firstLetterOfDirection;
	NameOfFourDirections mainFourDirections;
    
    public static void main(String[] args){
		Directions obj = new Directions();
        Directions obj1 = new Directions(NameOfDirections.NORTH, 8, 'S',NameOfFourDirections.EAST);	

        System.out.println(obj1.directionsName);
        System.out.println(obj1.noOfDirections);
        System.out.println(Directions.firstLetterOfDirection);	
        System.out.println(obj1.mainFourDirections);		
	} 
	
	public Directions(){
		System.out.println("Default Constructor");
	}
	
	public Directions(NameOfDirections directionsName,int noOfDirections,char firstLetterOfDirection,NameOfFourDirections mainFourDirections){
		this.directionsName = directionsName;
		this.noOfDirections = noOfDirections;
		this.firstLetterOfDirection = firstLetterOfDirection;
		this.mainFourDirections = mainFourDirections;
		
	}
}

enum NameOfDirections{
	EAST,WEST,SOUTH,NORTH,NORTHWEST,NORTHEAST,SOUTHWEST,SOUTHEAST;
	
}

enum NameOfFourDirections{
	EAST,WEST,SOUTH,NORTH;
}