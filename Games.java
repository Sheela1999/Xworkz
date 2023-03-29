public class Games{
	final String gameName = "Badminton";
	final byte noOfPlayers = 2;
	final String type = new String("Indoor");
	final String surface = "rectangular";
	final String firstPlayerName = "SainaNehwal";
	long noOfAudience = 3890765;
	int noOfGames = 40;
	char firstLetterOfGame ='B';
	static long prizeAmount = 3250000;
	boolean isThereAnyRulesForGames = true;
	static String coachName = "pullelaVimal";
	static short coachSalary = 32743;
    float likeGames = 69.03f;
    double doNotLikeGames = 5.3d;
    static byte noOfMatchs = 3;
    static String courtName = "pullela";
    NameOfTheGames gamesName;
    NameofThePrize prizeName;
    NameOfThePlayers playersName;
	GiveJerseyColours jerseyColours;
	NameOfTheEquipments equipmentName;
 	
	public static void main(String[] args){
		Games obj = new Games(NameOfTheGames.CHESS,NameofThePrize.GOLDMEDAL,NameOfThePlayers.PVSINDHU,GiveJerseyColours.BLUE,NameOfTheEquipments.RACKET);
		System.out.println(obj.gamesName.name);
		System.out.println(obj.prizeName);
		System.out.println(obj.playersName);
		System.out.println(obj.jerseyColours);
		System.out.println(obj.equipmentName);
		
		docompareToIgnoreCase("tenniscourt");
		dojoin("play");
		givelastIndexOf("vimal");
		givetoUpperCase("shape");
		getsubstring(4);
		givetoString("nehwal");
		giveisEmpty();
		givevalueOf('d');
		giveintern("pullela");
		givelength("5");
	}
	public static int docompareToIgnoreCase(String courtName){
		int value = courtName.compareToIgnoreCase("PULLELA");
		System.out.println(value);
		return 55;
		}
		
		public static String dojoin(String gameName){
			String res = gameName.join("-","Badminton","Play");
			System.out.println(res);
            return "game";			
		}
		
		public static int givelastIndexOf(String coachName){
			int value1 = coachName.lastIndexOf("pullelaVimal");
			System.out.println(value1);
			return 24;
		}
		
		public static String givetoUpperCase(String surface){
			String res1 = surface.toUpperCase("rectangular");
			System.out.println(res1);
			return "flat";
		}
		
		public static String givetoString(String firstPlayerName){
			String res2 = firstPlayerName.toString("SainaNehwal");
            System.out.println(res2);
            return "sindhu";		
		}
		
		public String getsubstring(int noOfPlayers){
			String result = noOfPlayers.substring(7);
			System.out.println(result);
			return "shee";
		}
		
		public boolean giveisEmpty(){
			boolean resultName ="sheela".isEmpty();
			System.out.println(resultName.isEmpty());
			return true;
		}
		
		public static String givevalueOf(char firstLetterOfGame){
			String result = firstLetterOfGame.valueOf('B');
			System.out.println(result);
			return "pullela";
		}
		
		public String giveintern(String coachName){
			String result1 = coachName.intern("pullelaVimal");
			System.out.println(result1);
			return "BothCoachNames";
		}
		
		public int givelength(String value){
			int res2 = "PVSINDHU".length("2");
			System.out.println(res2);
			return 67;
		}	
		
	public Games(NameOfTheGames gamesName,NameofThePrize prizeName,NameOfThePlayers playersName,GiveJerseyColours jerseyColours,NameOfTheEquipments equipmentName){
		this.gamesName = gamesName;
		this.prizeName = prizeName;
		this.playersName = playersName;
		this.jerseyColours = jerseyColours;
		this.equipmentName = equipmentName;
	}
	
	
}

enum NameOfTheGames{
	CHESS("chess"),AQUATICS("aqua"),ARCHERY("arch"),ATHLETICS("athlet"),TENNIS("tennis"),BASKETBALL("basball");
	
	String name;
	
	NameOfTheGames(String name){
    this.name = name; 	
	}
}

enum NameofThePrize{
	GOLDMEDAL,SILVERMEDAL,BRONZEMEDAL;
}

enum NameOfThePlayers{
	PVSINDHU,SAINANEHWAL,LAKSHYASEN;
}

enum GiveJerseyColours{
	BLUE,PINK,BLACK;
}

enum NameOfTheEquipments{
	SHUTTLECOCK,RACKET,BADMINTONNET;	
}