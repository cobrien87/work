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

  public void same_teacher(Student other_kid){
    /*
    TODO
    If one and two refer to the same Student object, the method should print "Same Student".
    Regardless of whether the instance and other_kid refer to the same Student object, the method should
    print "Same CS teacher" if the CSTeacher objects returned by getTeacher are equal as
    determined by the equals method.  If the Teacher objects returned by get_teacher are
    not equal as determined by the equals method, the method should print "Different teacher".
    */
  }
}
