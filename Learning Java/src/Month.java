//Write a class Month.

//A Month has a constructor that takes the month number as a parameter (1 for January, 2 for February and so forth)
//   public Month(int monthNumber)
//If monthNumber is not 1 to 12, set it to 1

//And 2 methods
//   public String getMonthName() Use if / else if /else if ...
//   public int getNumberOfDays() Do NOT use a separate if / else branch for each month. Use Boolean operators (&&, ||, !).
//       You will have an if then else if then else.
//       For February return 28
//
//These are implemented for you as stubs

//Now write a class MonthPrinter which will instantiate a Month object, ask the user for a month number
//and print the name of the month and the number or days.

//If the month is 6, the output should look exactly like this
//June 30

//If the user enters an invalid month number print this error message: "Number must be 1 through 12"

//If the user enters a non-integer, give this error message: "Not an integer. Terminating"

//To be considered correct, you must enter the message exactly as specified.

//For the draft:
//In Month, provide the constructor and the instance variable.

//In MonthPrinter, ask the user for a number 1 to 12 and create a month object with that number

public class Month
{
    //instance variables
    int number;
	String name;
	int days;

    /**
     * Contructs a Month
     * @param the month number. Must be 1 to 12. For any other number, the month number is set to 1
     */
    public Month(int theMonthNumber)
    {
        if (theMonthNumber >= 1 && theMonthNumber <= 12)
    		this.number = theMonthNumber;
    	else
    		this.number = 1;
    }

    /**
     * Gets the name of this month
     * @return the name of this month
     */
    public String getMonthName()
    {
    	String a = "January";
    	String b = "February";
    	String c = "March";
    	String d = "April";
    	String e = "May";
    	String f = "June";
    	String g = "July";
    	String h = "August";
    	String i = "September";
    	String j = "October";
    	String k = "November";
    	String l = "December";
    	if (this.number == 1)
    		return a;
    	else if(this.number == 2)
    		return b;
    	else if(this.number == 3)
    		return c;
    	else if(this.number == 4)
    		return d;
    	else if(this.number == 5)
    		return e;
    	else if(this.number == 6)
    		return f;
    	else if(this.number == 7)
    		return g;
    	else if(this.number == 8)
    		return h;
    	else if(this.number == 9)
    		return i;
    	else if(this.number == 10)
    		return j;
    	else if(this.number == 11)
    		return k;
    	else if(this.number == 12)
    		return l;
    	else
    		return "no";
    }

    /**
     * Gets the number of days in this month
     * @return the number of days in this month in a non-leap year
     */
    public int getNumberOfDays()
    {
    	if (this.number == 1 || this.number == 3 || this.number == 5 || this.number == 7 || this.number == 8 || this.number == 10 || this.number == 12)
    		return 31;
    	else if (this.number == 4 || this.number == 6 || this.number == 9 || this.number == 11)
    		return 30;
    	else
    		return 28;
    }
}