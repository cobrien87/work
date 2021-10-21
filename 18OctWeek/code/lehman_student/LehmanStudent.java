public class LehmanStudent {
    //instance variables
    private String firstName;
    private String lastName;
    private int grade;
    private String osis;
    //base year is the end of the current school year
    private int baseYear = 2022;
    //constructor
    public LehmanStudent(String fname, String lname, int g, String o){
        firstName = fname;
        lastName = lname;
        grade = g;
        osis = o;
    }
   //methods
   private int getGradYear(){
     //return the year student is expected to graduate
     int yearsToGraduate = 12 - grade;
     int gradYear = yearsToGraduate + baseYear;
     return  gradYear;
   }
   public void printGradYear(){
     System.out.println(firstName + " graduates in " + getGradYear());
   }
   public void setBaseYear(int year){
     //sets the base year
     baseYear = year;
   }
   public String getBaseYear(){
     return "base year: "  + baseYear;
   }
   public void printGradRequirementMessage(){
     String str = "apply for graduation by January 19, ";
     if (getGradYear() == baseYear){
       System.out.println(firstName + " needs to " +str  + baseYear);
     } else {
       System.out.println(firstName + " doesn't  need to " + str + baseYear);
     }
   }
  public String toString(){
        String output = "Name: " + firstName + " " + lastName + "\n";
        output += "Grade: " + grade + "\n";
        output += "OSIS: " + osis + "\n";

        return output;
    }
}
