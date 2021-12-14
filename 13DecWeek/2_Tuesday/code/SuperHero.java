public class SuperHero{
  private String name;
  private Power power;

  public SuperHero(String n, Power p){
    name = n;
    power = p;
  }

  public void getPowerLevel(){
    System.out.println(name+"'s "+ power.getName() + " power level: " + power.getStrength());
  }

  public void setPowerLevel(int level){
    power.setStrength(level);
  }

}
