public class LehmanStudent{
  private String firstName;
  private String lastName;
  private String osis;

  public LehmanStudent(String f, String l, String o){
    firstName = f;
    lastName = l;
    osis = o;

  }

  public  String toString(){
    return "Name: " + firstName + " " + lastName + "\nOSIS: " + osis+"\n";
  }
}
