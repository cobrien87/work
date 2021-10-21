public class LSdriver{
  public static void main(String[] args){
    LehmanStudent sam = new LehmanStudent("Sam", "Senior", 12, 45);
    LehmanStudent sophia = new LehmanStudent("Sophia", "Sophomore", 10, 22);
    LehmanStudent jamila = new LehmanStudent("Jamila", "Junior", 11, 44);
    LehmanStudent shadia = new LehmanStudent("Shadia", "Slacker", 12, 32);
    
    System.out.println(sam);
    System.out.println(shadia);
    System.out.println(jamila);
    System.out.println(sophia);

    sam.canTheyGraduate();
    shadia.canTheyGraduate();
    jamila.canTheyGraduate();
    sophia.canTheyGraduate();
  }
}



//  LehmanStudent luis = new LehmanStudent("Luis", "Castro", 12, "123456789");
//  luis.printGradYear();
//  LehmanStudent gulfidan = new LehmanStudent("Gulfidan", "Sulemanoski", 10, "012345678");
//  gulfidan.printGradYear();

//    luis.printGradRequirementMessage();
//    gulfidan.printGradRequirementMessage();
