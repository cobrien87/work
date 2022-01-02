public class Power{
  private String name;
  private int strength;

  public Power(String my_name, int my_strength){
    name = my_name;
    strength = my_strength;
  }

 /**
 Returns a string with the name of a given power object.
 Precondition: Power object must be initialized.
 Post condition: Returns string name accesseed from the power objects name attribute.

 @return name -the name of the power object
 */
  public String getName(){
    return name;
  }

  /**
  Returns an integer with the value of the Power objects strength.
  Precondition: Power object must be initialized.
  Post condition: Returns integer value accesseed from the power objects strength attribute.

  @return strength -the strength of the power object
  */
  public int getStrength(){
    return strength;
  }
  /**
  Returns an integer with the value of the Power objects strength.
  Precondition: Power object must be initialized. new_strength must be an integer.
  Post condition: No output. Changes the value of the power object's strength attribute.

  */
  public void setStrength(int new_strength){
    strength = new_strength;
  }
}
