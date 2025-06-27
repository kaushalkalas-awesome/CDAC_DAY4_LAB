import java.util.Scanner;

class Date{
	
	private int day, month, year;
	
	Date(int day, int month, int year){
		this.day = day;
		this.month = month;
		this.year = year;
	}

	
	//@return the day
	public int getDay() {
		return day;
	}

	
	//@param day the day to set
	public void setDay(int day) {
		this.day = day;
	}

	
	//@return the month
	public int getMonth() {
		return month;
	}

	
	//@param month the month to set
	public void setMonth(int month) {
		this.month = month;
	}

	
	//@return the year
	public int getYear() {
		return year;
	}

	
	//@param year the year to set
	public void setYear(int year) {
		this.year = year;
	}
	
}

class DateTest{

	Date d = new Date(8,8,2005);
	Scanner sc = new Scanner(System.in);
	
	void setDate() {
		System.out.print("Enter Day: ");
		d.setDay(sc.nextInt());
		System.out.print("Enter Month: ");
		d.setMonth(sc.nextInt());
		System.out.print("Enter Year: ");
		d.setYear(sc.nextInt());
	}
	
	public void displayDate() {
		System.out.println("Date: "+d.getDay()+"/"+d.getMonth()+"/"+d.getYear());
	}
}

public class ProgramOne {

	public static void main(String[] args) {
		DateTest dt = new DateTest();
		dt.displayDate();
		
		dt.setDate();
		dt.displayDate();
	}

}
