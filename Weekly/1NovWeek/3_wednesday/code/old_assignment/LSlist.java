import java.util.ArrayList; // import the ArrayList class

public class LSlist{

  private ArrayList<LehmanStudent> my_list = new ArrayList<LehmanStudent>();;
  private LehmanStudent saad = new LehmanStudent("Saad", "Ahmed", "012345678");
  my_list.add(saad);
  private LehmanStudent sam = new LehmanStudent("Sam", "O'Neill", "012345678");
  my_list.add(sam);
  private LehmanStudent rafiki = new LehmanStudent("Rafiki", "Holder", "012345678");
  my_list.add(rafiki);
  private LehmanStudent yosuf = new LehmanStudent("Yosuf", "Almairi", "012345678");
  my_list.add(yosuf);
  private LehmanStudent maddox = new LehmanStudent("Maddox", "Ferrer", "012345678");
  my_list.add(maddox);
  private LehmanStudent luis = new LehmanStudent("Luis", "Castro", "012345678");
  my_list.add(luis);


  public static ArrayList<LehmanStudent> get_list(){
    return my_list;
  }
}
