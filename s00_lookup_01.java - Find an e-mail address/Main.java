class Main
{
  private static String name[];
  private static String eMail[];
  
  public static void main(String args[])
  {
      populate();
      
      System.out.println("#Find e-mail address");
      System.out.print("#Enter name to lookup : ");
      String aName = BIO.getString();
      
      while ( !  aName.equals("END") )
      {
          boolean found = false;
          for (int i=0; i<name.length; i++)
          {
              if (aName.equals(name[i]))
              {
                  System.out.printf("Email address for %s is %s\n",
                                     aName, eMail[i]);
                  found = true;
                  break;
              }
          }
          if ( ! found )
          System.out.printf("Name %s not known\n", aName);
          System.out.print("#Enter name to lookup : ");
          aName = BIO.getString();
      }
  }
  public static void populate()
  {
      name = new String[5];
      eMail = new String[5];
      
      name[0] = "Thomas";     eMail[0] = "t27@brighton.ac.uk";
      name[1] = "Gordon";     eMail[1] = "g56@brighton.ac.uk";
      name[2] = "Clarabelle"; eMail[2] = "c99@brighton.ac.uk";
      name[3] = "Annie";      eMail[3] = "a94@brighton.ac.uk";
      name[4] = "Henry";      eMail[4] = "h11@brighton.ac.uk";

  }
}