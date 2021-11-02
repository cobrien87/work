public class Main{
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
    /*
    TODO
    expected output:
    Same teacher.
    Same student. Same teacher.
    Different teacher.

    */
  }
}
