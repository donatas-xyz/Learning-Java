
class Main
{
  public static void main( String args[] )
  {
    ModelOfDiary model = new ModelOfDiary();
    ViewOfDiary  view  = new ViewOfDiary();
    Controller   cont  = new Controller( model, view );

    model.addObserver( view );       // Add observer to the model 
    model.addToDay(0);               // Create initial view 
  }
}
