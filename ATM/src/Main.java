
/**
 * BCS C1a
 * Main.java
 * Purpose: Invokes GUI.
 * 
 * For testing purposes user ID 9 and password (PIN) 71 can be used.
 *
 * @version 0.1 12/05/2012
 * @author Mike Smith
 */
class Main
{ 
  public static void main( String args[] )
  {
    GUIaccount gui = new GUIaccount();
    gui.display();
  }
}

// References:
// 
// PostgreSQL monetary types: http://www.postgresql.org/docs/8.3/static/datatype-money.html
// Characters' encoding problem: http://postgresql.1045698.n5.nabble.com/invalid-byte-sequence-for-encoding-quot-UTF8-quot-td2140640.html
// PostgreSQL Java tutorial: http://zetcode.com/db/postgresqljavatutorial/
// PostgreSQL and JDBC FAQ: http://www.fankhausers.com/postgresql/jdbc/

// Bibliography
//
// D. Flanagan. "Java in a nutshell - A desktop quick reference". 5th edition.