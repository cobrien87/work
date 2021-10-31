public class Student{
  private String firstName;
  private String lastName;
  private String osis;
  private CSTeacher teacher;

  public Student(String first, String last, String o, CSTeacher t){
    firstName = first;
    lastName = last;
    osis = o;
    teacher = t;
  }
  
  /** Returns a reference to the CSTeacher object associated
  * with this Student object
  */
  public CSTeacher get_teacher(){
    return teacher;
  }
}
