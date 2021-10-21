public class LSdriver{
  public static void main(String[] args){
    LehmanStudent luis = new LehmanStudent("Luis", "Castro", 12, "123456789");
    luis.printGradYear();
    LehmanStudent gulfidan = new LehmanStudent("Gulfidan", "Sulemanoski", 10, "012345678");
    gulfidan.printGradYear();

    luis.printGradRequirementMessage();
    gulfidan.printGradRequirementMessage();
  }
}
