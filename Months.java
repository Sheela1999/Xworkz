public class Months{
	NameOfMonth monthName;
	int noOfMonths;
	byte noOfDaysInMonth;
    static short totalDaysInYear;
    char firstLetterOfMonth;
    boolean isFebHaveLessDaysOrNot;
    static int noOfLessDaysInMonth; 	
	
	public static void main(String[] args){
		Months obj = new Months();
		Months obj1 = new Months(NameOfMonth.MAY, 12,(byte) 31, (short) 365, 'M', true, 28);
		
		System.out.println(obj1.monthName.name);
		System.out.println(obj1.noOfMonths);
		System.out.println(obj1.noOfDaysInMonth);
		System.out.println(Months.totalDaysInYear);
		System.out.println(obj1.firstLetterOfMonth);
		System.out.println(obj1.isFebHaveLessDaysOrNot);
		System.out.println(Months.noOfLessDaysInMonth);	
	}
	
	public Months(){
		System.out.println("Default Constructor");
	}
	
	public Months(NameOfMonth monthName,int noOfMonths,byte noOfDaysInMonth,short totalDaysInYear,char firstLetterOfMonth,  boolean isFebHaveLessDaysOrNot,int noOfLessDaysInMonth){
		this.monthName = monthName;
		this.noOfMonths = noOfMonths;
		this.noOfDaysInMonth = noOfDaysInMonth;
		this.totalDaysInYear = totalDaysInYear;
		this.firstLetterOfMonth = firstLetterOfMonth;
		this.isFebHaveLessDaysOrNot = isFebHaveLessDaysOrNot;
		this.noOfLessDaysInMonth = noOfLessDaysInMonth;
	}
	
}

enum NameOfMonth{
	JANUARY("jan"), FEBRUARY("feb"), MARCH("march"), APRIL("april"), MAY("may"), JUNE("june"), JULY("july"), AUGUST("aug"), SEPTEMBER("sept"), NOVEMBER("nov"),DECEMBER("dec");
	
	String name;
	
	 NameOfMonth(String name){
    this.name = name; 	
	}
} 