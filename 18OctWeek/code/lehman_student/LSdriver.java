public class LSdriver{
  public static void main(String[] args){
    LehmanStudent sam = new LehmanStudent("Sam", "Senior", 12, "123456789");
    LehmanStudent sophia = new LehmanStudent("Sophia", "Sophomore", 10, "234567891");
    LehmanStudent jamila = new LehmanStudent("Jamila", "Junior", 11, "345678912");
    LehmanStudent shadia = new LehmanStudent("Shadia", "Slacker", 12, "456789123");

    //manually update credits;
    sam.addToCredits(45);
    sophia.addToCredits(22);
    jamila.addToCredits(44);
    shadia.addToCredits(32);

    //invite to freshman orientation?
    boolean invite;
    invite = sam.inviteCollegePrep();
    System.out.println("Invite sam? " + invite);

    //Can student graduate
    System.out.println(sam.canTheyGraduate());
    System.out.println(shadia.canTheyGraduate());
    System.out.println(jamila.canTheyGraduate());
    System.out.println(sophia.canTheyGraduate());
  }
}
