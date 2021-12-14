public class Power{
  private String name;
  private int strength;

  public Power(String my_name, int my_strength){
    name = my_name;
    strength = my_strength;
  }

  public String getName(){
    return name;
  }

  public int getStrength(){
    return strength;
  }

  public void setStrength(int new_strength){
    strength = new_strength;
  }
}
