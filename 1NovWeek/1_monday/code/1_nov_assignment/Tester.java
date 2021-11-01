public class Tester{

  public static void sameCSTeacher(Student one, Student two){
    /*
    TODO

    If one and two refer to the same Student object, the method should print "Same Student".
    Regardless of whether one and two refer to the same Student object, the method should print "Same CS teacher" if the CSTeacher objects returned
    by getTeacher are equal as determined by the equals method.
    If the Teacher objects returned by get_teacher are not equal as determined by the equals method, the method should print "Different teacher".

    */  
  }

  public static void main(String[] args){
  //teachers
    CSTeacher shuda = new CSTeacher("Mr.", "Shuda", "12345");
    CSTeacher obrien = new CSTeacher("Dr.", "O'Brien", "23456");

    //students
    Student sam = new Student("Sam", "O'Neill", "123456789", obrien);
    Student rafiki = new Student("Rafiki", "Holder", "234567890", obrien);
    Student eric = new Student("Eric", "Chau", "345678912", shuda);
    Student faiza = new Student("Faiza", "Khatun", "4567890123", shuda);

    //unit tests 
    sameCSTeacher(sam, rafiki);
    sameCSTeacher(eric, eric);
    sameCSTeacher(rafiki, faiza);
    /*
    expected output:
    Same teacher.
    Same student. Same teacher.
    Different teacher.
    
    */
  }
}
