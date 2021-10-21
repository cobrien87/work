public class LehmanStudent {
    //instance variables
    private String firstName;
    private String lastName;
    private int grade;
  //  private String osis;
    private int credits;
    //base year is the end of the current school year
    private int baseYear = 2022;
    private int gradYear = getGradYear();

    //constructor
    public LehmanStudent(String fname, String lname, int g, int c){
        firstName = fname;
        lastName = lname;
        grade = g;
        credits = c;

    }

    //credits methods;
    public int getCredits(){
      return credits;
    }
    public void addToCredits(int newCredits){
      credits += newCredits;
    }
    public boolean enoughCredits(){
      return credits >= 44;
    }
    public void canTheyGraduate(){
      boolean creditCheck = enoughCredits();
      if (grade == 12 && creditCheck){
        System.out.println(firstName + " will graduate this year!");
      } else if (grade == 12 && !(creditCheck)) {
        System.out.println(firstName + " is behind schedule! They need to earn " + (44 - credits) + " credits to graduate this year.");
      } else if (grade < 12 && creditCheck){
        System.out.println(firstName + " needs to wait until "+ gradYear + " to graduate.");

      } else {
        System.out.println(firstName + " needs to earn " + (44-credits) +" credits and wait until "+ gradYear +  " to graduate.");
      }
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
        output += "Credits: " + credits + "\n";


        return output;
    }
}
