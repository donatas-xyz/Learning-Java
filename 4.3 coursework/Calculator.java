class Calculator
{
  //Evaluate an arithmetic operation on the stored result
  // E.g evaluate( '+',9) would add 9 to the stored result
  //     evaluate( '/',3) would divide the stored result
  //                      by 3
  //     actions are '+'. '-', '*', '/'
  //Note: if the operation is
  //     evaluate( '/',0 ) the result returned should be 0
  long tmp;
  public void evaluate( char action, long number )
  {
      if(action == '+')
      {
          tmp = tmp + number;
      }
      if(action == '-')
      {
          tmp = tmp - number;
      }
      if(action == '*')
      {
          tmp = tmp * number;
      }
      if(action == '/')
      {
          
          if(number == 0)
          {
              tmp = 0;
          }
          else
          {
              tmp = tmp / number;
          }
      }      
  }

  public long getValue()
  {
      return tmp;
  }
  
  public void setValue( long number )
  {
      tmp = number;
  }

  public void reset()
  {
      tmp = 0;
  }

}
