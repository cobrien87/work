public class MyProgram{

  public static void main(String[] args){
    Power oop = new Power("Object oriented programming", 10);
    SuperHero java_man = new SuperHero("Java Man", oop);
    SuperHero cplus_plus_boy  = new SuperHero("C++ boy", oop);
    java_man.getPowerLevel();
    cplus_plus_boy.getPowerLevel();
    java_man.setPowerLevel(8);
    java_man.getPowerLevel();
    cplus_plus_boy.getPowerLevel();

  }
}
