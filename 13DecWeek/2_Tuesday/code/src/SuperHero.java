public class SuperHero{
  private String name;
  private Power power;

  public SuperHero(String n, Power p){
    name = n;
    power = new Power(p.getName(), p.getStrength());
  }
  /**
  Prints the objects power level.
  Precondition: Power object must be initialized.
  Postcondition: Prints a string.
  */
  public void getPowerLevel(){
    System.out.println(name+"'s "+ power.getName() + " power level: " + power.getStrength());
  }
  /**
   Changes objects power level depending on input.
   Precondition: Power object must be initialized. Argument level must be an integer.
   Post condition: side effect is changing value of strenghth attribute in objects Power attribute.
  */
  public void setPowerLevel(int level){
    power.setStrength(level);
  }

}
