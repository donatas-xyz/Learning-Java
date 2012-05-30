import java.util.Map;
import java.util.Observable;


/**
 *   Model of a diary
 */

class ModelOfDiary extends Observable
{
  private DiaryIO dio = new DiaryIO();
  private Map< String, String> diary;  // date, message 

  private int year = 2012, month = 4, day = 23;
  

		  
  public ModelOfDiary()
  {
    diary = dio.read();     // Read previous saved diary 
  }


  // Retrieve the message for the current date, 
  // which is held in the instance variables year, month, day 
  // If the date is not already held return "" (Empty string) 
  public String getMessageForToday()
  {
	  String date = String.format("%04d-%02d-%02d", year, month, day);
      return date;
  }

  // Set the message for the current day 
  // which is held in the instance variables year, month, day 
  public void saveMessageForToday( String message )
  {
	  
  }

  // return the number of days in the month for year 
  // month = 1 - 12, Jan = 1, Feb = 2, etc. 
  // Works for years in the range 1600 - 2400 
  public int maxDaysInMonth( int year, int month )
  {
    // ***  You need to add code here  *** 
    return 31;
  }

  public int getYear()  { return year; }

  public int getMonth() { return month; }

  public int getDay()   { return day; }

  public void addToYear( int add )
  {
    year += add;
    if ( year < 2000 ) year = 2000;
    if ( year > 2100 ) year = 2100;
    int mDays = maxDaysInMonth( year, month );
    if ( day > mDays ) day = mDays;
    setChanged(); notifyObservers();
  }

  public void addToMonth( int add )
  {
    month += add;
    if ( month < 1  ){ addToYear(-1); month = 12; }
    if ( month > 12 ){ addToYear(+1); month = 1;  }
    int mDays = maxDaysInMonth( year, month );
    if ( day > mDays ) day = mDays;
    setChanged(); notifyObservers();
  }

  public void addToDay( int add )
  {
    day += add;
    if ( day < 1 )
    {
      day = 1;              // Avoid endless recursion 
      addToMonth(-1);
      day = maxDaysInMonth( year, month );
    }

    int maxday = maxDaysInMonth( year, month );
    if ( day > maxday )
    {
      day = 1;
      addToMonth(+1);
    }
    setChanged(); notifyObservers();
  }

  public void setDate( int aYear, int aMonth, int aDay )
  {
    day = aDay; month = aMonth; year = aYear;
    setChanged(); notifyObservers();
  }

  public void close()
  {
    dio.write( diary );     // Save the diary to disk 
  }
}
