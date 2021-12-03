public class LehmanStudent {
    //instance variables
    private String firstName;
    private String lastName;
    private int grade;
    private String osis;
    private int credits = 0;
    //base year is the end of the current school year
    private int baseYear = 2022;
    private int gradYear;
    //constructor
    public LehmanStudent(String fname, String lname, int g, String o){
        firstName = fname;
        lastName = lname;
        grade = g;
        osis = o;
        gradYear = getGradYear();
    }
    public boolean inviteCollegePrep(){
      if (grade <12){
        return false;
      } else {
        return true;
      }
    }
    //credits methods;
    public void addToCredits(int newCredits){
      credits += newCredits;
    }

    public String canTheyGraduate(){
      boolean creditCheck = (credits >= 44);
      String output;
      if (grade == 12 && creditCheck){
        output = firstName + " will graduate this year! Congrats!";

      } else if (grade == 12 && !(creditCheck)) {
        output = firstName + " is behind schedule! They need to earn " + (44 - credits) + " credits to graduate this year.";

      } else if (grade < 12 && creditCheck){
        output = firstName + " needs to wait until "+ gradYear + " to graduate.";
      } else {
        output =  firstName + " needs to earn " + (44-credits) +" credits and wait until "+ gradYear +  " to graduate.";

      }
      return output;
    }
   //grad year methods
   public int getGradYear(){
     //return the year student is expected to graduate
     int yearsToGraduate = 12 - grade;
     int gradYear = yearsToGraduate + baseYear;
     return  gradYear;
   }
   public void printGradYear(){
     System.out.println(firstName + " graduates in " + getGradYear());
   }
   //base year methods
   public void setBaseYear(int year){
     //sets the base year
     baseYear = year;
   }
   public String getBaseYear(){
     return "base year: "  + baseYear;
   }
   //grad requirements
   public void printGradRequirementMessage(){
     String str = "apply for graduation by January 19, ";
     if (getGradYear() == baseYear){
       System.out.println(firstName + " needs to " +str  + baseYear);
     } else {
       System.out.println(firstName + " doesn't  need to " + str + baseYear);
     }
   }
   //string method
    public String toString(){
        String output = "Name: " + firstName + " " + lastName + "\n";
        output += "Grade: " + grade + "\n";
        output += "Credits: " + credits + "\n";
        output += "Expected graduation: " + gradYear + "\n";
        return output;
    }
}
