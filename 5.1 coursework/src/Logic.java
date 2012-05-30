import javax.swing.JTextArea;


class Logic {
	 private enum  State { DESTINATION, PAY };
	  private State state = State.DESTINATION;
	  private JTextArea display1, display2;
	  private String destination = "";
	 
	  private ProcessMoney pm = new ProcessMoney();

	  public Logic( JTextArea area1, JTextArea area2 )
	  {
	    display1 = area1; display2 = area2;
	    display2.setText( "Welcome: Please select your destination" );
	  }
	 
	  public void setDestination( String too, int price )
	  {
	    destination = too;
	    display1.setText( "" );
	    display2.setText( "Cost of a ticket to " + too +
	                      " is " + price + " pence" );
	    state = State.PAY;
	    pm.setTicketPrice( price );
	  }

	  public void process( String button )
	  {
	    if ( state == State.DESTINATION )
	    {
	      if ( button.equals( "Brighton" ) )
	      {
	        setDestination( button, 240 );
	      }
	      else if ( button.equals( "London Road" ) )
	      {
	        setDestination( button, 240 );
	      }
	      else if ( button.equals( "Falmer" ) )
	      {
	        setDestination( button, 240 );
	      }
	      else if ( button.equals( "Lewes" ) )
	      {
	        setDestination( button, 390 );
	      }
	      else
	      {
	        display1.setText( "" );
	        display2.setText( "Please select a destination" );
	      }
	      return;
	    }

	    if ( state == State.PAY )
	    {
	      if ( button.equals( "Buy" ) )
	      {
	        if ( pm.enough() )
	        {
	          pm.bought();
	          display1.setText( "" );
	          display2.setText( "You have now paid for your ticket to " + 
	                            destination + "\n\n" +
	                            "Single ticket for " + destination );
	                          
	          state = State.DESTINATION;
	        } else {
	          display1.setText( "Enter more money: Paid " + 
	                            pm.getPaidSoFar() + " so far" );
	        }
	        return;
	      } 
	      if ( button.equals( "Cancel" ) )
	      {
	        display1.setText( "" );
	        if ( pm.getPaidSoFar() > 0 )
	        {
	          display2.setText( "You money is returned " + 
	                             pm.getPaidSoFar()  + "\n" );
	        } else {
	          display2.setText( "Cancel" + "\n" );
	        }
	        pm.cancel();
	        display2.append("Welcome: Please select your destination" );
	        state = State.DESTINATION;
	        return;
	      }

	      // Only valid entry is enter amount a number 

	      try
	      {
	        int entered = 0;
	        entered = Integer.parseInt( button.trim() );
	        pm.add( entered );
	        display1.setText( "You have paid " + 
	                          pm.getPaidSoFar() + " so far" );

	      } catch ( Exception err )
	      {
	        display1.setText( "" );
	        display1.setText( "Invalid entry: " +
	                          "You have paid " + 
	                           pm.getPaidSoFar() + " so far" );
	      }
	    }

	  }
}
