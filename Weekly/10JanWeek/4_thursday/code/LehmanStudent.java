public class LehmanStudent {
    //instance variables
    private String firstName;
    private String lastName;
    private int grade;
    private String osis;

    //constructor
    public LehmanStudent(String fname, String lname, int g, String o){
        firstName = fname;
        lastName = lname;
        grade = g;
        osis = o;
    }

    //methods
    public String getFirstName(){
      return firstName;
    }
    public String getlastName(){
      return lastName;
    }
    public int getGrade(){
      return grade;
    }
    public String getOsis(){
      return osis;
    }


    public void setFirstName(String newFn){
       firstName = newFn;
    }
    public String getlastName(String newLn){
      return lastName = newLn;
    }
    public int getGrade(int newGrade){
      return grade = newGrade;
    }
    public String getOsis(String newOs){
      return osis = newOs;
    }


    public String toString(){
        String output = "Name: " + firstName + " " + lastName + "\n";
        output += "Grade: " + grade + "\n";
        output += "OSIS: " + osis + "\n";

        return output;
    }
}
